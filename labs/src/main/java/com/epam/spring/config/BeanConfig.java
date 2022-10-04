package com.epam.spring.config;

import com.epam.spring.beans.BeanA;
import com.epam.spring.beans.BeanB;
import com.epam.spring.beans.BeanC;
import com.epam.spring.beans.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@PropertySource("application.properties")
@ComponentScan( basePackages = {"com.epam.spring.beans", "com.epam.spring.beanPostProcessor", "com.epam.spring.beanFactoryPostProcessor"})
public class BeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Order(2)
    public BeanB beanB(@Value("${beanB.name}") String name, @Value("${beanB.value}") String value) {
        return new BeanB(name, Integer.parseInt(value));
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Order(3)
    public BeanC beanC(@Value("${beanC.name}") String name, @Value("${beanC.value}") String value) {
        return new BeanC(name, Integer.parseInt(value));
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Order(1)
    public BeanD beanD(@Value("${beanD.name}") String name, @Value("${beanD.value}") String value) {
        return new BeanD(name, Integer.parseInt(value));
    }

}
