/* 
 * File: Helicopter.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas Helicopter
 */
public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficiency(){
        return maxLoad * 2;
    }

    public double calcTripDistance(){
        return 500.0;
    }

    public void takeOff(){
        System.out.println("Helikopter sedang lepas landas");
    }

    public void land(){
        System.out.println("Helikopter sedang mendarat");
    }

    public void fly(){
        System.out.println("Helikopter sedang terbang");
    }

    @Override
    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
