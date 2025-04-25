/*
File      : Tendik.java
Deskripsi : Program untuk class Tendik 
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 28 Maret 2025 */
/***********************************/

public class Tendik extends Karyawan{
    private static int counterTendik =0;
    private static final double gaji_pokok = 4000000;

    public Tendik(){
        counterTendik++;
    }

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counterTendik++;
    }

    public static int getCounterTendik() {
        return counterTendik;
    }

    @Override
    public double hitungGaji() {
        return gaji_pokok + (getMasaKerja() * 0.01 * gaji_pokok);
    }

    @Override
    public void printInfo() {
        System.out.println("Tendik      : " + getNama());
        System.out.println("Email       : " + getEmail());
        System.out.println("NIP         : " + getNip());
        System.out.println("MasaKerja   : " + (getMasaKerja()) + " tahun");
        System.out.println("Gaji        : Rp" + String.format("%,.2f", hitungGaji()) +"\n");
    }
    
}
