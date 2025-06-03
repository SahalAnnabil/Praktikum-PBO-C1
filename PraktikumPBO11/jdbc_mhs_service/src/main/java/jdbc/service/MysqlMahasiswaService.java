/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;


/**
 *
 * @author Sahal Annabil
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    //Contruct
    public MysqlMahasiswaService(){koneksi = MysqlUtility.getConnection();}
    
    //Create mhs
    public Mahasiswa makeMhsObject(ResultSet rSet) throws SQLException{
        Mahasiswa mhs = new Mahasiswa(rSet.getInt("id"), rSet.getString("nama"));
        return mhs;
    }

    // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) throws SQLException{
        PreparedStatement stmt  = koneksi.prepareStatement("INSERT INTO mahasiswa (id, nama) VALUES (?, ?)");
        stmt.setInt(1,mhs.getId());
        stmt.setString(2,mhs.getNama());
        stmt.executeUpdate();
    }
    
    // Update data mahasiswa sesuai id
    public void update(Mahasiswa mhs) throws SQLException{
        PreparedStatement stmt  = koneksi.prepareStatement("UPDATE mahasiswa SET nama=? WHERE id=?");
        stmt.setString(1, mhs.getNama());
        stmt.setInt(2, mhs.getId());
        stmt.executeUpdate();
    }
    
    // Delete data mahasiswa sesuai id
    public void delete(int id) throws SQLException{
        PreparedStatement stmt  = koneksi.prepareStatement("DELETE FROM mahasiswa WHERE id=?");
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
    
    // Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) throws SQLException{
        Mahasiswa mhs = null;
        PreparedStatement stmt  = koneksi.prepareStatement("SELECT id, nama FROM mahasiswa WHERE id=?");
        stmt.setInt(1, id);
        ResultSet rSet = stmt.executeQuery();
        if(rSet.next()){
            mhs = makeMhsObject(rSet);
        }
        return mhs;
    }
    
    // Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() throws SQLException{
        List<Mahasiswa> listMhs = new ArrayList<>();
        PreparedStatement stmt  = koneksi.prepareStatement("SELECT * FROM mahasiswa");
        ResultSet rSet = stmt.executeQuery();
        while(rSet.next()){
            Mahasiswa mhs = makeMhsObject(rSet);
            listMhs.add(mhs);
        }
        return listMhs;
    }
}