package cn.imtiger.master.auth.service.impl;

import cn.imtiger.master.auth.dao.UserResourceDao;
import cn.imtiger.master.auth.entity.UserResource;
import cn.imtiger.master.auth.service.UserResourceService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户资源权限 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class UserResourceServiceImpl extends ServiceImpl<UserResourceDao, UserResource> implements UserResourceService {

}
