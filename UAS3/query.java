/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS3;

/**
 *
 * @author Fysl
 */
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;


public class query {
    koneksiJDBC k=new koneksiJDBC();
    
    public void simpan(String nama, String kontrak, String telepon, String pencairan, String tenor, String motor){
    k.koneksiData();
    String sql="INSERT INTO `angsuran`(`NO_Kontrak`, `Nama`, `No_Telepon`, `Pencairan`, `Tenor`, `motor`) VALUES (?,?,?,?,?,?)";
        
        try{
            PreparedStatement st = k.conn.prepareStatement(sql);
            st.setString(1, kontrak); //1= nilai kolom, nim= nilai dari inputan nim dst sampi 4
            st.setString(2, nama);
            st.setString(3, telepon);
            st.setString(4, pencairan);
            st.setString(5, tenor);
            st.setString(6, motor);

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
    
    public void hapus(String kontrak){
     k.koneksiData();
      String sql = "DELETE FROM angsuran WHERE NO_Kontrak=?";
    try (PreparedStatement stmt = k.conn.prepareStatement(sql)) { // Gunakan try-with-resources
        stmt.setString(1, kontrak); // Set kontrak yang ingin dihapus

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
    
    public void update(String nama, String kontrak, String telepon, String pencairan, String tenor, String motor){
     k.koneksiData();
     String sql = "UPDATE angsuran SET Nama=?, No_Telepon=?, Pencairan=?, Tenor=?, motor=? WHERE NO_Kontrak=?";
     try{
        PreparedStatement st=k.conn.prepareStatement(sql);
        st.setString(1, nama);
        st.setString(2, telepon);
        st.setString(3, pencairan);
        st.setString(4, tenor);
        st.setString(5, motor);
        st.setString(6, kontrak);
        st.executeUpdate();
        
        System.out.println("Berhasil diubah");
     }catch(Exception e){
         System.out.println("Gagal JDBC");
         e.printStackTrace();
     }
 }
    
    public void cari(String nama){
        k.koneksiData();
        String sql="SELECT*FROM angsuran WHERE Nama LIKE ?";
        try{
            PreparedStatement st=k.conn.prepareStatement(sql);
            st.setString(1,  "%" + nama + "%");
           ResultSet rs = st.executeQuery();
            if(rs.next()){
                System.out.println("Data ditemukan");
            }
            else {
                System.out.println("Data tidak ditemukan");
            }
            
        }catch(Exception e){
         System.out.println("Gagal JDBC");
         e.printStackTrace(); 
     }
    
    }
    
    
    
}
