/*
File      : BangunDatar.java
Deskripsi : Program untuk class parent BangunDatar menggunakan abstract class
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 21 Maret 2025 */
/***********************************/

public abstract class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }
 
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
            this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public abstract double getLuas();
    public abstract double getKeliling();
    
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printinfo(){
        System.out.println(("Jumlah sisi: " + jmlSisi));
        System.out.println(("Warna: " + warna));
        System.out.println(("Border: " + border));
    }

    /*
    public final void printinfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

        Method printinfo() di BangunDatar menjadi tidak bisa dioverride.
        Saat override printinfo() di Persegi atau Lingkaran, akan muncul error
     */
    
}