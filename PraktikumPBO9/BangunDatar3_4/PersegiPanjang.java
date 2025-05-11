/* File     : PersegiPanjang.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: implementasi PersegiPanjang sebagai BangunDatar
 * 
 */

 public class PersegiPanjang extends BangunDatar {
    //Atribut
    private double panjang;
    private double lebar;
    
    //Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //Method
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }
}
