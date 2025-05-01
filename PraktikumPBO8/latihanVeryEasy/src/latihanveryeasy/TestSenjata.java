/* Nama File: TestSenjata.java
 * Nama     : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 30 April 2025
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanveryeasy;

/**
 *
 * @author Sahal Annabil
 */
public class TestSenjata {
    
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
                
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
