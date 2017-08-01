package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Consult;

public class frmConsult extends javax.swing.JFrame {

    private int x, y;
    private ArrayList<JCheckBox> listOfSymptoms;
    
    public frmConsult() {
        initComponents();
        setLocationRelativeTo(null);
        fillList();
        applyActionListener();
    }

    private void fillList(){
        listOfSymptoms = new ArrayList<>();
        listOfSymptoms.add(jCheckBox1);
        listOfSymptoms.add(jCheckBox2);
        listOfSymptoms.add(jCheckBox3);
        listOfSymptoms.add(jCheckBox4);
        listOfSymptoms.add(jCheckBox5);
        listOfSymptoms.add(jCheckBox6);
        listOfSymptoms.add(jCheckBox7);
        listOfSymptoms.add(jCheckBox8);
        listOfSymptoms.add(jCheckBox9);
        listOfSymptoms.add(jCheckBox10);
        listOfSymptoms.add(jCheckBox11);
        listOfSymptoms.add(jCheckBox12);
        listOfSymptoms.add(jCheckBox13);
        listOfSymptoms.add(jCheckBox14);
        listOfSymptoms.add(jCheckBox15);
        listOfSymptoms.add(jCheckBox16);
        listOfSymptoms.add(jCheckBox17);
        listOfSymptoms.add(jCheckBox18);
        listOfSymptoms.add(jCheckBox19);
        listOfSymptoms.add(jCheckBox20);
        listOfSymptoms.add(jCheckBox21);
        listOfSymptoms.add(jCheckBox22);
        listOfSymptoms.add(jCheckBox23);
        listOfSymptoms.add(jCheckBox24);
        listOfSymptoms.add(jCheckBox25);
        listOfSymptoms.add(jCheckBox26);
        listOfSymptoms.add(jCheckBox27);
        listOfSymptoms.add(jCheckBox28);
        listOfSymptoms.add(jCheckBox29);
 
    }
    
    private String convertToPrologStyle(String symptom){
        symptom = symptom.toLowerCase();
        symptom = symptom.replaceAll(" ","_");
        return symptom;
    }
    
    private void applyActionListener(){
        listOfSymptoms.forEach((checkBox) -> {
            checkBox.addActionListener((ActionEvent e) -> {
                lblCounter.setText(getCheckBoxSelected());
            });
        });
    }
    
