/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.modul3;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Leyli Agustin
 */
public class coba1 extends javax.swing.JFrame {

    /**
     * Creates new form coba1
     */
    public coba1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bl1 = new javax.swing.JRadioButton();
        bl2 = new javax.swing.JRadioButton();
        bl3 = new javax.swing.JRadioButton();
        bl4 = new javax.swing.JRadioButton();
        bl5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bl6 = new javax.swing.JRadioButton();
        bl7 = new javax.swing.JRadioButton();
        bl8 = new javax.swing.JRadioButton();
        bl9 = new javax.swing.JRadioButton();
        bl10 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dobat = new javax.swing.JComboBox<>();
        beli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APOTIK MINI");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.rowHeights = new int[] {0};
        jPanel2.setLayout(jPanel2Layout);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 5, -90, -70));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\1b.png")); // NOI18N
        jLabel2.setIconTextGap(0);
        jPanel3.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\2b.jpg")); // NOI18N
        jPanel3.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\3b.jpg")); // NOI18N
        jPanel3.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\4b.jpg")); // NOI18N
        jPanel3.add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\5b.jpg")); // NOI18N
        jPanel3.add(jLabel6);

        buttonGroup1.add(bl1);
        bl1.setText("ONOIWA");
        jPanel3.add(bl1);

        buttonGroup1.add(bl2);
        bl2.setText("PARACETAMOL");
        jPanel3.add(bl2);

        buttonGroup1.add(bl3);
        bl3.setText("AMBROXOL");
        jPanel3.add(bl3);

        buttonGroup1.add(bl4);
        bl4.setText("ANTASIDA DOEN");
        jPanel3.add(bl4);

        buttonGroup1.add(bl5);
        bl5.setText("ASAM MEFENAMAT");
        jPanel3.add(bl5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 595;
        gridBagConstraints.ipady = 94;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jPanel3, gridBagConstraints);

        jButton1.setText("Detail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        jButton2.setText("Detail");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 219, 0, 196);
        jPanel2.add(jButton2, gridBagConstraints);

        jButton3.setText("Detail");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 222);
        jPanel2.add(jButton3, gridBagConstraints);

        jButton4.setText("Detail");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 198, 0, 0);
        jPanel2.add(jButton4, gridBagConstraints);

        jButton5.setText("Detail");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 635, 0, 0);
        jPanel2.add(jButton5, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new java.awt.GridLayout(2, 5, -90, -40));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\7b.png")); // NOI18N
        jPanel5.add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\8b.png")); // NOI18N
        jPanel5.add(jLabel8);

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\9b.png")); // NOI18N
        jPanel5.add(jLabel9);

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\6b.jpg")); // NOI18N
        jPanel5.add(jLabel10);

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\10b.jpg")); // NOI18N
        jPanel5.add(jLabel11);

        buttonGroup1.add(bl6);
        bl6.setText("ENTROSTOP");
        jPanel5.add(bl6);

        buttonGroup1.add(bl7);
        bl7.setText("ALBOTHYL");
        jPanel5.add(bl7);

        buttonGroup1.add(bl8);
        bl8.setText("STREPSILS");
        jPanel5.add(bl8);

        buttonGroup1.add(bl9);
        bl9.setText("BETADINE");
        jPanel5.add(bl9);

        buttonGroup1.add(bl10);
        bl10.setText("MINYAK KAYUH PUTIH");
        jPanel5.add(bl10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 905;
        gridBagConstraints.ipady = -118;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel4.add(jPanel5, gridBagConstraints);

        jButton6.setText("Detail");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 66, 0, 15);
        jPanel4.add(jButton6, gridBagConstraints);

        jButton7.setText("Detail");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 241, 0, 26);
        jPanel4.add(jButton7, gridBagConstraints);

        jButton8.setText("Detail");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 222);
        jPanel4.add(jButton8, gridBagConstraints);

        jButton9.setText("Detail");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 238, 0, 0);
        jPanel4.add(jButton9, gridBagConstraints);

        jButton10.setText("Detail");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 685, 0, 0);
        jPanel4.add(jButton10, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Daftar Obat:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        dobat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Obat", "Albumin tubuh", "Demam", "Batuk berdahak", "Asam lambung", "Peradangan", "Diare", "Sariawan", "Sakit tenggorokan", "Sakit Luka", "Gatal-gatal" }));
        dobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobatActionPerformed(evt);
            }
        });
        jPanel6.add(dobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 140, -1));

        beli.setText("Beli Obat");
        beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliActionPerformed(evt);
            }
        });
        jPanel6.add(beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new onoiwa().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new paracetamol().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         new ambroxol().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         new antasida().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         new mefenamat().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         new entrostop().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         new albothyl().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         new strepsils().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         new betanide().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         new minyakputih().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliActionPerformed
        // TODO add your handling code here:
        int jcoke = dobat.getSelectedIndex();
    
        // Check if no radio button is selected
        if (!bl1.isSelected() && !bl2.isSelected() && !bl3.isSelected() && !bl4.isSelected() && !bl5.isSelected() && 
            !bl6.isSelected() && !bl7.isSelected() && !bl8.isSelected() && !bl9.isSelected() && !bl10.isSelected()) {

            JOptionPane.showMessageDialog(this, "Pilih Salah Satunya, jangan dikosongin", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
        // Switch based on selected index of the combo box
        switch (jcoke) {
            case 1:
                JOptionPane.showMessageDialog(this, "Pilihan obat Albumin tubuh sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Pilihan obat Demam Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(this, "Pilihan obat Batuk berdahak Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(this, "Pilihan obat Asam lambung Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(this, "Pilihan obat Peradangan nyeri Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 6:
                JOptionPane.showMessageDialog(this, "Pilihan obat Diare Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 7:
                JOptionPane.showMessageDialog(this, "Pilihan obat Sariawan Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 8:
                JOptionPane.showMessageDialog(this, "Pilihan obat Sakit tenggorokan Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 9:
                JOptionPane.showMessageDialog(this, "Pilihan obat Sakit Luka Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 10:
                JOptionPane.showMessageDialog(this, "Pilihan obat Gatal-gatal Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Obat Yang Anda Pilih Salah", "Message", JOptionPane.WARNING_MESSAGE);
                break;
        }

        // Reset all selections, except bl1
        buttonGroup1.clearSelection();  
        dobat.setSelectedIndex(0);      
        
    }
    }//GEN-LAST:event_beliActionPerformed

    private void dobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobatActionPerformed
        // TODO add your handling code here:
        // Get selected index from the combo box
        int jcoke = dobat.getSelectedIndex();
    
        // Reset all radio buttons
        buttonGroup1.clearSelection();
    
        // Set radio button according to the combo box selection
        switch (jcoke) {
            case 0:
                // no selection
                break;
            case 1:
                bl1.setSelected(true);
                break;
            case 2:
                bl2.setSelected(true);
                break;
            case 3:
                bl3.setSelected(true);
                break;
            case 4:
                bl4.setSelected(true);
                break;
            case 5:
                bl5.setSelected(true);
                break;
            case 6:
                bl6.setSelected(true);
                break;
            case 7:
                bl7.setSelected(true);
                break;
            case 8:
                bl8.setSelected(true);
                break;
            case 9:
                bl9.setSelected(true);
                break;
            case 10:
                bl10.setSelected(true);
                break;
            default:
                buttonGroup1.clearSelection();
                break;
        }
    }//GEN-LAST:event_dobatActionPerformed

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
            java.util.logging.Logger.getLogger(coba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coba1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beli;
    private javax.swing.JRadioButton bl1;
    private javax.swing.JRadioButton bl10;
    private javax.swing.JRadioButton bl2;
    private javax.swing.JRadioButton bl3;
    private javax.swing.JRadioButton bl4;
    private javax.swing.JRadioButton bl5;
    private javax.swing.JRadioButton bl6;
    private javax.swing.JRadioButton bl7;
    private javax.swing.JRadioButton bl8;
    private javax.swing.JRadioButton bl9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dobat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}