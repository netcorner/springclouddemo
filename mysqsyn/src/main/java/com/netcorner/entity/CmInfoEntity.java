package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "cm_info", schema = "testssx", catalog = "")
public class CmInfoEntity {
    private int id;
    private String title;
    private String source;
    private Date pubTime;
    private String pubUser;
    private Timestamp addTime;
    private Timestamp lastReadTime;
    private Integer lastReadUserId;
    private Integer addUserId;
    private Integer hits;
    private Integer cateId;
    private String content;
    private Integer top;
    private Date topBeginTime;
    private Date topEndTime;
    private Timestamp updateTime;
    private Integer updateUserId;
    private String imageIndex;
    private Integer entId;
    private String entName;
    private Integer status;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "PubTime")
    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    @Basic
    @Column(name = "PubUser")
    public String getPubUser() {
        return pubUser;
    }

    public void setPubUser(String pubUser) {
        this.pubUser = pubUser;
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
    @Column(name = "LastReadTime")
    public Timestamp getLastReadTime() {
        return lastReadTime;
    }

    public void setLastReadTime(Timestamp lastReadTime) {
        this.lastReadTime = lastReadTime;
    }

    @Basic
    @Column(name = "LastReadUserID")
    public Integer getLastReadUserId() {
        return lastReadUserId;
    }

    public void setLastReadUserId(Integer lastReadUserId) {
        this.lastReadUserId = lastReadUserId;
    }

    @Basic
    @Column(name = "AddUserID")
    public Integer getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    @Basic
    @Column(name = "Hits")
    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @Basic
    @Column(name = "CateID")
    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    @Basic
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "Top")
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    @Basic
    @Column(name = "TopBeginTime")
    public Date getTopBeginTime() {
        return topBeginTime;
    }

    public void setTopBeginTime(Date topBeginTime) {
        this.topBeginTime = topBeginTime;
    }

    @Basic
    @Column(name = "TopEndTime")
    public Date getTopEndTime() {
        return topEndTime;
    }

    public void setTopEndTime(Date topEndTime) {
        this.topEndTime = topEndTime;
    }

    @Basic
    @Column(name = "UpdateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "UpdateUserID")
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Basic
    @Column(name = "ImageIndex")
    public String getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(String imageIndex) {
        this.imageIndex = imageIndex;
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
    @Column(name = "EntName")
    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmInfoEntity that = (CmInfoEntity) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (pubTime != null ? !pubTime.equals(that.pubTime) : that.pubTime != null) return false;
        if (pubUser != null ? !pubUser.equals(that.pubUser) : that.pubUser != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (lastReadTime != null ? !lastReadTime.equals(that.lastReadTime) : that.lastReadTime != null) return false;
        if (lastReadUserId != null ? !lastReadUserId.equals(that.lastReadUserId) : that.lastReadUserId != null)
            return false;
        if (addUserId != null ? !addUserId.equals(that.addUserId) : that.addUserId != null) return false;
        if (hits != null ? !hits.equals(that.hits) : that.hits != null) return false;
        if (cateId != null ? !cateId.equals(that.cateId) : that.cateId != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (top != null ? !top.equals(that.top) : that.top != null) return false;
        if (topBeginTime != null ? !topBeginTime.equals(that.topBeginTime) : that.topBeginTime != null) return false;
        if (topEndTime != null ? !topEndTime.equals(that.topEndTime) : that.topEndTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (imageIndex != null ? !imageIndex.equals(that.imageIndex) : that.imageIndex != null) return false;
        if (entId != null ? !entId.equals(that.entId) : that.entId != null) return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (pubTime != null ? pubTime.hashCode() : 0);
        result = 31 * result + (pubUser != null ? pubUser.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (lastReadTime != null ? lastReadTime.hashCode() : 0);
        result = 31 * result + (lastReadUserId != null ? lastReadUserId.hashCode() : 0);
        result = 31 * result + (addUserId != null ? addUserId.hashCode() : 0);
        result = 31 * result + (hits != null ? hits.hashCode() : 0);
        result = 31 * result + (cateId != null ? cateId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (top != null ? top.hashCode() : 0);
        result = 31 * result + (topBeginTime != null ? topBeginTime.hashCode() : 0);
        result = 31 * result + (topEndTime != null ? topEndTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (imageIndex != null ? imageIndex.hashCode() : 0);
        result = 31 * result + (entId != null ? entId.hashCode() : 0);
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
