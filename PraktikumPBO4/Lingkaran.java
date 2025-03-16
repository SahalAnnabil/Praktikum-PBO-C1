/*
File      : Lingkaran.java
Deskripsi : Program Lingkaran extend ke BangunDatar
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 12 Maret 2025 */
/***********************************/
public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter/2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI*jari*jari;
    }

    public double getKeliling(){
        return Math.PI*2*jari;
    }

    @Override
    public void printinfo(){
        super.printinfo();
        System.out.println("Jari: " + jari);
    }

}   
