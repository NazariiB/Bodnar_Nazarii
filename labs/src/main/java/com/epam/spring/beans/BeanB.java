package com.epam.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private String name;
    private int value;

    public BeanB(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void anotherInit() {
        System.out.println(this.getClass().getSimpleName() + "  anotherInit");
    }

    public void init() {
        System.out.println(this.getClass().getSimpleName() + " init");
    }

    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + " destroy");
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
