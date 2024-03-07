/**
 * File      : Pembeli.java
 * Deskripsi : Program untuk menunjukkan eksepsi
 * 
 */
public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;
    private final int batasObat = 0;

    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[batasObat];
        jumlahObat = 1;
    }

    public String getNama() {
        return nama;
    }

    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        // Implementasikan try-catch untuk handling exception saat pembelian obat
        // Buat dua blok catch yaitu ketika jumlah obat sudah mencapai batas dan ketika obat tidak tersedia
        try {
            if (jumlahObat >= batasObat) {
                throw new BatasObatPenuhException("Jumlah obat sudah mencapai batas!");
            }

            if (!obat.isTersedia()) {
                throw new ObatTidakTersediaException("Obat tidak tersedia!");
            }

            obat.setTersedia(false);
            keranjangObat[jumlahObat] = obat;
            jumlahObat++;
        } catch (BatasObatPenuhException | ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}