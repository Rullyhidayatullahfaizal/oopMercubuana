/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author rully hidayatullah faizal
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksidatabases {
    Connection cn;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/uas_oop","root","");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
