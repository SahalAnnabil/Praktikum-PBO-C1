/************************************/
/* Nama File : Dosen.java */
/* Deskripsi : Program class Garis dan method*/
/* NIM/Nama  : 24060123130088/Muhamad Sahal Annabil*/
/* Tanggal   : 26 Februari 2025*/
/***********************************/

public class Dosen {

    //attribute
    private String nip, nama, prodi;

    //method
    //konstruktor tanpa parameter
    public Dosen(){
        this(" ", " ", " ");
    }

    //konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
