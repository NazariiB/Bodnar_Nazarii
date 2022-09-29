package com.epam.spring.homework1.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    @Autowired
    public BeanA() {
        System.out.println(this.getClass().getSimpleName());
    }
}
