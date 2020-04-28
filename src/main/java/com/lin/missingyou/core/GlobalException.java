/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-28 17:26
 */
package com.lin.missingyou.core;

import com.lin.missingyou.core.configuration.ExceptionCodeConfiguration;
import com.lin.missingyou.exception.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalException {
    @Autowired
    private ExceptionCodeConfiguration codeConfiguration;
    // 未知异常

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyException handleException(HttpServletRequest req,Exception e){
        // 当有checkedException异常抛出,加上这两个方法,会在全局捕捉到异常,并运行方法
        String url = req.getRequestURI();
        String method =req.getMethod();
        UnifyException message = new UnifyException(999,"服务器异常",method+" "+url);
        return message;
    }

    //已知异常

    @ExceptionHandler(HttpException.class)
    public ResponseEntity<UnifyException> handleHttpException(HttpServletRequest req, HttpException e){
        String url = req.getRequestURI();
        String method = req.getMethod();
        UnifyException message = new UnifyException(e.getCode(),codeConfiguration.getMessage(e.getCode()),method+" "+url);
        // 设置已知异常的Httpstatus 利用泛型设置
        //ResponseEntity<UnifyResponse> r = new ResponseEntity<>(message,header,httpStatus);
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);

        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpstatusCode());
        ResponseEntity<UnifyException> r = new ResponseEntity<>(message,header,httpStatus);
        return r;
    }

}
