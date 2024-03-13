/* 
 * File: Segitiga.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 13 Maret 2024
 * Deskripsi: Representasi dari objek segitiga, turunan kelas poligon 
 */
package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahsisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahsisi = jumlahsisi;
    }

    public double hitungLuas(){
        return 0.5*alas*tinggi;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi " + this.getjumlahsisi());
    }
}
