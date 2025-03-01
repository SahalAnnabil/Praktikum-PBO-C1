/************************************/
/* Nama File : MMahasiswa.java      */
/* Deskripsi : Program Main untuk aplikasi class Mahasiswa */
/* NIM/Nama  : 24060123130088/Muhamad Sahal Annabil */
/* Tanggal   : 26 Februari 2025 */
/***********************************/

public class MMahasiswa {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen();
        dosen1.setNip("123");
        dosen1.setNama("Dr. Budi");
        dosen1.setProdi("Informatika");

        Dosen dosen2 = new Dosen("456", "Dr. Siti", "Ilmu Komputer");

        MataKuliah matkul1 = new MataKuliah();
        matkul1.setIdMatKul("MBD");
        matkul1.setNama("Managemen Basis Data");
        matkul1.setSks(3);

        MataKuliah matkul2 = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);

        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.setNoPlat("B 1234 AB");
        kendaraan1.setJenis("Motor");

        Kendaraan kendaraan2 = new Kendaraan("H 5678 GH", "Mobil");

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNim("24060123130088");
        mahasiswa1.setNama("Muhamad Sahal Annabil");
        mahasiswa1.setProdi("Informatika");

        Mahasiswa mahasiswa2 = new Mahasiswa("24060123130123", "Lahas Bannana", "Ilmu Komputer");

        //dosen wali ke mahasiswa
        mahasiswa1.setDosenWali(dosen1);

        mahasiswa2.setDosenWali(dosen2);

        //kendaraan ke mahasiswa
        mahasiswa1.setKendaraan(kendaraan1);

        mahasiswa2.setKendaraan(kendaraan2);

        //mata kuliah ke mahasiswa
        mahasiswa1.addMatKul(matkul1);
        mahasiswa1.addMatKul(matkul2);

        mahasiswa2.addMatKul(matkul2);

        System.out.println("Data Mahasiswa 1:");
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("Prodi: " + mahasiswa1.getProdi());
        System.out.println("Dosen Wali: " + mahasiswa1.getDosenWali().getNama());
        System.out.println("Kendaraan: Nomor Plat " + mahasiswa1.getKendaraan().getNoPlat() + " - Jenis " + mahasiswa1.getKendaraan().getJenis());
        System.out.println("Jumlah SKS yang diambil: " + mahasiswa1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah yang diambil: " + mahasiswa1.getJumlahMatKul());
        System.out.println();
        System.out.println("Data mahasiswa1 dengan method printDetailMhs:");
        mahasiswa1.printDetailMhs();
        
        System.out.println();
        
        System.out.println("Data Mahasiswa 2:");
        System.out.println("NIM: " + mahasiswa2.getNim());
        System.out.println("Nama: " + mahasiswa2.getNama());
        System.out.println("Prodi: " + mahasiswa2.getProdi());
        System.out.println("Dosen Wali: " + mahasiswa2.getDosenWali().getNama());
        System.out.println("Kendaraan: Nomor Plat " + mahasiswa2.getKendaraan().getNoPlat() + " - Jenis " + mahasiswa2.getKendaraan().getJenis());
        System.out.println("Jumlah SKS yang diambil: " + mahasiswa2.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah yang diambil: " + mahasiswa2.getJumlahMatKul());
        System.out.println();
        System.out.println("Data mahasiswa2 dengan method printDetailMhs:");
        mahasiswa2.printDetailMhs();
    }
}
