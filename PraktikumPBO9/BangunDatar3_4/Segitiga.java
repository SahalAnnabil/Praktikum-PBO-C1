/* File     : Persegi.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: implementasi Persegi sebagai BangunDatar
 * 
 */
public class Segitiga extends BangunDatar {
    //Atribut
    private double alas;
    private double tinggi;
    
    //Konstruktor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    //Method
    public double hitungKeliling() {
        return 3 * alas; // Asumsi segitiga sama sisi
    }
    
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
