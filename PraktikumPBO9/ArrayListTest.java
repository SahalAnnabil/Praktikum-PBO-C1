/* File     : ArrayListTest.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: Program penggunaan objek ArrayList
 *            sebagai Collection class.
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //inisialisasi ArrayList yang hanya dapat
        //berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambahkan elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
        // interasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.print(s+" ");
        }
    }
}