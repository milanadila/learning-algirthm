package com.dicoding.javafundamental.belajar.solid.liskov;

public interface Animal {
    void walk();
    void makeNoise();
    void eat();
}

class Duck implements Animal {
    public void makeNoise() {
        System.out.println("kwak kwak");
    }

    public void eat() {
        System.out.println("I eat cheese");
    }

    public void walk() {
        System.out.println("Use two leg");
    }
}

//class DuckToy extends Duck {
//    private String battery;
//    public void eat() {
//        throw new Exception("Dont eat");
//    }
//
//    public void setBattery(String battery){
//        this.battery = battery;
//    }
//
//    public String getBattery() {
//        return this.battery;
//    }
//}


