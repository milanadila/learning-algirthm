package com.dicoding.javafundamental.belajar.encapsulation;

public class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // get method for age to access
    // private variable geekAge
    public String getGeekName() {
        return geekName;
    }

    // set method for name to access
    // private variable geekName
    public void setGeekName(String geekName) {
        this.geekName = geekName;
    }

    public int getGeekRoll() {
        return geekRoll;
    }

    public void setGeekRoll(int geekRoll) {
        this.geekRoll = geekRoll;
    }

    public int getGeekAge() {
        return geekAge;
    }

    public void setGeekAge(int geekAge) {
        this.geekAge = geekAge;
    }
}
