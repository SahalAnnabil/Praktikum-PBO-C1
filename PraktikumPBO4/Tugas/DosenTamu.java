/* 
 * Nama File    : DosenTamu.java
 * Nama Pembuat : Muhamad Sahal Annabil
 * NIM Pembuat  : 24060123130088
 * Tanggal      : 14 Maret 2025
 * Deskripsi    : subclass dari Dosen, berisi atribut
 *                tambahan NIDK dan tglBerakhirKontrak.
 */

 public class DosenTamu extends Dosen {
    private String NIDK;
    private Date tglBerakhirKontrak;

    public DosenTamu(String NIP, String NIDK, String nama, Date tanggalLahir, Date TMT, double gajiPokok, String fakultas, Date tglBerakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public int hitungLamaKontrak(Date sekarang) {
        int tahun = tglBerakhirKontrak.getTahun() - sekarang.getTahun();
        int bulan = tglBerakhirKontrak.convertMonthToInt(tglBerakhirKontrak.getBulan()) - sekarang.convertMonthToInt(sekarang.getBulan());
        
        if (bulan < 0) {
            tahun--;
            bulan += 12;
        }
        return (tahun * 12) + bulan;
    }

    @Override
    public void printInfo(Date sekarang) {
        super.printInfo(sekarang);
        System.out.println("NIDK          : " + NIDK);
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Lama Kontrak  : " + hitungLamaKontrak(sekarang) + " bulan");
        System.out.println("Tunjangan     : Rp " + String.format("%,.0f", hitungTunjangan()) + ",00");
    }
}