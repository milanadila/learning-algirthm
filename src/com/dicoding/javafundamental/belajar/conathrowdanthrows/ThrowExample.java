package com.dicoding.javafundamental.belajar.conathrowdanthrows;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int bebek;

        System.out.println("Wildan Tolong Bawakan 2 Ekor Bebek Dikandang");

        try{
            System.out.print("Jumlah Bebek Yang Ingin Dibawa: ");
            bebek = input.nextInt();
            if(bebek > 2){
                //Jika Bebek Yang Kita Bawa lebih dari 2, maka akan terjad error
                throw new Exception("Terjadi Kesalahan  Nih!");
            }else{
                System.out.println("Aman-Aman Saja");
            }
        }catch(Exception e){
            //Menampilkan Pesan Kesalahan
            e.printStackTrace();
        }
    }
}
