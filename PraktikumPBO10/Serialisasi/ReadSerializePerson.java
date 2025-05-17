/* Program  : ReadSerializePerson.java
 * Nama     : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 14 Mei 2025
 * Deskripsi: program untuk serialisasi objek Person
*/

package Serialisasi;
import java.io.*;

public class ReadSerializePerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("Serialisasi/person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            System.out.println("Selesai membaca objek person");
            System.out.println("Nama: " + person.getName());
            s.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
