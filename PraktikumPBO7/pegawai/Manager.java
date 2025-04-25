/*Nama : Muhamad Sahal Annabil
 * Nim : 240060123130088
 * tgl : 23/4/2025
 */

public class Manager extends Pegawai{
    private static int tunjangan =  700000;

    public Manager(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : "+tunjangan);
    }
    
}
