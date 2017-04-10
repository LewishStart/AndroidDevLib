package com.lewish.start.android_lib.net.entity;

import java.io.Serializable;

/**
 * author: sundong
 * created at 2017/4/7 10:27
 */
public class CommonJson<T> implements Serializable {
    private boolean isError;
    private String ecode;
    private String emsg;
    private T data;

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public String getEmsg() {
        return emsg;
    }

    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
