package com.epam.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanConfig.class)
public class AnotherConfig {

}
