/* Nama File: MKoleksi.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: kelas Main Koleksi untuk realisasi Class Koleksi
 * 
 */

public class MKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>();

        // Menambahkan 10 elemen
        for (char c = 'A'; c < 'A' + 20; c+= 2) {
            koleksiChar.add(c);
        }

        System.out.println("Koleksi setelah add 10 elm:");
        koleksiChar.showAll();

        // Mengupdate elemen ke-10
        koleksiChar.setIsi(9, 'A');
        System.out.println("Koleksi setelah set elm ke-10 menjadi 'A':");
        koleksiChar.showAll();

        // Menghapus elemen ke-1
        koleksiChar.delete(0);
        System.out.println("Koleksi setelah delete elm ke-1:");
        koleksiChar.showAll();

        // Menghapus elemen ke-1
        koleksiChar.delete(0);
        System.out.println("Koleksi setelah delete elm ke-1 lagi:");
        koleksiChar.showAll();

        // Menampilkan size koleksi
        System.out.println("Ukuran koleksi: " + koleksiChar.getSize());
    }
}
