/*
File      : Asersi2.java
Deskripsi : Program untuk demo asersi, yang akan menolak input
            jari-jari lingkaran yang bernilai nol
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 26 Februari 2025 */
/***********************************/

// Kelas Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas utama Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        // Asersi untuk memastikan jari-jari lebih besar dari nol
        assert (jariJari > 0) : "Jari-jari tidak boleh nol!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
/*
Konsep yang kurang tepat yaitu: karena asersi lebih tepat digunakan pada saat debugging
tidak untuk memvalidasi input. Sedangkan jari jari lingkaran > 0 seharusnya ditanggulangin
sebelum objek dibuat dengan jari jari yang tidak memenuhi kriteria. langkah yang lebih tepat
adalah dengan menggunakan kondisional if-else
*/
