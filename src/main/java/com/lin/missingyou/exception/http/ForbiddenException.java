/**
 * @作者 努力中的杨先生
 * @描述 禁止访问
 * @创建时间 2020-04-28 22:45
 */
package com.lin.missingyou.exception.http;

public class ForbiddenException extends HttpException{
    public  ForbiddenException(int code){
        this.code = code;
        this.HttpstatusCode = 403;
    }
}
