package com.dicoding.javafundamental.belajar.polimor;

public class Penyanyi {

    public void bernyanyi(){
        System.out.println("Karekteristik nadanya" + "Belum didefinisikan ");
    }
}

class PenyanyiPop extends Penyanyi{

    @Override
    public void bernyanyi(){
        System.out.println("Bernyanyi dengan irama Pop");

    }
}

class PenyanyiDangdut extends Penyanyi{

    @Override
    public void bernyanyi(){
        System.out.println("Bernyanyi dengan irama Dangdut");

    }
}

class Main {
    public static void main(String[] args) {

        Penyanyi p = new PenyanyiPop();
        Penyanyi x = new PenyanyiDangdut();

        p.bernyanyi();
        x.bernyanyi();

    }

}
