/* 
 * File: RiverBarge.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas RiverBarge
 */
public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.5;
    }

    public double calcTripDistance(){
        return 200.00;
    }
}
