/* 
 * File: BangunDatar.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 20 Maret 2024
 * Deskripsi: kelas abstrak, berisi abstraksi bangun datar
 */

public abstract class BangunDatar {

    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}