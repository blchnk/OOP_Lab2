package com.donnu.lab2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task01 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        context.close();
    }
}
