/**
 * File : Animal.java
 * Nama : Aulya Salsabila Khairunnisa
 * NIM  : 24060122140163
 */
public abstract class Animal {
    public abstract void eat();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}