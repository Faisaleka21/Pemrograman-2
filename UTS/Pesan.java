/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UTS;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fysl
 */

public class Pesan extends Beli {

    /**
     * Creates new form seblak
     */
    
    public Pesan() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        hrg4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        hrg3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hrg2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        hrg1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        judl5 = new javax.swing.JLabel();
        beli = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        judl3 = new javax.swing.JLabel();
        varian = new javax.swing.JComboBox<>();
        judl6 = new javax.swing.JLabel();
        level = new javax.swing.JComboBox<>();
        batal = new javax.swing.JButton();
        s1 = new javax.swing.JCheckBox();
        s2 = new javax.swing.JCheckBox();
        jml1 = new javax.swing.JTextField();
        s4 = new javax.swing.JCheckBox();
        s3 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        judl7 = new javax.swing.JLabel();
        judl8 = new javax.swing.JLabel();
        judl9 = new javax.swing.JLabel();
        judl10 = new javax.swing.JLabel();
        judl11 = new javax.swing.JLabel();
        judl12 = new javax.swing.JLabel();
        judl13 = new javax.swing.JLabel();
        judl14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jml2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jml3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jml4 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        hasil = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        judl4 = new javax.swing.JLabel();
        potongan3 = new javax.swing.JLabel();
        potongan1 = new javax.swing.JLabel();
        garisapi = new javax.swing.JLabel();
        garisapi1 = new javax.swing.JLabel();
        potongan4 = new javax.swing.JLabel();
        apikiri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(128, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(152, 43, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(128, 43, 28));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(51, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/S1.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 120));

