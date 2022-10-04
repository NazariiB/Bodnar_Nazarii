package com.epam.spring.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory conLisBeanFactory) throws BeansException {
        System.out.println(this.getClass().getSimpleName() + " beginning");
        System.out.println("Previous method name: " + conLisBeanFactory.getBeanDefinition("beanB").getInitMethodName());
        conLisBeanFactory.getBeanDefinition("beanB").setInitMethodName("anotherInit");
        System.out.println(this.getClass().getSimpleName() + " end");
    }
}
