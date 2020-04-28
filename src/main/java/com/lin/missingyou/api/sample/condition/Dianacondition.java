/**
 * @作者 努力中的杨先生
 * @描述 使用条件注解解决bean注入问题
 * @创建时间 2020-04-28 16:47
 */
package com.lin.missingyou.api.sample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Dianacondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return true;
    }
}
