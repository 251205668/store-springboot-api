/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-27 22:14
 */
package com.lin.missingyou.api.sample.hero;

import org.springframework.stereotype.Component;

//@Component
public class Gailun implements ISkill {
    public void q(){
        System.out.println("Gailun q");
    }
    public void w(){
        System.out.println("Gailun w");
    }
    public void e(){
        System.out.println("Gailun e");
    }
    public void r(){
        System.out.println("Gailun r");
    }
}
