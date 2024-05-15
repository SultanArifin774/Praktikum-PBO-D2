/* File: SerializePerson.java
 * Nama Pembuat : Sultan Alamsyah Borneo Arifin
 * NIM          : 24060122130079
 * Tanggal      : 15 Mei 2024
 * Deskripsi: Program untuk serialisasi objek Person
 */
import java.io.*;

//Class PersonSer
class PersonSer implements Serializable {
    private String name;
    public PersonSer(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        PersonSer personser = new PersonSer("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(personser);
            System.err.println("Selesai menulis objek person");
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
