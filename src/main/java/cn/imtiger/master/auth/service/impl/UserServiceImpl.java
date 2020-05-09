package cn.imtiger.master.auth.service.impl;

import cn.imtiger.master.auth.dao.UserDao;
import cn.imtiger.master.auth.entity.User;
import cn.imtiger.master.auth.service.UserService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
