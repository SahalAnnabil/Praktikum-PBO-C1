/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author Sahal Annabil
 */
public class Mahasiswa {
    // atribut
    private int id;
    private String nama;

    // Constructor tanpa parameter
    public Mahasiswa() {
        id = -1;
        nama = "not set";
    }

    // Constructor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}