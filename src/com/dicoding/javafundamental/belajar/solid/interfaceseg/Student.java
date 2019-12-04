package com.dicoding.javafundamental.belajar.solid.interfaceseg;

public class Student implements Study {
    public void createPaper() {
        // create a paper
    }
    public void createThesis() {
        throw new IllegalStateException("not implement yet");
    }
}
