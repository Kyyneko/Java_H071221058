import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/aplikasi_kasir";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("-".repeat(40));
            System.out.println(" WELCOME TO DATABASE CASHIER");
            System.out.println("-".repeat(40));
            System.out.println("1.] Read Data");
            System.out.println("2.] Insert data");
            System.out.println("3.] Edit Data");
            System.out.println("4.] Delete data");
            System.out.println("-".repeat(40));
            System.out.print("Pilih : ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    readData();
                    break;
                case 2:
                    insertData();
                    break;
                case 3:
                    editData();
                    break;
                case 4:
                    deleteData();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
            
            break;
            

        }            
        System.out.println("-".repeat(40));
        scanner.close();
        System.out.println("Terima kasih telah menggunakan program ini!");
        System.out.println("-".repeat(40));
    }

    private static void readData() {
        try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM riwayat");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id          = resultSet.getInt("ID");
                String nama     = resultSet.getString("NAMA");
                int harga       = resultSet.getInt("HARGA");
                int jumlah      = resultSet.getInt("JUMLAH");

                System.out.println("-".repeat(40));
                System.out.println();
                System.out.println("ID          : " + id);
                System.out.println("NAMA        : " + nama);
                System.out.println("HARGA       : " + harga);
                System.out.println("JUMAH       : " + jumlah);
                System.out.println();
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertData() {
        try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO riwayat (NAMA, HARGA, JUMLAH VALUES (?, ?, ?)");
            Scanner scanner = new Scanner(System.in);

            System.out.println("-".repeat(40));
            System.out.println();
            System.out.print("Masukkan Nama Barang  : ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Harga Barang : ");
            int harga = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline yang tersisa

            System.out.print("Masukkan Jumlah Baran : ");
            int jumlah = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline yang tersisa
            System.out.println();

            statement.setString(1, nama);
            statement.setInt(2, harga);
            statement.setInt(3, jumlah);

            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " data berhasil dimasukkan.");
            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void editData() {
        try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("UPDATE riwayat SET NAMA = ?, HARGA = ?, JUMLAH = ? WHERE ID = ?");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan ID data yang ingin diubah: ");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter newline yang tersisa

                System.out.println("-".repeat(40));
                System.out.println();
                System.out.print("Masukkan Nama Barang baru     : ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan Harga Barang baru    : ");
                int harga = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter newline yang tersisa

                System.out.print("Masukkan Jumlah Barang baru   : ");
                int jumlah = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter newline yang tersisa
                System.out.println();

                statement.setString(1, nama);
                statement.setInt(2, harga);
                statement.setInt(3, jumlah);
                statement.setInt(4, id);

                int rowsAffected = statement.executeUpdate();
                System.out.println(rowsAffected + " data berhasil diubah.");
                scanner.close();
            } else {
                System.out.println("Input ID tidak valid.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteData() {
        try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM riwayat WHERE ID = ?");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan ID data yang ingin dihapus: ");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter newline yang tersisa

                statement.setInt(1, id);

                System.out.println("-".repeat(40));
                System.out.println();
                int rowsAffected = statement.executeUpdate();
                System.out.println(rowsAffected + " data berhasil dihapus.");
                scanner.close();
                System.out.println();
            } else {
                System.out.println("-".repeat(40));
                System.out.println();
                System.out.println("Input ID tidak valid.");
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
