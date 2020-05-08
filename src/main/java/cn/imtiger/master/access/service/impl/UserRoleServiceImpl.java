package cn.imtiger.master.access.service.impl;

import cn.imtiger.master.access.entity.UserRole;
import cn.imtiger.master.access.dao.UserRoleDao;
import cn.imtiger.master.access.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色权限 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {

}
