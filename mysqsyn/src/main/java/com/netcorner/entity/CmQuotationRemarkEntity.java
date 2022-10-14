package com.netcorner.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_quotation_remark", schema = "testssx", catalog = "")
public class CmQuotationRemarkEntity {
    private Integer quotationId;
    private String remark;

    @Basic
    @Column(name = "QuotationID")
    public Integer getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Integer quotationId) {
        this.quotationId = quotationId;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmQuotationRemarkEntity that = (CmQuotationRemarkEntity) o;

        if (quotationId != null ? !quotationId.equals(that.quotationId) : that.quotationId != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quotationId != null ? quotationId.hashCode() : 0;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
