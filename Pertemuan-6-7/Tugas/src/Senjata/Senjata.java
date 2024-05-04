/* 
 * File: Senjata.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 04 Mei 2024
 * Deskripsi: File untuk class Senjata
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Senjata;

/**
 *
 * @author Sultan Arifin
 */
public class Senjata {
//Atribut
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    //Konstruktor
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    
    //Method
    public String getBunyi(){
        return this.bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    public boolean isMenusuk(){
        return this.menusuk;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

}
