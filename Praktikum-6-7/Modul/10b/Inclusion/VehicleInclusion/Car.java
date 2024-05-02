/* 
 * File: Car.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 02 Mei 2024
 * Deskripsi: File kelas car
 */
public class Car extends Vehicle {
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
