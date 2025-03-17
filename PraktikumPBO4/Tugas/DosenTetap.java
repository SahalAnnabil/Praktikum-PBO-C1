/* 
 * Nama File    : DosenTetap.java
 * Nama Pembuat : Muhamad Sahal Annabil
 * NIM Pembuat  : 24060123130088
 * Tanggal      : 14 Maret 2025
 * Deskripsi    : subclass dari Dosen, berisi atribut
 *                tambahan NIDN dan batasUsiaPensiun (BUP).
 */


 public class DosenTetap extends Dosen {
    private String NIDN;
    private static final int BUP = 65;

    public DosenTetap(String NIP, String NIDN, String nama, Date tanggalLahir, Date TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan(Date tanggalSekarang) {
        int masaKerja = tanggalSekarang.getTahun() - TMT.getTahun();
        return 0.02 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo(Date tanggalSekarang) {
        System.out.println("NIDN          : " + NIDN);
        super.printInfo(tanggalSekarang);
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("BUP           : " + hitungBUP(BUP).getHari() + " " + hitungBUP(BUP).getBulan() + " " + hitungBUP(BUP).getTahun());
        System.out.println("Tunjangan     : Rp " + String.format("%,.0f", hitungTunjangan(tanggalSekarang)) + ",00");
    }
}