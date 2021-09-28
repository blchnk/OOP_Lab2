package com.donnu.lab2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Task02 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Employee employee = context.getBean("employeeBean", Employee.class);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        employee.callYourPet();
        employee.openTheCar();

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
