/*
File      : BangunDatar.java
Deskripsi : Program untuk class parent BangunDatar
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 12 Maret 2025 */
/***********************************/

public class BangunDatar {
/*public final class BangunDatar {

  }
    keyword 'final' pada Kelas BangunDatar menyebabkannya tidak bisa di inheritance kelas lain.
    Persegi dan Lingkaran yang sebelumnya extends BangunDatar akan error
*/

    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;
    
    // protected int jmlSisi;
    // protected String warna;
    // protected String border;
    // protected static int counterBangunDatar = 0;
    /* Modifikasilah atribut class BangunDatar dengan access modifier protected. Setelah modifikasi
        tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
        public Persegi(double sisi, String warna, String border){
            this.jmlSisi = 4;
            this.warna = warna;
            this.border = border;
            this.sisi = sisi;
        }
        Mengapa?
     * 
     * Akses modifier protected membuat atribut dapat diakses langsung oleh subclass
     * Jadi this.jmlSisi = 4; 
     *      this.warna = warna;
     *  dan this.border = border; dapat dilakukan pada konstruktor Persegi.
     */

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