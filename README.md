## PENJELASAN CODE

Kode yang saya buat adalah implementasi sederhana dari sebuah manajer database menggunakan Java dan JDBC (Java Database Connectivity)

*BAGIAN 1 : Import Paket*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

<!-- Kode di atas mengimpor paket-paket yang diperlukan untuk mengakses database, mengambil input dari pengguna, dan menampilkan hasilnya. -->

*BAGIAN 2 : Konstanta Database*

private static final String DB_URL = "jdbc:mysql://localhost:3306 aplikasi_kasir";
private static final String USERNAME = "root";
private static final String PASSWORD = "";

<!-- Konstanta ini menyimpan URL database, nama pengguna, dan kata sandi untuk menghubungkan ke database MySQL yang diinginkan. -->

*BAGIAN 3 : Metode Utama (Main)*

public static void main(String[] args) {
    // ...
}

<!-- Main inilah yang akan dijalankan saat program dimulai. Ini adalah tempat program utama berjalan dan pengguna akan berinteraksi dengan menu database. -->

*BAGIAN 4 : Menu Database*

while (choice != 5) {
    // ...
}

<!-- Di dalam metode utama, terdapat perulangan while yang terus berjalan sampai pengguna memilih keluar (choice = 5). Ini akan menampilkan menu pilihan kepada pengguna dan mengambil input pilihan pengguna. -->

*BAGIAN 5 : Membaca Data (Read Data)*

private static void readData() {
    // ...
}

<!-- Metode readData() digunakan untuk membaca data dari database. Ini akan menjalankan query SELECT untuk mengambil data dari tabel riwayat dan menampilkannya ke layar. -->

*BAGIAN 6 : Memasukkan Data (Insert Data)*

private static void insertData() {
    // ...
}

<!-- Metode insertData() digunakan untuk memasukkan data baru ke dalam database. Ini akan meminta pengguna memasukkan informasi pengguna baru seperti username, PIN, dan email, dan kemudian akan menjalankan query INSERT untuk menyimpan data ke dalam tabel riwayat. -->

*BAGIAN 7 : Mengedit Data (Edit Data)*

private static void editData() {
    // ...
}

<!-- Metode editData() digunakan untuk mengedit data yang ada dalam database. Ini akan meminta pengguna memasukkan ID data yang ingin diubah, kemudian meminta informasi pengguna yang diperbarui seperti ID, NAMA, HARGA, Dan JUMLAH. Setelah itu, akan menjalankan query UPDATE untuk memperbarui data yang sesuai dalam tabel riwayat. -->

*BAGIAN 8 : Mengahapus Data (Delete Data)*

private static void deleteData() {
    // ...
}

<!-- Metode deleteData() digunakan untuk menghapus data dari database. Ini akan meminta pengguna memasukkan ID data yang ingin dihapus, kemudian menjalankan query DELETE untuk menghapus data yang sesuai dari tabel riwayat. -->

*BAGIAN 9 : Koneksi Ke Database*

try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
    // ...
} catch (SQLException e) {
    e.printStackTrace();
}

<!-- Di dalam setiap metode untuk membaca, memasukkan, mengedit, atau menghapus data, koneksi ke database dibuat menggunakan DriverManager.getConnection() dengan URL database, nama pengguna, dan kata sandi yang telah ditentukan sebelumnya. -->

*BAGIAN 10 : Statement SQL* 

PreparedStatement statement = connection.prepareStatement("SELECT * FROM riwayat");


<!-- Pernyataan SQL dipersiapkan menggunakan objek PreparedStatement. Di sini, contohnya adalah SELECT * FROM riwayat, tetapi pernyataan SQL lain juga bisa digunakan tergantung pada kebutuhan. -->

*BAGIAN 11 : Eksekusi Statement* 

ResultSet resultSet = statement.executeQuery();

<!-- Statement SQL yang telah dipersiapkan dieksekusi menggunakan metode executeQuery(). Hasilnya disimpan dalam objek ResultSet yang berisi data yang ditemukan dari database. -->

*BAGIAN 12 : Mengambil Data ResultSet*

while (resultSet.next()) {
    // ...
}

<!-- Hasil dari eksekusi query diiterasi menggunakan perulangan while dengan resultSet.next(). Ini akan berjalan melalui setiap baris hasil dan mengambil nilai dari setiap kolom menggunakan metode getInt() dan getString(). -->

*BAGIAN 13 : Menutup Koneksi dan Sumber Daya*

resultSet.close();

<!-- Setelah selesai menggunakan ResultSet, perlu menutupnya dengan memanggil metode close(). -->

*BAGIAN 14 : Penanganan Kesalahan*

catch (SQLException e) {
    e.printStackTrace();
}

