/* 
 * Nama File    : Main.java
 * Nama Pembuat : Muhamad Sahal Annabil
 * NIM Pembuat  : 24060123130088
 * Tanggal      : 14 Maret 2025
 * Deskripsi    : Main program untuk menjalankan class
 */

public class Main {
    public static void main(String[] args) {
        Date sekarangDate = new Date(10, "Maret", 2025);

        // contoh Dosen Tetap
        System.out.println("\nDetail Dosen Tetap");
        Date tglLahirDosTetap = new Date(2, "Mei", 1990);
        Date tmtDosTetap = new Date(2, "Juni", 2015);
        DosenTetap dosTetap = new DosenTetap("12345678", "22345678", "Abah", tglLahirDosTetap, tmtDosTetap, 6000000, "FSM");
        dosTetap.printInfo(sekarangDate);
        System.out.println("\n");

        // contoh Dosen Tamu 
        System.out.println("Detail Dosen Tamu");
        Date tglLahirDosTamu = new Date(3, "Juni", 1995);
        Date tmtDosTamu = new Date(3, "Juli", 2015);
        Date kontrakBerakhir = new Date(3, "Juni", 2026);
        DosenTamu dosTamu = new DosenTamu("32345678", "42345678", "Baba", tglLahirDosTamu, tmtDosTamu, 5000000, "FSM", kontrakBerakhir);
        dosTamu.printInfo(sekarangDate);
        System.out.println("\n");

        // contoh Tendik
        System.out.println("Detail Tendik");
        Date tglLahirTendik = new Date(4, "Agustus", 2000);
        Date tmtTendik = new Date(4, "September", 2015);
        Tendik tendik = new Tendik("52345678", "Chichi", tglLahirTendik, tmtTendik, 4000000, "Pendidikan Pancasila");
        tendik.printInfo(sekarangDate);
    }
}