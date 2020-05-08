package cn.imtiger.master.data.service.impl;

import cn.imtiger.master.data.entity.Org;
import cn.imtiger.master.data.dao.OrgDao;
import cn.imtiger.master.data.service.OrgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 组织机构信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class OrgServiceImpl extends ServiceImpl<OrgDao, Org> implements OrgService {

}
