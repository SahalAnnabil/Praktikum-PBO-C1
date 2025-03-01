/************************************/
/* Nama File : MTitik.java */
/* Deskripsi : Program Main untuk aplikasi class titik*/
/* NIM/Nama  : 24060123130088/Muhamad Sahal Annabil*/
/* Tanggal   : 26 Februari 2025*/
/***********************************/

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        
        Titik T2 = new Titik();
        T2.setAbsis(10);
        T2.setOrdinat(10);
        T2.printTitik();

        System.out.println("Jumlah titik saat ini " + Titik.getCounterTitik());
        System.out.println("Kuadran T1 adalah " + T1.getKuadran());
        System.out.println("Jarak T1 ke Pusat adalah " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T2 adalah " + T1.getJarak(T2));

        T1.refleksiX();
        System.out.println("T1 setelah refleksi terhadap X adalah ");
        T1.printTitik();

        T2.refleksiY();
        System.out.println("T2 setelah refleksi terhadap Y adalah ");
        T2.printTitik();
        
        Titik T3 = T1.getRefleksiX();
        T3.printTitik();
        T1.printTitik();

        Titik T4 = T2.getRefleksiY();
        T4.printTitik();

    }
}   
