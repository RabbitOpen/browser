package com.jdd.fintech.megrez.loan.core.common.submit.model.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 文件输出格式
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Format {

    // 值前缀
    String prefix() default "";

    // 值后缀
    String suffix() default "";

    // 分隔符
    String split() default ",";

}
