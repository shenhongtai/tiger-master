package cn.imtiger.master.auth.service.impl;

import cn.imtiger.master.auth.dao.AppResourceDao;
import cn.imtiger.master.auth.entity.AppResource;
import cn.imtiger.master.auth.service.AppResourceService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用资源信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class AppResourceServiceImpl extends ServiceImpl<AppResourceDao, AppResource> implements AppResourceService {

}
