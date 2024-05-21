/**
 * File : Superman.java
 * Nama : Aulya Salsabila Khairunnisa
 * NIM  : 24060122140163
 */
public class Superman extends Kryptonian implements IFlyer {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void takeOff() {
        System.out.println("Superman takes off");
    }

    @Override
    public void land() {
        System.out.println("Superman lands");
    }

    @Override
    public void fly() {
        System.out.println("I'm " + this.name);
    }

    @Override
    public void eat() {
        System.out.println("Makan: Nasi Goreng");
    }
}