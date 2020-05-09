package cn.imtiger.master.auth.service.impl;

import cn.imtiger.master.auth.dao.AppGroupDao;
import cn.imtiger.master.auth.entity.AppGroup;
import cn.imtiger.master.auth.service.AppGroupService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用分组信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class AppGroupServiceImpl extends ServiceImpl<AppGroupDao, AppGroup> implements AppGroupService {

}
