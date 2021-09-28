package com.donnu.lab2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bmwBean")
@Scope("prototype")
public class BMW implements ICar {

    @Override
    public void explosion(){
        System.out.println("B-O-O-O-M!!!");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class BMW: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class BMW: destroy method");
    }
}
