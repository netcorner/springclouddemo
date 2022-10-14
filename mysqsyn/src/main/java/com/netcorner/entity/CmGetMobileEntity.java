package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_get_mobile", schema = "testssx", catalog = "")
public class CmGetMobileEntity {
    private int id;
    private Integer paymentId;
    private Integer paymentUserId;
    private Integer paymentEntId;
    private Integer getUserId;
    private String getMobile;
    private String type;
    private String targetId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PaymentID")
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "PaymentUserID")
    public Integer getPaymentUserId() {
        return paymentUserId;
    }

    public void setPaymentUserId(Integer paymentUserId) {
        this.paymentUserId = paymentUserId;
    }

    @Basic
    @Column(name = "PaymentEntID")
    public Integer getPaymentEntId() {
        return paymentEntId;
    }

    public void setPaymentEntId(Integer paymentEntId) {
        this.paymentEntId = paymentEntId;
    }

    @Basic
    @Column(name = "GetUserID")
    public Integer getGetUserId() {
        return getUserId;
    }

    public void setGetUserId(Integer getUserId) {
        this.getUserId = getUserId;
    }

    @Basic
    @Column(name = "GetMobile")
    public String getGetMobile() {
        return getMobile;
    }

    public void setGetMobile(String getMobile) {
        this.getMobile = getMobile;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "TargetID")
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmGetMobileEntity that = (CmGetMobileEntity) o;

        if (id != that.id) return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (paymentUserId != null ? !paymentUserId.equals(that.paymentUserId) : that.paymentUserId != null)
            return false;
        if (paymentEntId != null ? !paymentEntId.equals(that.paymentEntId) : that.paymentEntId != null) return false;
        if (getUserId != null ? !getUserId.equals(that.getUserId) : that.getUserId != null) return false;
        if (getMobile != null ? !getMobile.equals(that.getMobile) : that.getMobile != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (targetId != null ? !targetId.equals(that.targetId) : that.targetId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (paymentUserId != null ? paymentUserId.hashCode() : 0);
        result = 31 * result + (paymentEntId != null ? paymentEntId.hashCode() : 0);
        result = 31 * result + (getUserId != null ? getUserId.hashCode() : 0);
        result = 31 * result + (getMobile != null ? getMobile.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (targetId != null ? targetId.hashCode() : 0);
        return result;
    }
}
