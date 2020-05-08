package cn.imtiger.master.flow.service.impl;

import cn.imtiger.master.flow.entity.FlowAuditLog;
import cn.imtiger.master.flow.dao.FlowAuditLogDao;
import cn.imtiger.master.flow.service.FlowAuditLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 审批日志 服务实现类
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@Service
public class FlowAuditLogServiceImpl extends ServiceImpl<FlowAuditLogDao, FlowAuditLog> implements FlowAuditLogService {

}
