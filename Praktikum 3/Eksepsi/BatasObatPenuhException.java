/**
 * File      : BatasObatPenuhException.java
 * Deskripsi : Program untuk menunjukkan eksepsi
 * 
 */
public class BatasObatPenuhException extends Exception {
    // Buat konstruktor dengan parameter message dan panggil konstruktor parent dengan keyword super
    public BatasObatPenuhException(String message) {
        super(message);
    }
}