/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_parkir;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author zurin
 */
public class utama extends javax.swing.JFrame {
    
    /**
     * Creates new form utama
     */
    public utama() {
        initComponents();
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnParkir = new javax.swing.JMenu();
        mnPendapatan = new javax.swing.JMenu();
        mnKeluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Manajemen Parkir");
        setPreferredSize(new java.awt.Dimension(668, 608));
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Universitas Kuningan\\Mata Kuliah\\Bahasa Pemrograman 1\\Project\\TA_parkir\\TA_parkir\\car-parking-city-street-luxury-automobiles_33099-1995.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel2.setText("Parking Application");

        mnParkir.setIcon(new javax.swing.ImageIcon("F:\\Universitas Kuningan\\Mata Kuliah\\Bahasa Pemrograman 1\\Project\\TA_parkir\\TA_parkir\\images (2).jpeg")); // NOI18N
        mnParkir.setText("Parkir");
        mnParkir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnParkirMousePressed(evt);
            }
        });
        jMenuBar1.add(mnParkir);

        mnPendapatan.setIcon(new javax.swing.ImageIcon("F:\\Universitas Kuningan\\Mata Kuliah\\Bahasa Pemrograman 1\\Project\\TA_parkir\\TA_parkir\\dollar.jpeg")); // NOI18N
        mnPendapatan.setText("Pendapatan");
        mnPendapatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnPendapatanMousePressed(evt);
            }
        });
        jMenuBar1.add(mnPendapatan);

        mnKeluar.setIcon(new javax.swing.ImageIcon("F:\\Universitas Kuningan\\Mata Kuliah\\Bahasa Pemrograman 1\\Project\\TA_parkir\\TA_parkir\\exit.png")); // NOI18N
        mnKeluar.setText("Keluar");
        mnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnKeluarMousePressed(evt);
            }
        });
        jMenuBar1.add(mnKeluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnKeluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnKeluarMousePressed
        // TODO add your handling code here:
        Object[] options = {"Ya", "Tidak, tetap di halaman"};
        int dialog = JOptionPane.showOptionDialog(this, "Apakah Anda yakin akan Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (dialog == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnKeluarMousePressed

    private void mnParkirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnParkirMousePressed
        // TODO add your handling code here:
        new fParkir(this,true).setVisible(true);
    }//GEN-LAST:event_mnParkirMousePressed

    private void mnPendapatanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPendapatanMousePressed
        // TODO add your handling code here:
        new fPendapatan(this, true).setVisible(true);
    }//GEN-LAST:event_mnPendapatanMousePressed

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
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnKeluar;
    private javax.swing.JMenu mnParkir;
    private javax.swing.JMenu mnPendapatan;
    // End of variables declaration//GEN-END:variables
}