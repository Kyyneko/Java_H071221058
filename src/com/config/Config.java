package com.config;

import java.sql.*;

public class Config {
    public static final String URL = "jdbc:mysql://localhost:3306/aplikasi_kasir";
    public static final String USER = "root";
    public static final String PASS = "";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            // Membuat data
            // createData(conn, "Baju", 200000, 2);

            // Membaca data
            // readData(conn);

            // Memperbarui data
            // updateData(conn, 1, "Baju", 250000, 3);

            // Menghapus data
            // deleteData(conn, 22);

            // Mereset ID
            // resetID(conn, "riwayat");
        } catch (SQLException e) {
            System.out.println("Failed");
        }
    }

    // Fungsi untuk membuat data
    public static void createData(Connection conn, String nama, int harga, int jumlah) throws SQLException {
        String query = "INSERT INTO riwayat (nama, harga, jumlah) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nama);
            stmt.setInt(2, harga);
            stmt.setInt(3, jumlah);
            stmt.executeUpdate();
            System.out.println("Crate Data Success");
        } catch (SQLException e) {
            System.out.println("Failed to create data");
        }
    }

    // Fungsi untuk membaca data
    public static void readData(Connection conn) throws SQLException {
        String query = "SELECT * FROM riwayat";
        try (Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String nama = rs.getString("NAMA");
                int harga = rs.getInt("HARGA");
                int jumlah = rs.getInt("JUMLAH");
                System.out.println("ID: " + id + ", Nama: " + nama + ", Harga: " + harga + ", Jumlah: " + jumlah);
            }
        } catch (Exception e) {
            System.out.println("Failed to read data");
        }
    }

    // Fungsi untuk memperbarui data
    public static void updateData(Connection conn, int id, String nama, int harga, int jumlah) throws SQLException {
        String query = "UPDATE riwayat SET nama = ?, harga = ?, jumlah = ? WHERE ID = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nama);
            stmt.setInt(2, harga);
            stmt.setInt(3, jumlah);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            System.out.println("Update Data Success" );
        } catch (Exception e) {
            System.out.println("Fail to update data");
        }
    }

    // Fungsi untuk menghapus data
    public static void deleteData(Connection conn, int id) throws SQLException {
        String query = "DELETE FROM riwayat WHERE ID = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Delete Data Success");
        } catch (Exception e) {
            System.out.println("Failed to delete data");
        }
    }

    // Fungsi untuk mereset ID
    public static void resetID(Connection conn, String tableName) throws SQLException {
        String query = "ALTER TABLE " + tableName + " AUTO_INCREMENT = 1";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Reset ID Success");
        } catch (Exception e) {
            System.out.println("Failed To Reset ID");
        }
    }
}
