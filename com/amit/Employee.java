package com.amit;

public class Employee {
    private String name ;
    public Employee(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + name + "!");
    }
}
