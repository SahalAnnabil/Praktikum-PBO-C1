/*Nama : Muhamad Sahal Annabil
 * Nim : 240060123130088
 * tgl : 23/4/2025
 */

public class Programmer extends Pegawai{
    private static int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : "+bonus);
    }
    
}
