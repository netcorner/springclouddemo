package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_user_role_setting", schema = "testssx", catalog = "")
public class SysUserRoleSettingEntity {
    private int id;
    private int userRoleId;
    private String settingKey;
    private String settingLabel;
    private String settingValue;
    private Timestamp addTime;
    private Integer addUserId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "UserRoleID")
    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Basic
    @Column(name = "SettingKey")
    public String getSettingKey() {
        return settingKey;
    }

    public void setSettingKey(String settingKey) {
        this.settingKey = settingKey;
    }

    @Basic
    @Column(name = "SettingLabel")
    public String getSettingLabel() {
        return settingLabel;
    }

    public void setSettingLabel(String settingLabel) {
        this.settingLabel = settingLabel;
    }

    @Basic
    @Column(name = "SettingValue")
    public String getSettingValue() {
        return settingValue;
    }

    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }

    @Basic
    @Column(name = "AddTime")
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "AddUserID")
    public Integer getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUserRoleSettingEntity that = (SysUserRoleSettingEntity) o;

        if (id != that.id) return false;
        if (userRoleId != that.userRoleId) return false;
        if (settingKey != null ? !settingKey.equals(that.settingKey) : that.settingKey != null) return false;
        if (settingLabel != null ? !settingLabel.equals(that.settingLabel) : that.settingLabel != null) return false;
        if (settingValue != null ? !settingValue.equals(that.settingValue) : that.settingValue != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (addUserId != null ? !addUserId.equals(that.addUserId) : that.addUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userRoleId;
        result = 31 * result + (settingKey != null ? settingKey.hashCode() : 0);
        result = 31 * result + (settingLabel != null ? settingLabel.hashCode() : 0);
        result = 31 * result + (settingValue != null ? settingValue.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (addUserId != null ? addUserId.hashCode() : 0);
        return result;
    }
}
