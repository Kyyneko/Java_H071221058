import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ResetID {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/aplikasi_kasir"; // Ganti dengan URL database Anda
        String username = "root"; // Ganti dengan username database Anda
        String password = ""; // Ganti dengan password database Anda

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String tableName = "riwayat"; // Ganti dengan nama tabel Anda

            // Jalankan perintah ALTER TABLE untuk mereset nilai kolom primary key
            String resetQuery = "ALTER TABLE " + tableName + " AUTO_INCREMENT = 1";
            Statement statement = connection.createStatement();
            statement.executeUpdate(resetQuery);

            System.out.println("Primary Key Direset.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
