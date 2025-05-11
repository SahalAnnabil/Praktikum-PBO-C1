/* Nama File: Main.java
 * Nama     : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 30 April 2025
 * Deskripsi: Kelas Anabul dan turunannya, serta kelas Datum dan ContohMetodeGenerik
 */

class Anabul {
    //Attributes
    private String nama;

    //Constructor
    public Anabul(String nama) {
        this.nama = nama;
    }
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
    public Anjing(String nama) {
        super(nama);
    }
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
    public Kucing(String nama) {
        super(nama);
    }

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
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Tebang");
    }
    
    @Override
    public void Bersuara() {
        System.out.println("cuit");
    }
}

class KoleksiAnabul extends Koleksi<Anabul> {
    @Override
    public void showAll() {
        for (int i = 0; i < getSize(); i++) {
            Anabul a = getIsi(i);
            System.out.println("Nama: " + a.getNama()); 
            System.out.print("Gerak: "); a.Gerak(); 
            System.out.print("Bunyi: "); a.Bersuara();
            System.out.println("---------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //Kamus
        Koleksi<Anabul> KoleksiAnabul = new KoleksiAnabul();
        
        //algoritma
        KoleksiAnabul.add(new Anjing("Doggy"));
        KoleksiAnabul.add(new Kucing("Catty"));
        KoleksiAnabul.add(new Burung("Birdy"));
        KoleksiAnabul.add(new Anjing("Tralala"));
        KoleksiAnabul.add(new Kucing("Trululu"));
        KoleksiAnabul.add(new Burung("Brururu"));
        KoleksiAnabul.add(new Anjing("Ajaja"));
        KoleksiAnabul.add(new Kucing("Kiki"));
        KoleksiAnabul.add(new Burung("Burr"));
        KoleksiAnabul.add(new Anjing("Anjaja"));

        System.out.println("Isi Koleksi Anabul:");
        KoleksiAnabul.showAll();
    }
}