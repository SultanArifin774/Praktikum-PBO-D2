/* 
 * File: InsufficientFundsException.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 08 Maret 2024
 * Deskripsi: Kelas eksepsi untuk menolak jika saldo tidak mencukupi
 */

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
      super(message);
    }
}
  