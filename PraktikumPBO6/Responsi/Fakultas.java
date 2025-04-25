/*
File      : Fakultas.java
Deskripsi : Program untuk class Fakultas 
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 28 Maret 2025 */
/***********************************/


public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;
    
    public Fakultas(){

    }
    
    public Fakultas(String nama, double tarifUKT, double gajiPokok){
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }
    
    public double getTarifUKT() {
        return tarifUKT;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}