/**
 * File      : PersegiPanjang.java 11/03/2024
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Representasi dari objek persegi panjang, turunan kelas poligon
 */
package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    // Deklarasi variabel private untuk menyimpan panjang dan lebar persegi panjang
    private double panjang, lebar;

    // Konstruktor untuk inisialisasi panjang, lebar, dan jumlah sisi
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    // Metode untuk menghitung luas persegi panjang
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Metode untuk mencetak informasi tentang persegi panjang
    public void printInfo() {
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}