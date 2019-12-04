package com.dicoding.javafundamental.belajar.inheritance;

public class Parent {
    int value = 100;
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    int value = 10;
    Child() {
        System.out.println("Child Constructor");
    }
}

class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Reference of Child Type : " + obj.value);

        // Note that doing "Parent par = new Child()"
        // would produce same result
        Parent par = obj;

        // Par holding obj will access the value
        // variable of parent class
        System.out.println("Reference of Parent Type : " + par.value);
    }
}
