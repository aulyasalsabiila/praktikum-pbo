/* File       : Penjual.java */
/* Deskripsi  : Mengimplementasikan kelas diagram ke dalam program dalam bahasa Java */
/* NIM & Nama : 24060122140163 & Aulya Salsabila Khairunnisa */
/* Tanggal    : 27 Februari 2024 */

public class Penjual {

    // Atribut
    private String nama;
    private String alamat;
    private String nomorTelepon;

    // Konstruktor
    public Penjual (String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter dan setter untuk atribut private
    public String getNama() {
        return nama;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon (String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Metode untuk mendapatkan informasi penjual
    public String getInfoPenjual() {
        return "Penjual: " + nama + "\nAlamat: " + alamat + "\nNomor Telepon: " + nomorTelepon;
    }
}