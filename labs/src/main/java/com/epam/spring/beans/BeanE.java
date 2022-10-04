package com.epam.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE {
    private String name;
    private int value;

    public BeanE(@Value("beanE") String name) {
        this.name = name;
        this.value = 3;
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(this.getClass().getSimpleName() + " preDestroy");
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println(this.getClass().getSimpleName() + " postConstructor");
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
