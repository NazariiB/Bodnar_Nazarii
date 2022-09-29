package com.epam.spring.homework1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanC {
    @Autowired
    public BeanC() {
        System.out.println(this.getClass().getSimpleName());
    }
}
