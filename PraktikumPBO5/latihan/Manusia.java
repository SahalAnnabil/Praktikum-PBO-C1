/*
File      : Manusia.java
Deskripsi : Program untuk class parent Manusia menggunakan abstract class
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 21 Maret 2025 */
/***********************************/


public abstract class Manusia {
    protected String nama;
    protected Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    

    //Konstruktor
    public Manusia(){
        counterMns++;
    }
    //Helper
    protected Date toDate(String dateString) {
        String[] parts = dateString.split("-");
        return new Date(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
    }

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = toDate(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;

        counterMns++;
    }
    // Getter
    public String getNama() {
        return nama;
    }

    public Date getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(Date tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void cetakInfo(){
        System.out.println("\nNama                :" + this.getNama());
        System.out.println("tanggal Mulai Kerja :" + this.getTgl_mulai_kerja().toString());
        System.out.println("Alamat              :" + this.getAlamat());
        System.out.println("Pendapatan          :" + String.format("%.2f", this.getPendapatan()));
    }

    public abstract int hitungMasaKerja();
}