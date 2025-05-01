/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanveryeasy;

/**
 *
 * @author Sahal Annabil
 */
public class Senjata {
    //Attribute
    private String bunyi;
    private int peluru;
    
    //Contructor
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    //Method
    public String getBunyi(){
        return bunyi;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setPeluru(int peluru){
        this.peluru += peluru;
    }
    
    public void menembak(){
        System.out.println(bunyi);
        peluru --;
        System.out.println("Sisa Peluru: " + peluru);
    }
}

