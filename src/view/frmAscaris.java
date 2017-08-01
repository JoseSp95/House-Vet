package view;

import javax.swing.JFrame;

public class frmAscaris extends javax.swing.JFrame {

    private int x, y;
    
    public frmAscaris() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pane = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnConsult = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Pane.setBackground(new java.awt.Color(255, 255, 255));
        Pane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 66), 1, true));
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
        Pane.setLayout(null);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ascaris.jpg"))); // NOI18N
        Pane.add(lblImage);
        lblImage.setBounds(1, 1, 450, 513);

        jPanel1.setBackground(new java.awt.Color(38, 50, 56));
        jPanel1.setLayout(null);

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
        jPanel1.add(btnExit);
        btnExit.setBounds(560, 5, 50, 40);

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
        jPanel1.add(btnMinimize);
        btnMinimize.setBounds(505, 0, 50, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASCARIS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 10, 200, 46);

        Pane.add(jPanel1);
        jPanel1.setBounds(450, 0, 611, 69);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tratamiento :");
        Pane.add(jLabel2);
        jLabel2.setBounds(510, 240, 95, 33);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("retraso en el crecimiento de los cachorros y en algunos casos la muerte.");
        Pane.add(jLabel4);
        jLabel4.setBounds(586, 192, 400, 29);

        btnLogin.setBackground(new java.awt.Color(38, 60, 56));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Menu Principal");
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        Pane.add(btnLogin);
        btnLogin.setBounds(820, 440, 150, 40);

        btnConsult.setBackground(new java.awt.Color(38, 60, 56));
        btnConsult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsult.setForeground(new java.awt.Color(255, 255, 255));
        btnConsult.setText("Nueva Consulta");
        btnConsult.setBorderPainted(false);
        btnConsult.setFocusPainted(false);
        btnConsult.setFocusable(false);
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });
        Pane.add(btnConsult);
        btnConsult.setBounds(560, 440, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Definicion :");
        Pane.add(jLabel5);
        jLabel5.setBounds(509, 109, 95, 33);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Son parasitos internos que se localizan en el intestino delgado provocando");
        Pane.add(jLabel6);
        jLabel6.setBounds(586, 148, 405, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Darle antiparasitarios como pamoato, pyrantal  y fenbendazol .");
        Pane.add(jLabel7);
        jLabel7.setBounds(586, 279, 410, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("distintos transtornos de su salud, en particular diarrea, desnutrición, ");
        Pane.add(jLabel10);
        jLabel10.setBounds(586, 170, 378, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void PaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_PaneMousePressed

    private void PaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneMouseDragged
        this.setLocation(evt.getX() + getLocation().x - x, evt.getY() + getLocation().y - y);
    }//GEN-LAST:event_PaneMouseDragged

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        new frmConsult().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new frmLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane;
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}
