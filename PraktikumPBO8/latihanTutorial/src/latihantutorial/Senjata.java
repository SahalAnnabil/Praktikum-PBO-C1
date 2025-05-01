/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantutorial;

/**
 *
 * @author Sahal Annabil
 */
public class Senjata {
    //Fields
    private String bunyi;
    private boolean menusuk;
    
    //Constructors
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    //Methods
    private String getBunyi(){
        return bunyi;
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public String menusuk(){
        if (isMenusuk()){
            return "Jleb!";
        } else {
            return"Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
}
