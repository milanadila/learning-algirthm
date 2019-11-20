package com.dicoding.javafundamental.belajar.conathrowdanthrows;

public class ThrowsExample {
    static void apaanNi() throws ClassNotFoundException{
        System.out.println("Ada Yang Error Ni!");
        throw new ClassNotFoundException("Udah Saya Tangkap");
    }
}

 class latihan {

    public static void main(String[] args){
        try{
            ThrowsExample.apaanNi();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
