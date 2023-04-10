package com.dyx.mobilegis.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String userPhone;
    private String userPassword;
    private String userPosition;

    public User(String userPhone, String userPassword) {
        this.userPhone = userPhone;
        this.userPassword = userPassword;
    }

    public Integer getUserId() { return userId;}

    public void setUserId(Integer userId) { this.userId = userId;}

    public String getUserName() { return userName;}

    public void setUserName(String userName) { this.userName = userName;}

    public String getUserPhone() { return userPhone;}

    public void setUserPhone(String userPhone) { this.userPhone = userPhone;}

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }
}
