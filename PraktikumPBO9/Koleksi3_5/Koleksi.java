/* File     : Koleksi.java
 * Nama     : Muhammad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 7 Mei 2025
 * Deskripsi: kelas Koleksi generik untuk menyimpan elemen-elemen dalam wadah ArrayList
 * 
 */
import java.util.ArrayList;

public class Koleksi<T> {
    // Atribut
    private int nbelm;
    private ArrayList<T> wadah;

    // Konstruktor
    public Koleksi() {
        this.wadah = new ArrayList<>();
        this.nbelm = 0;
    }

    // Metode
    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T nilai) {
        wadah.set(index, nilai);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T nilai) {
        wadah.add(nilai);
        nbelm++;
    }

    public void delete(int index) {
        wadah.remove(index);
        nbelm--;
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(getIsi(i));
        }
    }
}
