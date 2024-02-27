/* File       : Produk.java */
/* Deskripsi  : Mengimplementasikan kelas diagram ke dalam program dalam bahasa Java */
/* NIM & Nama : 24060122140163 & Aulya Salsabila Khairunnisa */
/* Tanggal    : 27 Februari 2024 */

public class Produk {
    // Atribut
    private String nama;
    private double harga;
    private int stok;
    private String deskripsi;
    private Penjual penjual; // Agregasi dengan Penjual

    // Konstruktor
    public Produk (String nama, double harga, int stok, String deskripsi, Penjual penjual) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.penjual = penjual;
    }

    // Getter dan setter untuk atribut private
    public String getNama() {
        return nama;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga (double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok (int stok) {
        this.stok = stok;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi (String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Metode untuk mendapatkan informasi produk
    public String getInfoProduk() {
        return "Produk: " + nama + "\nHarga: " + harga + "\nStok: " + stok + "\nDeskripsi: " + deskripsi;
    }

    // Metode untuk mendapatkan objek penjual terkait
    public Penjual getPenjual() {
        return penjual;
    }
}