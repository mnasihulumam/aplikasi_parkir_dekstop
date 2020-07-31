/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_parkir;
import java.sql.*;
/**
 *
 * @author zurin
 */
public class koneksi {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    
    public void koneksi()
    {   
        konek("localhost","db_parkir","root","");
    }
    
    public void konek(String server, String db, String user,String passwd){
        System.out.println("Keterangan");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC tidak barhasil Load");
            e.printStackTrace();
            return;
        }
        System.out.println("Driver berhasil di Load");
        conn = null;
        try {
            conn = DriverManager.getConnection(
            "jdbc:mysql://"+server+":3306/"+db,user,passwd);
        } catch (SQLException e) {
            System.out.println("Tidak bisa koneksi ke database");
            e.printStackTrace();
            return;
        }
        if (conn != null)
            System.out.println("Berhasil Koneksi!");
        else
            System.out.println("Koneksi Gagal........ !");
        }
    }
