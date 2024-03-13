/* 
 * File: PersegiPanjang.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 13 Maret 2024
 * Deskripsi: Representasi dari objek persegi panjang, turunan kelas poligon 
 */

package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahsisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahsisi = jumlahsisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }
    
    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi " + this.getjumlahsisi());
    }
}