/**
 * File : Airplane.java
 * Nama : Aulya Salsabila Khairunnisa
 * NIM  : 24060122140163
 */
public abstract class Airplane extends Vehicle implements IFlyer {
    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " takes off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " lands");
    }

    @Override
    public abstract void fly();
}