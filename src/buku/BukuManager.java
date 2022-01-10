/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

import database.Koneksi;
import model.BukuModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BukuManager {
    
    private final Connection koneksiDatabase;

    public BukuManager() {
        this.koneksiDatabase = Koneksi.koneksiDB();
    }
    
    public List<BukuModel> tampilSemua(){
        String namaTable = "data_buku";
        String query = "SELECT * FROM "+namaTable;
        BukuModel model;
        List<BukuModel> list = new ArrayList<>();
        try {
            Statement preparedStatement = koneksiDatabase.createStatement();
            ResultSet hasilQuery = preparedStatement.executeQuery(query);
            
            while(hasilQuery.next()){
                model = new BukuModel();
                model.setId(hasilQuery.getInt("id"));
                model.setNama_buku(hasilQuery.getString("nama_buku"));
                model.setPenerbit(hasilQuery.getString("penerbit"));
                model.setPenyusun(hasilQuery.getString("penyusun"));
                model.setTahun_terbit(hasilQuery.getString("tahun_terbit"));
                list.add(model);
            }            
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(BukuManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public BukuModel byId(int id){
        String namaTable = "data_buku";
        String query = "SELECT * FROM "+namaTable+" WHERE id = "+id;
        BukuModel model = null;
        try {
            Statement preparedStatement = koneksiDatabase.createStatement();
            ResultSet hasilQuery = preparedStatement.executeQuery(query);
            
            while(hasilQuery.next()){
                model = new BukuModel();
                model.setId(hasilQuery.getInt("id"));
                model.setNama_buku(hasilQuery.getString("nama_buku"));
                model.setPenerbit(hasilQuery.getString("penerbit"));
                model.setPenyusun(hasilQuery.getString("penyusun"));
                model.setTahun_terbit(hasilQuery.getString("tahun_terbit"));
            }            
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BukuManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    
    public boolean insert(String namabuku, String penerbit, String penyusun, String tahunterbit) {
        String namaTable = "data_buku";
        String query = "INSERT INTO "+namaTable+" (`nama_buku`, `penerbit`, `penyusun`, `tahun_terbit`) VALUES ('"+namabuku+"', '"+penerbit+"','"+penyusun+"', '"+tahunterbit+"');";
        
        try {
            PreparedStatement preparedStatement = koneksiDatabase.prepareStatement(query);
            preparedStatement.execute();   
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BukuManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean update(String namabuku, String penerbit, String penyusun, String tahunterbit, int id) {
        String namaTable = "data_buku";
        String query = "UPDATE "+namaTable+" SET `nama_buku`='"+namabuku+"', `penerbit`='"+penerbit+"', `penyusun`='"+penyusun+"', `tahun_terbit`='"+tahunterbit+"'  WHERE  `id`="+id+";";
        
        try {
            PreparedStatement preparedStatement = koneksiDatabase.prepareStatement(query);
            preparedStatement.execute();   
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BukuManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean delete(String id) {
        String namaTable = "data_buku";
        String query = "DELETE FROM "+namaTable+" WHERE id = "+id;
        
        try {
            PreparedStatement preparedStatement = koneksiDatabase.prepareStatement(query);
            preparedStatement.execute();   
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BukuManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
