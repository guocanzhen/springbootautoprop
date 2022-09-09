package com.guocz.test.config;

import com.guocz.test.A;
import com.guocz.test.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guocz
 * @date 2022/9/2 14:50
 */
@Configuration
public class MyConfig {

    @Bean(name = "a")
    public A a() {
        return new A();
    }

    @Bean(name = "b")
    public B b() {
        return new B();
    }
}
