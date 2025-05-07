/* File     : MapTest.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * 
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //kunci-> integer, nilai->string
        Map<Integer, String> map = new HashMap<Integer, String>();
        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai onjek collection set
        Set<Integer> key = map.keySet();
        //bagaimana interasi untuk mengambil keseluruhan kunci
        //nilai dari kunci ? tulis pada laporan anda!
        //petunjuk: gunakan iterasi seperti program ArrayListTest

        for (Integer k : key) {
            System.out.println(k + " " + map.get(k));
        }
    }
}
