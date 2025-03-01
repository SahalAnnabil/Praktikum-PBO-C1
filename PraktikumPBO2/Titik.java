/************************************/
/* Nama File : Titik.java */
/* Deskripsi : Program class Titik dan method*/
/* NIM/Nama  : 24060123130088/Muhamad Sahal Annabil*/
/* Tanggal   : 26 Februari 2025*/
/***********************************/
public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;
    
   
    /************Method****************/
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    public Titik(){
        this(0,0);
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis   = absis   + x;
        ordinat = ordinat + y;
    }

    public int getKuadran(){
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

    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    public void refleksiX(){
        ordinat = ordinat*(-1);
    }

    public void refleksiY(){
        absis = absis*(-1);
    }

    public Titik getRefleksiX(){
        Titik Temp = new Titik(absis, ordinat*(-1));
        return Temp;
    }

    public Titik getRefleksiY(){
        Titik Temp = new Titik(absis*(-1), ordinat);
        return Temp;
    }

    public void printTitik(){
        System.out.println("Titik ("+ absis +"," + ordinat + ")");
    }
}//end class titik
