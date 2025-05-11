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
        PersegiPanjang pp = new PersegiPanjang(4, 5);
        Persegi p = new Persegi(4);
        Segitiga s = new Segitiga(3, 4);
        BangunDatarGeneric<Lingkaran> bdg1 = new BangunDatarGeneric<Lingkaran>(); 
        BangunDatarGeneric<PersegiPanjang> bdg2 = new BangunDatarGeneric<PersegiPanjang>();
        BangunDatarGeneric<Persegi> bdg3 = new BangunDatarGeneric<Persegi>();
        BangunDatarGeneric<Segitiga> bdg4 = new BangunDatarGeneric<Segitiga>();
        
        bdg1.set(l);
        bdg2.set(pp);
        bdg3.set(p);
        bdg4.set(s);
        System.out.println("Bangun Datar Generic\n");
        System.out.println("Keliling Lingkaran = " + bdg1.hitungKeliling());
        System.out.println("Luas Lingkaran = " + bdg1.hitungLuas());
        System.out.println("tipe generic : " +bdg1.get().getClass().getName() + "\n");
        System.out.println("Keliling Persegi Panjang = " + bdg2.hitungKeliling());
        System.out.println("Luas Persegi Panjang = " + bdg2.hitungLuas());
        System.out.println("tipe generic : " +bdg2.get().getClass().getName() + "\n");
        System.out.println("Keliling Persegi = " + bdg3.hitungKeliling());
        System.out.println("Luas Persegi = " + bdg3.hitungLuas());
        System.out.println("tipe generic : " +bdg3.get().getClass().getName() + "\n");
        System.out.println("Keliling Segitiga = " + bdg4.hitungKeliling());
        System.out.println("(asumsi segitiga sama sisi)");
        System.out.println("Luas Segitiga = " + bdg4.hitungLuas());
        System.out.println("tipe generic : " +bdg4.get().getClass().getName() + "\n");
    }
}
