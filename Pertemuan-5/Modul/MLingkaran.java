/* 
 * File: MLingkaran.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 20 Maret 2024
 * Deskripsi: implementasi cara menghitung luas lingkaran
 */
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        Lingkaran l = new Lingkaran(r);
        System.out.println("Masukkan jari - jari lingkaran: ");
        System.out.println("Luas lingkaran dengan jari jari " + r + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}
