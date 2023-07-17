package vistas;

import controladores.ControladorCliente;
import modelos.Login;
import java.awt.Image;
import java.awt.Toolkit;
import recursos.MetodosGenerales;
import static recursos.MetodosGenerales.abrirVentana;

public class AgregarCliente_JFrame extends javax.swing.JFrame {

  private final ControladorCliente controladorCliente_;

  public AgregarCliente_JFrame() {
    initComponents();
    this.setLocationRelativeTo(null);
    if (Login.getRol().equals("gerente")) {
      combox_registro.addItem("Registro de manufacturas");
      combox_registro.addItem("Registro de empleados");
    } else if (Login.getRol().equals("administrador")) {
      combox_registro.addItem("Registro de manufacturas");
      combox_registro.addItem("Registro de gerentes");
      combox_registro.addItem("Registro de empleados");
      combox_registro.addItem("Registro de areas");
    }
    controladorCliente_ = new ControladorCliente(this);
    btn_guardar.addActionListener(controladorCliente_);
  }

  @Override
  public Image getIconImage() {
    return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.jpg"));
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel10 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jButton_Volver = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    btn_guardar = new javax.swing.JButton();
    txt_nombre = new javax.swing.JTextField();
    txt_celular = new javax.swing.JTextField();
    txt_direccion = new javax.swing.JTextField();
    combox_registro = new javax.swing.JComboBox<>();
    jButton_Eliminar = new javax.swing.JButton();
    jButton_Modificar = new javax.swing.JButton();
    jButton_Consultar = new javax.swing.JButton();
    jLabel11 = new javax.swing.JLabel();

    jLabel10.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
    jLabel10.setText("Registro de Empleados");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Registro de clientes");
    setIconImage(getIconImage());
    setName("AgregarCliente_JFrame"); // NOI18N
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(0, 220, 62));

