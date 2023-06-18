package app;

import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.table.*;
import static com.config.Config.*;
import java.sql.*;

/**
 *
 * @author Mahen
 */
public class MainFrame extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acumulateButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField hargaTxt;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahTxt;
    private javax.swing.JTextField kembalianTxt;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField namaBarangTxt;
    private javax.swing.JButton payButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JPanel transaksiPanel;
    private javax.swing.JTextField tunaiTxt;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;

    public MainFrame() {
        initComponents();
        model = (DefaultTableModel) tabelBarang.getModel();
    }
    
    private void clearInputFields() {
        namaBarangTxt.setText("");
        hargaTxt.setText("");
        jumlahTxt.setText("");
    }
    
    private int calculateTotalHarga() {
    int totalHarga = 0;
    int rowCount = tabelBarang.getRowCount();

    for (int i = 0; i < rowCount; i++) {
        Integer hargaObj = (Integer) tabelBarang.getValueAt(i, 2); // Kolom harga berada pada indeks 2
        Integer jumlahObj = (Integer) tabelBarang.getValueAt(i, 3); // Kolom jumlah berada pada indeks 3
        if (hargaObj != null && jumlahObj != null) {
            int harga = hargaObj;
            int jumlah = jumlahObj;
            totalHarga += harga * jumlah;
        }
    }

    return totalHarga;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        namaBarangTxt = new javax.swing.JTextField();
        hargaTxt = new javax.swing.JTextField();
        jumlahTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        transaksiPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        acumulateButton = new javax.swing.JButton();
        totalTxt = new javax.swing.JTextField();
        tunaiTxt = new javax.swing.JTextField();
        kembalianTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(247, 230, 196));

        titlePanel.setBackground(new java.awt.Color(96, 108, 93));
        titlePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 195, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CASHIER PROJECT 58");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.setBackground(new java.awt.Color(96, 108, 93));
        inputPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 195, 118));
        jLabel2.setText("NAMA BARANG");

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 195, 118));
        jLabel3.setText("HARGA");

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 195, 118));
        jLabel4.setText("JUMLAH");

        addButton.setBackground(new java.awt.Color(0, 204, 51));
        addButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addButton.setText("ADD");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(247, 230, 196));
        editButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        editButton.setText("EDIT");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        namaBarangTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        hargaTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jumlahTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rp. ");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlahTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(hargaTxt)
                            .addComponent(namaBarangTxt)))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaBarangTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        transaksiPanel.setBackground(new java.awt.Color(96, 108, 93));
        transaksiPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 195, 118));
        jLabel5.setText("TOTAL");

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 195, 118));
        jLabel6.setText("TUNAI");

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(241, 195, 118));
        jLabel7.setText("KEMBALIAN");

        saveButton.setBackground(new java.awt.Color(247, 230, 196));
        saveButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        payButton.setBackground(new java.awt.Color(0, 204, 51));
        payButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        payButton.setText("PAY");
        payButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        acumulateButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        acumulateButton.setText("ACUMULATE");
        acumulateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acumulateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acumulateButtonActionPerformed(evt);
            }
        });

        totalTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tunaiTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tunaiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunaiTxtActionPerformed(evt);
            }
        });

        kembalianTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rp. ");

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rp. ");

        jLabel11.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rp. ");

        javax.swing.GroupLayout transaksiPanelLayout = new javax.swing.GroupLayout(transaksiPanel);
        transaksiPanel.setLayout(transaksiPanelLayout);
        transaksiPanelLayout.setHorizontalGroup(
            transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel5)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transaksiPanelLayout.createSequentialGroup()
                        .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTxt)
                            .addComponent(tunaiTxt)
                            .addComponent(kembalianTxt)))
                    .addGroup(transaksiPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acumulateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        transaksiPanelLayout.setVerticalGroup(
            transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tunaiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalianTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(31, 31, 31)
                .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(payButton)
                    .addComponent(acumulateButton))
                .addGap(32, 32, 32))
        );

        tabelBarang.setBackground(new java.awt.Color(96, 108, 93));
        tabelBarang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.lightGray));
        tabelBarang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tabelBarang.setForeground(new java.awt.Color(255, 255, 255));
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAMA", "HARGA", "JUMLAH"
            }
        ));
        tabelBarang.setToolTipText("");
        tabelBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabelBarang);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transaksiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(transaksiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /* ================================================== ADD BUTTON =============================================== */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (namaBarangTxt.getText().trim().isEmpty() || hargaTxt.getText().trim().isEmpty() ||
            jumlahTxt.getText().trim().isEmpty()) {
        JOptionPane.showConfirmDialog(null, "Please Input All Components",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String namaBarang = namaBarangTxt.getText();
            String hargaStr   = hargaTxt.getText();
            String jumlahStr  = jumlahTxt.getText();

            try {
                int harga  = Integer.parseInt(hargaStr);
                int jumlah = Integer.parseInt(jumlahStr);

                int idCounter = 1;
                // Tambahkan data baru ke dalam tabel
                model.insertRow(0, new Object[]{idCounter, namaBarang, harga, jumlah});
                idCounter++;
                clearInputFields();
            } catch (NumberFormatException e) {
                hargaTxt.setText("");
                jumlahTxt.setText("");
                JOptionPane.showConfirmDialog(null, "Harga and Jumlah must be numeric",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
    }
    }//GEN-LAST:event_addButtonActionPerformed

    // Clear Button
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        clearInputFields();
    }                                           

    private void tunaiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
    }//GEN-LAST:event_clearButtonActionPerformed

    // Edit Button
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int selectedRow = tabelBarang.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this,"Pilih barang yang akan diedit",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String namaBarang = namaBarangTxt.getText();
        String hargaStr   = hargaTxt.getText();
        String jumlahStr  = jumlahTxt.getText();

        if (namaBarang.isEmpty() || hargaStr.isEmpty() || jumlahStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi semua kolom inputan",
                    "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int harga  = Integer.parseInt(hargaStr);
            int jumlah = Integer.parseInt(jumlahStr);

            tabelBarang.setValueAt(namaBarang,selectedRow, 1);
            tabelBarang.setValueAt(harga, selectedRow, 2);
            tabelBarang.setValueAt(jumlah, selectedRow, 3);

            clearInputFields();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input for harga or jumlah",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    // Delete Button
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = tabelBarang.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Select a row to delete",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Row deleted successfully");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    // Acumulate Button
    private void acumulateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acumulateButtonActionPerformed
        if (tabelBarang.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Tabel Kosong",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
        }
        int totalHarga = calculateTotalHarga();
        totalTxt.setText(String.valueOf(totalHarga));
        JOptionPane.showMessageDialog(null, "Total Harga: " + totalHarga,
                "Result", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_acumulateButtonActionPerformed

    // Pay Button
    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
    if (tabelBarang.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Tabel Kosong",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String tunaiStr = tunaiTxt.getText().trim();
    if (tunaiStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter the amount of cash",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
        }

        try {
            int tunai = Integer.parseInt(tunaiStr);
            int totalHarga = calculateTotalHarga();
            int kembalian = tunai - totalHarga;

            if (kembalian >= 0) {
                kembalianTxt.setText(decimalFormat.format(kembalian)); // Menetapkan nilai kembalian ke kembalianTxt
                totalTxt.setText(decimalFormat.format(totalHarga));
                JOptionPane.showMessageDialog(null, "Total Harga: " + decimalFormat.format(totalHarga) + "\nKembalian: " + decimalFormat.format(kembalian),
                        "Result", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Payment Successful",
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed Payment. Insufficient cash.",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for cash amount",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_payButtonActionPerformed

    // Save Button
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (tabelBarang.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "No data to save",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
        }

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            String query = "INSERT INTO riwayat (NAMA, HARGA, JUMLAH) VALUES (?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);
            // Menyimpan setiap baris data ke database
            for (int i = 0; i < tabelBarang.getRowCount(); i++) {
                Object namaBarangObj = tabelBarang.getValueAt(i, 1);
                Object hargaObj = tabelBarang.getValueAt(i, 2);
                Object jumlahObj = tabelBarang.getValueAt(i, 3);

                // Periksa apakah nilai tidak null sebelum melakukan konversi
                if (namaBarangObj != null && hargaObj != null && jumlahObj != null) {
                    String namaBarang = namaBarangObj.toString();
                    int harga = Integer.parseInt(hargaObj.toString());
                    int jumlah = Integer.parseInt(jumlahObj.toString());

                    statement.setString(1, namaBarang);
                    statement.setInt(2, harga);
                    statement.setInt(3, jumlah);

                    // Menjalankan query untuk menyimpan data ke database
                    statement.executeUpdate();
                }
            }

            // Mengosongkan tabelBarang
            DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
            model.setRowCount(0);
            model.setRowCount(100);
            totalTxt.setText("");
            tunaiTxt.setText("");
            kembalianTxt.setText("");

            JOptionPane.showMessageDialog(null, "Data saved successfully",
                    "Success", JOptionPane.INFORMATION_MESSAGE);

            // Menutup koneksi dan statement
            statement.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error occurred while saving data to database",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for price or quantity",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
