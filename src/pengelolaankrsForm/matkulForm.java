/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pengelolaankrsForm;

import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import koneksidb.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author User
 */
public class matkulForm extends javax.swing.JFrame {
    
        private koneksi obj;
        private DefaultTableModel tableModel;
    
    /**
     * Creates new form matkulForm
     */
    public matkulForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        obj = new koneksi();
        tableModel = new DefaultTableModel();
        tableMK.setModel(tableModel);
        tableModel.addColumn("Id");
        tableModel.addColumn("Mata Kuliah");
        tableModel.addColumn("Semester");
        tableModel.addColumn("Dosen");
        
        tampilDataMatkul();
    }
        
        public void tampilDataMatkul() {
         try {
            tableModel.setRowCount(0);

            String query = "SELECT * FROM mata_kuliah ";
            try (PreparedStatement preparedStatement = (PreparedStatement) obj.konek.prepareStatement(query);
                 ResultSet data = preparedStatement.executeQuery()) {
                while (data.next()) {
                    Object[] line = new Object[4];
                    line[0] = data.getString("id");
                    line[1] = data.getString("mata_kuliah");
                    line[2] = data.getString("semester");
                    line[3] = data.getString("dosen");
                    tableModel.addRow(line);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        matkulTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dosenTF = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMK = new javax.swing.JTable();
        btnCetak = new javax.swing.JButton();
        semCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MATA KULIAH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setText("ID MATA KULIAH");

        jLabel3.setText("MATA KULIAH");

        jLabel5.setText("SEMESTER");

        jLabel6.setText("DOSEN");

        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setText("CLEAR");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 153));

        tableMK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMK);

        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(btnCetak)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCetak)
                .addContainerGap())
        );

        semCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4", "5", "6", "7", "8" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(56, 56, 56)
                                .addComponent(matkulTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(63, 63, 63)
                                .addComponent(dosenTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(47, 47, 47)
                                .addComponent(semCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnTambah)
                                .addGap(32, 32, 32)
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(matkulTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUbah)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnRefresh)
                    .addComponent(btnKeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        try {
            if (idTF.getText().isEmpty() || matkulTF.getText().isEmpty() ||
                    semCB.getSelectedItem() == null || dosenTF.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Silahkan isi semua data terlebih dahulu!");
            } else {
                // Cek apakah data dengan NPM yang sama sudah ada
                String sqlCheck = "SELECT * FROM mata_kuliah WHERE id=?";
                PreparedStatement checkStmt = (PreparedStatement) obj.konek.prepareStatement(sqlCheck);
                checkStmt.setString(1, idTF.getText());
                ResultSet resultSet = checkStmt.executeQuery();

                if (resultSet.next()) {
                    // Data sudah ada, tampilkan pesan kesalahan
                    JOptionPane.showMessageDialog(this, "Data dengan id tersebut sudah ada. Gunakan tombol Edit untuk mengubah data.");
                } else {
                    // Data belum ada, jalankan perintah INSERT
                    String sqlInsert = "INSERT INTO mata_kuliah (id, mata_kuliah, semester, dosen) " +
                                       "VALUES (?, ?, ?, ?)";
                    PreparedStatement insertStmt = (PreparedStatement) obj.konek.prepareStatement(sqlInsert);

                    insertStmt.setString(1, idTF.getText());
                    insertStmt.setString(2, matkulTF.getText());
                    insertStmt.setString(3, (String) semCB.getSelectedItem());
                    insertStmt.setString(4, (String) dosenTF.getText());

                    // Eksekusi query INSERT
                    int hasilInsert = insertStmt.executeUpdate();

                    if (hasilInsert > 0) {
                        tampilDataMatkul();
                        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal menambahkan data. Pastikan NPM yang dimasukkan belum ada.");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
try {
    if (idTF.getText().isEmpty() || matkulTF.getText().isEmpty() ||
        semCB.getSelectedItem() == null || dosenTF.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Silahkan isi semua data terlebih dahulu!");
    } else {
        // Cek apakah data dengan id yang sama sudah ada
        String sqlCheck = "SELECT * FROM mata_kuliah WHERE id=?";
        PreparedStatement checkStmt = (PreparedStatement) obj.konek.prepareStatement(sqlCheck);
        checkStmt.setString(1, idTF.getText());
        ResultSet resultSet = checkStmt.executeQuery();

        if (resultSet.next()) {
            // Data sudah ada, jalankan perintah UPDATE
            String sqlUpdate = "UPDATE mata_kuliah SET mata_kuliah=?, semester=?, " +
                               "dosen=? WHERE id=?";
            PreparedStatement updateStmt = (PreparedStatement) obj.konek.prepareStatement(sqlUpdate);

            updateStmt.setString(1, matkulTF.getText());
            updateStmt.setString(2, (String) semCB.getSelectedItem());
            updateStmt.setString(3, dosenTF.getText());
            updateStmt.setString(4, idTF.getText());

            // Eksekusi query UPDATE
            int hasilUpdate = updateStmt.executeUpdate();

            if (hasilUpdate > 0) {
                tampilDataMatkul();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengubah data. Pastikan id yang dimasukkan benar.");
            }
        } else {
            // Data belum ada, tampilkan pesan kesalahan
            JOptionPane.showMessageDialog(this, "Data dengan ID tersebut tidak ditemukan. Gunakan tombol Tambah untuk menambahkan data baru.");
        }
    }
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
                        try {
          // Mengecek apakah semua kolom input kosong
         if (idTF.getText().isEmpty() && matkulTF.getText().isEmpty()
              && semCB.getSelectedIndex() == 0 && dosenTF.getText().isEmpty()) {
              JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu!");
          } else {
              // Menampilkan dialog konfirmasi sebelum menghapus
              int confirmDialogResult = JOptionPane.showConfirmDialog(this,
                      "Apakah Anda yakin ingin menghapus data?", "Konfirmasi Hapus",
                      JOptionPane.YES_NO_OPTION);

              // Jika pengguna mengonfirmasi untuk menghapus
              if (confirmDialogResult == JOptionPane.YES_OPTION) {
                  // Query SQL untuk menghapus data dari tabel gaji
                  String sql = "DELETE FROM mata_kuliah WHERE id=?";

                  // Menggunakan try-with-resources untuk PreparedStatement
                  try (java.sql.PreparedStatement hapus = obj.konek.prepareStatement(sql)) {
                      hapus.setString(1, idTF.getText());

                      // Menjalankan query DELETE dan mendapatkan jumlah baris yang terpengaruh
                      int rowsAffected = hapus.executeUpdate();

                      // Jika ada baris yang terpengaruh, berarti data berhasil dihapus
                      if (rowsAffected > 0) {
                          tampilDataMatkul();
                          JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!");
                      } else {
                          // Jika tidak ada baris yang terpengaruh, berarti data tidak ditemukan
                          JOptionPane.showMessageDialog(this, "Gagal menghapus data. Data tidak ditemukan.");
                      }
                  }
              }
          }
      } catch (SQLException | HeadlessException e) {
          // Menangani kesalahan dan menampilkan pesan kesalahan kepada pengguna
          JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        idTF.setText("");
        matkulTF.setText("");
        semCB.setSelectedIndex(0);
        dosenTF.setText("");
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void tableMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMKMouseClicked
        // TODO add your handling code here:
                int baris = tableMK.getSelectedRow();
        if (baris != -1) {
            String id = tableMK.getValueAt(baris, 0).toString();
            String mata_kuliah = tableMK.getValueAt(baris, 1).toString();
            String semester = tableMK.getValueAt(baris, 2).toString();
            String dosen = tableMK.getValueAt(baris, 3).toString();

            idTF.setText(id);
            matkulTF.setText(mata_kuliah);
            semCB.setSelectedItem(semester);
            dosenTF.setText(dosen);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris terlebih dahulu.");
        }
        
    }//GEN-LAST:event_tableMKMouseClicked

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
                String path = ".\\src\\report\\reportDataMatkul.jasper";
        try {
        // Mengatur koneksi database (gantilah parameter koneksi dengan yang sesuai)
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aplikasi_krs", "root", "");

        // Mengisi laporan dengan data dari database
        JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);

        // Menampilkan laporan menggunakan JasperViewer
        JasperViewer jviewer = new JasperViewer(jprint, false);
        jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jviewer.setVisible(true);

        // Menutup koneksi database setelah selesai
        conn.close();
     } catch (JRException | SQLException e) {
        // Menangkap dan menampilkan exception
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_btnCetakActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(matkulForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matkulForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matkulForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matkulForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matkulForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField dosenTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matkulTF;
    private javax.swing.JComboBox<String> semCB;
    private javax.swing.JTable tableMK;
    // End of variables declaration//GEN-END:variables
}
