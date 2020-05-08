package cn.imtiger.master.data.service.impl;

import cn.imtiger.master.data.entity.Profile;
import cn.imtiger.master.data.dao.ProfileDao;
import cn.imtiger.master.data.service.ProfileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统设置 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class ProfileServiceImpl extends ServiceImpl<ProfileDao, Profile> implements ProfileService {

}