    private String getCheckBoxSelected(){
        int counter = 0;
        for(JCheckBox checkBox : listOfSymptoms){
            if(checkBox.isSelected()){
                counter++;
            }
        }
        return String.valueOf(counter);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        btnConsult = new javax.swing.JButton();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblCounter = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1060, 510));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 50, 56), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

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
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        lblTitle.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(77, 76, 76));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("House Vet");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jLabel1.setBackground(new java.awt.Color(77, 76, 76));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(77, 76, 76));
        jLabel1.setText("Seleccione los sintomas que presente el Canino ( 6 sintomas )");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 67, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox1.setText("Agresividad Leve");
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.setFocusable(false);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 119, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox2.setText("Aumento del Apetito");
        jCheckBox2.setFocusPainted(false);
        jCheckBox2.setFocusable(false);
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 160, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox3.setText("Adelgazamiento");
        jCheckBox3.setFocusPainted(false);
        jCheckBox3.setFocusable(false);
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 201, -1, -1));

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox4.setText("Barriga Hinchada");
        jCheckBox4.setFocusPainted(false);
        jCheckBox4.setFocusable(false);
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 242, -1, -1));

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox5.setText("Bebe demasiada agua");
        jCheckBox5.setFocusPainted(false);
        jCheckBox5.setFocusable(false);
        jPanel1.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 283, -1, -1));

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox6.setText("Cabeza Inclinada");
        jCheckBox6.setFocusPainted(false);
        jCheckBox6.setFocusable(false);
        jPanel1.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 324, -1, -1));

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox7.setText("Cansancio");
        jCheckBox7.setFocusPainted(false);
        jCheckBox7.setFocusable(false);
        jPanel1.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 365, -1, -1));

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox8.setText("Convulsiones");
        jCheckBox8.setFocusPainted(false);
        jCheckBox8.setFocusable(false);
        jPanel1.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 406, -1, -1));

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox9.setText("Diarrea");
        jCheckBox9.setFocusPainted(false);
        jCheckBox9.setFocusable(false);
        jPanel1.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 119, -1, -1));

        btnConsult.setBackground(new java.awt.Color(38, 50, 56));
        btnConsult.setForeground(new java.awt.Color(255, 255, 255));
        btnConsult.setText("CONSULTAR");
        btnConsult.setFocusPainted(false);
        btnConsult.setFocusable(false);
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 155, 38));

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox10.setText("Dolor abdominal");
        jCheckBox10.setFocusPainted(false);
        jCheckBox10.setFocusable(false);
        jPanel1.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 160, -1, -1));

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox11.setText("Dolor en las orejas");
        jCheckBox11.setFocusPainted(false);
        jCheckBox11.setFocusable(false);
        jPanel1.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 201, -1, -1));

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox12.setText("Deshidratacion");
        jCheckBox12.setFocusPainted(false);
        jCheckBox12.setFocusable(false);
        jPanel1.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 242, -1, -1));

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox13.setText("Dificultad para respirar");
        jCheckBox13.setFocusPainted(false);
        jCheckBox13.setFocusable(false);
        jPanel1.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 283, -1, -1));

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox14.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox14.setText("Fiebre");
        jCheckBox14.setFocusPainted(false);
        jCheckBox14.setFocusable(false);
        jPanel1.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 365, -1, -1));

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox15.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox15.setText("Estornudo");
        jCheckBox15.setFocusPainted(false);
        jCheckBox15.setFocusable(false);
        jPanel1.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 324, -1, -1));

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox16.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox16.setText("Heces con Sangre");
        jCheckBox16.setFocusPainted(false);
        jCheckBox16.setFocusable(false);
        jPanel1.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 406, -1, -1));

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox17.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox17.setText("Ojos llorosos");
        jCheckBox17.setFocusPainted(false);
        jCheckBox17.setFocusable(false);
        jPanel1.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 160, -1, -1));

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox18.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox18.setText("Orina con frecuencia");
        jCheckBox18.setFocusPainted(false);
        jCheckBox18.setFocusable(false);
        jPanel1.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 201, -1, -1));

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox19.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox19.setText("Perdida de apetito");
        jCheckBox19.setFocusPainted(false);
        jCheckBox19.setFocusable(false);
        jPanel1.add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 242, -1, -1));

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox20.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox20.setText("Salivacion Espumosa");
        jCheckBox20.setFocusPainted(false);
        jCheckBox20.setFocusable(false);
        jPanel1.add(jCheckBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 283, -1, -1));

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox21.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox21.setText("Se rasca las orejas muy seguido");
        jCheckBox21.setFocusPainted(false);
        jCheckBox21.setFocusable(false);
        jPanel1.add(jCheckBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 365, -1, -1));

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox22.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox22.setText("Mal olor en los oidos");
        jCheckBox22.setFocusPainted(false);
        jCheckBox22.setFocusable(false);
        jPanel1.add(jCheckBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 119, -1, -1));

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox23.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox23.setText("Secrecion en los oidos");
        jCheckBox23.setFocusPainted(false);
        jCheckBox23.setFocusable(false);
        jPanel1.add(jCheckBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 324, -1, -1));

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox24.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox24.setText("Secrecion nasal");
        jCheckBox24.setFocusPainted(false);
        jCheckBox24.setFocusable(false);
        jPanel1.add(jCheckBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 406, -1, -1));

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox25.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox25.setText("Sed Extrema");
        jCheckBox25.setFocusPainted(false);
        jCheckBox25.setFocusable(false);
        jPanel1.add(jCheckBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 119, -1, -1));

        jCheckBox26.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox26.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox26.setText("Tos");
        jCheckBox26.setFocusPainted(false);
        jCheckBox26.setFocusable(false);
        jPanel1.add(jCheckBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 160, -1, -1));

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox27.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox27.setText("Tristeza");
        jCheckBox27.setFocusPainted(false);
        jCheckBox27.setFocusable(false);
        jPanel1.add(jCheckBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 201, -1, -1));

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox28.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox28.setText("Violencia Extrema");
        jCheckBox28.setFocusPainted(false);
        jCheckBox28.setFocusable(false);
        jPanel1.add(jCheckBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 242, -1, -1));

        jCheckBox29.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox29.setForeground(new java.awt.Color(77, 76, 76));
        jCheckBox29.setText("Vomito");
        jCheckBox29.setFocusPainted(false);
        jCheckBox29.setFocusable(false);
        jPanel1.add(jCheckBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 283, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dogvet.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 230, 350));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back1.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, 30, 30));

        lblCounter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCounter.setText("0");
        jPanel1.add(lblCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 71, 30, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(77, 76, 76));
        jLabel4.setText("Seleccionados : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getX() + this.getLocation().x - this.x, evt.getY() + this.getLocation().y - this.y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new frmLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        String symptom;
        int counter = 0;
        ArrayList<String> list = new ArrayList<>();
        for(JCheckBox checkBox : listOfSymptoms){
            if(checkBox.isSelected()){
                symptom = convertToPrologStyle(checkBox.getText());
                list.add(symptom);
                counter++;
                System.out.println(symptom);
            }
        }
        
        if(counter < 6){
            JOptionPane.showMessageDialog(null,"Sintomas insuficientes");
        }
        else if( counter > 6){
            JOptionPane.showMessageDialog(null,"Eliga los sintomas principales");
        }
        else{
            Consult consult = new Consult(list);
            String result = consult.getResult();
            consult.cleanAsserts();
            
            if("no_determinado".equals(result)){
                result = "No se pudo detectar la enfermedad";
            }
            
            JOptionPane.showMessageDialog(null,result);
        }
        
    }//GEN-LAST:event_btnConsultActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCounter;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
