package com.smart.model;

import java.sql.Timestamp;

/**
 * Created by gaowei on 2017/10/28.
 */
public class HomeWork {
    private int id;

    private int userId;

    private int classId;

    private int lessionId;

    private String filePath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getLessionId() {
        return lessionId;
    }

    public void setLessionId(int lessionId) {
        this.lessionId = lessionId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public int getCorrectFlag() {
        return correctFlag;
    }

    public void setCorrectFlag(int correctFlag) {
        this.correctFlag = correctFlag;
    }

    public int getStar_count() {
        return star_count;
    }

    public void setStar_count(int star_count) {
        this.star_count = star_count;
    }

    public int getNegativeCount() {
        return negativeCount;
    }

    public void setNegativeCount(int negativeCount) {
        this.negativeCount = negativeCount;
    }

    public int getBestFlag() {
        return bestFlag;
    }

    public void setBestFlag(int bestFlag) {
        this.bestFlag = bestFlag;
    }

    private String fileName;

    private Timestamp createTime;

    private Timestamp updateTime;

    private int correctFlag;

    private int star_count;

    private int negativeCount;

    private int bestFlag;
}