    jButton_Volver.setBackground(new java.awt.Color(255, 116, 1));
    jButton_Volver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jButton_Volver.setForeground(new java.awt.Color(255, 255, 255));
    jButton_Volver.setText("Menú");
    jButton_Volver.setBorder(null);
    jButton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton_Volver.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_VolverActionPerformed(evt);
          }
        });

    jPanel2.setBackground(new java.awt.Color(255, 116, 1));
    jPanel2.setBorder(
        javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel5.setText("Dirección:");
    jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel5.setPreferredSize(new java.awt.Dimension(190, 20));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel3.setText("Número celular:");
    jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel3.setPreferredSize(new java.awt.Dimension(190, 20));

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel2.setText("Nombre:");
    jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel2.setPreferredSize(new java.awt.Dimension(190, 20));

    btn_guardar.setBackground(new java.awt.Color(0, 220, 62));
    btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
    btn_guardar.setText("Guardar");
    btn_guardar.setBorder(null);
    btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn_guardar.setName(""); // NOI18N
    btn_guardar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_guardarActionPerformed(evt);
          }
        });

    txt_nombre.setPreferredSize(new java.awt.Dimension(175, 20));
    txt_nombre.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_nombreActionPerformed(evt);
          }
        });

    txt_celular.setPreferredSize(new java.awt.Dimension(175, 20));

    txt_direccion.setPreferredSize(new java.awt.Dimension(175, 20));
    txt_direccion.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_direccionActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel2Layout
                    .createSequentialGroup()
                    .addContainerGap(27, Short.MAX_VALUE)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addComponent(
                                        jLabel5,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                        txt_direccion,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        175,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addComponent(
                                        jLabel3,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                        txt_celular,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        175,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addComponent(
                                        jLabel2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                        txt_nombre,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        175,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(
                                btn_guardar,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE))
                    .addGap(24, 24, 24)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                jLabel2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txt_nombre,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                25,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                jLabel3,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txt_celular,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                25,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                jLabel5,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txt_direccion,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                25,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(48, 48, 48)
                    .addComponent(
                        btn_guardar,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        31,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(229, Short.MAX_VALUE)));

    combox_registro.setModel(
        new javax.swing.DefaultComboBoxModel<>(
            new String[] {
              "--Seleccione--",
              "Registro de ventas",
              "Registro de productos",
              "Registro de observaciones"
            }));
    combox_registro.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            combox_registroActionPerformed(evt);
          }
        });

    jButton_Eliminar.setBackground(new java.awt.Color(255, 116, 1));
    jButton_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
    jButton_Eliminar.setText("Eliminar registros");
    jButton_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_Eliminar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_EliminarActionPerformed(evt);
          }
        });

    jButton_Modificar.setBackground(new java.awt.Color(255, 116, 1));
    jButton_Modificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton_Modificar.setForeground(new java.awt.Color(255, 255, 255));
    jButton_Modificar.setText("Modificar registros");
    jButton_Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_Modificar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_ModificarActionPerformed(evt);
          }
        });

    jButton_Consultar.setBackground(new java.awt.Color(255, 116, 1));
    jButton_Consultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton_Consultar.setForeground(new java.awt.Color(255, 255, 255));
    jButton_Consultar.setText("Consultar registros");
    jButton_Consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_Consultar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_ConsultarActionPerformed(evt);
          }
        });

    jLabel11.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
    jLabel11.setText("Registro de Clientes");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(
                        jPanel2,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(
                                jButton_Modificar,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                180,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jButton_Eliminar,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                180,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jButton_Consultar,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                180,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(124, 124, 124))
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(
                        jButton_Volver,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        72,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(120, 120, 120)
                    .addComponent(
                        combox_registro,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)));
    jPanel1Layout.setVerticalGroup(
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
                                    .addGap(16, 16, 16)
                                    .addComponent(
                                        jButton_Volver,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(
                                        combox_registro,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel11)))
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        37,
                                        Short.MAX_VALUE)
                                    .addComponent(
                                        jPanel2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGap(206, 206, 206)
                                    .addComponent(
                                        jButton_Consultar,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(
                                        jButton_Modificar,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(
                                        jButton_Eliminar,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));

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

  private void jButton_ConsultarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton_ConsultarActionPerformed
    // TODO add your handling code here:
    ConsultasCli_JFrame cliente = new ConsultasCli_JFrame();
    cliente.setVisible(true);
    this.dispose();
  } // GEN-LAST:event_jButton_ConsultarActionPerformed

  private void jButton_ModificarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton_ModificarActionPerformed
    // TODO add your handling code here:
    ModificarCli_JFrame modificar = new ModificarCli_JFrame();
    modificar.setVisible(true);
    this.dispose();
  } // GEN-LAST:event_jButton_ModificarActionPerformed

  private void jButton_EliminarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton_EliminarActionPerformed

    Eliminar_JFrame eliminar = new Eliminar_JFrame();
    eliminar.setVisible(true);
    this.dispose();
  } // GEN-LAST:event_jButton_EliminarActionPerformed

  private void combox_registroActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_combox_registroActionPerformed
    // TODO add your handling code here:
    String seleccionado = combox_registro.getSelectedItem().toString();
    switch (seleccionado) {
      case "Registro de empleados":
        abrirVentana(new AgregarEmpl_JFrame());
        this.dispose();
        break;
      case "Registro de gerentes":
        abrirVentana(new AgregarGeren_JFrame());
        this.dispose();
        break;
      case "Registro de areas":
        abrirVentana(new AgregarArea_JFrame());
        this.dispose();
        break;
      case "Registro de productos":
        abrirVentana(new AgregarPro_JFrame());
        this.dispose();
        break;
      case "Registro de observaciones":
        abrirVentana(new AgregarObs_JFrame());
        this.dispose();
        break;
      case "Registro de ventas":
        abrirVentana(new AgregarVenta_JFrame());
        this.dispose();
        break;
      case "Registro de manufacturas":
        abrirVentana(new AgregarManu_JFrame());
        this.dispose();
        break;
    }
  } // GEN-LAST:event_combox_registroActionPerformed

  private void txt_direccionActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txt_direccionActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_direccionActionPerformed

  private void txt_nombreActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txt_nombreActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_nombreActionPerformed

  private void jButton_VolverActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton_VolverActionPerformed
    // TODO add your handling code here:
    MetodosGenerales.RolMenu();
    this.dispose();
  } // GEN-LAST:event_jButton_VolverActionPerformed

  private void btn_guardarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btn_guardarActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_btn_guardarActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btn_guardar;

  private javax.swing.JComboBox<String> combox_registro;
  private javax.swing.JButton jButton_Consultar;
  private javax.swing.JButton jButton_Eliminar;
  private javax.swing.JButton jButton_Modificar;
  private javax.swing.JButton jButton_Volver;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  public javax.swing.JTextField txt_celular;
  public javax.swing.JTextField txt_direccion;
  public javax.swing.JTextField txt_nombre;
  // End of variables declaration//GEN-END:variables
}
