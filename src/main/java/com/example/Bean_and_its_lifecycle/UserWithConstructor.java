package com.example.Bean_and_its_lifecycle;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Component
public class UserWithConstructor {
    String userName;
    String name;

    /*
    with help of @Component:  application will not run because of no defalut construct. spring unable to create the bean of this class.
    that's where @Bean come's into the picture


    @Bean comes into the picture , where we provide the External configuration details
    and tells spring boot to use it while creating a Bean.
     */

    public UserWithConstructor() {

    }

    public UserWithConstructor(String userName, String name){
        this.userName=userName;
        this.name=name;
        // System.out.println("hihi");
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
