package view;

import javax.swing.JFrame;

public class frmLogin extends javax.swing.JFrame {

    private int x, y;
    
    public frmLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pane = new javax.swing.JPanel();
        btnInit = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pane.setBackground(new java.awt.Color(38, 50, 56));
        Pane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PaneMouseDragged(evt);
            }
        });
        Pane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PaneMousePressed(evt);
            }
        });
        Pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInit.setBackground(new java.awt.Color(38, 50, 56));
        btnInit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInit.setForeground(new java.awt.Color(255, 255, 255));
        btnInit.setText("Iniciar");
        btnInit.setFocusPainted(false);
        btnInit.setFocusable(false);
        btnInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitActionPerformed(evt);
            }
        });
        Pane.add(btnInit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 170, 50));

        btnMinimize.setBackground(new java.awt.Color(38, 50, 56));
        btnMinimize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(38, 50, 56));
        btnMinimize.setText("_");
        btnMinimize.setBorderPainted(false);
        btnMinimize.setFocusPainted(false);
        btnMinimize.setFocusable(false);
        btnMinimize.setOpaque(false);
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });
        Pane.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

        lblTitle.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(77, 76, 76));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("House Vet");
        Pane.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 270, 60));

        btnExit.setBackground(new java.awt.Color(38, 50, 56));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(38, 50, 56));
        btnExit.setText("X");
        btnExit.setBorderPainted(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setOpaque(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        Pane.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dog.jpg"))); // NOI18N
        lblImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 50, 56), 1, true));
        Pane.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 490));

        getContentPane().add(Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
       this.setExtendedState(JFrame.ICONIFIED); 
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void PaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_PaneMousePressed

    private void PaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - this.x, this.getLocation().y + evt.getY() - this.y);
    }//GEN-LAST:event_PaneMouseDragged

    private void btnInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitActionPerformed
        new frmConsult().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
