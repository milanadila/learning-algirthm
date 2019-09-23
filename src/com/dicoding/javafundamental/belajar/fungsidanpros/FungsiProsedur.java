package com.dicoding.javafundamental.belajar.fungsidanpros;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FungsiProsedur {

    static ArrayList listBuah = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void main(String[] args) throws Exception {

        do {
            showMenu();
        } while (isRunning);
    }

    static void showMenu() throws Exception {

        System.out.println("========= MENU ========");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.println("PILIH MENU>");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch (selectedMenu) {
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deleteBuah();
                break;
            case 5:
                System.exit(0);
                break;
                default:
                    System.out.println("Pilihan salah! ");
        }
    }

    static void showAllBuah() {
        if (listBuah.isEmpty()) {
            System.out.println("List buah belum ada");
        } else {
            for (int i = 0; i < listBuah.size(); i++) {
                System.out.println(String.format("[%d] %s", i, listBuah.get(i)));
            }
        }
    }

    static void insertBuah() throws Exception {
        System.out.println("Nama buah: ");
        String namaBuah = input.readLine();
        listBuah.add(namaBuah);
    }

    static void editBuah() throws Exception {
        showAllBuah();
        System.out.println("Pilih nomor buah: ");
        int indexBuah = Integer.valueOf(input.readLine());

        System.out.println("Nama baru: ");
        String namabaru = input.readLine();
        listBuah.set(indexBuah, namabaru);
    }

    static void deleteBuah() throws Exception {
        showAllBuah();
        System.out.println("Pilih nomor buah: ");
        int indexBuah = Integer.valueOf(input.readLine());
        listBuah.remove(indexBuah);
    }
}
