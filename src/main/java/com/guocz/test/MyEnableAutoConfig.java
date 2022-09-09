package com.guocz.test;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author guocz
 * @date 2022/9/2 14:40
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportSelector.class) // 导入bean定义
public @interface MyEnableAutoConfig {
}