<!-- Jika terjadi kesalahan saat menjalankan pernyataan SQL atau mengakses database, kesalahan tersebut ditangkap dan dicetak menggunakan e.printStackTrace(). -->


## MEKANISME KODE

1. Menghubungkan ke Database:
    Kode DriverManager.getConnection(DB_URL, USERNAME, PASSWORD) digunakan untuk membuat koneksi dengan database menggunakan URL, nama pengguna, dan kata sandi yang telah ditentukan sebelumnya. Ini memastikan bahwa program dapat terhubung ke database yang diinginkan.

2. Menampilkan Menu dan Meminta Pilihan:
    Setelah terhubung ke database, program akan menampilkan menu pilihan kepada pengguna menggunakan perulangan while. Pengguna diminta untuk memilih satu opsi dari menu dengan memasukkan angka terkait.

3. Menjalankan Operasi Sesuai Pilihan:
    Program menggunakan pernyataan switch-case untuk menjalankan operasi yang sesuai berdasarkan pilihan pengguna. Terdapat empat opsi yang dapat dipilih: membaca data, memasukkan data baru, mengedit data yang ada, atau menghapus data.

4. Membaca Data:
    Jika pengguna memilih opsi "Read Data", program akan menjalankan metode readData(). Metode ini akan membuat pernyataan SQL SELECT untuk mengambil data dari tabel riwayat. Hasilnya disimpan dalam objek ResultSet dan kemudian ditampilkan ke layar.

5. Memasukkan Data:
    Jika pengguna memilih opsi "Insert Data", program akan menjalankan metode insertData(). Metode ini meminta pengguna untuk memasukkan informasi pengguna baru seperti username, PIN, dan email. Kemudian, pernyataan SQL INSERT akan dieksekusi dengan menggunakan nilai-nilai yang dimasukkan pengguna.

6. Mengedit Data:
    Jika pengguna memilih opsi "Edit Data", program akan menjalankan metode editData(). Metode ini meminta pengguna untuk memasukkan ID data yang ingin diubah, kemudian meminta informasi pengguna yang diperbarui seperti username, PIN, dan email. Pernyataan SQL UPDATE akan dieksekusi dengan menggunakan nilai-nilai yang dimasukkan pengguna.

7. Menghapus Data:
    Jika pengguna memilih opsi "Delete Data", program akan menjalankan metode deleteData(). Metode ini meminta pengguna untuk memasukkan ID data yang ingin dihapus. Pernyataan SQL DELETE akan dieksekusi dengan menggunakan ID yang dimasukkan pengguna.

8. Menutup Koneksi dan Sumber Daya:
    Setelah operasi selesai, program akan menutup sumber daya yang digunakan, termasuk koneksi ke database dan objek scanner yang digunakan untuk menerima input dari pengguna.

9. Penanganan Kesalahan:
    Jika terjadi kesalahan saat menjalankan pernyataan SQL atau mengakses database, pengecualian SQLException akan ditangkap dan dicetak melalui e.printStackTrace(). Ini membantu dalam memperbaiki masalah yang mungkin terjadi selama eksekusi program.

Dengan mekanisme ini, program memungkinkan pengguna untuk berinteraksi dengan database, melakukan operasi seperti membaca, memasukkan, mengedit, atau menghapus data, dan memberikan umpan balik melalui tampilan konsol.

## PENJELASAN FILE

1. DatabaseManager.java
    Dalam file ini menyimpan seluruh program yang akan dijalankan, mulai dari method, main class, dan juga semua yang dibutuhkan untuk menjalankan code, namun ada lagi 1 file yang dibutuhkan agar lebih mudah untuk mengakses seluruh menu

2. ResetID.java
    file ini adalah program Java yang digunakan untuk mereset nilai kolom primary key pada tabel database, fungsinya adalah untuk mengatur ulang urutan nilai primary key pada tabel database. Ketika data dihapus atau kolom primary key diperbarui, urutan nilai primary key tidak otomatis diubah. Hal ini dapat mengakibatkan ketidakkonsistenan dalam urutan nilai primary key.

    Dengan menggunakan perintah ALTER TABLE dan mengatur nilai AUTO_INCREMENT ke 1, kita dapat mereset nilai kolom primary key agar dimulai dari 1 dan diurutkan secara berurutan. Ini membantu menjaga konsistensi dan memastikan bahwa nilai primary key pada tabel dimulai dari angka yang sesuai.

    Misalnya, jika kita memiliki tabel dengan kolom primary key yang diatur sebagai AUTO_INCREMENT, dan kita menghapus beberapa baris data dari tabel tersebut, maka nilai primary key yang tersisa mungkin tidak berurutan. Dengan mereset nilai kolom primary key, kita dapat mengatur ulang urutan nilai primary key sehingga berurutan lagi dan dimulai dari 1.