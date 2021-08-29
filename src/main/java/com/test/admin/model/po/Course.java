package com.test.admin.model.po;

import java.math.BigDecimal;
import java.util.Date;

public class Course {
    private Integer actListId;

    private String actTitle;

    private String actContent;

    private Byte type;

    private Date actBeginTime;

    private Date actEndTime;

    private String actRule;

    private String bgPictureApp;

    private String popPicturePc;

    private String bgPicturePc;

    private String sharePicture;

    private Byte popUp;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

    private BigDecimal actMoney;

    public Integer getActListId() {
        return actListId;
    }

    public void setActListId(Integer actListId) {
        this.actListId = actListId;
    }

    public String getActTitle() {
        return actTitle;
    }

    public void setActTitle(String actTitle) {
        this.actTitle = actTitle == null ? null : actTitle.trim();
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent == null ? null : actContent.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getActBeginTime() {
        return actBeginTime;
    }

    public void setActBeginTime(Date actBeginTime) {
        this.actBeginTime = actBeginTime;
    }

    public Date getActEndTime() {
        return actEndTime;
    }

    public void setActEndTime(Date actEndTime) {
        this.actEndTime = actEndTime;
    }

    public String getActRule() {
        return actRule;
    }

    public void setActRule(String actRule) {
        this.actRule = actRule == null ? null : actRule.trim();
    }

    public String getBgPictureApp() {
        return bgPictureApp;
    }

    public void setBgPictureApp(String bgPictureApp) {
        this.bgPictureApp = bgPictureApp == null ? null : bgPictureApp.trim();
    }

    public String getPopPicturePc() {
        return popPicturePc;
    }

    public void setPopPicturePc(String popPicturePc) {
        this.popPicturePc = popPicturePc == null ? null : popPicturePc.trim();
    }

    public String getBgPicturePc() {
        return bgPicturePc;
    }

    public void setBgPicturePc(String bgPicturePc) {
        this.bgPicturePc = bgPicturePc == null ? null : bgPicturePc.trim();
    }

    public String getSharePicture() {
        return sharePicture;
    }

    public void setSharePicture(String sharePicture) {
        this.sharePicture = sharePicture == null ? null : sharePicture.trim();
    }

    public Byte getPopUp() {
        return popUp;
    }

    public void setPopUp(Byte popUp) {
        this.popUp = popUp;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public BigDecimal getActMoney() {
        return actMoney;
    }

    public void setActMoney(BigDecimal actMoney) {
        this.actMoney = actMoney;
    }
}