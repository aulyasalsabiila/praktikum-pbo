/**
 * Bunyi.java 29/04/24
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Kelas Bunyi
 * 
 */
public class Bunyi {
    private String suara;

    public Bunyi() {
        this.suara = "";
    }

    public Bunyi(String suara) {
        this.suara = suara;
    }

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }
}