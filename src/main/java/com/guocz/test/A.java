package com.guocz.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author guocz
 * @date 2022/9/2 10:54
 */
//@Component(value = "a")
@Data
public class A {

    @Value("我是AAA")
    private String name;

    @Autowired
    private B b;

}
