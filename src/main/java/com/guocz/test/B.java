package com.guocz.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author guocz
 * @date 2022/9/2 10:55
 */
//@Component("b")
public class B {

    @Value("我是BBB")
    private String name;

}
