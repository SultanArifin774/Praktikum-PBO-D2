/* 
 * File: TestSenjata.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 04 Mei 2024
 * Deskripsi: File program utama untuk class Senjata dan KontrolSenjata
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Senjata;

/**
 *
 * @author Sultan Arifin
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senjata AK47 = new Senjata("TAR");
        Senjata M16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(AK47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(M16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);

        System.out.println("=================");
        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
        System.out.println(kontrolM16.menusuk());
        kontrolM16.pasangBayonet();
        System.out.println(kontrolM16.menusuk());
    }
    
}
