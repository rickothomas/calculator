package com.tutorial;

import java.util.*;

public class Belajar {
    
    public static void main(String[] args) {

    
    int input, angka1, angka2, lanjut;
    float hasil;
    boolean kondisi = true;
    Scanner inputUser = new Scanner(System.in);
    
    do {
    // Menu
    System.out.println("\nCalculator");
    System.out.println("1. Penjumlahan (+)");
    System.out.println("2. Pengurangan (-)");
    System.out.println("3. Perkalian (x)");
    System.out.println("4. Pembagian (/)\n");

    // Inputan Menu
    System.out.print("Masukan Menu Perhitungan : ");
        input = inputUser.nextInt();


        // Menu Pilihan
    switch (input) {
        case (1):
            System.out.println("\n1. Penjumlahan (+)");
            break;
        case (2):
            System.out.println("\n2. Pengurangan (-)");
            break;
        case (3):
            System.out.println("\n3. Perkalian (x)");
            break;
        case (4):
            System.out.println("\n4. Pembagian (/)");
            break;
        default:
    }
    
        if (input <= 4 ) {


        // Inputan Angka
        System.out.print("Masukan Angka Pertama : ");
        angka1 = inputUser.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        angka2 = inputUser.nextInt();

        // Kondisi Pemilihan Menu

        if (input == 1) {
            hasil = (float)angka1 + angka2;
            System.out.printf("Hasil Dari Penjumlahan %d + %d adalah : " + hasil ,angka1,angka2);
        } else if (input == 2) {
            hasil = (float)angka1 - angka2;
            System.out.printf("Hasil Dari Pengurangan %d - %d adalah : " + hasil ,angka1,angka2);
        } else if (input == 3) {
            hasil = (float)angka1 * angka2;
            System.out.printf("Hasil Dari Perkalian %d x %d adalah : " + hasil ,angka1,angka2);
        } else if (input == 4) {
            hasil = (float)angka1 / angka2;
            if (angka1 == 0 || angka2 == 0){
                System.out.println("Tidak Dapat Dibagi 0");
            } else {
                System.out.printf("Hasil Dari Pembagian %d / %d adalah : " + hasil,angka1,angka2);
            }
        }

    } else 
            { 
                System.out.println("Operator Tidak Tersedia \n");
            }
            System.out.println("\n\nLanjutkan Perhitungan?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");

            System.out.print("Tentukan Pilihanmu : ");
            lanjut = inputUser.nextInt();

            if (lanjut == 2) {
                kondisi = false;
            } else if (lanjut > 2) {
                System.out.println("===Salah Memilih Pilihan===");
                kondisi = false;
            }

        } while (kondisi);
       
    }
}
