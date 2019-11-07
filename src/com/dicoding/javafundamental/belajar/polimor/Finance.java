package com.dicoding.javafundamental.belajar.polimor;

public class Finance {
    Karyawan karyawan;

    Finance(Karyawan karyawan){
        this.karyawan = karyawan;
    }

    public void pembayaranGaji(){
        karyawan.calculateGaji();
    }
}
