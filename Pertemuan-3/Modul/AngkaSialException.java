/* 
 * File: AngkaSialException.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 06 Maret 2024
 * Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13
 */
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}