package com.epam.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean {

    public BeanA(@Value("beanA") String name) {
        this.name = name;
        this.value = 4;
    }
    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "destroy DisposalBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "afterPropertiesSet InitializingBean");
    }
}
