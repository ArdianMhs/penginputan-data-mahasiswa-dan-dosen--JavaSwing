/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class connect {
    public static Connection con;
    public static Statement stm;
    public static void config(){
        try{
            String url ="jdbc:mysql://localhost/inputdata";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil");           
        }catch (Exception e){
            System.err.println("koneksi gagal" + e.getMessage());
        }
            
    }
    
}
    
