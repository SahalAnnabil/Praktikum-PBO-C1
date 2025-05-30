/* Nama File: KontrolSenjata.java
 * Nama     : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 30 April 2025
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author Sahal Annabil
 */
public class KontrolSenjata {
    //Attribute
    Senjata senjata;
    //Constructor
    public KontrolSenjata(Senjata s){
        senjata = s;
    }
    //Method
    public boolean isAdaPeluru(){
        return (senjata.getPeluru() > 0);
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambahkan: "+ jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak "+ jumlah+" kali");
        if (isAdaPeluru()){
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() -1);
                }else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: "+ senjata.getPeluru());
        }else{
            System.out.println("Peluru Habis");
        }
    }
    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb!";
        } else {
            return"Gagal, belum pasang bayonet";
        }
    }
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
}
