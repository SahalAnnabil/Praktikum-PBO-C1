/* Nama File: Senjata.java
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
public class Senjata {
    //Attribute
    private String bunyi;
    boolean menusuk;
    private int peluru;
    
    //Contructor
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    //Method
    public String getBunyi(){
        return bunyi;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
