package com.dicoding.javafundamental.belajar.belajarabstract;

public class AbstractDemo {
    public static void main(String[] args) {

//        // Following is not allowed nd would raise an error
//        Employee e = new Employee("George W.", "Houston, TX", 43);
//        System.out.println("\n Call mailCheck using Employee reference--");
//        e.mailCheck();


        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        s.computePays();
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
        e.computePays();
    }
}