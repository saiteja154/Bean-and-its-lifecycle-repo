package com.example.Bean_and_its_lifecycle;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserAppConfiguration {

    @Bean
    public UserWithConstructor createUserBean(){
        return new UserWithConstructor("defaultUserName","defaultEmail");
    }

}
