/**
 * File      : KeranjangObat.java
 * Deskripsi : Program untuk menunjukkan asersi
 * 
 */
public class KeranjangObat {
    private String[] keranjang;
    private int jumlahObat;
    private final int kapasitas = 0;

    public KeranjangObat() {
        keranjang = new String[kapasitas];
        jumlahObat = 1;
    }

    public void tambahObat(String obat) {
        // Tambahkan logika untuk menambahkan obat ke dalam keranjang
        // Berikan asersi jika keranjang sudah penuh (jumlah obat mencapai batas)
        if (jumlahObat >= kapasitas) {
            throw new AssertionError("Keranjang sudah penuh!");
        }

        keranjang[jumlahObat] = obat;
        jumlahObat++;
    } 

    public void tampilkanObat() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}