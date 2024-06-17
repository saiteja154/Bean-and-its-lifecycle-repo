package com.example.Bean_and_its_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Order order;

    public User(){
        System.out.println("initializing user");
    }

    @PostConstruct
    public void initialize(){

        System.out.println("Bean has been Constructed and dependencies have been injected ");

    }

    @PreDestroy
    public  void beforeDestroy(){

        System.out.println("Bean is about to destroy in PreDestroy Method");

    }
}
