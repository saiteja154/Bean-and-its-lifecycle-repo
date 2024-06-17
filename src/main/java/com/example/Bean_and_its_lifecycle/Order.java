package com.example.Bean_and_its_lifecycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {

    public Order(){
        System.out.println("Lazy : initializing Order");
    }
}
