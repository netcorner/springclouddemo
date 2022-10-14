package com.netcorner.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by shijiufeng on 2022/1/23.
 */
@Entity
@Table(name = "sys_user", schema = "testssx", catalog = "")
public class SysUserEntity {
    private int id;
    private String userName;
    private String realName;
    private String pwd;
    private Timestamp lastLoginTime;
    private String lastLoginIp;
    private Timestamp regTime;
    private byte[] descripts;
    private String question;
    private String answer;
    private String email;
    private String tel;
    private String mobile;
    private Integer isLockedOut;
    private Timestamp lastPasswordChangedDate;
    private Integer failedPasswordAttemptCount;
    private Integer failedPasswordAnswerAttemptCount;
    private Integer loginTimes;
    private String verifyCode;
    private Timestamp verifme;
    private String verifyIp;
    private Integer integral;
    private Integer viewTimes;
    private String userIdentity;
    private BigDecimal money;
    private String signMsg;
    private byte isDeleted;
    private Timestamp deletedOn;
    private Timestamp createdOn;
    private Integer createdBy;
    private Timestamp lastModifiedOn;
    private Integer lastModifiedBy;
    private Integer status;
    private String userPhoto;
    private String userKey;
    private Integer sex;
    private Integer hasPassword;
    private Integer dataVer;
    private Date born;
    private String clientId;
    private String releaseVer;
    private String model;
    private String release;
    private Double lat;
    private Double lon;
    private Integer userRoleId;
    private String idNumber;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "RealName")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "Pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "LastLoginTime")
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "LastLoginIP")
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "RegTime")
    public Timestamp getRegTime() {
        return regTime;
    }

    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    @Basic
    @Column(name = "Descripts")
    public byte[] getDescripts() {
        return descripts;
    }

    public void setDescripts(byte[] descripts) {
        this.descripts = descripts;
    }

    @Basic
    @Column(name = "Question")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "Answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "Mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "IsLockedOut")
    public Integer getIsLockedOut() {
        return isLockedOut;
    }

    public void setIsLockedOut(Integer isLockedOut) {
        this.isLockedOut = isLockedOut;
    }

    @Basic
    @Column(name = "LastPasswordChangedDate")
    public Timestamp getLastPasswordChangedDate() {
        return lastPasswordChangedDate;
    }

    public void setLastPasswordChangedDate(Timestamp lastPasswordChangedDate) {
        this.lastPasswordChangedDate = lastPasswordChangedDate;
    }

    @Basic
    @Column(name = "FailedPasswordAttemptCount")
    public Integer getFailedPasswordAttemptCount() {
        return failedPasswordAttemptCount;
    }

    public void setFailedPasswordAttemptCount(Integer failedPasswordAttemptCount) {
        this.failedPasswordAttemptCount = failedPasswordAttemptCount;
    }

    @Basic
    @Column(name = "FailedPasswordAnswerAttemptCount")
    public Integer getFailedPasswordAnswerAttemptCount() {
        return failedPasswordAnswerAttemptCount;
    }

    public void setFailedPasswordAnswerAttemptCount(Integer failedPasswordAnswerAttemptCount) {
        this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
    }

    @Basic
    @Column(name = "LoginTimes")
    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    @Basic
    @Column(name = "VerifyCode")
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    @Basic
    @Column(name = "Verifme")
    public Timestamp getVerifme() {
        return verifme;
    }

    public void setVerifme(Timestamp verifme) {
        this.verifme = verifme;
    }

    @Basic
    @Column(name = "VerifyIP")
    public String getVerifyIp() {
        return verifyIp;
    }

    public void setVerifyIp(String verifyIp) {
        this.verifyIp = verifyIp;
    }

    @Basic
    @Column(name = "Integral")
    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    @Basic
    @Column(name = "ViewTimes")
    public Integer getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(Integer viewTimes) {
        this.viewTimes = viewTimes;
    }

    @Basic
    @Column(name = "UserIdentity")
    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Basic
    @Column(name = "Money")
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Basic
    @Column(name = "SignMsg")
    public String getSignMsg() {
        return signMsg;
    }

    public void setSignMsg(String signMsg) {
        this.signMsg = signMsg;
    }

    @Basic
    @Column(name = "IsDeleted")
    public byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "DeletedOn")
    public Timestamp getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Timestamp deletedOn) {
        this.deletedOn = deletedOn;
    }

    @Basic
    @Column(name = "CreatedOn")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "CreatedBy")
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "LastModifiedOn")
    public Timestamp getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(Timestamp lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    @Basic
    @Column(name = "LastModifiedBy")
    public Integer getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Integer lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
    @Column(name = "UserPhoto")
    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Basic
    @Column(name = "UserKey")
    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    @Basic
    @Column(name = "Sex")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "HasPassword")
    public Integer getHasPassword() {
        return hasPassword;
    }

    public void setHasPassword(Integer hasPassword) {
        this.hasPassword = hasPassword;
    }

    @Basic
    @Column(name = "DataVer")
    public Integer getDataVer() {
        return dataVer;
    }

    public void setDataVer(Integer dataVer) {
        this.dataVer = dataVer;
    }

    @Basic
    @Column(name = "Born")
    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    @Basic
    @Column(name = "ClientID")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "ReleaseVer")
    public String getReleaseVer() {
        return releaseVer;
    }

    public void setReleaseVer(String releaseVer) {
        this.releaseVer = releaseVer;
    }

    @Basic
    @Column(name = "Model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "Release")
    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    @Basic
    @Column(name = "Lat")
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "Lon")
    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
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
    @Column(name = "IdNumber")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUserEntity that = (SysUserEntity) o;

        if (id != that.id) return false;
        if (isDeleted != that.isDeleted) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(that.lastLoginTime) : that.lastLoginTime != null)
            return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(that.lastLoginIp) : that.lastLoginIp != null) return false;
        if (regTime != null ? !regTime.equals(that.regTime) : that.regTime != null) return false;
        if (!Arrays.equals(descripts, that.descripts)) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (isLockedOut != null ? !isLockedOut.equals(that.isLockedOut) : that.isLockedOut != null) return false;
        if (lastPasswordChangedDate != null ? !lastPasswordChangedDate.equals(that.lastPasswordChangedDate) : that.lastPasswordChangedDate != null)
            return false;
        if (failedPasswordAttemptCount != null ? !failedPasswordAttemptCount.equals(that.failedPasswordAttemptCount) : that.failedPasswordAttemptCount != null)
            return false;
        if (failedPasswordAnswerAttemptCount != null ? !failedPasswordAnswerAttemptCount.equals(that.failedPasswordAnswerAttemptCount) : that.failedPasswordAnswerAttemptCount != null)
            return false;
        if (loginTimes != null ? !loginTimes.equals(that.loginTimes) : that.loginTimes != null) return false;
        if (verifyCode != null ? !verifyCode.equals(that.verifyCode) : that.verifyCode != null) return false;
        if (verifme != null ? !verifme.equals(that.verifme) : that.verifme != null) return false;
        if (verifyIp != null ? !verifyIp.equals(that.verifyIp) : that.verifyIp != null) return false;
        if (integral != null ? !integral.equals(that.integral) : that.integral != null) return false;
        if (viewTimes != null ? !viewTimes.equals(that.viewTimes) : that.viewTimes != null) return false;
        if (userIdentity != null ? !userIdentity.equals(that.userIdentity) : that.userIdentity != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (signMsg != null ? !signMsg.equals(that.signMsg) : that.signMsg != null) return false;
        if (deletedOn != null ? !deletedOn.equals(that.deletedOn) : that.deletedOn != null) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastModifiedOn != null ? !lastModifiedOn.equals(that.lastModifiedOn) : that.lastModifiedOn != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (userPhoto != null ? !userPhoto.equals(that.userPhoto) : that.userPhoto != null) return false;
        if (userKey != null ? !userKey.equals(that.userKey) : that.userKey != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (hasPassword != null ? !hasPassword.equals(that.hasPassword) : that.hasPassword != null) return false;
        if (dataVer != null ? !dataVer.equals(that.dataVer) : that.dataVer != null) return false;
        if (born != null ? !born.equals(that.born) : that.born != null) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (releaseVer != null ? !releaseVer.equals(that.releaseVer) : that.releaseVer != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (release != null ? !release.equals(that.release) : that.release != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lon != null ? !lon.equals(that.lon) : that.lon != null) return false;
        if (userRoleId != null ? !userRoleId.equals(that.userRoleId) : that.userRoleId != null) return false;
        if (idNumber != null ? !idNumber.equals(that.idNumber) : that.idNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + (regTime != null ? regTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(descripts);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (isLockedOut != null ? isLockedOut.hashCode() : 0);
        result = 31 * result + (lastPasswordChangedDate != null ? lastPasswordChangedDate.hashCode() : 0);
        result = 31 * result + (failedPasswordAttemptCount != null ? failedPasswordAttemptCount.hashCode() : 0);
        result = 31 * result + (failedPasswordAnswerAttemptCount != null ? failedPasswordAnswerAttemptCount.hashCode() : 0);
        result = 31 * result + (loginTimes != null ? loginTimes.hashCode() : 0);
        result = 31 * result + (verifyCode != null ? verifyCode.hashCode() : 0);
        result = 31 * result + (verifme != null ? verifme.hashCode() : 0);
        result = 31 * result + (verifyIp != null ? verifyIp.hashCode() : 0);
        result = 31 * result + (integral != null ? integral.hashCode() : 0);
        result = 31 * result + (viewTimes != null ? viewTimes.hashCode() : 0);
        result = 31 * result + (userIdentity != null ? userIdentity.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (signMsg != null ? signMsg.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        result = 31 * result + (deletedOn != null ? deletedOn.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifiedOn != null ? lastModifiedOn.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userPhoto != null ? userPhoto.hashCode() : 0);
        result = 31 * result + (userKey != null ? userKey.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (hasPassword != null ? hasPassword.hashCode() : 0);
        result = 31 * result + (dataVer != null ? dataVer.hashCode() : 0);
        result = 31 * result + (born != null ? born.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (releaseVer != null ? releaseVer.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (release != null ? release.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (userRoleId != null ? userRoleId.hashCode() : 0);
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        return result;
    }
}
