package com.donnu.lab2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("employeeBean")
@Scope("prototype")
public class Employee {
    @Autowired
    @Qualifier("bmwBean")
    private ICar car;
    @Autowired
    @Qualifier("dogBean")
    private IPet pet;
    @Value("Nikita")
    private String name;
    @Value("20")
    private int age;

    @Autowired
    public void setCar(ICar car) {
        this.car = car;
        System.out.println("Class Employee: set Car");
    }

    @Autowired
    public void setPet(IPet pet){
        this.pet = pet;
        System.out.println("Class Employee: set Pet");
    }

    public void setName(String name){
        this.name = name;
        System.out.println("Class Employee: set name");
    }

    public void setAge(int age){
        this.age = age;
        System.out.println("Class Employee: set age");
    }

    public String getName() { return name; }

    public int getAge(){
        return age;
    }

    public Employee(){
        System.out.println("Employee bean was created");
    }

    public void openTheCar(){
        System.out.println("Opened");
        car.explosion();
    }

    public void callYourPet(){
        System.out.println("Hey!");
        pet.say();
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Employee: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Employee: destroy method");
    }
}
