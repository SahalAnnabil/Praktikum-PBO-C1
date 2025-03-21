/*
File      : Lingkaran.java
Deskripsi : Program Lingkaran extend ke BangunDatar
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 21 Maret 2025 */
/***********************************/
public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(double jari){
        setJmlSisi(1);
        this.jari = jari;
    }

    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    public double getLuas(){
        return Math.PI*jari*jari;
    }

    @Override
    public double getKeliling(){
        return Math.PI*2*jari;
    }

    @Override
    public void printinfo(){
        super.printinfo();
        System.out.println("Jari: " + jari);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas    : " + getLuas());
    }


    public void zoomIn(){
        jari = jari*1.1;
    }

    public void zoomOut(){
        jari = jari*0.9;
    }

    public void zoom(int percent){
        jari = jari * percent/100;
    }    

}   
