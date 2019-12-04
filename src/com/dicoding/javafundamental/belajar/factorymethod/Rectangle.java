package com.dicoding.javafundamental.belajar.factorymethod;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}


// create the concrete classes that implements abstract class