/************************************/
/* Nama File : Mahasiswa.java */
/* Deskripsi : Program class Garis dan method*/
/* NIM/Nama  : 24060123130088/Muhamad Sahal Annabil*/
/* Tanggal   : 26 Februari 2025*/
/***********************************/

import java.util.ArrayList;

public class Mahasiswa {
    //attribute
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //method
    //konstruktor tanpa parameter
    public Mahasiswa () {
        this.nim = " ";
        this.nama = " ";
        this.prodi = " ";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }
    
    //konstruktor dengan parameter
    public Mahasiswa (String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul) {
        this.listMatKul.add(newMatKul);
    }

    public int getJumlahSKS() {
        int jumlahSKS = 0;
        for (int i = 0; i < this.listMatKul.size(); i++) {
            jumlahSKS += this.listMatKul.get(i).getSks();
        }
        return jumlahSKS;
    }

    public int getJumlahMatKul() {
        return this.listMatKul.size();
    }

    public void printMhs() {
        System.out.println("NIM : " + this.nim);
        System.out.println("nama : " + this.nama);
        System.out.println("prodi : " + this.prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM : " + this.nim);
        System.out.println("nama : " + this.nama);
        System.out.println("prodi : " + this.prodi);
        System.out.println("Mata Kuliah : ");
        for (int i = 0; i < this.listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Dosen Wali : " + this.dosenWali.getNama());
        System.out.println("Plat Nomor Kendaraan : " + this.kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan : " + this.kendaraan.getJenis());
    }
}
