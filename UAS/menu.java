/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UAS;

import UTS.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fysl
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form seblak
     */
    Beli t =new Beli();
    Pesan p=new Pesan();
    info i=new info();
    Daftar d=new Daftar();
    
    public menu() {
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

        jPanel1 = new javax.swing.JPanel();
        apikiri = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnbeli = new javax.swing.JButton();
        data = new javax.swing.JButton();
        info = new javax.swing.JButton();
        pesan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cabai = new javax.swing.JLabel();
        apikanan = new javax.swing.JLabel();
        potongan2 = new javax.swing.JLabel();
        potongan1 = new javax.swing.JLabel();
        judl1 = new javax.swing.JLabel();
        garisapi = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(128, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apikiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN (1).png"))); // NOI18N
        jPanel1.add(apikiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 100, 450, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/seblak.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        jPanel2.setBackground(new java.awt.Color(152, 43, 28));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbeli.setBackground(new java.awt.Color(218, 212, 181));
        btnbeli.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        btnbeli.setForeground(new java.awt.Color(51, 0, 0));
        btnbeli.setText("Beli");
        btnbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeliActionPerformed(evt);
            }
        });
        jPanel2.add(btnbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 270, 50));

        data.setBackground(new java.awt.Color(218, 212, 181));
        data.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        data.setForeground(new java.awt.Color(51, 0, 0));
        data.setText("Data");
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        jPanel2.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 270, 50));

        info.setBackground(new java.awt.Color(218, 212, 181));
        info.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        info.setForeground(new java.awt.Color(51, 0, 0));
        info.setText("Info");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 270, 50));

        pesan.setBackground(new java.awt.Color(218, 212, 181));
        pesan.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        pesan.setForeground(new java.awt.Color(51, 0, 0));
        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });
        jPanel2.add(pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 270, 50));

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 212, 181));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 255, 255), java.awt.Color.gray, java.awt.Color.gray));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -1, 500, 60));

        cabai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/logo.png"))); // NOI18N
        jPanel2.add(cabai, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 310, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 500, 340));

        apikanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN (1).png"))); // NOI18N
        jPanel1.add(apikanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 440, 290));

        potongan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN (2 x 1 inci).png"))); // NOI18N
        jPanel1.add(potongan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 390, 227, -1));

        potongan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN (2 x 1 inci).png"))); // NOI18N
        jPanel1.add(potongan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 227, -1));

        judl1.setBackground(new java.awt.Color(218, 212, 181));
        judl1.setFont(new java.awt.Font("Ravie", 1, 44)); // NOI18N
        judl1.setForeground(new java.awt.Color(218, 212, 181));
        judl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl1.setText("Seblak Geni Rawit");
        jPanel1.add(judl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 660, 80));

        garisapi.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        garisapi.setForeground(new java.awt.Color(255, 255, 255));
        garisapi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN.png"))); // NOI18N
        jPanel1.add(garisapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, -1, 170));

        keluar.setBackground(new java.awt.Color(255, 51, 51));
        keluar.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        keluar.setForeground(new java.awt.Color(51, 0, 0));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel1.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(600, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here
        //pemindahan class
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void btnbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeliActionPerformed
        // TODO add your handling code here:
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbeliActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_infoActionPerformed

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
        // TODO add your handling code here:
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_pesanActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_dataActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
                
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apikanan;
    private javax.swing.JLabel apikiri;
    public javax.swing.JButton btnbeli;
    private javax.swing.JLabel cabai;
    public javax.swing.JButton data;
    private javax.swing.JLabel garisapi;
    public javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judl1;
    public javax.swing.JButton keluar;
    public javax.swing.JButton pesan;
    private javax.swing.JLabel potongan1;
    private javax.swing.JLabel potongan2;
    // End of variables declaration//GEN-END:variables
}
