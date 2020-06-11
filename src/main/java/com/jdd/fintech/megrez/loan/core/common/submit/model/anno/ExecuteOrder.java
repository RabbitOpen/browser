package com.jdd.fintech.megrez.loan.core.common.submit.model.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 监管报送服务执行顺序注解
 * @author yuanjingshen
 * @date 2020/4/30
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExecuteOrder {
    int order() default -1;
}
