package com.netcorner.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_evaluation_tag", schema = "testssx", catalog = "")
public class CmEvaluationTagEntity {
    private Integer evaluationId;
    private String tagName;

    @Basic
    @Column(name = "EvaluationID")
    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    @Basic
    @Column(name = "TagName")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmEvaluationTagEntity that = (CmEvaluationTagEntity) o;

        if (evaluationId != null ? !evaluationId.equals(that.evaluationId) : that.evaluationId != null) return false;
        if (tagName != null ? !tagName.equals(that.tagName) : that.tagName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = evaluationId != null ? evaluationId.hashCode() : 0;
        result = 31 * result + (tagName != null ? tagName.hashCode() : 0);
        return result;
    }
}
