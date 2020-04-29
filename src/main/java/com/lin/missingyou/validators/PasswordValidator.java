/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-29 16:32
 */
package com.lin.missingyou.validators;

import com.lin.missingyou.DTO.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {
   private int min;
   private int max;
    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
    String password1 = personDTO.getPassword1();
    String passwword2 = personDTO.getPassword2();
    //相关逻辑
        return password1.equals(passwword2);
    }

    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        // 获取注解的最大值和最小值参数
        min = constraintAnnotation.min();
        max = constraintAnnotation.max();
    }
}
