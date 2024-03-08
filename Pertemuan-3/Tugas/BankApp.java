/* 
 * File: BankApp.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 08 Maret 2024
 * Deskripsi: File program kelas BankAccount
 */
public class BankApp {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500.0);
        System.out.println("Saldo awal account1: $" + account1.getBalance());
        BankAccount account2 = new BankAccount(1000.0);
        System.out.println("Saldo awal account2: $" + account2.getBalance());

        try {
            account2.withdraw(500.0);
            account1.deposit(100.0);
            account1.withdraw(300.0);
            account1.withdraw(400.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Gagal withdrawn, " + e.getMessage());
        }
        System.out.println("Saldo akhir setelah transaksi, account1: $" + account1.getBalance());
        System.out.println("Saldo akhir setelah transaksi, account2: $" + account2.getBalance());
    }
}