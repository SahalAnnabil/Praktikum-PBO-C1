/* 
 * Nama File    : Pegawai.java
 * Nama Pembuat : Muhamad Sahal Annabil
 * NIM Pembuat  : 24060123130088
 * Tanggal      : 14 Maret 2025
 * Deskripsi    : superclass, berisi atribut
 *                NIP, nama, tanggalLahir, TMT, dan gajiPokok.
 */

 public class Pegawai {
    protected String NIP;
    protected String nama;
    protected Date tanggalLahir;
    protected Date TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, Date tanggalLahir, Date TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public Date hitungBUP(int BUP) {
        int tahunBUP = tanggalLahir.getTahun() + BUP;
        int bulanBUP = tanggalLahir.convertMonthToInt(tanggalLahir.getBulan()) + 1;
        if (bulanBUP > 12) {
            bulanBUP = 1;
            tahunBUP++;
        }
        return new Date(1, getNamaBulan(bulanBUP), tahunBUP);
    }
    
    private String getNamaBulan(int bulan) {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return namaBulan[bulan - 1];
    }

    public String hitungMasaKerja(Date tanggalSekarang) {
        int tahun = tanggalSekarang.getTahun() - TMT.getTahun();
        int bulan = tanggalSekarang.convertMonthToInt(tanggalSekarang.getBulan()) - TMT.convertMonthToInt(TMT.getBulan());
        
        if (bulan < 0) {
            tahun--;
            bulan += 12;
        }
        return tahun + " tahun " + bulan + " bulan";
    }

    public void printInfo(Date tanggalSekarang) {
        System.out.println("NIP           : " + NIP);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.getHari() + " " + tanggalLahir.getBulan() + " " + tanggalLahir.getTahun());
        System.out.println("TMT           : " + TMT.getHari() + " " + TMT.getBulan() + " " + TMT.getTahun());
        System.out.println("Masa Kerja    : " + hitungMasaKerja(tanggalSekarang));
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.0f", gajiPokok) + ",00");
    }
}