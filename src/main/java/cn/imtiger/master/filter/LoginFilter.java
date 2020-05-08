package cn.imtiger.master.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@Component
@WebFilter(urlPatterns = "/*", filterName = "loginFilter")
public class LoginFilter implements Filter {

	@Value("${app.access.whitelist-uri:''}")
	private String whiteList;

	@Value("${app.sessionKey:''}")
	private String sessionKey;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		Logger logger = LoggerFactory.getLogger(LoginFilter.class);

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		Object user = request.getSession().getAttribute(sessionKey);
		String path = request.getRequestURI();

		StringBuffer whiteLists = new StringBuffer();
		whiteLists.append("/,/index,/login,/captcha,");
		whiteLists.append(whiteList);
		List<String> list = Arrays.asList(whiteLists.toString().split(","));
		boolean isWhiteListUri = list.contains(path);
		boolean isRestUri = path.startsWith("/restapi") && !path.contains("/..");
		boolean isResourceFile = Pattern.matches("^.{1,}[\\.][a-zA-Z0-9]{1,}$", path.split("\\?")[0]);
		if (user == null && !isWhiteListUri && !isRestUri && !isResourceFile) {
			logger.info("拦截到未登录请求：" + path);
			response.sendRedirect("/");
		}

		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void destroy() {

	}
	
}