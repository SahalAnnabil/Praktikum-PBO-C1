/*
File      : Manusia.java
Deskripsi : Program untuk class PNS
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 21 Maret 2025 */
/***********************************/


public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    //Konstruktor tanpa parameter
    public PNS(){
        counterPNS++;
    }
    //Konstruktor tanpa parameter
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    // Konstruktor dengan semua parameter kecuali alamat
    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //getter
    public String getNip(){
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    //setter
    public void setNip(String nip){
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        Date now = toDate("24-03-2025");
        if(now.getMonth() >= this.getTgl_mulai_kerja().getMonth()){
            return (now.getYear() - this.getTgl_mulai_kerja().getYear()) + 8;
        }else{
            return (now.getYear() -1 - this.getTgl_mulai_kerja().getYear()) + 8;
        }
    }

    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.10;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP                 :" + this.getNip());
        System.out.println("Masa Kerja          :" + this.hitungMasaKerja() +" tahun");
        System.out.println("Pajak               :" + this.hitungPajak() +" rupiah");

    }
    
}
