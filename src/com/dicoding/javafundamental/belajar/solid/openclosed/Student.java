package com.dicoding.javafundamental.belajar.solid.openclosed;

public class Student {
    private String type;

    public void introduce() {
        if ("highSchool".equals(type)) {
            System.out.println("I am an high school student");
        } else if ("underGraduate".equals(type)) {
            System.out.println("I am a under graduate student");
        } else {
            System.out.println("I am a common student");
        }
    }
}
