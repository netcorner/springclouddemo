package com.netcorner.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_quotation_exes", schema = "testssx", catalog = "")
public class CmQuotationExesEntity {
    private Integer quotationId;
    private String exesName;
    private BigDecimal exesMoney;

    @Basic
    @Column(name = "QuotationID")
    public Integer getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Integer quotationId) {
        this.quotationId = quotationId;
    }

    @Basic
    @Column(name = "ExesName")
    public String getExesName() {
        return exesName;
    }

    public void setExesName(String exesName) {
        this.exesName = exesName;
    }

    @Basic
    @Column(name = "ExesMoney")
    public BigDecimal getExesMoney() {
        return exesMoney;
    }

    public void setExesMoney(BigDecimal exesMoney) {
        this.exesMoney = exesMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmQuotationExesEntity that = (CmQuotationExesEntity) o;

        if (quotationId != null ? !quotationId.equals(that.quotationId) : that.quotationId != null) return false;
        if (exesName != null ? !exesName.equals(that.exesName) : that.exesName != null) return false;
        if (exesMoney != null ? !exesMoney.equals(that.exesMoney) : that.exesMoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quotationId != null ? quotationId.hashCode() : 0;
        result = 31 * result + (exesName != null ? exesName.hashCode() : 0);
        result = 31 * result + (exesMoney != null ? exesMoney.hashCode() : 0);
        return result;
    }
}
