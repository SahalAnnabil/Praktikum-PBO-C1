/*
File      : Karyawan.java
Deskripsi : Program untuk class Karyawan 
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 28 Maret 2025 */
/***********************************/

public abstract class Karyawan extends CivitasAkademika{
    protected String nip;
    protected int masaKerja;

    public Karyawan(){
    }

    public Karyawan(String nama, String email, String nip, int masaKerja){
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public String getNip() {
        return nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public abstract double hitungGaji();
    
}
