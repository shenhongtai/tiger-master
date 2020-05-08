package cn.imtiger.master.flow.service.impl;

import cn.imtiger.master.flow.entity.FlowInstance;
import cn.imtiger.master.flow.dao.FlowInstanceDao;
import cn.imtiger.master.flow.service.FlowInstanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 流程实例信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class FlowInstanceServiceImpl extends ServiceImpl<FlowInstanceDao, FlowInstance> implements FlowInstanceService {

}
