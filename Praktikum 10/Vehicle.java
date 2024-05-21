/**
 * File : Vehicle.java
 * Nama : Aulya Salsabila Khairunnisa
 * NIM  : 24060122140163
 */
public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}