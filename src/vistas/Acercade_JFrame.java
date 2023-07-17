package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Objects;

public class Acercade_JFrame extends javax.swing.JFrame {

  public Acercade_JFrame() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  @Override
  public Image getIconImage() {
    return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.jpg"));
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Acerca de Yeralitas");
    setIconImage(getIconImage());
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(0, 220, 62));
    jPanel1.setPreferredSize(new java.awt.Dimension(992, 609));

    jButton1.setBackground(new java.awt.Color(255, 116, 1));
    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Volver");
    jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton1.addActionListener(this::jButton1ActionPerformed);

    jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Acerca de Yeralitas");

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText(
        "<html>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</html>");

    jLabel8.setIcon(
        new javax.swing.ImageIcon(
            Objects.requireNonNull(getClass().getResource("/imagenes/Loguito.jpg")))); // NOI18N
    jLabel8.setText("jLabel8");
    jLabel8.setBorder(
        javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Facebook ");
    jLabel3.setToolTipText("https://facebook.com/Yeralitas");

    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Instagram ");
    jLabel4.setToolTipText("https://www.instagram.com/yeralitas/");

    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("WhatsApp ");
    jLabel5.setToolTipText("354629854");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jButton1))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addComponent(
                                                        jLabel2,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        579,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(48, 48, 48)
                                                    .addComponent(
                                                        jLabel8,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))))
                    .addContainerGap(74, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGap(144, 144, 144)
                                    .addComponent(
                                        jLabel8,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(12, 12, 12)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addGap(30, 30, 30)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(
                jPanel1,
                javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(
                jPanel1,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton1ActionPerformed
    Inicio_JFrame inicio = new Inicio_JFrame();
    inicio.setVisible(true);
    this.dispose();
  } // GEN-LAST:event_jButton1ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  // End of variables declaration//GEN-END:variables
}
