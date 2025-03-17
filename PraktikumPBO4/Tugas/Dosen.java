/* 
 * Nama File    : Dosen.java
 * Nama Pembuat : Muhamad Sahal Annabil
 * NIM Pembuat  : 24060123130088
 * Tanggal      : 14 Maret 2025
 * Deskripsi    : subclass dari Pegawai, berisi atribut tambahan fakultas
 *                Superclass dari class DosenTetap dan DosenTamu *                .
 */

 public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, Date tanggalLahir, Date TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(Date tanggalSekarang) {
        super.printInfo(tanggalSekarang);
        System.out.println("Fakultas      : " + fakultas);
    }
}

