package com.example.glidelearn.http;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 235297835691709362L;
    private static int SUCCESS_CODE = 0;//成功的code

    private int errorCode;
    private String errorMsg;
    private T data;

    public int getCode() {
        return errorCode;
    }

    public void setCode(int code) {
        this.errorCode = code;
    }

    public String getMsg() {
        return errorMsg;
    }

    public void setMsg(String msg) {
        this.errorMsg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return getCode() == SUCCESS_CODE;
    }
}
