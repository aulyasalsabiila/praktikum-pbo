/* File       : Main.java */
/* Deskripsi  : Mengimplementasikan kelas diagram ke dalam program dalam bahasa Java */
/* NIM & Nama : 24060122140163 & Aulya Salsabila Khairunnisa */
/* Tanggal    : 27 Februari 2024 */

public class Main {
    public static void main (String[] args) {

        // Membuat objek penjual
        Penjual penjual1 = new Penjual("Aulya Salsabila", "Jl. Raya No. 20", "087827192734");

        // Membuat objek produk dengan menggunakan objek penjual sebagai parameter
        Produk produk1 = new Produk("Kamera", 15000000.0, 10, "Spesifikasi kamera...", penjual1);

        // Menggunakan aksesor (getter) untuk mendapatkan informasi penjual dan produk
        System.out.println(produk1.getInfoProduk());
        System.out.println("\n" + produk1.getPenjual().getInfoPenjual());
    }
}