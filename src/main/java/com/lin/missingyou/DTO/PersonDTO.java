/**
 * @作者 努力中的杨先生
 * @描述 自定义接收 body数据类
 * @创建时间 2020-04-29 14:12
 */
package com.lin.missingyou.DTO;

import com.lin.missingyou.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;

@Builder
@Getter
@PasswordEqual(min = 1,message = "两次密码不相同")
public class PersonDTO {
    @Length(min = 1,max = 8,message = "长度应该在1到8之间")
    private String name;
    private Integer age;
    private String password1;
    private String password2;
    @Valid
    private SchoolDTO schoolDTO;
}
