package cn.imtiger.master.flow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 审批者信息
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_flow_approver")
public class FlowApprover extends Model<FlowApprover> {

    private static final long serialVersionUID = 1L;

    /**
     * 审批者编号
     */
    @TableId("ID")
    private String id;

    /**
     * 审批者类型
     */
    @TableField("TYPE")
    private String type;

    /**
     * 指定用户审批-用户编号（逗号分隔）
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 指定组织审批-组织机构编号
     */
    @TableField("ORG_ID")
    private String orgId;

    /**
     * 指定角色审批-角色编号
     */
    @TableField("ROLE_ID")
    private String roleId;

    /**
     * 自动审批-类名
     */
    @TableField("CLASS_NAME")
    private String className;

    /**
     * 自动审批-方法名
     */
    @TableField("METHOD_NAME")
    private String methodName;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 是否禁用
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
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
        return "FlowApprover{" +
        "id=" + id +
        ", type=" + type +
        ", userId=" + userId +
        ", orgId=" + orgId +
        ", roleId=" + roleId +
        ", className=" + className +
        ", methodName=" + methodName +
        ", status=" + status +
        ", disabled=" + disabled +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updator=" + updator +
        ", updateTime=" + updateTime +
        "}";
    }
}
