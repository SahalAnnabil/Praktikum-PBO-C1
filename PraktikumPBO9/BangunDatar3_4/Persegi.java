/* File     : Persegi.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: implementasi Persegi sebagai BangunDatar
 * 
 */

public class Persegi extends BangunDatar {
    
    //Atribut
    private double sisi;
    //Konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    //Method
    public double hitungKeliling() {
        return 4 * sisi;
    }
    public double hitungLuas() {
        return sisi * sisi;
    }
    
}
