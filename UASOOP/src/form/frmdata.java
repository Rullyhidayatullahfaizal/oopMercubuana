/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

/**
 *
 * @author rullyhidayatullahfaizal
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmdata extends javax.swing.JFrame {

    
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksidatabases.BukaKoneksi();
    public frmdata() {
        initComponents();
        TampilData();
         try {
            // Misalnya, membuat objek Statement menggunakan koneksi 'cn'
            st = cn.createStatement();
            
            // Sekarang 'cn' telah digunakan dan tidak akan ada pesan error
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void Bersih(){
        txtnik.setText("");
        txtnama.setText("");
        txtalamat.setText("");
        txtkota.setText("");
        txtjeniskelamin.setText("");
        txttempatlahir.setText("");
        txttanggallahir.setText("");
        txtjurusan.setText("");
        txtipk.setText("");
        
        btnsimpan.setText("simpan");
        txtnik.setEditable(true);
    }
    
    private void CariData(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM mahasiswa WHERE " 
            + cmbcari.getSelectedItem().toString() +
                    " LIKE '%" + txtcari.getText() + "%'");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No.");
            model.addColumn("nik");
            model.addColumn("nama");
            model.addColumn("jenis kelamin");
            model.addColumn("jurusan");
            
            int no = 1;
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()){
                Object[] data = {
                    no ++,
                    rs.getString("nik"),
                    rs.getString("nama"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("jurusan")
                };
                model.addRow(data);
                tbldata.setModel(model);
            }
        } catch (Exception e) {
        }
    }
    
    private void TampilData(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM mahasiswa");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No.");
            model.addColumn("nik");
            model.addColumn("nama");
            model.addColumn("jenis kelamin");
            model.addColumn("jurusan");
            
            int no = 1;
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()){
                Object[] data = {
                    no ++,
                    rs.getString("nik"),
                    rs.getString("nama"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("jurusan")
                };
                model.addRow(data);
                tbldata.setModel(model);
            }
        } catch (Exception e) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtkota = new javax.swing.JTextField();
        txtjeniskelamin = new javax.swing.JTextField();
        txttempatlahir = new javax.swing.JTextField();
        txttanggallahir = new javax.swing.JTextField();
        txtjurusan = new javax.swing.JTextField();
        txtipk = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        cmbcari = new javax.swing.JComboBox<>();
        txtcari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("nik");

        jLabel2.setText("nama");

        jLabel3.setText("alamat");

        jLabel4.setText("kota");

        jLabel5.setText("jenis kelamin");

        jLabel6.setText("tempat lahir");

        jLabel7.setText("tanggal lahir");

        jLabel8.setText("jurusan");

        jLabel9.setText("ipk akhir");

        txtnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnikActionPerformed(evt);
            }
        });

        btnsimpan.setText("simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnhapus.setText("hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbatal.setText("batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "nik", "nama", "jenis kelamin", "jurusan"
            }
        ));
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbldata);

        jLabel10.setText("cari data");

        cmbcari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nik", "nama" }));

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)
                        .addComponent(cmbcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnhapus)
                                .addGap(29, 29, 29)
                                .addComponent(btnbatal))
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkota, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtipk, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtkota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txttanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnhapus)
                    .addComponent(btnbatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnikActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        if(txtnik.getText().equals("")){
            JOptionPane.showMessageDialog(this,"silahkan pilih data yang akan dihapus!");
        }else{
            int jawab = JOptionPane.showConfirmDialog(null,"Data ini akan dihapus, lanjutkan ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(jawab == 0){
                try {
                    st = cn.createStatement();
                    String sql = "DELETE FROM mahasiswa WHERE nik = '" + txtnik.getText() + "'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Data berhasil dihapus");
                    TampilData();
                    Bersih();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try {
            st = cn.createStatement();
            if (txtnik.getText().equals("")||
                    txtnama.getText().equals("")||
                    txtalamat.getText().equals("")||
                    txtkota.getText().equals("")||
                    txtjeniskelamin.getText().equals("")||
                    txttempatlahir.getText().equals("")||
                    txttanggallahir.getText().equals("")||
                    txtjurusan.getText().equals("")||
                    txtipk.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"data tidak boleh kosong","Validasi Data",JOptionPane.INFORMATION_MESSAGE);
                return;   
            }
            //aksi simpan data
            if (btnsimpan.getText() == "simpan") {
                String cek = "select * from mahasiswa WHERE nik = '" + txtnik.getText() + "'";
                rs = st.executeQuery(cek);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "UPS..NIK SUDAH ADA");
                }else{
                    String sql = "INSERT INTO mahasiswa VALUES('" + txtnik.getText() + 
                            "','" + txtnama.getText() +
                            "','" + txtalamat.getText() +
                            "','" + txtkota.getText() +
                            "','" + txtjeniskelamin.getText() +
                            "','" + txttempatlahir.getText() +
                            "','" + txttanggallahir.getText() +
                            "','" + txtjurusan.getText() + 
                            "','" + txtipk.getText() + "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                    Bersih();
                    TampilData();
                }
                
            }else{
                //aksi ubah data
               String update = "UPDATE  mahasiswa SET nama = '" + txtnama.getText() + 
                       "', alamat = '" + txtalamat.getText() +
                       "', kota = '" + txtkota.getText() +
                       "', jenis_kelamin = '" + txtjeniskelamin.getText() +
                       "', tempat_lahir = '" + txttempatlahir.getText() +
                       "', tanggal_lahir = '" + txttanggallahir.getText() +
                       "', jurusan = '" + txtjurusan.getText() +
                       "', ipk_akhir = '" + txtipk.getText() +
                       "' WHERE nik = '" + txtnik.getText() + "'";
                       st.executeUpdate(update);
                       JOptionPane.showMessageDialog(null,"data berhasil diubah");
                       Bersih();
                       TampilData();
                           
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        // TODO add your handling code here:
        int selectedRow = tbldata.getSelectedRow();

    if (selectedRow != -1) {
        // Menampilkan data dari tabel
        txtnik.setText(tbldata.getValueAt(selectedRow, 1).toString());
        txtnama.setText(tbldata.getValueAt(selectedRow, 2).toString());
        txtjeniskelamin.setText(tbldata.getValueAt(selectedRow, 3).toString());
        txtjurusan.setText(tbldata.getValueAt(selectedRow, 4).toString());

        // Mengambil data dari database untuk kolom yang tidak ada di tabel
        try {
            String nik = tbldata.getValueAt(selectedRow, 0).toString();
            String query = "SELECT alamat,kota, tempat_lahir, tanggal_lahir, ipk_akhir FROM mahasiswa WHERE nik = '" + nik + "'";
            Statement statement = cn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                txtalamat.setText(resultSet.getString("alamat"));
                txtkota.setText(resultSet.getString("kota"));
                txttempatlahir.setText(resultSet.getString("tempat_lahir"));
                txttanggallahir.setText(resultSet.getString("tanggal_lahir"));
                txtipk.setText(resultSet.getString("ipk_akhir"));
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        txtnik.setEditable(false);
        btnsimpan.setText("ubah");
    }


    }//GEN-LAST:event_tbldataMouseClicked

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
        Bersih();
        
    }//GEN-LAST:event_btnbatalActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:
        CariData();
    }//GEN-LAST:event_txtcariKeyPressed

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
            java.util.logging.Logger.getLogger(frmdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmbcari;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtipk;
    private javax.swing.JTextField txtjeniskelamin;
    private javax.swing.JTextField txtjurusan;
    private javax.swing.JTextField txtkota;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txttanggallahir;
    private javax.swing.JTextField txttempatlahir;
    // End of variables declaration//GEN-END:variables
}
