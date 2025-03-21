/*
File      : MBangunDatar.java
Deskripsi : Main Program untuk menguji class BangunDatar dan subclass Persegi dan Lingkaran
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 21 Maret 2025 */
/***********************************/
public class MBangunDatar {
    public static void main(String[] args) {
       // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran (14);

        //class abstract bangunDatar tidak dapat di inisialisasi langsung "new BangunDatar"
        //namun tetap bisa menjadi tipe objek.

        System.out.println("apakah Keliling P1 = luas L1? " + (P1.isEqualLuas(L1) ? "yes" : "no"));
        System.out.println("apakah Keliling P1 = Keliling L1? " + (P1.isEqualKeliling(L1) ? "yes" : "no"));

        System.out.println("Sebelum zoomIn zoomOut");
        P2.printinfo();
        L2.printinfo();
        
        P2.zoomIn();
        L2.zoomOut();
        
        System.out.println("Setelah zoomIn zoomOut");
        P2.printinfo();
        L2.printinfo();
    }
}

