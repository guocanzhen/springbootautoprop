package com.guocz.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guocz
 * @date 2022/9/2 10:35
 */
@RestController
@RequestMapping
public class TestController {

    @Autowired
    private A a;

    @RequestMapping("test")
    public void test() {
        System.out.println();
    }
}
