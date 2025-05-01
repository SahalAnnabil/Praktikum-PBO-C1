/* Nama File: Main.java
 * Nama     : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 30 April 2025
 * Deskripsi: Kelas Anabul dan turunannya, serta kelas Datum dan ContohMetodeGenerik
 */

class Anabul {
    //Attributes
    private String nama;

    //Methods
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void Gerak() {}
    public void Bersuara() {}
}

class Anjing extends Anabul {
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("guk-guk");
    }
}

class Kucing extends Anabul {
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }
    
    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}

class Burung extends Anabul {
    
    // Methods
    @Override
    public void Gerak() {
        System.out.println("Tebang");
    }
    
    @Override
    public void Bersuara() {
        System.out.println("cuit");
    }
}

class Datum <G> {
    private G isi;

    public Datum(G isi) {
        this.isi = isi;
    }

    public G getIsi() {
        return isi;
    }

    public void setIsi(G isi) {
        this.isi = isi;
    }
}

class ContohMetodeGenerik{
    <G> G Fungsi(Datum<G> x){
        return x.getIsi();
    }
    <G extends Anabul> void ProsedurGerak(Datum<G> x){
        x.getIsi().Gerak();
    }
    <G extends Anabul> void ProsedurBersuara(Datum<G> x){
        x.getIsi().Gerak();
    }
}

public class Main {
    public static void main(String[] args) {
        //Kamus
        Datum<Anabul> D;
        ContohMetodeGenerik C;
        
        //algoritma
        D = new Datum<>(new Anjing());
        C = new ContohMetodeGenerik();
        System.out.print("\nAnjing gerak (Fungsi): "); C.Fungsi(D).Gerak();
        System.out.print("Anjing gerak (Prosedur): "); C.ProsedurGerak(D);;
        System.out.print("Anjing bersuara (Fungsi): "); C.Fungsi(D).Bersuara();
        System.out.print("Anjing bersuara (Fungsi): "); C.Fungsi(D).Bersuara();

        D = new Datum<>(new Kucing());
        System.out.print("\nKucing gerak (Fungsi): ");C.Fungsi(D).Gerak();
        System.out.print("Kucing gerak (Prosedur): ");C.ProsedurGerak(D);
        System.out.print("Kucing bersuara (Fungsi): ");C.Fungsi(D).Bersuara();
        System.out.print("Kucing bersuara (Prosedur): ");C.ProsedurBersuara(D);

        D = new Datum<>(new Burung());
        System.out.print("\nBurung gerak (Fungsi): ");C.Fungsi(D).Gerak();
        System.out.print("Burung gerak (Prodesur): ");C.ProsedurGerak(D);
        System.out.print("Burung bersuara (Fungsi): ");C.Fungsi(D).Bersuara();
        System.out.print("Burung bersuara (Prosedur): ");C.ProsedurBersuara(D);
    }
}