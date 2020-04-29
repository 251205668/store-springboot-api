
package com.lin.missingyou.api.v1;

import com.lin.missingyou.DTO.PersonDTO;
import com.lin.missingyou.api.sample.hero.Diana;
import com.lin.missingyou.api.sample.hero.ISkill;
import com.lin.missingyou.exception.http.NotFoundException;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author 努力中的杨先生
 */
@RestController
@RequestMapping("/v1/banner")
@Validated
public class BannerController {
    private final ISkill iSkill;

    public BannerController(ISkill iSkill) {
        this.iSkill = iSkill;
    }

    @GetMapping("/test/{id}")
    public PersonDTO test(@PathVariable @Range(min = 0,max = 10,message = "id不合法") Integer id){
        iSkill.r();
        PersonDTO personDTO1 = PersonDTO.builder().age(10).name("7yue").build();
        return personDTO1;
    }
    @PostMapping("/test")
    public PersonDTO test1(@RequestBody @Validated PersonDTO personDTO){
        PersonDTO personDTO1 = PersonDTO.builder().age(10).name("7yue").build();
        return personDTO1;
    }
}
