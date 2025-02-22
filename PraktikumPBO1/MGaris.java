/************************************/
/* Nama File : MGaris.java */
/* Deskripsi : Program Main untuk aplikasi class Garis */
/* NIM/Nama  : 24060123130088 */
/* Tanggal   : 19 Februari 2025 */
/***********************************/

public class MGaris {
    public static void main(String[] args) {
        // Membuat dua titik
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik();
        T2.setAbsis(10);
        T2.setOrdinat(10);
        
        // Membuat garis menggunakan dua titik
        Garis G1 = new Garis(T1, T2);
        
        // Menampilkan informasi tentang garis
        System.out.println("Titik T1: ");
        T1.printTitik();
        System.out.println("Titik T2: ");
        T2.printTitik();

        System.out.println("Panjang Garis: " + G1.getPanjangGaris());
        System.out.println("Gradien Garis: " + G1.getGradienGaris());
        
        // Menampilkan titik tengah garis
        Titik tengah = G1.getTitikTengah();
        System.out.println("Titik Tengah Garis: ");
        tengah.printTitik();

        // Membuat garis lain untuk mengecek sejajar atau tegak lurus
        Titik T3 = new Titik(5, 8);
        Titik T4 = new Titik(12, 14);
        Garis G2 = new Garis(T3, T4);

        System.out.println("Garis G1 sejajar dengan G2? " + G1.isSejajarGaris(G2));
        System.out.println("Garis G1 tegak lurus dengan G2? " + G1.isTegakLurusGaris(G2));

        // Menampilkan jumlah garis yang dibuat
        System.out.println("Jumlah garis yang telah dibuat: " + Garis.getCounterGaris());

        // Menampilkan persamaan garis
        System.out.println("Persamaan Garis G1:");
        G1.printPersamaanGaris();
    }
}
