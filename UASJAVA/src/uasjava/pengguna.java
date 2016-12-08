/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasjava;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class pengguna extends javax.swing.JFrame {

  
    public pengguna() {
        initComponents();
        TableDataBarang ();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTipe = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDari = new javax.swing.JTextField();
        txtSampai = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jComboSort = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtpilih = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTipe.setBackground(java.awt.SystemColor.activeCaption);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jButton3.setText("Beli");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Chat Admin");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("RaurusShop.com");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Advance Search"));

        jButton5.setText("Cari");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Harga Terendah", "Harga Tertinggi", " " }));

        jButton4.setText("Cari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboSort, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDari, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSampai, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nama", "tipe", "harga", "jumlah"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        txtpilih.setText("pilih");
        txtpilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpilihActionPerformed(evt);
            }
        });

        txtTipe.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(txtpilih, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtTipe.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout txtTipeLayout = new javax.swing.GroupLayout(txtTipe);
        txtTipe.setLayout(txtTipeLayout);
        txtTipeLayout.setHorizontalGroup(
            txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTipeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtTipeLayout.createSequentialGroup()
                        .addGroup(txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtTipeLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtTipeLayout.createSequentialGroup()
                                .addGroup(txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtTipeLayout.createSequentialGroup()
                                        .addGap(204, 204, 204)
                                        .addComponent(jButton6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtTipeLayout.createSequentialGroup()
                                        .addComponent(txtpilih)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(txtTipeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(194, 194, 194))))
        );
        txtTipeLayout.setVerticalGroup(
            txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTipeLayout.createSequentialGroup()
                .addGroup(txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(txtTipeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGroup(txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtTipeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtTipeLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(txtTipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(txtpilih))))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtTipeLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTipe)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTipe)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        user.main(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //jTextField1.getText;
        cariBarang(jTextField1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    
            
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jComboSort.getSelectedItem().equals("Harga Terendah")){
            
            sorting();
        }
        if(jComboSort.getSelectedItem().equals("Harga Tertinggi")){
            sortingtinggi();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel databarang = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
       }; 
       
           
       databarang.addColumn("id");
       databarang.addColumn("merk");
       databarang.addColumn("tipe");
       databarang.addColumn("harga");
       databarang.addColumn("jumlah");
       
       
       
       jTable1.setModel(databarang);
       
        try {
            String query = "SELECT * FROM `barang` WHERE harga BETWEEN "+txtDari.getText()+" and "+txtSampai.getText();
            Statement stm = connect.connection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){      
                databarang.addRow(new Object[]{rs.getString("id"),
                rs.getString("merk"),
                rs.getString("tipe"),
                rs.getString("harga"),
                rs.getString("jumlah"),});
            }
        } catch (SQLException ex) {
            Logger.getLogger(pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed
public Server Server;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Server = new Server();
Server.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtpilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpilihActionPerformed
       /* TableModel model1 = jTable1.getModel();
        int[] indexs = jTable1.getSelectedRows();
        Object[] row = new Object[4];
        DefaulTableModel model2 = (DefaultTableModel) jTable2.getModel();
        for(int i = 0;i<indexs.length;i++){
            row[0] = model.getValueAt(indexs[i], 0);
            
        }*/
         int indexs = jTable1.getSelectedRow();
        TableDataBarang2(indexs);
        kurangstok(1, indexs);
    }//GEN-LAST:event_txtpilihActionPerformed

    private void sorting(){
        DefaultTableModel databarang = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
       }; 
       
           
       databarang.addColumn("id");
       databarang.addColumn("merk");
       databarang.addColumn("tipe");
       databarang.addColumn("harga");
       databarang.addColumn("jumlah");
       
       
       
       jTable1.setModel(databarang);
       
        try {
            String query = "SELECT * FROM `barang` order by harga";
            Statement stm = connect.connection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){      
                databarang.addRow(new Object[]{rs.getString("id"),
                rs.getString("merk"),
                rs.getString("tipe"),
                rs.getString("harga"),
                rs.getString("jumlah"),});
            }
        } catch (SQLException ex) {
            Logger.getLogger(pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void sortingtinggi(){
        DefaultTableModel databarang = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
       }; 
       
           
       databarang.addColumn("id");
       databarang.addColumn("merk");
       databarang.addColumn("tipe");
       databarang.addColumn("harga");
       databarang.addColumn("jumlah");
       
       
       
       jTable1.setModel(databarang);
       
        try {
            String query = "SELECT * FROM `barang` ORDER BY HARGA DESC";
            Statement stm = connect.connection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){      
                databarang.addRow(new Object[]{rs.getString("id"),
                rs.getString("merk"),
                rs.getString("tipe"),
                rs.getString("harga"),
                rs.getString("jumlah"),});
            }
        } catch (SQLException ex) {
            Logger.getLogger(pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void cariBarang(String a) {
        DefaultTableModel databarang = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
       }; 
       
           
       databarang.addColumn("id");
       databarang.addColumn("merk");
       databarang.addColumn("tipe");
       databarang.addColumn("harga");
       databarang.addColumn("jumlah");
       
       
       
       jTable1.setModel(databarang);
       
        try {
            String query = "SELECT * FROM barang WHERE merk LIKE '%" + a + "%'";
            Statement stm = connect.connection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){      
                databarang.addRow(new Object[]{rs.getString("id"),
                rs.getString("merk"),
                rs.getString("tipe"),
                rs.getString("harga"),
                rs.getString("jumlah"),});
            }
        } catch (SQLException ex) {
            Logger.getLogger(pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       private void kurangstok(Integer a, Integer id) {
           String aa = Integer.toString(a);
           String bb = Integer.toString(id);
        try {
            String query = "UPDATE `barang` SET jumlah=jumlah-" + aa + " WHERE id =" + bb;
            Statement stm = connect.connection.createStatement();
            stm.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    private void TableDataBarang (){
       DefaultTableModel databarang = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
       }; 
       
           
       databarang.addColumn("id");
       databarang.addColumn("merk");
       databarang.addColumn("tipe");
       databarang.addColumn("harga");
       databarang.addColumn("jumlah");
       
       
       jTable1.setModel(databarang);
       
       try {
           Statement statement  = connect.connection.createStatement();
           ResultSet result = statement.executeQuery ("SELECT * FROM barang");
           
           while (result.next ()) {
               databarang.addRow (new Object[] {result.getString ("id"), result.getString ("merk"), result.getString ("tipe"), result.getString ("harga"), result.getString ("jumlah")
               });
           }
       } catch (SQLException ex) {
            Logger.getLogger(pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
        private void TableDataBarang2 (Integer p){
       DefaultTableModel databarang = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
       }; 
       
           
       databarang.addColumn("id");
       databarang.addColumn("merk");
       databarang.addColumn("tipe");
       databarang.addColumn("harga");
       databarang.addColumn("jumlah");
       
       
       jTable2.setModel(databarang);
       String pilih = Integer.toString(p);
       try {
           Statement statement  = connect.connection.createStatement();
           ResultSet result = statement.executeQuery ("SELECT * FROM barang WHERE id="+pilih);
           
           while (result.next ()) {
               databarang.addRow (new Object[] {result.getString ("id"), result.getString ("merk"), result.getString ("tipe"), result.getString ("harga"), result.getString ("jumlah")
               });
           }
       } catch (SQLException ex) {
            Logger.getLogger(pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
   
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
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtDari;
    private javax.swing.JTextField txtSampai;
    private javax.swing.JDesktopPane txtTipe;
    private javax.swing.JButton txtpilih;
    // End of variables declaration//GEN-END:variables
}
