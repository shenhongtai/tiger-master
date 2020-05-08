package cn.imtiger.master.flow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 流程实例信息
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_flow_instance")
public class FlowInstance extends Model<FlowInstance> {

    private static final long serialVersionUID = 1L;

    /**
     * 流程实例编号
     */
    @TableId("ID")
    private String id;

    /**
     * 所属流程编号
     */
    @TableField("FLOW_ID")
    private String flowId;

    /**
     * 当前节点编号
     */
    @TableField("CURRENT_NODE_ID")
    private String currentNodeId;

    /**
     * 流程实例状态（字典）
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

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getCurrentNodeId() {
        return currentNodeId;
    }

    public void setCurrentNodeId(String currentNodeId) {
        this.currentNodeId = currentNodeId;
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
        return "FlowInstance{" +
        "id=" + id +
        ", flowId=" + flowId +
        ", currentNodeId=" + currentNodeId +
        ", status=" + status +
        ", disabled=" + disabled +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updator=" + updator +
        ", updateTime=" + updateTime +
        "}";
    }
}
