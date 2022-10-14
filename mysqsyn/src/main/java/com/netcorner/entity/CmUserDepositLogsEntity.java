package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_user_deposit_logs", schema = "testssx", catalog = "")
public class CmUserDepositLogsEntity {
    private int id;
    private Integer depositWay;
    private Integer depositMoney;
    private Timestamp depositTime;
    private Integer userId;
    private Integer status;
    private String body;
    private String tradeNo;
    private Timestamp addTime;
    private String openId;
    private String transactionId;
    private String userName;
    private String entName;
    private Integer entId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DepositWay")
    public Integer getDepositWay() {
        return depositWay;
    }

    public void setDepositWay(Integer depositWay) {
        this.depositWay = depositWay;
    }

    @Basic
    @Column(name = "DepositMoney")
    public Integer getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Integer depositMoney) {
        this.depositMoney = depositMoney;
    }

    @Basic
    @Column(name = "DepositTime")
    public Timestamp getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(Timestamp depositTime) {
        this.depositTime = depositTime;
    }

    @Basic
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "Body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Column(name = "TradeNO")
    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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
    @Column(name = "OpenID")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Basic
    @Column(name = "TransactionID")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "EntName")
    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    @Basic
    @Column(name = "EntID")
    public Integer getEntId() {
        return entId;
    }

    public void setEntId(Integer entId) {
        this.entId = entId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmUserDepositLogsEntity that = (CmUserDepositLogsEntity) o;

        if (id != that.id) return false;
        if (depositWay != null ? !depositWay.equals(that.depositWay) : that.depositWay != null) return false;
        if (depositMoney != null ? !depositMoney.equals(that.depositMoney) : that.depositMoney != null) return false;
        if (depositTime != null ? !depositTime.equals(that.depositTime) : that.depositTime != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (tradeNo != null ? !tradeNo.equals(that.tradeNo) : that.tradeNo != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (openId != null ? !openId.equals(that.openId) : that.openId != null) return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (depositWay != null ? depositWay.hashCode() : 0);
        result = 31 * result + (depositMoney != null ? depositMoney.hashCode() : 0);
        result = 31 * result + (depositTime != null ? depositTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (tradeNo != null ? tradeNo.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (openId != null ? openId.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        return result;
    }
}
