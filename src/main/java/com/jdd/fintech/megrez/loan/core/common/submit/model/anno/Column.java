package com.jdd.fintech.megrez.loan.core.common.submit.model.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 监管报送字段信息注解
 * @author xiaoqianbin
 * @date 2020/4/21
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

    // 字段在报送文件中的位置标号，从0开始
    int order();

    // 字段说明信息
    String comment() default "";

    // 字段长度信息
    int length() default 0;

    // 是否可以为空
    boolean canBeEmpty() default true;
}
