/************************************/
/* Nama File : Garis.java */
/* Deskripsi : Program class Garis dan method*/
/* NIM/Nama  : 24060123130088*/
/* Tanggal   : 19 Februari 2025*/
/***********************************/
public class Garis{
    Titik T1;
    Titik T2;
    static int counterGaris = 0;
    
    //Konstruktor
    Garis(Titik T1, Titik T2){
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;
    }
    
    Garis(){
        T1 = new Titik();
        T2 = new Titik(1,1);
        counterGaris++;
    }

    //Method
    static int getCounterGaris(){
        return counterGaris;
    }

    Titik getT1(){
        return T1;
    }

    Titik getT2(){
        return T2;
    }

    void setT1(Titik T1){
        this.T1 = T1;
    }

    void setT2(Titik T2){
        this.T2 = T2;
    }

    double getPanjangGaris(){
        return T1.getJarak(T2);
    }

    double getGradienGaris(){
        return (T1.getOrdinat() - T2.getOrdinat()) / (T1.getAbsis() - T2.getAbsis());
    }

    Titik getTitikTengah(){
        return new Titik((T1.getAbsis() + T2.getAbsis())/2, (T1.getOrdinat() + T2.getOrdinat())/2);
    }

    boolean isSejajarGaris(Garis G2){
        return this.getGradienGaris() == G2.getGradienGaris();
    }

    boolean isTegakLurusGaris(Garis G2){
        return this.getGradienGaris()*G2.getGradienGaris() == (-1);
    }

    void printGaris(){
        System.out.println("T1(" + T1.getAbsis() + "," + T1.getOrdinat() + "), T2(" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
    }

    void printPersamaanGaris(){
        double m = this.getGradienGaris();
        System.out.println("y = " + m + "x + " + (T1.getOrdinat() - m*T1.getAbsis()) );
    }
}//end class garis