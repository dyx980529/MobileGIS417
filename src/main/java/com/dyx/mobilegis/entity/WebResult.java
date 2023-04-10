package com.dyx.mobilegis.entity;

public class WebResult<T> {
    private T data;//数据
    /*状态码
    ERROR(-1, "失败"),
    SUCCESS(0, "成功");*/
    private int code;
    private String message;//返回消息

    public WebResult() {

    }
    public WebResult(T data) {
        this.data = data;
    }

    //成功
    public void success() {
        this.code = 1;
        message ="成功";
    }
    //出错
    public void error() {
        this.code =-1;
        message = "出错";
    }
    //成功,携带信息
    public void success(String message) {
        this.code = 1;
        this.message = message;
    }
 /*   public WebResult webResultSuccess(T data) {
        return new WebResult().setData(data);
*//*        this.code = 1;
        this.message = message;*//*
    }*/
    //失败,携带信息
    public void error(String message) {
        this.code =-1;
        this.message = message;
    }
    public T getData() { return data; }
    public WebResult setData(T data) {
        this.data = data;
        return this;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
