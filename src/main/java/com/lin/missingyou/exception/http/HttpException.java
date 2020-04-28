/**
 * @作者 努力中的杨先生
 * @描述 HttpException父类
 * @创建时间 2020-04-28 22:41
 */
package com.lin.missingyou.exception.http;

public class HttpException extends RuntimeException{
    protected Integer code;
    protected Integer HttpstatusCode;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getHttpstatusCode() {
        return HttpstatusCode;
    }

    public void setHttpstatusCode(Integer httpstatusCode) {
        HttpstatusCode = httpstatusCode;
    }
}
