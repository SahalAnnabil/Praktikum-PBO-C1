/*
File      : Persegi.java
Deskripsi : Program Persegi extend ke BangunDatar
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 21 Maret 2025 */
/***********************************/
public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(double sisi){
        setJmlSisi(4);
        this.sisi = sisi;
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi*sisi;
    }
    @Override
    public double getKeliling(){
        return sisi*4;
    }

    public double getDiagonal(){
        return sisi*Math.sqrt(2);
    }

    @Override
    public void printinfo(){
        super.printinfo();
        System.out.println("Sisi    : " + sisi);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas    : " + getLuas());
    }

    // Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek
    // bangun datar yang berbeda?
    
        //Ya, method ini dapat membandingkan objek BangunDatar yang berbeda, seperti Persegi dan Lingkaran, karena:
    
        // isEqualLuas() hanya membandingkan hasil return dari getLuas().
        // getLuas() adalah method polymorphic, yang dipanggil sesuai dengan tipe objek.

    // Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas()
    // dan isEqualKeliling pada class BangunDatar? Mengapa?

        //Bisa, namun harus ada implementasi defaultnya misal di method getLuas() pada bangun datar
        //di beri default return 0;
        //namun beresiko error jika bangun datar diinisialisasi new BangunDatar() karena hanya return 0 saat getLuas;

    // Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?

        //Menggunakan abstract class BangunDatar lebih baik karena setiap subclass harus implementasi getLuas() 
        //dan getKeliling(), sehingga tidak ada kesalahan logika.

    public void zoomIn(){
        sisi = sisi*1.1;
    }

    public void zoomOut(){
        sisi = sisi*0.9;
    }

    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}
