package vistas;

import java.awt.Image;
import modelos.Login;
import java.awt.Toolkit;
import recursos.MetodosGenerales;
import javax.swing.JOptionPane;

public class ConfigDatosGer_JFrame extends javax.swing.JFrame {

  public ConfigDatosGer_JFrame() {
    initComponents();
    this.setLocationRelativeTo(null);
    txt_id.setText(Login.getIdentificacion());
    txt_nombre.setText(Login.getNombre());
    txt_apellidos.setText(Login.getApellidos());
    txt_correo.setText(Login.getCorreo());
    txt_numero.setText(Login.getNumero());
    txt_fech.setText(Login.getFechNac());
  }

  @Override
  public Image getIconImage() {
    return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.jpg"));
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    btn_exit = new javax.swing.JButton();
    btn_volver = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txt_id = new javax.swing.JTextField();
    txt_apellidos = new javax.swing.JTextField();
    txt_numero = new javax.swing.JTextField();
    txt_correo = new javax.swing.JTextField();
    txt_fech = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    txt_nombre = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Menú");
    setIconImage(getIconImage());
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(0, 220, 62));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setBackground(new java.awt.Color(255, 153, 0));
    jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("<html>Modificar datos<hr/></html>");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 66, -1, -1));

    btn_exit.setBackground(new java.awt.Color(0, 220, 62));
    btn_exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    btn_exit.setForeground(new java.awt.Color(255, 255, 255));
    btn_exit.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
    btn_exit.setToolTipText("Cerrar sesión");
    btn_exit.setBorder(null);
    btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn_exit.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_exitActionPerformed(evt);
          }
        });
    jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, 16, -1, -1));

    btn_volver.setBackground(new java.awt.Color(255, 116, 1));
    btn_volver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    btn_volver.setForeground(new java.awt.Color(255, 255, 255));
    btn_volver.setText("Volver");
    btn_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn_volver.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_volverActionPerformed(evt);
          }
        });
    jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));

    jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Número de identificación:");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 145, 250, 25));

    jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Correo electrónico:");
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 250, 25));

    jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Número celular:");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 250, 25));

    jButton1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jButton1.setText("Cambiar contraseña");
    jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton1.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
          }
        });
    jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 300, 25));

    jButton2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jButton2.setText("Guardar cambios");
    jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton2.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
          }
        });
    jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 300, 25));

    jLabel5.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/imagenes/Loguito.jpg"))); // NOI18N
    jLabel5.setText("jLabel5");
    jLabel5.setBorder(
        javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 200, -1));

    jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Nombre:");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 216, 250, 25));

    jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Fecha de nacimiento:");
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 250, 25));
    jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 173, 300, 25));
    jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 300, 25));
    jPanel1.add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 300, 25));
    jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 300, 25));
    jPanel1.add(txt_fech, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 300, 25));

    jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("Apellidos:");
    jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 250, 25));
    jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 247, 300, 25));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(
                jPanel1,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE));
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

  private void btn_exitActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btn_exitActionPerformed
    // TODO add your handling code here:
    Inicio_JFrame inicio = new Inicio_JFrame();
    inicio.setVisible(true);
    this.dispose();
  } // GEN-LAST:event_btn_exitActionPerformed

  private void btn_volverActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btn_volverActionPerformed
    // TODO add your handling code here:
    ConfigGeren_JFrame config = new ConfigGeren_JFrame();
    config.setVisible(true);
    this.dispose();
  } // GEN-LAST:event_btn_volverActionPerformed

  private void jButton1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    ConfigContra_JFrame cambio = new ConfigContra_JFrame();
    cambio.setVisible(true);
    this.dispose();
  } // GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    if (MetodosGenerales.validarId(txt_id.getText())) {
      if (MetodosGenerales.validarEmail(txt_correo.getText())) {
        Login.ModificarGeren(
            txt_id.getText(),
            txt_nombre.getText(),
            txt_apellidos.getText(),
            txt_numero.getText(),
            txt_correo.getText(),
            txt_fech.getText());
      } else {
        JOptionPane.showMessageDialog(null, "Ingrese un correo válido");
      }
    } else {
      JOptionPane.showMessageDialog(null, "Ingrese un ID válido");
    }
  } // GEN-LAST:event_jButton2ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_exit;
  private javax.swing.JButton btn_volver;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txt_apellidos;
  private javax.swing.JTextField txt_correo;
  private javax.swing.JTextField txt_fech;
  private javax.swing.JTextField txt_id;
  private javax.swing.JTextField txt_nombre;
  private javax.swing.JTextField txt_numero;
  // End of variables declaration//GEN-END:variables
}