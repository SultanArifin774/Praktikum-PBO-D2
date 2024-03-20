/* 
 * File: Lingkaran.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 20 Maret 2024
 * Deskripsi: kelas implementasi IArea berupa cara menghitung luas lingkaran
 */
import static java.lang.Math.PI;

public class Lingkaran implements IArea {

    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
    
}
