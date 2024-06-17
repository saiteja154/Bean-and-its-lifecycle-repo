package com.example.Bean_and_its_lifecycle;

import org.springframework.stereotype.Component;

@Component
public class UserWithDeafultConstructor {
    String userName;
    String name;

    /*
    Spring use's default constructor to initialization the object .
     */
    public UserWithDeafultConstructor(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
