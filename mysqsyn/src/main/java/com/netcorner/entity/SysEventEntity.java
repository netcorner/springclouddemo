package com.netcorner.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_event", schema = "testssx", catalog = "")
public class SysEventEntity {
    private String id;
    private Timestamp addTime;
    private Integer userId;
    private Integer actionId;
    private String ipAddress;
    private String content;
    private String result;
    private String optUrl;
    private String optParams;
    private String targetId;
    private Integer userRoleId;
    private String httpMethod;
    private String classMethod;
    private String classMethodParams;
    private String userAgent;
    private Long spendTime;
    private String description;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ActionID")
    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    @Basic
    @Column(name = "IPAddress")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
    @Column(name = "Result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "OptURL")
    public String getOptUrl() {
        return optUrl;
    }

    public void setOptUrl(String optUrl) {
        this.optUrl = optUrl;
    }

    @Basic
    @Column(name = "OptParams")
    public String getOptParams() {
        return optParams;
    }

    public void setOptParams(String optParams) {
        this.optParams = optParams;
    }

    @Basic
    @Column(name = "TargetID")
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Basic
    @Column(name = "UserRoleID")
    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Basic
    @Column(name = "HttpMethod")
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Basic
    @Column(name = "ClassMethod")
    public String getClassMethod() {
        return classMethod;
    }

    public void setClassMethod(String classMethod) {
        this.classMethod = classMethod;
    }

    @Basic
    @Column(name = "ClassMethodParams")
    public String getClassMethodParams() {
        return classMethodParams;
    }

    public void setClassMethodParams(String classMethodParams) {
        this.classMethodParams = classMethodParams;
    }

    @Basic
    @Column(name = "UserAgent")
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Basic
    @Column(name = "SpendTime")
    public Long getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Long spendTime) {
        this.spendTime = spendTime;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysEventEntity that = (SysEventEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (actionId != null ? !actionId.equals(that.actionId) : that.actionId != null) return false;
        if (ipAddress != null ? !ipAddress.equals(that.ipAddress) : that.ipAddress != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (optUrl != null ? !optUrl.equals(that.optUrl) : that.optUrl != null) return false;
        if (optParams != null ? !optParams.equals(that.optParams) : that.optParams != null) return false;
        if (targetId != null ? !targetId.equals(that.targetId) : that.targetId != null) return false;
        if (userRoleId != null ? !userRoleId.equals(that.userRoleId) : that.userRoleId != null) return false;
        if (httpMethod != null ? !httpMethod.equals(that.httpMethod) : that.httpMethod != null) return false;
        if (classMethod != null ? !classMethod.equals(that.classMethod) : that.classMethod != null) return false;
        if (classMethodParams != null ? !classMethodParams.equals(that.classMethodParams) : that.classMethodParams != null)
            return false;
        if (userAgent != null ? !userAgent.equals(that.userAgent) : that.userAgent != null) return false;
        if (spendTime != null ? !spendTime.equals(that.spendTime) : that.spendTime != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id != null ? id.hashCode() : 0;
        result1 = 31 * result1 + (addTime != null ? addTime.hashCode() : 0);
        result1 = 31 * result1 + (userId != null ? userId.hashCode() : 0);
        result1 = 31 * result1 + (actionId != null ? actionId.hashCode() : 0);
        result1 = 31 * result1 + (ipAddress != null ? ipAddress.hashCode() : 0);
        result1 = 31 * result1 + (content != null ? content.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (optUrl != null ? optUrl.hashCode() : 0);
        result1 = 31 * result1 + (optParams != null ? optParams.hashCode() : 0);
        result1 = 31 * result1 + (targetId != null ? targetId.hashCode() : 0);
        result1 = 31 * result1 + (userRoleId != null ? userRoleId.hashCode() : 0);
        result1 = 31 * result1 + (httpMethod != null ? httpMethod.hashCode() : 0);
        result1 = 31 * result1 + (classMethod != null ? classMethod.hashCode() : 0);
        result1 = 31 * result1 + (classMethodParams != null ? classMethodParams.hashCode() : 0);
        result1 = 31 * result1 + (userAgent != null ? userAgent.hashCode() : 0);
        result1 = 31 * result1 + (spendTime != null ? spendTime.hashCode() : 0);
        result1 = 31 * result1 + (description != null ? description.hashCode() : 0);
        return result1;
    }
}
