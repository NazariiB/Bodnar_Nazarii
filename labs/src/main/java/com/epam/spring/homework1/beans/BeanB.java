package com.epam.spring.homework1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    @Autowired
    public BeanB() {
        System.out.println(this.getClass().getSimpleName());
    }
}
