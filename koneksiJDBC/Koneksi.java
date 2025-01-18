/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksiJDBC;

/**
 *
 * @author Fysl
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


public class Koneksi {
    
            //driver jdbc
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";//versi baru . kalau versi lama com.mysql.jdbc.Driver
    //alamat database lsp
    static final String DB_URL = "jdbc:mysql://localhost/Mahasiswa"; //yg mahasiswa nama database
    //user mysql
    static final String USER = "root";
    //pasword mysql
    static final String PASS = "";
    
    //variabel untuk menyimpan status koneksi
    String statuskoneksi="";
    
    
    public Connection conn; //adalah objek yg digunakan untuk koneksi ke jdbc ke Driver
    public Statement stmt; //untuk eksekusi query/db
       
    public void koneksiData (){
        //melakukan koneksi ke database
        //hrus dibungkus memakai blok try/catch
    try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement/ 
            stmt = conn.createStatement(); 
            statuskoneksi=("Tersambungkan");  
        }
    //untuk menangkap jdbc
    catch (Exception e) {
            statuskoneksi=("Gagal Koneksi" );
    }
    }
     

    }
