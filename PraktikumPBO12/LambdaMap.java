/* Nama File: LambdaMap.java
 * Deskripsi: Program ini menggunakan lambda expression untuk menampilkan isi dari Map.
 * Nama     : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Kelas    : PBO - C
 * Tanggal  : 28 Mei 2025
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060123130088", "Sahal");
        mahasiswaMap.put("123", "Bambang");
        mahasiswaMap.put("124", "Cici");
        mahasiswaMap.put("125", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}