/* 
 * File: Animal.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas abstrak Animal
 */
public abstract class Animal {
    
    public abstract void Eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
