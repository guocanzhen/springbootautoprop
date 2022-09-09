package com.guocz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author guocz
 * @date 2022/9/2 11:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {

    @Autowired
    private A a;

    @Autowired
    private ApplicationContext context;

    @Test
    public void test() {
        A a1 = context.getBean("a", A.class);
        System.out.println("最终拿到了==> " + a1);
    }

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MyAutoConfig.class);
        A a1 = context1.getBean("a", A.class);
        System.out.println(a1);
    }
}
