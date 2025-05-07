/* File     : BangunDatarGeneric.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: kelas konstruksi generic untuk BangunDatar
 * 
 */

public class BangunDatarGeneric <T extends BangunDatar> {
    private T bangunDatar;
    
    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }
    
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

}
