package com.dicoding.javafundamental.belajar.superclass;

public class Employee extends Person{

    float salary = 4000f;
    String name = "Suji";
    int age = 22;

    public void showInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + this.salary);
    }
}
