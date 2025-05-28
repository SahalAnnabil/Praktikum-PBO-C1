/* Nama File: DiskonLambda.java
 * Deskripsi: Program ini menggunakan lambda expression untuk menampilkan hasil berbagai Diskon
 * Nama     : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Kelas    : PBO - C
 * Tanggal  : 28 Mei 2025
 */


interface IDiskon {
    double hitungDiskon(int harga);
}

public class DiskonLambda {

    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(int harga) {
                return harga * 0.3; // Diskon 30%
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4); // Diskon 40%
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        }; // Diskon 10%

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}