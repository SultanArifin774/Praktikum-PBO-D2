/* 
 * File: Vehicle.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas abstrak Vehicle
 */
public abstract class Vehicle {

    public abstract  double calcFuelEfficiency();

    public abstract double calcTripDistance();

    public String toString(){
        return this.getClass().getSimpleName();
    }
    
}