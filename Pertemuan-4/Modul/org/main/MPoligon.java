/* 
 * File: MPoligon.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 13 Maret 2024
 * Deskripsi: Driver class untuk poligon, persegi panjang, dan segitiga 
 */
package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga(6, 4, 3);

        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());

        segitiga.printInfo();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}
