/* File       : MOperasiTitik.java */
/* Deskripsi  : Mengimplementasikan kelas diagram ke dalam program dalam bahasa Java */
/* NIM & Nama : 24060122140163 & Aulya Salsabila Khairunnisa */
/* Tanggal    : 26 Februari 2024 */

 public class MOperasiTitik {
    public static void main (String[] args) {
        Titik t = new Titik (4,4);
        OperasiTitik o = new OperasiTitik();

        System.out.println("Titik: (" + t.getAbsis() + " , " + t.getOrdinat() + ") " ) ;
        o.refleksiX(t);
        System.out.println("Titik: (" + t.getAbsis() + " , " + t.getOrdinat() + ") " ) ;
        o.refleksiY(t);
        System.out.println("Titik: (" + t.getAbsis() + " , " + t.getOrdinat() + ") " ) ;
    }
}
