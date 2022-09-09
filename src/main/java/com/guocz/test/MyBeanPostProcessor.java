package com.guocz.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author guocz
 * @date 2022/9/2 13:52
 */
public class MyBeanPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        GenericBeanDefinition a = (GenericBeanDefinition) configurableListableBeanFactory.getBeanDefinition("a");
        a.setBeanClass(B.class);
    }
}
