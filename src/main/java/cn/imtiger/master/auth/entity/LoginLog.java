package cn.imtiger.master.auth.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 用户登录日志
 * </p>
 *
 * @author Tiger Shen
 * @since 2020-05-08
 */
@TableName("ts_login_log")
public class LoginLog extends Model<LoginLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private String id;

    /**
     * 用户登录名
     */
    @TableField("LOGIN_NAME")
    private String loginName;

    /**
     * 来源IP地址
     */
    @TableField("IP")
    private String ip;

    /**
     * 来源端口
     */
    @TableField("PORT")
    private String port;

    /**
     * 设备类型标识
     */
    @TableField("DEVICE")
    private String device;

    /**
     * 操作系统
     */
    @TableField("OS")
    private String os;

    /**
     * 浏览器标识
     */
    @TableField("UA")
    private String ua;

    /**
     * 登录时间
     */
    @TableField("LOGIN_TIME")
    private LocalDateTime loginTime;

    /**
     * 状态（1成功，0失败）
     */
    @TableField("STATUS")
    private String status;

    /**
     * 备注
     */
    @TableField("NOTE")
    private String note;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
        "id=" + id +
        ", loginName=" + loginName +
        ", ip=" + ip +
        ", port=" + port +
        ", device=" + device +
        ", os=" + os +
        ", ua=" + ua +
        ", loginTime=" + loginTime +
        ", status=" + status +
        ", note=" + note +
        "}";
    }
}
