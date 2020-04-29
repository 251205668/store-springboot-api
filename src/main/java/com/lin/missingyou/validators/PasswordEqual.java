package com.lin.missingyou.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author 努力中的杨先生
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(validatedBy = PasswordValidator.class)
public @interface PasswordEqual {
    String message() default "password is not equal";
    int min() default 4;
    int max() default 8;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
