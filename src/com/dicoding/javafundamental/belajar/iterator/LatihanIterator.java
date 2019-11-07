package com.dicoding.javafundamental.belajar.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LatihanIterator {
    public static void main(String[] args) {

        //Membuat Instance/Objek hewan Dari ArrayList
        List<String> hewan = new ArrayList<>();

        //Menambahkan Data atau Nilai pada Objek hewan
        hewan.add("anjing");
        hewan.add("kucing");
        hewan.add("jerapah");
        hewan.add("rusa");
        hewan.add("sapi");
        hewan.add("kambing");
        hewan.add("burung");

        /*
         *Menginisialisasi Method Iterator yang Terdapat
         *Pada Objek hewan dari Collection ArrayList
         */
        Iterator itr = hewan.iterator();

        //Mengecek Iterator Apakah Mempunyai Elemen Selanjutnya atau Tidak
        while (itr.hasNext()) {
            //Jika Iya/True Maka Iterator Akan Mengambil Nilai Selanjutnya
            System.out.println(itr.next());
        }
    }
}
