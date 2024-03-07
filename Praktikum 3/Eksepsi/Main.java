/**
 * File      : Main.java
 * Deskripsi : Program untuk menunjukkan eksepsi
 * 
 */
public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas Pembeli dan Obat
        // Implementasikan try-catch untuk handling exception saat pembelian obat
        // Buat dua blok catch: ketika jumlah obat sudah mencapai batas dan ketika obat tidak tersedia
        Pembeli pembeli = new Pembeli("Aulya Salsabila");
        Obat obat1 = new Obat("Vitamin C");
        Obat obat2 = new Obat("Paracetamol");

        try {
            pembeli.beliObat(obat1);
            pembeli.beliObat(obat2);
            // Simulasi obat tidak tersedia
            obat2.setTersedia(false);
            pembeli.beliObat(obat2);
        } catch (BatasObatPenuhException | ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}