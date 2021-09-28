package com.donnu.lab2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Task03 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Employee employee = context.getBean("employeeBean", Employee.class);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        employee.callYourPet();
        employee.openTheCar();

        context.close();
    }
}
