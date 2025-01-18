/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasJDBC;

/**
 *
 * @author Fysl
 */
//import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class Query {
    Koneksi k=new Koneksi();

    //simpan
    public void simpan(String nim, String nama, String alamat, String gender){
        k.koneksiData();
        String sql="INSERT INTO `identitas`(`NIM`, `Nama`, `Alamat`, `Gender`) VALUES (?,?,?,?)";
        
        try{
            PreparedStatement st = k.conn.prepareStatement(sql);
            st.setString(1, nim); //1= nilai kolom, nim= nilai dari inputan nim dst sampi 4
            st.setString(2, nama);
            st.setString(3, alamat);
            st.setString(4, gender);

            //eksekusi query
            int eksekusi = st.executeUpdate();
            //simpan
            if (eksekusi > 0) {
                JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Simpan");
            };
        }catch(Exception ex){ 
           System.out.println("GAGAL JDBC");
           ex.printStackTrace();
        }
}   
    
 public void hapus(String nim){
     k.koneksiData();
      String sql = "DELETE FROM identitas WHERE nim = ?";
    try (PreparedStatement stmt = k.conn.prepareStatement(sql)) { // Gunakan try-with-resources
        stmt.setString(1, nim); // Set NIM yang ingin dihapus

        // Eksekusi query dan periksa hasil
         stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
    } catch (SQLException e) { // Tangkap kesalahan SQL khusus
        System.out.println("Kesalahan saat menghapus data: " + e.getMessage());
        e.printStackTrace(); // Untuk debugging
    } catch (Exception e) { // Tangkap kesalahan umum lainnya
        System.out.println("Terjadi kesalahan: " + e.getMessage());
        e.printStackTrace();
    }

 }
 
 public void update(String nim, String nama, String alamat, String gender){
     k.koneksiData();
     String sql = "UPDATE identitas SET Nama = ?, Alamat = ?, Gender = ? WHERE nim = ?";
     try{
        PreparedStatement st=k.conn.prepareStatement(sql);
        st.setString(1, nama);
        st.setString(2, alamat);
        st.setString(3, gender);
        st.setString(4, nim);
        st.executeUpdate();
        
        System.out.println("Berhasil diubah");
     }catch(Exception e){
         System.out.println("Gagal JDBC");
         e.printStackTrace();
     }
 }
 
 public void riset(){
    k.koneksiData();
    try{
       String sql = "DELETE FROM identitas"; // Menghapus semua data dari tabel "data"
        PreparedStatement stmt = k.conn.prepareStatement(sql);
        
        stmt.executeUpdate(); // Eksekusi query 
    }catch(Exception e){
        System.out.println("Gagallllllll");
        e.printStackTrace();
    }
 }
 
 
}
