package vistas;

import java.awt.Image;
import java.awt.Toolkit;

import static recursos.MetodosGenerales.abrirVentana;

public class Historial_JFrame extends javax.swing.JFrame {

  public Historial_JFrame() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  public Image getIconImage() {
    return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.jpg"));
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jButton_Volver = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    txt_nota1 = new javax.swing.JTextPane();
    jScrollPane2 = new javax.swing.JScrollPane();
    txt_nota3 = new javax.swing.JTextPane();
    jScrollPane3 = new javax.swing.JScrollPane();
    txt_nota5 = new javax.swing.JTextPane();
    jScrollPane4 = new javax.swing.JScrollPane();
    txt_nota2 = new javax.swing.JTextPane();
    jScrollPane5 = new javax.swing.JScrollPane();
    txt_nota4 = new javax.swing.JTextPane();
    jScrollPane6 = new javax.swing.JScrollPane();
    txt_nota6 = new javax.swing.JTextPane();
    btn_guardar = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Historial de ventas");
    setIconImage(getIconImage());
    setName("Historial_JFrame"); // NOI18N
    setResizable(false);

    jPanel2.setBackground(new java.awt.Color(0, 220, 62));

    jButton_Volver.setBackground(new java.awt.Color(255, 116, 1));
    jButton_Volver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jButton_Volver.setForeground(new java.awt.Color(255, 255, 255));
    jButton_Volver.setText("Volver");
    jButton_Volver.setBorder(null);
    jButton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton_Volver.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_VolverActionPerformed(evt);
          }
        });

    jLabel10.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel10.setText("Historial de ventas");

    txt_nota1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txt_nota1.setPreferredSize(new java.awt.Dimension(300, 80));
    jScrollPane1.setViewportView(txt_nota1);

    txt_nota3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txt_nota3.setPreferredSize(new java.awt.Dimension(300, 80));
    jScrollPane2.setViewportView(txt_nota3);

    txt_nota5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txt_nota5.setPreferredSize(new java.awt.Dimension(300, 80));
    jScrollPane3.setViewportView(txt_nota5);

    txt_nota2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txt_nota2.setPreferredSize(new java.awt.Dimension(300, 80));
    jScrollPane4.setViewportView(txt_nota2);

    txt_nota4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txt_nota4.setPreferredSize(new java.awt.Dimension(300, 80));
    jScrollPane5.setViewportView(txt_nota4);

    txt_nota6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txt_nota6.setPreferredSize(new java.awt.Dimension(300, 80));
    jScrollPane6.setViewportView(txt_nota6);

    btn_guardar.setBackground(new java.awt.Color(255, 116, 1));
    btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
    btn_guardar.setText("Guardar");
    btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn_guardar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_guardarActionPerformed(evt);
          }
        });

    jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Lunes");

    jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Martes");

    jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Miércoles");

    jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Jueves");

    jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("Viernes");

    jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Sábado");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel2Layout
                    .createSequentialGroup()
                    .addContainerGap(165, Short.MAX_VALUE)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addComponent(
                                        jLabel10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        352,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(289, 289, 289))
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel2Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                btn_guardar,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(
                                                jPanel2Layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        jPanel2Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addGroup(
                                                                jPanel2Layout
                                                                    .createParallelGroup(
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.LEADING,
                                                                        false)
                                                                    .addComponent(
                                                                        jScrollPane2,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING)
                                                                    .addComponent(
                                                                        jScrollPane1,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE))
                                                            .addComponent(
                                                                jScrollPane3,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                302,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE))
                                                    .addGap(87, 87, 87)
                                                    .addGroup(
                                                        jPanel2Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                jScrollPane6,
                                                                javax.swing.GroupLayout.Alignment
                                                                    .TRAILING,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                302,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addGroup(
                                                                jPanel2Layout
                                                                    .createParallelGroup(
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.LEADING,
                                                                        false)
                                                                    .addComponent(
                                                                        jScrollPane5,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING)
                                                                    .addComponent(
                                                                        jScrollPane4,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)))))
                                    .addGap(136, 136, 136))))
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(280, 280, 280)
                    .addComponent(jLabel1)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(261, 261, 261))
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(272, 272, 272)
                    .addComponent(jLabel3)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(258, 258, 258))
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(
                        jButton_Volver,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        72,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(279, 279, 279)
                    .addComponent(jLabel5)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(257, 257, 257)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(
                        jButton_Volver,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        22,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jLabel10)
                    .addGap(29, 29, 29)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel2Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(
                                        jPanel2Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                jScrollPane1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                80,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jScrollPane4,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                80,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(
                                        jScrollPane2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        80,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(
                                        jScrollPane5,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(
                                jScrollPane3,
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jScrollPane6,
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addComponent(btn_guardar)
                    .addGap(36, 36, 36)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(
                jPanel2,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(
                jPanel2,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButton_VolverActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton_VolverActionPerformed
    // TODO add your handling code here:
    abrirVentana(new NotVent_JFrame());
    this.dispose();
  } // GEN-LAST:event_jButton_VolverActionPerformed

  private void btn_guardarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btn_guardarActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_btn_guardarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_guardar;
  private javax.swing.JButton jButton_Volver;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JScrollPane jScrollPane6;
  private javax.swing.JTextPane txt_nota1;
  private javax.swing.JTextPane txt_nota2;
  private javax.swing.JTextPane txt_nota3;
  private javax.swing.JTextPane txt_nota4;
  private javax.swing.JTextPane txt_nota5;
  private javax.swing.JTextPane txt_nota6;
  // End of variables declaration//GEN-END:variables
}
