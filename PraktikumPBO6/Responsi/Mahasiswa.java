/*
File      : Mahasiswa.java
Deskripsi : Program untuk class Mahasiswa 
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 28 Maret 2025 */
/***********************************/


public class Mahasiswa extends CivitasAkademika{
    private static int counterMHS =0;
    private String nim;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa(){
        counterMHS++;
    }
    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas){
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMHS++;
    }

    public static int getCounterMHS() {
        return counterMHS;
    }

    public String getNim() {
        return nim;
    }

    public int getSemester() {
        return semester;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungUKT(){
        return fakultas.getTarifUKT() * Math.pow(0.95, semester -1);
    }

    @Override
    public void printInfo() {
        System.out.println("Mahasiswa   : " + getNama());
        System.out.println("Email       : " + getEmail());
        System.out.println("NIM         : " + getNim());
        System.out.println("Semester    : " + getSemester());
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.println("Biaya UKT   : Rp" + String.format("%,.2f", hitungUKT()) +"\n");
    }
}
