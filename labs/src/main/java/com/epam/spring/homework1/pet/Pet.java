package com.epam.spring.homework1.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Component
public class Pet {

    @Autowired
    private List<Animal> pets;
    public void printPets() {
        pets.forEach(el -> {
            System.out.println(el.getClass().getSimpleName());
        });
    }
}
