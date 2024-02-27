/* File       : MKubus.java */
/* Deskripsi  : Mengimplementasikan kelas diagram ke dalam program dalam bahasa Java */
/* NIM & Nama : 24060122140163 & Aulya Salsabila Khairunnisa */
/* Tanggal    : 27 Februari 2024 */

public class MKubus {
    public static void main (String[] args) {
        // Membuat objek kubus1 dengan panjang sisi tertentu
        Kubus kubus1 = new Kubus (5.0);

        // a. Hitung dan cetak volume dari kubus1
        System.out.println("Volume Kubus 1: " + kubus1.hitungVolume());

        // b. Hitung dan cetak luas permukaan dari kubus1
        System.out.println("Luas Permukaan Kubus 1: " + kubus1.hitungLuasPermukaan());
    }
}