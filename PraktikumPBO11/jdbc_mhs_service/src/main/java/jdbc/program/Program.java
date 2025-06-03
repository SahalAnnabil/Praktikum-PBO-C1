/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * File     : Program.java
 * Pembuat  : Muhamad Sahal Annabil
 * NIM      : 24060123130088
 * Tanggal  : 27 Mei 2025
 * Deskripsi: Main program untuk akses basis data mahasiswa 
 */
package jdbc.program;
/**
 *
 * @author Sahal Annabil
 */
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) throws SQLException {
        List<Mahasiswa> lmhs = new ArrayList<>();
        System.out.println("");

        // === INSERT ===
        System.out.println("===insert===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // === UPDATE ===
        System.out.println("===update===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // === DELETE ===
        System.out.println("===delete===");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    // Menampilkan semua data mahasiswa
    public static void displayAll() throws SQLException {
        List<Mahasiswa> list = service.getAll();
        System.out.println("==displayAll==");
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
    }
}
