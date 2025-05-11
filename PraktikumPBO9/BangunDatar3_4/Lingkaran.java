/* File     : Lingkaran.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: implementasi Lingkaran sebagai BangunDatar
 * 
 */

 public class Lingkaran extends BangunDatar {
    //Atribut
    private double jejari;
    //Konstruktor
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    //Method
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
    public double hitungLuas() {
        return jejari * jejari * 3.14;
    }
}
