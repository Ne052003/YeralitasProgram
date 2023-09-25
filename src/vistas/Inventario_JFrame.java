package vistas;

import modelos.Login;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

import controladores.ControladorConsultasProdu;
import recursos.MetodosGenerales;
import static recursos.MetodosGenerales.abrirVentana;

public class Inventario_JFrame extends javax.swing.JFrame {

  private final DefaultTableModel tabla;

  public Inventario_JFrame() {
    initComponents();
    this.setLocationRelativeTo(null);
    if (Login.getRol().equals("gerente")) {
      combox_consulta.addItem("Consultas - Empleados");
      combox_consulta.addItem("Consultas - Manufacturas");
    } else if (Login.getRol().equals("administrador")) {
      combox_consulta.addItem("Consultas - Gerentes");
      combox_consulta.addItem("Consultas - Empleados");
      combox_consulta.addItem("Consultas - Areas");
      combox_consulta.addItem("Consultas - Manufacturas");
    }
    ControladorConsultasProdu consultaProdu = new ControladorConsultasProdu(this);
    String[] titulos = {
      "ID Gerente",
      "ID",
      "Nombre",
      "Precio",
      "Unidad de medida",
      "Fecha de ingreso",
      "Fecha de vencimiento"
    };
    tabla = new DefaultTableModel(null, titulos);
    table_inventario.setModel(tabla);
    btn_buscar.addActionListener(consultaProdu);
  }

  public DefaultTableModel getTableModelo() {
    return tabla;
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

    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    table_inventario = new javax.swing.JTable();
    combox_filtro = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    dato_txt = new javax.swing.JTextField();
    btn_buscar = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    combox_consulta = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Inventario");
    setIconImage(getIconImage());
    setName("Inventario_JFrame"); // NOI18N
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(0, 220, 62));

    jLabel2.setBackground(new java.awt.Color(255, 153, 0));
    jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("<html>Inventario<hr/></html>");

    jButton1.setBackground(new java.awt.Color(255, 116, 1));
    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Menú");
    jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton1.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
          }
        });

    table_inventario =
        new javax.swing.JTable() {
          public boolean isCellEditable(int row, int column) {
            return false;
          }
        };
    table_inventario.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {"1", "Alas", "1038336539", "65000", "kg", "15/07/2022", "25/08/2022", null},
              {"2", "Gaseosa", "1038336539", "8000", "L", "15/07/2022", "14/02/2023", null},
              {"3", "Finas hierbas", "1038336539", "700", "gr", "15/07/2022", "21/11/2022", null},
              {"4", "Salsa BBQ", "1038336539", "21000", "gr", "15/07/2022", "04/12/2022", null},
              {"235", "Papa", "1038336539", "30000", "kg", "15/07/2022", "5/08/2022", null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null}
            },
            new String[] {
              "ID",
              "Nombre",
              "ID Gerente",
              "Precio",
              "Unidad de medida",
              "Fecha de ingreso",
              "Fecha de vencimiento",
              "Observaciones"
            }) {
          boolean[] canEdit =
              new boolean[] {false, false, false, false, false, false, false, false};

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    table_inventario.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(table_inventario);

    combox_filtro.setModel(
        new javax.swing.DefaultComboBoxModel<>(
            new String[] {"ID", "Nombre", "Precio", "Fecha de ingreso"}));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Filtrar por:");

    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Dato:");

    btn_buscar.setBackground(new java.awt.Color(255, 116, 1));
    btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
    btn_buscar.setText("Buscar");
    btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    jButton3.setBackground(new java.awt.Color(255, 116, 1));
    jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton3.setForeground(new java.awt.Color(255, 255, 255));
    jButton3.setText("Agregar nuevo registro");
    jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton3.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
          }
        });

    jButton4.setBackground(new java.awt.Color(255, 116, 1));
    jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton4.setForeground(new java.awt.Color(255, 255, 255));
    jButton4.setText("Eliminar registros");
    jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton4.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
          }
        });

    jButton5.setBackground(new java.awt.Color(255, 116, 1));
    jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton5.setForeground(new java.awt.Color(255, 255, 255));
    jButton5.setText("Modificar registros");
    jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton5.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
          }
        });

    combox_consulta.setModel(
        new javax.swing.DefaultComboBoxModel<>(
            new String[] {"--Seleccione--", "Consultas - Clientes", "Consultas - Ventas"}));
    combox_consulta.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            combox_consultaActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jButton1)
                    .addGap(27, 27, 27)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                jLabel3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jLabel4,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_buscar))
                                    .addGap(78, 78, 78)
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                combox_filtro,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                130,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                dato_txt,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                130,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(
                                jLabel2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                259,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addComponent(
                                        combox_consulta,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(
                                                jButton5,
                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                            .addComponent(
                                                jButton3,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                200,
                                                Short.MAX_VALUE)
                                            .addComponent(
                                                jButton4,
                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                    .addGap(60, 60, 60))))
            .addComponent(jScrollPane1));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addComponent(
                                        jLabel2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(
                                                combox_filtro,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(
                                                dato_txt,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_buscar)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGap(16, 88, Short.MAX_VALUE)
                                    .addComponent(
                                        jButton3,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(
                                        jButton4,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(
                                        jButton5,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)))
                    .addComponent(
                        jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        349,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(
                                combox_consulta,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

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

  private void jButton1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    MetodosGenerales.RolMenu();
    this.dispose();
  } // GEN-LAST:event_jButton1ActionPerformed

  private void jButton3ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    abrirVentana(new AgregarPro_JFrame());
    this.dispose();
  } // GEN-LAST:event_jButton3ActionPerformed

  private void jButton4ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:
    abrirVentana(new Eliminar_JFrame());
    this.dispose();
  } // GEN-LAST:event_jButton4ActionPerformed

  private void jButton5ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton5ActionPerformed
    // TODO add your handling code here:
    ModificarPro_JFrame produ = new ModificarPro_JFrame();
    produ.setVisible(true);
    this.dispose();
  } // GEN-LAST:event_jButton5ActionPerformed

  private void combox_consultaActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_combox_consultaActionPerformed

    String seleccionado = combox_consulta.getSelectedItem().toString();
    switch (seleccionado) {
      case "Consultas - Clientes" -> {
        abrirVentana(new ConsultasCli_JFrame());
        this.dispose();
      }
      case "Consultas - Gerentes" -> {
        abrirVentana(new ConsultasGeren_JFrame());
        this.dispose();
      }
      case "Consultas - Empleados" -> {
        abrirVentana(new ConsultasEmpl_JFrame());
        this.dispose();
      }
      case "Consultas - Ventas" -> {
        abrirVentana(new ConsultasVen_JFrame());
        this.dispose();
      }
      case "Consultas - Areas" -> {
        abrirVentana(new AgregarArea_JFrame());
        this.dispose();
      }
      case "Consultas - Manufacturas" -> {
        abrirVentana(new ConsultasManu_JFrame());
        this.dispose();
      }
    }
  } // GEN-LAST:event_combox_consultaActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btn_buscar;
  private javax.swing.JComboBox<String> combox_consulta;
  public javax.swing.JComboBox<String> combox_filtro;
  public javax.swing.JTextField dato_txt;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  public javax.swing.JTable table_inventario;
  // End of variables declaration//GEN-END:variables
}