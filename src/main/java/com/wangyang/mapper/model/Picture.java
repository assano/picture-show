package com.wangyang.mapper.model;

import java.util.Date;

public class Picture {
    private Integer id;

    private Integer userId;

    private String smallPicturePath;

    private String largePicturePath;

    private Date uploadTime;

    private String pictureName;

    private String pictureDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSmallPicturePath() {
        return smallPicturePath;
    }

    public void setSmallPicturePath(String smallPicturePath) {
        this.smallPicturePath = smallPicturePath == null ? null : smallPicturePath.trim();
    }

    public String getLargePicturePath() {
        return largePicturePath;
    }

    public void setLargePicturePath(String largePicturePath) {
        this.largePicturePath = largePicturePath == null ? null : largePicturePath.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    public String getPictureDescription() {
        return pictureDescription;
    }

    public void setPictureDescription(String pictureDescription) {
        this.pictureDescription = pictureDescription == null ? null : pictureDescription.trim();
    }
}