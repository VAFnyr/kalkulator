/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_syahrul;
import java.sql.*;
/**
 *
 * @author USER
 */
public class Koneksi {
     private Connection connect;
    private String jdbcUrl = "jdbc:mysql://localhost:3306/kalkulator";
    private String username = "root";  //username default mysql
    private String password = "";

    public Connection getKoneksi() {
        if (connect == null) {

            try {
                connect = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("Koneksi berhasi"
                        + "");
            } catch (SQLException ex) {

                System.out.println("Koneksi Gagal");
            }

        }

        return connect;

    }

    public static void main(String[] args) {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
    }
}
