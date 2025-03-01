/************************************/
/* Nama File : Garis.java */
/* Deskripsi : Program class Garis dan method*/
/* NIM/Nama  : 24060123130088/Muhamad Sahal Annabil*/
/* Tanggal   : 26 Februari 2025*/
/***********************************/
public class Garis{
    private Titik T1;
    private Titik T2;
    private static int counterGaris = 0;
    
    //Konstruktor
    public Garis(Titik T1, Titik T2){
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;
    }
    
    public Garis(){
        T1 = new Titik();
        T2 = new Titik(1,1);
        counterGaris++;
    }

    //Method
    public static int getCounterGaris(){
        return counterGaris;
    }

    public Titik getT1(){
        return T1;
    }

    public Titik getT2(){
        return T2;
    }

    public void setT1(Titik T1){
        this.T1 = T1;
    }

    public void setT2(Titik T2){
        this.T2 = T2;
    }

    public double getPanjangGaris(){
        return T1.getJarak(T2);
    }

    public double getGradienGaris(){
        return (T1.getOrdinat() - T2.getOrdinat()) / (T1.getAbsis() - T2.getAbsis());
    }

    public Titik getTitikTengah(){
        return new Titik((T1.getAbsis() + T2.getAbsis())/2, (T1.getOrdinat() + T2.getOrdinat())/2);
    }

    public boolean isSejajarGaris(Garis G2){
        return this.getGradienGaris() == G2.getGradienGaris();
    }

    public boolean isTegakLurusGaris(Garis G2){
        return this.getGradienGaris()*G2.getGradienGaris() == (-1);
    }

    public void printGaris(){
        System.out.println("T1(" + T1.getAbsis() + "," + T1.getOrdinat() + "), T2(" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
    }

    public void printPersamaanGaris(){
        double m = this.getGradienGaris();
        System.out.println("y = " + m + "x + " + (T1.getOrdinat() - m*T1.getAbsis()) );
    }
}//end class garis