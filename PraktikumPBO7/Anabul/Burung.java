/*Nama File: Burung.java
  Nama     : Muhamad Sahal Annabil
  NIM      : 24060123130088
  Tanggal  : 25 April 2025
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    // Methods
    @Override
    public void Gerak() {
        System.out.println("tebang");
    }
    
    @Override
    public void Bersuara() {
        System.out.println("cuit");
    }
    
}
