package com.smart.model;

import java.sql.Timestamp;

/**
 * Created by gaowei on 2017/10/28.
 */
public class Correct {

    private int id;

    private int myId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(int homeworkId) {
        this.homeworkId = homeworkId;
    }

    public char getLevelFlag() {
        return levelFlag;
    }

    public void setLevelFlag(char levelFlag) {
        this.levelFlag = levelFlag;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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

    private int userId;

    private int homeworkId;

    private char levelFlag;

    private String mark;

    private Timestamp createTime;

    private Timestamp updateTime;


}
