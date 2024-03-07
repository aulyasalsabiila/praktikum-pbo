/**
 * File      : Main.java
 * Deskripsi : Program untuk menunjukkan asersi
 * 
 */
public class Main {
    public static void main(String[] args) {
        KeranjangObat keranjangObat = new KeranjangObat();
        keranjangObat.tambahObat("Paracetamol");
        keranjangObat.tambahObat("Vitamin C");
        keranjangObat.tambahObat("Antibiotik");
        keranjangObat.tambahObat("Obat Flu");
        keranjangObat.tambahObat("Obat Batuk");

        try {
            keranjangObat.tambahObat("Obat Sakit Kepala"); // Akan menghasilkan asersi
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }

        keranjangObat.tampilkanObat();
    }
}