        hrg4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        hrg4.setForeground(new java.awt.Color(242, 232, 198));
        hrg4.setText("Rp. 12.000");
        jPanel3.add(hrg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 200, 160));

        jPanel4.setBackground(new java.awt.Color(128, 43, 28));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(51, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/s2.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 120));

        hrg3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        hrg3.setForeground(new java.awt.Color(242, 232, 198));
        hrg3.setText("Rp. 10.000");
        jPanel4.add(hrg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 200, 160));

        jPanel5.setBackground(new java.awt.Color(128, 43, 28));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(51, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/s3.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 120));

        hrg2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        hrg2.setForeground(new java.awt.Color(242, 232, 198));
        hrg2.setText("Rp. 11.000");
        jPanel5.add(hrg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 200, 160));

        jPanel6.setBackground(new java.awt.Color(128, 43, 28));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(51, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hrg1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        hrg1.setForeground(new java.awt.Color(242, 232, 198));
        hrg1.setText("Rp. 13.000");
        jPanel6.add(hrg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/s4.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 120));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 200, 160));

        judl5.setFont(new java.awt.Font("Ravie", 0, 20)); // NOI18N
        judl5.setForeground(new java.awt.Color(242, 232, 198));
        judl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl5.setText("Masukkan Nama");
        jPanel2.add(judl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 40));

        beli.setBackground(new java.awt.Color(218, 212, 181));
        beli.setFont(new java.awt.Font("Ravie", 0, 22)); // NOI18N
        beli.setForeground(new java.awt.Color(51, 0, 0));
        beli.setText("Beli");
        beli.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliActionPerformed(evt);
            }
        });
        jPanel2.add(beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 110, 40));

        nama.setBackground(new java.awt.Color(204, 204, 204));
        nama.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        nama.setForeground(new java.awt.Color(51, 51, 51));
        nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 230, 40));

        judl3.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        judl3.setForeground(new java.awt.Color(242, 232, 198));
        judl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl3.setText("Geni Nangis");
        jPanel2.add(judl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 250, -1));

        varian.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        varian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Kuah", "Kering" }));
        jPanel2.add(varian, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 190, 40));

        judl6.setFont(new java.awt.Font("Ravie", 0, 20)); // NOI18N
        judl6.setForeground(new java.awt.Color(242, 232, 198));
        judl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl6.setText("Pilih Level");
        jPanel2.add(judl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, 40));

        level.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        jPanel2.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 190, 40));

        batal.setBackground(new java.awt.Color(218, 212, 181));
        batal.setFont(new java.awt.Font("Ravie", 0, 22)); // NOI18N
        batal.setForeground(new java.awt.Color(51, 0, 0));
        batal.setText("Batal");
        batal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel2.add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, 40));

        s1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s1.setForeground(new java.awt.Color(242, 232, 198));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        jPanel2.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        s2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s2.setForeground(new java.awt.Color(242, 232, 198));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        jPanel2.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jml1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml1ActionPerformed(evt);
            }
        });
        jPanel2.add(jml1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 60, -1));

        s4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s4.setForeground(new java.awt.Color(242, 232, 198));
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        jPanel2.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        s3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s3.setForeground(new java.awt.Color(242, 232, 198));
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        jPanel2.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 232, 198));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Jumlah");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 30));

        judl7.setFont(new java.awt.Font("Ravie", 0, 20)); // NOI18N
        judl7.setForeground(new java.awt.Color(242, 232, 198));
        judl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl7.setText("Varian");
        jPanel2.add(judl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 40));

        judl8.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        judl8.setForeground(new java.awt.Color(242, 232, 198));
        judl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl8.setText("Seblak Pentol");
        jPanel2.add(judl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 250, -1));

        judl9.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        judl9.setForeground(new java.awt.Color(242, 232, 198));
        judl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl9.setText("Seblak");
        jPanel2.add(judl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 250, -1));

        judl10.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        judl10.setForeground(new java.awt.Color(242, 232, 198));
        judl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl10.setText("Rawit Blast");
        jPanel2.add(judl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 250, -1));

        judl11.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        judl11.setForeground(new java.awt.Color(242, 232, 198));
        judl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl11.setText("Seblak Mie");
        jPanel2.add(judl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 250, -1));

        judl12.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        judl12.setForeground(new java.awt.Color(242, 232, 198));
        judl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl12.setText("Spicy Boom");
        jPanel2.add(judl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 250, -1));

        judl13.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        judl13.setForeground(new java.awt.Color(242, 232, 198));
        judl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl13.setText("Seblak");
        jPanel2.add(judl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 250, -1));

        judl14.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        judl14.setForeground(new java.awt.Color(242, 232, 198));
        judl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl14.setText("Pentol Nagih");
        jPanel2.add(judl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 250, -1));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 232, 198));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Jumlah");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, 30));

        jml2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml2ActionPerformed(evt);
            }
        });
        jPanel2.add(jml2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 60, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 232, 198));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Jumlah");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, 30));

        jml3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml3ActionPerformed(evt);
            }
        });
        jPanel2.add(jml3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 60, -1));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 232, 198));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Jumlah");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, 30));

        jml4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml4ActionPerformed(evt);
            }
        });
        jPanel2.add(jml4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 810, 480));

        jPanel12.setBackground(new java.awt.Color(152, 43, 28));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(242, 232, 198));
        jLabel15.setText("Total");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        tabel.setAutoCreateRowSorter(true);
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Jenis", "Jumlah", "Harga"
            }
        ));
        tabel.setEnabled(false);
        jScrollPane2.setViewportView(tabel);

        jPanel12.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 360));

        hasil.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        hasil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel12.add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 280, 60));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 320, 480));

        back.setBackground(new java.awt.Color(218, 212, 181));
        back.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(51, 0, 0));
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/seblak.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        judl4.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        judl4.setForeground(new java.awt.Color(242, 232, 198));
        judl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judl4.setText("Pilih Toping Favorit");
        jPanel1.add(judl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 530, 50));

        potongan3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN (2 x 1 inci).png"))); // NOI18N
        jPanel1.add(potongan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 500, 227, -1));

        potongan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN (2 x 1 inci).png"))); // NOI18N
        jPanel1.add(potongan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 227, -1));

        garisapi.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        garisapi.setForeground(new java.awt.Color(255, 255, 255));
        garisapi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN.png"))); // NOI18N
        jPanel1.add(garisapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 750, 170));

        garisapi1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        garisapi1.setForeground(new java.awt.Color(255, 255, 255));
        garisapi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN.png"))); // NOI18N
        jPanel1.add(garisapi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 750, 170));

        potongan4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN (2 x 1 inci).png"))); // NOI18N
        jPanel1.add(potongan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 40, 227, -1));

        apikiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS/gambaruts/SEBLAK PRASMANAN (1).png"))); // NOI18N
        jPanel1.add(apikiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 440, 450, 340));

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

        setSize(new java.awt.Dimension(1193, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliActionPerformed
        // TODO add your handling code here:
        
        //validasi input
        String nm=nama.getText().trim();
        if (nm.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        String selectedItem = (String) varian.getSelectedItem();
        if("-Pilih-".equals(selectedItem)){
                JOptionPane.showMessageDialog(this, "Harap Pilih Varian", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        
        
        
        //total
        int total=0;
        StringBuilder x= new StringBuilder();
        int i=0;
        
        //pentol geni
        if(s1.isSelected()){
            try {
                int a=Integer.parseInt(this.jml1.getText());
                i += a; //jml item
                total +=12000 * a; //dikalikan banyaknya jml item 
                x.append("Seblak Pentol Geni Nangis");
                } 
            catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Harap masukkan angka pada Seblak Pentol Geni!", "Input Error", JOptionPane.ERROR_MESSAGE);
                   jml1.requestFocus(); // Mengembalikan fokus ke JTextField jml1
                   return;
                   }
        }

        //rawit
        if(s2.isSelected()){
            try{
                int b=Integer.parseInt(this.jml2.getText());
                i += b;
                total +=10000 * b;
                x.append("Seblak Rawit Blast");
                } 
        catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Harap masukkan angka pada Seblak Pentol Geni!", "Input Error", JOptionPane.ERROR_MESSAGE);
                   jml1.requestFocus(); // Mengembalikan fokus ke JTextField jml1
                   return;
                   }
        }
        //mie
        if(s3.isSelected()){
            try{
                int c=Integer.parseInt(this.jml3.getText());
                i += c;
                total +=11000 * c;
                x.append("Seblak Spicy Boom");
                }
            catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Harap masukkan angka pada Seblak Pentol Geni!", "Input Error", JOptionPane.ERROR_MESSAGE);
                   jml1.requestFocus(); // Mengembalikan fokus ke JTextField jml1
                   return;
                   }
        }
        //pentol nagih
        if(s4.isSelected()){
            try{
                int d=Integer.parseInt(this.jml4.getText());
                i += d;
                total +=13000 * d;
                x.append("Seblak Pentol Nagih");
                }
            catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Harap masukkan angka pada Seblak Pentol Geni!", "Input Error", JOptionPane.ERROR_MESSAGE);
                   jml1.requestFocus(); // Mengembalikan fokus ke JTextField jml1
                   return;
                   }
        }
        
        String jumlah=String.valueOf(total);
        
        
        //menampilkan total
        hasil.setText("Rp."+jumlah);
        
        //tabel
        DefaultTableModel model=(DefaultTableModel)tabel.getModel();
        model.addRow(new Object[]{
            nama.getText(),
            x,
            i,
            hasil.getText()
        });
        
        
       
    }//GEN-LAST:event_beliActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_namaActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        //hapus centang pada chexbox
        s2.setSelected(false);
        s1.setSelected(false);
        s1.setSelected(false);
        s4.setSelected(false);
        
        //hapus pada textfield
        nama.setText("");
        jml1.setText("");
        jml2.setText("");
        jml3.setText("");
        jml4.setText("");
        hasil.setText("");
        
        //hapus combo box
        level.setSelectedIndex(0);
        varian.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_batalActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        menu s=new menu();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3ActionPerformed

    private void jml1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jml1ActionPerformed

    private void jml2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jml2ActionPerformed

    private void jml3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jml3ActionPerformed

    private void jml4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jml4ActionPerformed

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
            java.util.logging.Logger.getLogger(Pesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Pesan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apikiri;
    private javax.swing.JButton back;
    private javax.swing.JButton batal;
    private javax.swing.JButton beli;
    private javax.swing.JLabel garisapi;
    private javax.swing.JLabel garisapi1;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel hrg1;
    private javax.swing.JLabel hrg2;
    private javax.swing.JLabel hrg3;
    private javax.swing.JLabel hrg4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jml1;
    private javax.swing.JTextField jml2;
    private javax.swing.JTextField jml3;
    private javax.swing.JTextField jml4;
    private javax.swing.JLabel judl10;
    private javax.swing.JLabel judl11;
    private javax.swing.JLabel judl12;
    private javax.swing.JLabel judl13;
    private javax.swing.JLabel judl14;
    private javax.swing.JLabel judl3;
    private javax.swing.JLabel judl4;
    private javax.swing.JLabel judl5;
    private javax.swing.JLabel judl6;
    private javax.swing.JLabel judl7;
    private javax.swing.JLabel judl8;
    private javax.swing.JLabel judl9;
    private javax.swing.JComboBox<String> level;
    public javax.swing.JTextField nama;
    private javax.swing.JLabel potongan1;
    private javax.swing.JLabel potongan3;
    private javax.swing.JLabel potongan4;
    private javax.swing.JCheckBox s1;
    private javax.swing.JCheckBox s2;
    private javax.swing.JCheckBox s3;
    private javax.swing.JCheckBox s4;
    private javax.swing.JTable tabel;
    private javax.swing.JComboBox<String> varian;
    // End of variables declaration//GEN-END:variables
}
