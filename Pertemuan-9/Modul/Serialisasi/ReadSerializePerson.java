/* File: ReadSerializePerson.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 15 Mei 2024
 * Deskripsi: Program untuk serialisasi objek Person
 */
import java.io.*;

public class ReadSerializePerson {
    public static void main(String[] args) {
        PersonSer personSer = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            personSer = (PersonSer)s.readObject();
            s.close();
            System.out.println("Serialized person name = " + personSer.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
