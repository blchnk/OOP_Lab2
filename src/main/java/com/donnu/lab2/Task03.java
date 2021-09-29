package com.donnu.lab2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Task03 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig1.class);

        Employee employee = context.getBean("employeeBean", Employee.class);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        employee.callYourPet();
        employee.openTheCar();

        System.out.println("---------------------");

        Employee employee1 = context.getBean("employeeBean", Employee.class);
        employee1.setName("Vlad");
        employee1.setAge(21);
        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        employee1.callYourPet();
        employee1.openTheCar();

        context.close();
    }
}
