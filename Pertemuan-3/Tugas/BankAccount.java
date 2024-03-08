/* 
 * File: BankAccount.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 08 Maret 2024
 * Deskripsi: File kelas BankAccount
 */
public class BankAccount {

    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposit berhasil, deposited: $" + amount);
    System.out.println("Saldo anda saat ini: $" + balance);
  }

  public void withdraw(double amount) throws InsufficientFundsException{
    if (balance - amount < MIN_BALANCE){
        throw new InsufficientFundsException("Saldo anda tidak mencukupi, saldo minimal: $100.00");
    } balance -= amount;
    System.out.println("Withdrawn berhasil, withdrawn: $" + amount);
    System.out.println("Saldo anda saat ini: $" + balance);
  }

  public double getBalance() {
    return balance;
  }

}