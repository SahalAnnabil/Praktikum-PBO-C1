/* File     : BangunDatarGenericTest.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: main class untuk generic BangunDatarGeneric
 * 
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>(); 
        bdg.set(l);
        System.out.println("Keliling Lingkaran = " + bdg.hitungKeliling());
        System.out.println("tipe generic : " +bdg.get().getClass().getName());
    }
}
