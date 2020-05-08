package cn.imtiger.master.access.service.impl;

import cn.imtiger.master.access.entity.LoginLog;
import cn.imtiger.master.access.dao.LoginLogDao;
import cn.imtiger.master.access.service.LoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录日志 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogDao, LoginLog> implements LoginLogService {

}
