/**
 * @作者 努力中的杨先生
 * @描述 配置文件的读取并且提供getMessage()方法
 * @创建时间 2020-04-29 0:30
 */
package com.lin.missingyou.core.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;
@ConfigurationProperties(prefix = "lin")
@PropertySource(value = "classpath:config/exception-code.properties")
@Component
public class ExceptionCodeConfiguration {
/*
  codes看做是 Map数据结构，键值对应
 */
    private Map<Integer, String>codes;

    public Map<Integer, String> getCodes() {
        return codes;
    }
    public void setCodes(Map<Integer, String> codes) {
        this.codes = codes;
    }

    public String getMessage(int code){
        String message = codes.get(code);
        return message;
    }

}
