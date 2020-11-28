package com.xizi.config;


import com.xizi.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class xiziconfig2 {



    @Bean
    public User user(){
        return new User("xizizzz");
    }
}
