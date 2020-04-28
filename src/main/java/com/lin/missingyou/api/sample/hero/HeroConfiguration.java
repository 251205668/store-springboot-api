/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-28 16:34
 */
package com.lin.missingyou.api.sample.hero;

import com.lin.missingyou.api.sample.condition.Dianacondition;
import com.lin.missingyou.api.sample.condition.Gailuncondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author 努力中的杨先生
 * 配置类注入和条件注解
 */
@Configuration
public class HeroConfiguration {
    @Bean
    public ISkill diana(){
        return new Diana();
    }
//    @Bean
    public ISkill gailun(){
        return new Gailun();
    }

}
