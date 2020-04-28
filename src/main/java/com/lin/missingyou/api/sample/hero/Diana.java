/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-27 21:26
 */
package com.lin.missingyou.api.sample.hero;

import org.springframework.stereotype.Component;


public class Diana implements ISkill {
    public Diana() {
        System.out.println("Diana");
    }
    public void q(){
        System.out.println("Diana q");
    }
    public void w(){
        System.out.println("Diana w");
    }
    public void e(){
        System.out.println("Diana e");
    }
    public void r(){
        System.out.println("Diana r");
    }
}
