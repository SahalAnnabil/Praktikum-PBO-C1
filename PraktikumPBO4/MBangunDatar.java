/*
File      : MBangunDatar.java
Deskripsi : Main Program untuk menguji class BangunDatar dan subclass Persegi dan Lingkaran
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 12 Maret 2025 */
/***********************************/
public class MBangunDatar {
    public static void main(String[] args) {
        // Menguji konstruktor dan metode BangunDatar
        System.out.println("=== Menguji BangunDatar ===");
        BangunDatar bd1 = new BangunDatar();
        bd1.printinfo();
        bd1.setJmlSisi(3);
        bd1.setWarna("Merah");
        bd1.setBorder("Hitam");
        System.out.println("Jumlah Sisi: " + bd1.getJmlSisi());
        System.out.println("Warna: " + bd1.getWarna());
        System.out.println("Border: " + bd1.getBorder());
        
        BangunDatar bd2 = new BangunDatar(5, "Merah", "Hitam");
        bd2.printinfo();
        BangunDatar.printCounterBangunDatar();

        // Menguji konstruktor dan metode Lingkaran
        System.out.println("\n=== Menguji Lingkaran ===");
        Lingkaran l1 = new Lingkaran();
        l1.printinfo();
        l1.setJari(7);
        System.out.println("Jari-jari: " + l1.getJari());
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());
        
        Lingkaran l2 = new Lingkaran(10, "Biru", "Kuning");
        l2.printinfo();
        l2.setJari(5);
        System.out.println("Jari-jari: " + l2.getJari());
        System.out.println("Luas: " + l2.getLuas());
        System.out.println("Keliling: " + l2.getKeliling());
        
        // Menguji konstruktor dan metode Persegi
        System.out.println("\n=== Menguji Persegi ===");
        Persegi p1 = new Persegi();
        p1.printinfo();
        p1.setSisi(6.0);
        System.out.println("Sisi: " + p1.getSisi());
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());
        System.out.println("Diagonal: " + p1.getDiagonal());
        
        Persegi p2 = new Persegi(4, "Hijau", "Putih");
        p2.printinfo();
        p2.setSisi(8.0);
        System.out.println("Sisi: " + p2.getSisi());
        System.out.println("Luas: " + p2.getLuas());
        System.out.println("Keliling: " + p2.getKeliling());
        System.out.println("Diagonal: " + p2.getDiagonal());
    }
}

