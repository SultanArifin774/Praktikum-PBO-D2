/* 
 * File: ExceptionONArray.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 06 Maret 2024
 * Deskripsi: Program penggunaan eksepsi menggunakan class ;ibrary Java
 */

 public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer [] arrayIntegers = new Integer[4];
        try {
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
 }