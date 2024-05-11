/* 
 * File: Main.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 11 Mei 2024
 * Deskripsi: Main class untuk generic Kupu
 */
public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        K.gerak();;
        anu.setIsi(K);
        System.out.println("Tipe data: " + anu.getIsi().getClass().getName());
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        System.out.println("Tipe data: " + anu.getIsi().getClass().getName());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        System.out.println("Tipe data: " + anu.getIsi().getClass().getName());
        anu.getIsi().gerak();
    }
}
