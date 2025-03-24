/*
File      : Manusia.java
Deskripsi : Program untuk class Pengusaha
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 21 Maret 2025 */
/***********************************/


public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    //Konstruktor tanpa parameter
    public Pengusaha(){
        counterPengusaha++;
    }
    //Konstruktor tanpa parameter
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //getter
    public String getNpwp(){
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    //setter
    public void setNpwp(String npwp){
        this.npwp = npwp;
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
        return this.pendapatan * 0.15;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP                :" + this.getNpwp()); 
        System.out.println("Masa Kerja          :" + this.hitungMasaKerja() +" tahun");
        System.out.println("Pajak               :" + this.hitungPajak() +" rupiah");
    }

}

