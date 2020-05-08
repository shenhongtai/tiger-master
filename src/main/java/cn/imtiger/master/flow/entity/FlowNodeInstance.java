package cn.imtiger.master.flow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 节点实例信息
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_flow_node_instance")
public class FlowNodeInstance extends Model<FlowNodeInstance> {

    private static final long serialVersionUID = 1L;

    /**
     * 节点实例id
     */
    @TableId("ID")
    private String id;

    /**
     * 所属流程实例编号
     */
    @TableField("INSTANCE_ID")
    private String instanceId;

    /**
     * 是否加签
     */
    @TableField("IS_SIGN")
    private String isSign;

    /**
     * 加签人编号
     */
    @TableField("SIGN_USER_ID")
    private String signUserId;

    /**
     * 序号
     */
    @TableField("ORDER")
    private Integer order;

    /**
     * 原始节点编号
     */
    @TableField("NODE_ID")
    private String nodeId;

    /**
     * 原始节点名称
     */
    @TableField("NODE_NAME")
    private String nodeName;

    /**
     * 原始节点类型
     */
    @TableField("NODE_TYPE")
    private String nodeType;

    /**
     * 原始节点所属流程编号
     */
    @TableField("FLOW_ID")
    private String flowId;

    /**
     * 原始节点选用审批者编号
     */
    @TableField("APPROVER_ID")
    private String approverId;

    /**
     * 状态（1正常，0删除）
     */
    @TableField("STATUS")
    private String status;

    /**
     * 是否禁用（1是，0否）
     */
    @TableField("DISABLED")
    private String disabled;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 最后修改人
     */
    @TableField("UPDATOR")
    private String updator;

    /**
     * 最后修改时间
     */
    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;


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

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }

    public String getSignUserId() {
        return signUserId;
    }

    public void setSignUserId(String signUserId) {
        this.signUserId = signUserId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getApproverId() {
        return approverId;
    }

    public void setApproverId(String approverId) {
        this.approverId = approverId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "FlowNodeInstance{" +
        "id=" + id +
        ", instanceId=" + instanceId +
        ", isSign=" + isSign +
        ", signUserId=" + signUserId +
        ", order=" + order +
        ", nodeId=" + nodeId +
        ", nodeName=" + nodeName +
        ", nodeType=" + nodeType +
        ", flowId=" + flowId +
        ", approverId=" + approverId +
        ", status=" + status +
        ", disabled=" + disabled +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updator=" + updator +
        ", updateTime=" + updateTime +
        "}";
    }
}
