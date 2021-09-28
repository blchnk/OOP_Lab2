package com.donnu.lab2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig1 {

    @Bean
    @Scope("prototype")
    public Employee employeeBean(){
        return new Employee();
    }

    @Bean
    @Scope("prototype")
    public Dog dogBean(){
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public BMW bmwBean(){
        return new BMW();
    }
}
