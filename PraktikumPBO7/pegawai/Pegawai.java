/*Nama : Muhamad Sahal Annabil
 * Nim : 240060123130088
 * tgl : 23/4/2025
 */

public class Pegawai{
    private String nama;
    private static int gajiPokok = 5000000;

    public Pegawai(String nama){
        setNama(nama);
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama : "+ nama +", Gaji pokok : "+ gajiPokok);
    }
}