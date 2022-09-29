package com.epam.spring.homework1.config;

import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Spider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework1.pet", excludeFilters = @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE,
        classes = Spider.class))
public class PetConfig {

    @Bean
    @Primary
    public Cheetah ch() {
        return new Cheetah();
    }

    @Bean
    @Qualifier
    public Cheetah chSecond() {
        return new Cheetah();
    }
}
