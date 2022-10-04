package com.epam.spring;

import com.epam.spring.config.AnotherConfig;
import com.epam.spring.beanFactoryPostProcessor.MyBeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class DemoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnotherConfig.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        Arrays.stream(context.getDefaultListableBeanFactory().getBeanDefinitionNames())
                .forEach(item ->System.out.println(context.getDefaultListableBeanFactory().getBeanDefinition(item)));

        context.close();
    }
}
