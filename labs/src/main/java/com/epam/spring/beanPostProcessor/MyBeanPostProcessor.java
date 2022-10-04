package com.epam.spring.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("start initialization");
        try {
            Field name = bean.getClass().getDeclaredField("name");
            Field value = bean.getClass().getDeclaredField("value");
            value.setAccessible(true);
            name.setAccessible(true);
            if(name.get(bean) == null && (Integer)value.get(bean) > 0 ) {
                throw new RuntimeException();
            }
        } catch ( NoSuchFieldException | SecurityException |  IllegalArgumentException | IllegalAccessException e) {
            System.out.println("error");
        } catch (RuntimeException err) {
            throw new RuntimeException();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
