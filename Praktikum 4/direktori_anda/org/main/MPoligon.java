/**
 * File      : MPoligon.java 11/03/2024
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Driver class untuk poligon dan persegi panjang
 */

 package org.main;

 import org.bangundatar.*;

 public class MPoligon {
    public static void main (String[] args) {
        // Membuat objek PersegiPanjang dengan panjang 10, lebar 10, dan jumlah sisi 4
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        // Memanggil metode printInfo() dari PersegiPanjang untuk mencetak informasi
        persegi.printInfo();
        // Mencetak luas Persegi Panjang menggunakan metode hitungLuas() dari PersegiPanjang
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
        // Membuat objek Segitiga dengan alas 5, tinggi 8, dan jumlah sisi 3
        Segitiga segitiga = new Segitiga(5, 8, 3);
        // Memanggil metode printInfo() dari Segitiga untuk mencetak informasi
        segitiga.printInfo();
        // Mencetak luas Segitiga menggunakan metode hitungLuas() dari Segitiga
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
 }