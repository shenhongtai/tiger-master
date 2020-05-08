package cn.imtiger.master.data.service.impl;

import cn.imtiger.master.data.entity.Dict;
import cn.imtiger.master.data.dao.DictDao;
import cn.imtiger.master.data.service.DictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictDao, Dict> implements DictService {

}
