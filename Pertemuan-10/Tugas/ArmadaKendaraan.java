/* 
 * File: ArmadaKendaraan.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 25 Mei 2024
 * Deskripsi: File kelas ArmadaKendaraan
 */
import java.util.ArrayList;
import java.util.List;

public class ArmadaKendaraan<T extends Vehicle> {
    private List<T> armada = new ArrayList<>();

    public void tambahArmada(List<? extends T> newArmada) {
        armada.addAll(newArmada);
    }

    public List<T> getAllArmada() {
        return armada;
    }
}
