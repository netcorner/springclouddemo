package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_user_deposits", schema = "testssx", catalog = "")
public class CmUserDepositsEntity {
    private Integer userId;
    private String money;
    private Integer lastPayId;
    private Integer lastDepositId;
    private int id;

    @Basic
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Money")
    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Basic
    @Column(name = "LastPayID")
    public Integer getLastPayId() {
        return lastPayId;
    }

    public void setLastPayId(Integer lastPayId) {
        this.lastPayId = lastPayId;
    }

    @Basic
    @Column(name = "LastDepositID")
    public Integer getLastDepositId() {
        return lastDepositId;
    }

    public void setLastDepositId(Integer lastDepositId) {
        this.lastDepositId = lastDepositId;
    }

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmUserDepositsEntity that = (CmUserDepositsEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (lastPayId != null ? !lastPayId.equals(that.lastPayId) : that.lastPayId != null) return false;
        if (lastDepositId != null ? !lastDepositId.equals(that.lastDepositId) : that.lastDepositId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (lastPayId != null ? lastPayId.hashCode() : 0);
        result = 31 * result + (lastDepositId != null ? lastDepositId.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
