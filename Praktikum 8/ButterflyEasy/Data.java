/**
 * Data.java 06/05/24
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Kelas Data
 */
class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}