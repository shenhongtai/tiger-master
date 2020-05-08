package cn.imtiger.master.data.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 组织机构信息
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_org")
public class Org extends Model<Org> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private String id;

    /**
     * 组织机构名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 组织机构简称
     */
    @TableField("SHORT_NAME")
    private String shortName;

    /**
     * 组织机构全路径
     */
    @TableField("FULL_NAME")
    private String fullName;

    /**
     * 组织机构类型（字典org_type）
     */
    @TableField("TYPE")
    private String type;

    /**
     * 统一社会信用代码
     */
    @TableField("CREDIT_CODE")
    private String creditCode;

    /**
     * 级别
     */
    @TableField("RANK")
    private Integer rank;

    /**
     * 上级组织机构id
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 所属行政区划
     */
    @TableField("REGION")
    private String region;

    /**
     * 通讯地址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 联系人
     */
    @TableField("LINKMAN")
    private String linkman;

    /**
     * 联系电话
     */
    @TableField("PHONE")
    private String phone;

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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        return "Org{" +
        "id=" + id +
        ", name=" + name +
        ", shortName=" + shortName +
        ", fullName=" + fullName +
        ", type=" + type +
        ", creditCode=" + creditCode +
        ", rank=" + rank +
        ", parentId=" + parentId +
        ", region=" + region +
        ", address=" + address +
        ", linkman=" + linkman +
        ", phone=" + phone +
        ", status=" + status +
        ", disabled=" + disabled +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updator=" + updator +
        ", updateTime=" + updateTime +
        "}";
    }
}
