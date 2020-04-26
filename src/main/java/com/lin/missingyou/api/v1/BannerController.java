/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-04-27 0:30
 */
package com.lin.missingyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author 努力中的杨先生
 */
@Controller
public class BannerController {
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "七月牛逼";
    }
}
