/* 
 * File: BangunDatarGeneric.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 08 Mei 2024
 * Deskripsi: Kelas konstruksi generic untuk BangunDatar
 */
public class BangunDatarGeneric<T12 extends BangunDatar> {
    private T12 bangunDatar;

    public void set(T12 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T12 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
