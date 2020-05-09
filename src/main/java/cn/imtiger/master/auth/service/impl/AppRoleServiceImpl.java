package cn.imtiger.master.auth.service.impl;

import cn.imtiger.master.auth.dao.AppRoleDao;
import cn.imtiger.master.auth.entity.AppRole;
import cn.imtiger.master.auth.service.AppRoleService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用角色信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class AppRoleServiceImpl extends ServiceImpl<AppRoleDao, AppRole> implements AppRoleService {

}
