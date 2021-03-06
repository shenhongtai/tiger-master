package cn.imtiger.master.auth.service.impl;

import cn.imtiger.master.auth.dao.AppDao;
import cn.imtiger.master.auth.entity.App;
import cn.imtiger.master.auth.service.AppService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppDao, App> implements AppService {

}
