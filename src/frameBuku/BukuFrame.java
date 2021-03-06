/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameBuku;

import buku.BukuManager;
import model.BukuModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BukuFrame extends javax.swing.JFrame {

    /**
     * Creates new form KaryawanManagerUI
     */
    // inisialisasi table model
    DefaultTableModel tableModel;
    BukuManager bukuManager;
    boolean sedangDiEdit = false;
    public BukuFrame() {
        initComponents();
        bukuManager = new BukuManager();
        tampilDataTable();
    }
    
    private void tampilDataTable(){
        String[] kolom = {"ID","Nama Buku","Penerbit","Penyusun","Tahun Terbit"};
        tableModel = new DefaultTableModel(null, kolom);
        for(BukuModel model : bukuManager.tampilSemua()){
            String[] row = new String[kolom.length];
            row[0] = String.valueOf(model.getId());
            row[1] = model.getNama_buku();
            row[2] = model.getPenerbit();
            row[3] = model.getPenyusun();
            row[4] = model.getTahun_terbit();
            tableModel.addRow(row);
        }
        tbl_main.setModel(tableModel);
        tbl_main.clearSelection();
    }
    
    private void refresh(){
        tampilDataTable();
        clearData();
        sedangDiEdit = false;
    }
    
    private void clearData(){
        tf_namaBuku.setText("");
        tf_penerbit.setText("");
        tf_penyusun.setText("");
        tf_tahunTerbit.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_namaBuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_penerbit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_penyusun = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_tahunTerbit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_main = new javax.swing.JTable();
        bt_simpan = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_refresh = new javax.swing.JButton();
        bt_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DATA BUKU");

        jLabel2.setText("Nama Buku");

        jLabel3.setText("Penerbit");

        jLabel4.setText("Penyusun");

        jLabel5.setText("Tahun Terbit");

        tbl_main.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_main);

        bt_simpan.setText("Simpan");
        bt_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_simpanMouseClicked(evt);
            }
        });
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_delete.setText("Delete");
        bt_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deleteMouseClicked(evt);
            }
        });

        bt_refresh.setText("Refresh");
        bt_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_refreshMouseClicked(evt);
            }
        });

        bt_edit.setText("Edit");
        bt_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editMouseClicked(evt);
            }
        });
        bt_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(tf_penerbit)
                                .addComponent(jLabel4)
                                .addComponent(tf_penyusun)
                                .addComponent(jLabel5)
                                .addComponent(tf_tahunTerbit)
                                .addComponent(tf_namaBuku)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bt_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                            .addComponent(bt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_edit)
                        .addGap(106, 106, 106)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_namaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_penyusun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_tahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_simpan)
                            .addComponent(bt_delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_edit)
                        .addGap(4, 4, 4)
                        .addComponent(bt_refresh)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_simpanMouseClicked
        // TODO add your handling code here:
        String namabuku = tf_namaBuku.getText();
        String penerbit = tf_penerbit.getText();
        String penyusun = tf_penyusun.getText();
        String tahunterbit = tf_tahunTerbit.getText();
        
        if(!namabuku.isEmpty() && !penerbit.isEmpty() && !penyusun.isEmpty() && !tahunterbit.isEmpty()){
                bukuManager.insert(namabuku, penerbit, penyusun, tahunterbit);
                refresh();
        }else {
            JOptionPane.showMessageDialog(null,"Tidak boleh ada yang kosong !");
        }
    }//GEN-LAST:event_bt_simpanMouseClicked

    private void bt_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deleteMouseClicked

        // TODO add your handling code here:
        if(sedangDiEdit){
            String id = (String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0);
            bukuManager.delete(id);
            refresh();
        }
    }//GEN-LAST:event_bt_deleteMouseClicked

    private void bt_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_refreshMouseClicked
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_bt_refreshMouseClicked

    private void tbl_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mainMouseClicked
        // TODO add your handling code here:
        sedangDiEdit = true;
        String id = (String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0);
        BukuModel model = bukuManager.byId(Integer.valueOf(id));
        tf_namaBuku.setText(model.getNama_buku());
        tf_penerbit.setText(model.getPenerbit());
        tf_penyusun.setText(model.getPenyusun());
        tf_tahunTerbit.setText(model.getTahun_terbit());
    }//GEN-LAST:event_tbl_mainMouseClicked

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_simpanActionPerformed

    private void bt_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_editActionPerformed

    private void bt_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editMouseClicked
        String namabuku = tf_namaBuku.getText();
        String penerbit = tf_penerbit.getText();
        String penyusun = tf_penyusun.getText();
        String tahunterbit = tf_tahunTerbit.getText();
        
        if(!namabuku.isEmpty() && !penerbit.isEmpty() && !penyusun.isEmpty() && !tahunterbit.isEmpty()){
                String id = (String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0);
                bukuManager.update(namabuku, penerbit, penyusun, tahunterbit, Integer.valueOf(id));
            refresh();
        }else {
            JOptionPane.showMessageDialog(null,"Tidak boleh ada yang kosong !");
        }
    }//GEN-LAST:event_bt_editMouseClicked

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
            java.util.logging.Logger.getLogger(BukuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_edit;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_main;
    private javax.swing.JTextField tf_namaBuku;
    private javax.swing.JTextField tf_penerbit;
    private javax.swing.JTextField tf_penyusun;
    private javax.swing.JTextField tf_tahunTerbit;
    // End of variables declaration//GEN-END:variables
}
