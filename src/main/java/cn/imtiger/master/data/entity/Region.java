package cn.imtiger.master.data.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 行政区划信息（2019-12-31更新）
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_region")
public class Region extends Model<Region> {

    private static final long serialVersionUID = 1L;

    /**
     * 区划ID
     */
    @TableId("ID")
    private String id;

    /**
     * 区划名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 区划全称
     */
    @TableField("FULL_NAME")
    private String fullName;

    /**
     * 区划层级
     */
    @TableField("RANK")
    private String rank;

    /**
     * 上级区划ID
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 状态（0正常，1禁用）
     */
    @TableField("DISABLED")
    private String disabled;


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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Region{" +
        "id=" + id +
        ", name=" + name +
        ", fullName=" + fullName +
        ", rank=" + rank +
        ", parentId=" + parentId +
        ", disabled=" + disabled +
        "}";
    }
}
