/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-28 16:49
 */
package com.lin.missingyou.api.sample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Gailuncondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return false;
    }
}
