package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_enterprise_app", schema = "testssx", catalog = "")
public class SysEnterpriseAppEntity {
    private int id;
    private Integer entId;
    private Integer marketAppId;
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
    @Column(name = "EntID")
    public Integer getEntId() {
        return entId;
    }

    public void setEntId(Integer entId) {
        this.entId = entId;
    }

    @Basic
    @Column(name = "MarketAppID")
    public Integer getMarketAppId() {
        return marketAppId;
    }

    public void setMarketAppId(Integer marketAppId) {
        this.marketAppId = marketAppId;
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

        SysEnterpriseAppEntity that = (SysEnterpriseAppEntity) o;

        if (id != that.id) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (marketAppId != null ? !marketAppId.equals(that.marketAppId) : that.marketAppId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (addUserId != null ? !addUserId.equals(that.addUserId) : that.addUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (marketAppId != null ? marketAppId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (addUserId != null ? addUserId.hashCode() : 0);
        return result;
    }
}
