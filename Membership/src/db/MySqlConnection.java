/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author LENOVO
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// MySqlConnection adalah class yang bertugas untuk menghubungkan aplikasi dengan database
public class MySqlConnection {

    // DB URL adalah alamat database yang akan dihubungkan
    private final static String DB_URL = "jdbc:mysql://localhost:3306/pp2_membership";

    // DB USER adalah username database
    private final static String DB_USER = "root";

    // DB PASS adalah password database
    private final static String DB_PASS = ""; // Gantilah dengan password yang benar

    // instance adalah variabel yang digunakan untuk menyimpan instance dari MySqlConnection
    private static MySqlConnection instance;

    // getInstance adalah method yang digunakan untuk mengambil instance dari MySqlConnection
    public static MySqlConnection getInstance() {
        // jika instance bernilai null, maka akan dibuat instance baru
        if (instance == null) {
            instance = new MySqlConnection();
        }
        // mengembalikan instance
        return instance;
    }

    // getConnection adalah method yang digunakan untuk mengambil koneksi dari database
    public Connection getConnection() {
        // connection adalah variabel yang digunakan untuk menyimpan koneksi dari database
        Connection connection = null;

        try {
            // Class.forName digunakan untuk memuat class driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Mencoba membuat koneksi
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException | SQLException e) {
            // Menangani kesalahan jika gagal membuat koneksi
            e.printStackTrace();
        }

        // Mengembalikan koneksi
        return connection;
    }
}
