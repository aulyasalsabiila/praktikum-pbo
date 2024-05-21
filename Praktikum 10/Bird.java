/**
 * File : Bird.java
 * Nama : Aulya Salsabila Khairunnisa
 * NIM  : 24060122140163
 */
public class Bird extends Animal implements IFlyer {
    @Override
    public void takeOff() {
        System.out.println("Bird takes off");
    }

    @Override
    public void land() {
        System.out.println("Bird lands");
    }

    @Override
    public void fly() {
        System.out.println("I'm Bird");
        System.out.println("Bisa terbang");
    }

    @Override
    public void eat() {
        System.out.println("Makan: Makanan Burung");
    }
}