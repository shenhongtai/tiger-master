package cn.imtiger.master.flow.service.impl;

import cn.imtiger.master.flow.entity.Flow;
import cn.imtiger.master.flow.dao.FlowDao;
import cn.imtiger.master.flow.service.FlowService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 流程信息 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class FlowServiceImpl extends ServiceImpl<FlowDao, Flow> implements FlowService {

}
