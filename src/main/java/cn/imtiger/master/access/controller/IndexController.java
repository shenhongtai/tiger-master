package cn.imtiger.master.access.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import cn.imtiger.constant.StatusConst;
import cn.imtiger.controller.BaseController;
import cn.imtiger.master.access.entity.User;
import cn.imtiger.master.access.service.UserService;
import cn.imtiger.util.data.ValidateUtil;
import cn.imtiger.util.image.VerifyCodeUtil;

@Controller
public class IndexController extends BaseController {
	
	@Value("${app.sessionKey}")
	private String sessionKey;
	@Value("${app.captchaSessionKey}")
	private String captchaSessionKey;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/")
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		JSONObject user = this.getCurrentUser();
		if (user != null) {
			return this.getView("index", model);
		} else {
			return this.login(request, response, model);
		}
	}

	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		return this.getView("login", model);
	}

	@RequestMapping(value = "/register")
	public String register(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		return this.getView("register", model);
	}
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		request.getSession().invalidate();
		return this.login(request, response, map);
	}
	
	/**
	 * 获取登录验证码图片
	 * @param request
	 * @param response
	 * @param map
	 */
	@RequestMapping(value = "/captcha")
	public void captcha(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		// 生成一个4位验证码
		String code = VerifyCodeUtil.getCode(4);
		// 放到session里
		request.getSession().setAttribute(captchaSessionKey, code);
		// 制作验证码图片并通过输出流返回到页面
		try {
			VerifyCodeUtil.getImageStream(100, 39, response.getOutputStream(), code);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 登录流程
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/loginHandler")
	@ResponseBody
	public String loginHandler(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		// 获取用户名
		String userName = this.getString("u");
		// 获取密码
		String password = this.getString("p");
		// 获取验证码
		String captcha = this.getString("captcha");
		// 获取session里正确的验证码
		String rightCaptcha = (String) request.getSession().getAttribute(captchaSessionKey);
		// 作废session中的验证码
		request.getSession().removeAttribute(captchaSessionKey);

		// 校验字段是否为空
		if (ValidateUtil.isBlank(userName)) {
			return this.getResponse(false, "用户名不能为空，请检查");
		}
		if (ValidateUtil.isBlank(password)) {
			return this.getResponse(false, "密码不能为空，请检查");
		}
		if (ValidateUtil.isBlank(captcha)) {
			return this.getResponse(false, "验证码不能为空，请检查");
		}
		if (ValidateUtil.isBlank(rightCaptcha)) {
			return this.getResponse(false, "验证码已过期，请刷新页面再试");
		}
		// 校验验证码是否正确
		if (!rightCaptcha.toLowerCase().equals(captcha.toLowerCase())) {
			return this.getResponse(false, "验证码错误，请重新输入");
		}
		
		// 根据账号、密码去数据库查用户
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("ACCOUNT", userName).or().eq("MOBILE", userName).or().eq("EMAIL", userName);
		queryWrapper.eq("PASSWORD", password);
		queryWrapper.eq("STATUS", StatusConst.ENABLE);
		User user = userService.getOne(queryWrapper);
		if (user == null) {
			// 没查到用户，返回用户名或密码错误
			return this.getResponse(false, "用户名或密码错误，请重新输入");
		} else {
			// 查到用户了
			if (StatusConst.TRUE.equals(user.getDisabled())) {
				// 用户状态为禁用，返回用户已禁用的提示
				return this.getResponse(false, "用户账号已被禁用，请联系管理员");
			} else {
				// 用户状态正常，把用户信息保存到session
				request.getSession().setAttribute(sessionKey, JSON.toJSONString(user));
			}
		}
		
		// 返回登录成功信息
		return this.getResponse(true);
	}
	
}
