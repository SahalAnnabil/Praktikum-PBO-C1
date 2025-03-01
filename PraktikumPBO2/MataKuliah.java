/************************************/
/* Nama File : MataKuliah.java */
/* Deskripsi : Program class Garis dan method*/
/* NIM/Nama  : 24060123130088/Muhamad Sahal Annabil*/
/* Tanggal   : 26 Februari 2025*/
/***********************************/

public class MataKuliah {
    //attribute
    private String idMatKul, nama;
    private int sks;

    //method
    //konstruktor tanpa parameter
    public MataKuliah(){
        this(" "," ", 0);
    }
    //konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatKul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

}