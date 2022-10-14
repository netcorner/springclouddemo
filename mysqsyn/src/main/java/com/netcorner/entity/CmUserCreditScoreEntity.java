package com.netcorner.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_user_credit_score", schema = "testssx", catalog = "")
public class CmUserCreditScoreEntity {
    private Integer userId;
    private String type;
    private String score;
    private Timestamp lastScoreTime;
    private Integer entId;

    @Basic
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "Score")
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Basic
    @Column(name = "LastScoreTime")
    public Timestamp getLastScoreTime() {
        return lastScoreTime;
    }

    public void setLastScoreTime(Timestamp lastScoreTime) {
        this.lastScoreTime = lastScoreTime;
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

        CmUserCreditScoreEntity that = (CmUserCreditScoreEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (lastScoreTime != null ? !lastScoreTime.equals(that.lastScoreTime) : that.lastScoreTime != null)
            return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (lastScoreTime != null ? lastScoreTime.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        return result;
    }
}
