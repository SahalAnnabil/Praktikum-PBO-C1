/*
File      : Main.java
Deskripsi : Program untuk class Main 
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 28 Maret 2025 */
/***********************************/

public class Main {
    public static void main(String[] args) {
        Fakultas MIPA = new Fakultas("Teknik", 5000000, 8000000);
        Fakultas ekonomi = new Fakultas("Ekonomi", 4000000, 7000000);
        Fakultas hukum = new Fakultas();
        hukum.setNama("Hukum");
        hukum.setTarifUKT(7000000);
        hukum.setGajiPokok(10000000);

        
        Mahasiswa mhs1 = new Mahasiswa("Budi", "budi@email.com", "12345678901111", 3, MIPA);
        Mahasiswa mhs2 = new Mahasiswa("Siti", "siti@email.com", "12345678902222", 2, ekonomi);
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNama("Joko");
        mhs3.setEmail("joko@email.com");
        mhs3.setNim("4206912313420");
        mhs3.setSemester(4);
        mhs3.setFakultas(hukum);
        
        Dosen dosen1 = new Dosen("Edi", "edi@email.com", "123456789012345", 10, MIPA);
        Dosen dosen2 = new Dosen();
        dosen2.setNama("Ida");
        dosen2.setEmail("ida@gmail.com");
        dosen2.setNip("123456789012347");
        dosen2.setMasaKerja(4);
        dosen2.setFakultas(hukum);
        Tendik tendik1 = new Tendik("Adi", "adi@email.com", "123456789012346", 5);
        
        mhs1.printInfo();
        mhs2.printInfo();
        mhs3.printInfo();
        dosen1.printInfo();
        dosen2.printInfo();
        tendik1.printInfo();
        System.out.println("Banyak Objek Civitas Akademika  : " + CivitasAkademika.getCounterCA());
        System.out.println("Banyak Objek Mahasiswa          : "+Mahasiswa.getCounterMHS());
        System.out.println("Banyak Objek Dosen              : " +Dosen.getCounterDosen());
        System.out.println("Banyak Objel Tenaga Pendidik    : " +Tendik.getCounterTendik());
    }
}
