package com.dicoding.javafundamental.belajar.solid.openclosed;

public class Students {
    public void introduce() {
        System.out.println("I am a common student");
    }
}

 class HighSchoolStudent extends Student {
    @Override
    public void introduce() {
        System.out.println("I am an high school student");
    }
}

 class UnderGraduateStudent extends Student {
    @Override
    public void introduce() {
        System.out.println("I am a under graduate student");
    }
}
