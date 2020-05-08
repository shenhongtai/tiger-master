package cn.imtiger.master.flow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 流程节点信息
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_flow_node")
public class FlowNode extends Model<FlowNode> {

    private static final long serialVersionUID = 1L;

    /**
     * 节点id
     */
    @TableId("ID")
    private String id;

    /**
     * 节点名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 节点类型
     */
    @TableField("TYPE")
    private String type;

    /**
     * 所属流程id
     */
    @TableField("FLOW_ID")
    private String flowId;

    /**
     * 审批者id
     */
    @TableField("APPROVER_ID")
    private String approverId;

    /**
     * 节点序号
     */
    @TableField("ORDER")
    private Integer order;

    /**
     * 状态（1正常，0删除）
     */
    @TableField("STATUS")
    private String status;

    /**
     * 是否禁用（0正常，1禁用）
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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
        return "FlowNode{" +
        "id=" + id +
        ", name=" + name +
        ", type=" + type +
        ", flowId=" + flowId +
        ", approverId=" + approverId +
        ", order=" + order +
        ", status=" + status +
        ", disabled=" + disabled +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updator=" + updator +
        ", updateTime=" + updateTime +
        "}";
    }
}
