/* 
 * File: MBujurSangkar.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 20 Maret 2024
 * Deskripsi: kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */
import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        scan.close();
        System.out.println("Luas bujur sangkar dengan sisi: " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
