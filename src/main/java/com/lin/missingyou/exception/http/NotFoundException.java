/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-28 22:42
 */
package com.lin.missingyou.exception.http;

public class NotFoundException extends HttpException{
    public NotFoundException(int code){
        this.HttpstatusCode = 404;
        this.code = code;
    }
}
