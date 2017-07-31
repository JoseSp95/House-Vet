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
        btnMinimize = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        btnMinimize.setBackground(new java.awt.Color(38, 50, 56));
        btnMinimize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
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
        Pane.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 6, -1, -1));

        btnExit.setBackground(new java.awt.Color(38, 50, 56));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
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
        Pane.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(999, 11, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/vetLabel.jpg"))); // NOI18N
        Pane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 61, 1010, 430));

        getContentPane().add(Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
