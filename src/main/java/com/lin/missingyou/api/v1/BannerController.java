
package com.lin.missingyou.api.v1;

import com.lin.missingyou.api.sample.hero.Diana;
import com.lin.missingyou.api.sample.hero.ISkill;
import com.lin.missingyou.exception.http.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 努力中的杨先生
 */
@RestController
@RequestMapping("/v1")
public class BannerController {
    private final ISkill iSkill;

    public BannerController(ISkill iSkill) {
        this.iSkill = iSkill;
    }

    @GetMapping("/test")
    public String test() throws Exception {
        iSkill.r();
        throw new NotFoundException(10001);
//        return "七月,牛逼";
    }
}
