/* 
 * File: UserInputValidator.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 08 Maret 2024
 * Deskripsi: Program untuk memvalidasi user input
 */
import java.util.regex.Pattern;

public class UserInputValidator {

    public static void validateUsername(String username) {
        assert(username.length() >= 5): "Panjang username minimal 5 karakter";
        assert(username.length() <= 20): "Panjang username maksimal 20 karakter";
        assert Pattern.matches("[a-zA-Z][a-zA-Z0-9_]+", username): "Invalid username";
      }
    
      public static void validateEmail(String email) {
        assert Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", email): "Invalid email";
      }
    
      public static void validateAge(int age) {
        assert(age >= 17 && age <= 99): "Usia harus di antara 17 dan 99 tahun";
      }
}
