/*
File      : CivitasAkademika.java
Deskripsi : Program untuk abstract class CivitasAkademika 
NIM/Nama  : 24060123130088/Muhamad Sahal Annabil
Tanggal   : 28 Maret 2025 */
/***********************************/


public abstract class CivitasAkademika {
    private static int counterCA=0;
    protected String nama;
    protected String email;

    public CivitasAkademika(){
        counterCA++;
    }

    public CivitasAkademika(String nama, String email){
        this.nama = nama;
        this.email = email;
        counterCA++;
    }

    public static int getCounterCA() {
        return counterCA;
    }

    public String getNama() {
        return nama;
    }
    
    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void printInfo();
}
