/*
File      : Dosen.java
Deskripsi : Program untuk class Dosen 
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 28 Maret 2025 */
/***********************************/

public class Dosen extends Karyawan{
    private static int counterDosen =0;
    private Fakultas fakultas;

    public Dosen(){
        counterDosen++;
    }

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public static int getCounterDosen() {
        return counterDosen;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void printInfo() {
        System.out.println("Dosen       : " + getNama());
        System.out.println("Email       : " + getEmail());
        System.out.println("NIP         : " + getNip());
        System.out.println("Fakultas   : " + fakultas.getNama());
        System.out.println("MasaKerja   : " + getMasaKerja()+" tahun");
        System.out.println("Gaji        : Rp" + String.format("%,.2f", hitungGaji()) +"\n");
    }
    
}
