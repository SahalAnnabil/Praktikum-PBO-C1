/************************************/
/* Nama File : Titik.java */
/* Deskripsi : Program class Titik dan method*/
/* NIM/Nama  : 24060123130088*/
/* Tanggal   : 19 Februari 2025*/
/***********************************/
public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;
    
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    Titik(){
        this(0,0);
    }

/************Method****************/
    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis   = absis   + x;
        ordinat = ordinat + y;
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }else if(absis < 0 && ordinat > 0){
            return 2;
        }else if(absis < 0 && ordinat < 0){
            return 3;
        }else if(absis > 0 && ordinat < 0){
            return 4;
        }else{
            return -1;
        } 
    }

    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    void refleksiX(){
        ordinat = ordinat*(-1);
    }

    void refleksiY(){
        absis = absis*(-1);
    }

    Titik getRefleksiX(){
        Titik Temp = new Titik(absis, ordinat*(-1));
        return Temp;
    }

    Titik getRefleksiY(){
        Titik Temp = new Titik(absis*(-1), ordinat);
        return Temp;
    }

    void printTitik(){
        System.out.println("Titik ("+ absis +"," + ordinat + ")");
    }
}//end class titik
