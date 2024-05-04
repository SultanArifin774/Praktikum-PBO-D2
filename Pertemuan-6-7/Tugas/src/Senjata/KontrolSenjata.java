/* 
 * File: KontrolSenjata.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 04 Mei 2024
 * Deskripsi: File untuk class KontrolSenjata
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Senjata;

/**
 *
 * @author Sultan Arifin
 */
public class KontrolSenjata {
    //Atribut
    private Senjata senjata;

    //Konstruktor
    public KontrolSenjata(Senjata senjata){
        this.senjata = senjata;
    }

    //Method
    public boolean isAdaPeluru(){
        return this.senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah){
        this.senjata.setPeluru(jumlah);
        System.out.println(">> Peluru berhasil ditambah : " + jumlah);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()){
            for (int i = 0; i < jumlah; i ++){
                if (isAdaPeluru()){
                System.out.println(senjata.getBunyi());
                this.senjata.setPeluru(this.senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            } System.out.println(">> Peluru sisa: " + this.senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }

    public String menusuk(){
        if (this.senjata.isMenusuk()){
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }

    public void pasangBayonet(){
        this.senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
