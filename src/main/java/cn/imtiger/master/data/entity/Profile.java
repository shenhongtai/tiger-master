package cn.imtiger.master.data.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 系统设置
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_profile")
public class Profile extends Model<Profile> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private String id;

    /**
     * 配置项名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 配置项值
     */
    @TableField("VALUE")
    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        return "Profile{" +
        "id=" + id +
        ", name=" + name +
        ", value=" + value +
        ", updateTime=" + updateTime +
        "}";
    }
}
