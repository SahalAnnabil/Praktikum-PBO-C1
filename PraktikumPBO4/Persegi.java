/*
File      : Persegi.java
Deskripsi : Program Persegi extend ke BangunDatar
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 12 Maret 2025 */
/***********************************/
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    // public Persegi(double sisi, String warna, String border){
    //     this.jmlSisi = 4;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    //} 

    /*  Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
        Mengapa?

        Tidak, karena jmlSisi, warna, dan border adalah atribut private di kelas BangunDatar
        sehingga hanya dapat diakses langsung di kelas BangunDatar.
     */

    public double getSisi(){
        return sisi;
    }

    public void setSisi(Double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }
    
    public double getKeliling(){
        return sisi*4;
    }

    public double getDiagonal(){
        return sisi*Math.sqrt(2);
    }

    @Override
    public void printinfo(){
        super.printinfo();
        System.out.println("Sisi: " + sisi);
    }
}
