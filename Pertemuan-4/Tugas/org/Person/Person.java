/* 
 * Nama File    : Person.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Deskripsi    : File Kelas Person
 * Tanggal      : 16 Maret 2024
 */
package org.Person;

public class Person {

    //Atribut
    protected String nama;
    protected String alamat;
    protected int usia;

    //Konstruktor
    public Person(){

    }

    public Person(String nama, String alamat, int usia){
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
    }

    //Selektor
    public String getNama(){
        return this.nama;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public int getUsia(){
        return this.usia;
    }

    //Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    //Other Method
    public void getDetails(){
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Usia: " + getUsia());
    }
}