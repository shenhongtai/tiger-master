package cn.imtiger.master.flow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 审批日志
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_flow_audit_log")
public class FlowAuditLog extends Model<FlowAuditLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 审批流水号
     */
    @TableField("ID")
    private String id;

    /**
     * 所属流程实例id
     */
    @TableField("INSTANCE_ID")
    private String instanceId;

    /**
     * 所属节点实例id
     */
    @TableField("NODE_INSTANCE_ID")
    private String nodeInstanceId;

    /**
     * 审批结论（1通过，0拒绝）
     */
    @TableField("RESULT")
    private String result;

    /**
     * 审批意见
     */
    @TableField("MESSAGE")
    private String message;

    /**
     * 操作人
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 操作时间
     */
    @TableField("OPERATE_TIME")
    private LocalDateTime operateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getNodeInstanceId() {
        return nodeInstanceId;
    }

    public void setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "FlowAuditLog{" +
        "id=" + id +
        ", instanceId=" + instanceId +
        ", nodeInstanceId=" + nodeInstanceId +
        ", result=" + result +
        ", message=" + message +
        ", userId=" + userId +
        ", operateTime=" + operateTime +
        "}";
    }
}
