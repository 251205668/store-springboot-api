/**
 * @作者 努力中的杨先生
 * @描述 统一异常返回格式 code message request
 * @创建时间 2020-04-28 23:07
 */
package com.lin.missingyou.core;

public class UnifyException {
    private int code;
    private String message;
    private String request;

    public UnifyException(int code, String message, String request) {
        this.code = code;
        this.message = message;
        this.request = request;
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

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
