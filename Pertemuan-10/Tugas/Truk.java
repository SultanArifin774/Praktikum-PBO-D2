/* 
 * File: Truk.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas Truk
 */
public class Truk extends Vehicle {

    private double maxLoad;

    public Truk(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad * 1.5;
    }

    public double calcTripDistance(){
        return 1500.00;
    }

    @Override
    public String toString(){
        return "Truk adalah angkutan darat yang sangat handal";
    }
    
}
