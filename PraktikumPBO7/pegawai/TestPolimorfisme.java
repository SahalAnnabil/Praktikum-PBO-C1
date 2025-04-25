/*Nama : Muhamad Sahal Annabil
 * Nim : 240060123130088
 * tgl : 23/4/2025
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args){

        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps){
            emp.tampilData();
        }
    }
}
