package cn.imtiger.master.access.service.impl;

import cn.imtiger.master.access.entity.User;
import cn.imtiger.master.access.dao.UserDao;
import cn.imtiger.master.access.service.UserService;
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
