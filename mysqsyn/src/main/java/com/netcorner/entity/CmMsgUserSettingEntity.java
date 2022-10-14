package com.netcorner.entity;

import javax.persistence.*;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_msg_user_setting", schema = "testssx", catalog = "")
public class CmMsgUserSettingEntity {
    private int isEphemerality;
    private int userId;
    private int unReadTotal;
    private int id;

    @Basic
    @Column(name = "IsEphemerality")
    public int getIsEphemerality() {
        return isEphemerality;
    }

    public void setIsEphemerality(int isEphemerality) {
        this.isEphemerality = isEphemerality;
    }

    @Basic
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "UnReadTotal")
    public int getUnReadTotal() {
        return unReadTotal;
    }

    public void setUnReadTotal(int unReadTotal) {
        this.unReadTotal = unReadTotal;
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

        CmMsgUserSettingEntity that = (CmMsgUserSettingEntity) o;

        if (isEphemerality != that.isEphemerality) return false;
        if (userId != that.userId) return false;
        if (unReadTotal != that.unReadTotal) return false;
        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isEphemerality;
        result = 31 * result + userId;
        result = 31 * result + unReadTotal;
        result = 31 * result + id;
        return result;
    }
}
