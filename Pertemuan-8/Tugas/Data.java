/* 
 * File: Data.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 11 Mei 2024
 * Deskripsi: Kelas generic untuk Kupu
 */
public class Data<T> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}
