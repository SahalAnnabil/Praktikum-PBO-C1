/* Program  : Person.java
 * Nama     : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 14 Mei 2025
 * Deskripsi: program kelas Person
*/
public class Person {
    private int id;
    private String name;
    
    public Person(String n){
        name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}