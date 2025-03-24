/*
File      : Manusia.java
Deskripsi : Program untuk class Petani
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 21 Maret 2025 */
/***********************************/

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani = 0;

    //Konstruktor tanpa parameter
    public Petani(){
        counterPetani++;
    }
    //Konstruktor tanpa parameter
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //getter
    public String getAsalKota(){
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    //setter
    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja() {
        Date now = toDate("24-03-2025");
        if(now.getMonth() >= this.getTgl_mulai_kerja().getMonth()){
            return (now.getYear() - this.getTgl_mulai_kerja().getYear()) + 0;
        }else{
            return (now.getYear() -1 - this.getTgl_mulai_kerja().getYear()) + 0;
        }
    }
    @Override
    public double hitungPajak() {
        return this.pendapatan * 0;
    }    

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota           :" + this.getAsalKota());
        System.out.println("Masa Kerja          :" + this.hitungMasaKerja() +" tahun");
        System.out.println("Pajak               :" + this.hitungPajak() +" rupiah");
    }


}
