/**
 * PegawaiDanGaji.java 29/04/24
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Kelas Pegawai dan Gaji
 * 
 */
public class PegawaiDanGaji {

    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();

        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}