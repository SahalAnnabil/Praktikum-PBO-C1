/************************************/
/* Nama File : Kendaraan.java */
/* Deskripsi : Program class Garis dan method*/
/* NIM/Nama  : 24060123130088/Muhamad Sahal Annabil*/
/* Tanggal   : 26 Februari 2025*/
/***********************************/

public class Kendaraan {
    //attribute
    private String noPlat, jenis;

    //method
    //konstruktor tanpa parameter
    public Kendaraan(){
        this(" ", " ");
    }
    //konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

}
