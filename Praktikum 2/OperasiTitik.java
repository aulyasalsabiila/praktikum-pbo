/* File       : OperasiTitik.java */
/* Deskripsi  : Mengimplementasikan kelas diagram ke dalam program dalam bahasa Java */
/* NIM & Nama : 24060122140163 & Aulya Salsabila Khairunnisa */
/* Tanggal    : 26 Februari 2024 */

public class OperasiTitik {
    // Private method
    private void refleksiSumbuX (Titik titik) {
        double y = titik.getOrdinat();
        y *= -1;
        titik.setOrdinat (y);
    }

    public double getJarakPusat (Titik titik) {
        double x = titik.getAbsis();
        double y = titik.getOrdinat();
        double jarakPusat = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return jarakPusat;
    }

    private void refleksiSumbuY (Titik titik) {
        double x = titik.getAbsis();
        x *= -1;
        titik.setAbsis (x);
    }

    // Public method
    public Titik refleksiX (Titik titik) {
        refleksiSumbuX (titik);
        return titik;
    }

    public Titik refleksiY (Titik titik) {
        refleksiSumbuY (titik);
        return titik;
    }
}
