/* 
 * Nama File    : Date.java
 * Nama Pembuat : Muhamad Sahal Annabil
 * NIM Pembuat  : 24060123130088
 * Tanggal      : 14 Maret 2025
 * Deskripsi    : Date merupakan class sebagai tipe data Date
 */

public class Date {
    private int hari;
    private String bulan;
    private int tahun;

    public Date(int hari, String bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public void setHari(int hari) { 
        this.hari = hari; 
    }

    public void setBulan(String bulan) {
        this.bulan = bulan; 
    }

    public void setTahun(int tahun) {
        this.tahun = tahun; 
    }

    public int getHari() { 
        return this.hari; 
    }

    public String getBulan() {
        return this.bulan; 
    }

    public int getTahun() {
        return this.tahun; 
    }

    public boolean isKabisat() {
        return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
    }

    public int convertMonthToInt(String namaBulan) {
        switch (namaBulan) {
            case "Januari":
                return 1;
            case "Februari":
                return 2;
            case "Maret":
                return 3;
            case "April":
                return 4;
            case "Mei":
                return 5;
            case "Juni":
                return 6;
            case "Juli":          
                return 7;
            case "Agustus":
                return 8;
            case "September":
                return 9;
            case "Oktober":
                return 10;
            case "November":
                return 11;
            case "Desember":
                return 12;
            default:
                return -999999999;
        }
    }

    public int getJmlDayPerMonth(String bulan, int tahun) {
        switch (convertMonthToInt(bulan)) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (isKabisat()) ? 29 : 28;
            default:
                return -999999999;
        }
    }
}
