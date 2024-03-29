package views;

import java.awt.Image;
import java.awt.Toolkit;
import resources.Colors;
import resources.GeneralMethods;
import static resources.GeneralMethods.openFrame;

public class AgregarObs_JFrame extends javax.swing.JFrame {

    public AgregarObs_JFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        if (GeneralMethods.getRole() == 'G') {
            combox_registros.addItem("Registro de manufacturas");
            combox_registros.addItem("Registro de empleados");
        } else if (GeneralMethods.getRole() == 'A') {
            combox_registros.addItem("Registro de manufacturas");
            combox_registros.addItem("Registro de gerentes");
            combox_registros.addItem("Registro de empleados");
            combox_registros.addItem("Registro de areas");
        }
    }

    @Override
    public Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Logox800.png"));
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
        jButton_Volver = new javax.swing.JButton();
        combox_registros = new javax.swing.JComboBox<>();
        jButton_Consultar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        combox_producto = new javax.swing.JComboBox<>();
        chooser_fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observacion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btn_clean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar registro");
        setIconImage(getIconImage());
        setName("Agregar_JFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(Colors.FONDO);
        jPanel1.setPreferredSize(new java.awt.Dimension(518, 609));

        jButton_Volver.setBackground(Colors.FONDOBOTONES);
        jButton_Volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Volver.setForeground(Colors.LETRABOTONES);
        jButton_Volver.setText("Menú");
        jButton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Volver.setPreferredSize(new java.awt.Dimension(32, 30));
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });

        combox_registros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Registro de clientes", "Registro de ventas", "Registro de productos" }));
        combox_registros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combox_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_registrosActionPerformed(evt);
            }
        });

        jButton_Consultar.setBackground(Colors.FONDOBOTONES);
        jButton_Consultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Consultar.setForeground(Colors.LETRABOTONES);
        jButton_Consultar.setText("Consultar registros");
        jButton_Consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel11.setForeground(Colors.LETRAFONDO);
        jLabel11.setText("Registro de Observaciones");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(Colors.LETRABOTONES);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Fecha de observación:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(190, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(Colors.LETRABOTONES);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID producto:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 20));

        btn_guardar.setBackground(Colors.FONDOBOTONES);
        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_guardar.setForeground(Colors.LETRABOTONES);
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        combox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_observacion.setColumns(20);
        txt_observacion.setRows(5);
        jScrollPane1.setViewportView(txt_observacion);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(Colors.LETRABOTONES);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Observación:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(190, 20));

        btn_clean.setText("Clean");
        btn_clean.setBackground(Colors.FONDOBOTONES);
        btn_clean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clean.setForeground(Colors.LETRABOTONES);
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combox_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton_Volver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Consultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_clean)))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combox_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(combox_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combox_producto)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        txt_observacion.setText("");
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void jButton_VolverActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton_VolverActionPerformed
        // TODO add your handling code here:
        Menu_JFrame.getMenu().setVisible(true);
        this.dispose();
    } // GEN-LAST:event_jButton_VolverActionPerformed

    private void combox_registrosActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_combox_registrosActionPerformed
        // TODO add your handling code here:
        String seleccionado = combox_registros.getSelectedItem().toString();
        switch (seleccionado) {
            case "Registro de empleados" -> {
                openFrame(new AgregarEmpl_JFrame());
                this.dispose();
            }
            case "Registro de gerentes" -> {
                openFrame(new AgregarGeren_JFrame());
                this.dispose();
            }
            case "Registro de clientes" -> {
                openFrame(new AgregarCliente_JFrame());
                this.dispose();
            }
            case "Registro de productos" -> {
                openFrame(new AgregarPro_JFrame());
                this.dispose();
            }
            case "Registro de observaciones" -> {
                openFrame(new AgregarObs_JFrame());
                this.dispose();
            }
            case "Registro de ventas" -> {
                openFrame(new AgregarVenta_JFrame());
                this.dispose();
            }
            case "Registro de manufacturas" -> {
                openFrame(new AgregarManu_JFrame());
                this.dispose();
            }
        }
    }

    private void jButton_ConsultarActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton_ConsultarActionPerformed
        // TODO add your handling code here:
        GeneralMethods.openQueryFrame(1);
        this.dispose();
    } // GEN-LAST:event_jButton_ConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clean;
    public javax.swing.JButton btn_guardar;
    public com.toedter.calendar.JDateChooser chooser_fecha;
    public javax.swing.JComboBox<String> combox_producto;
    private javax.swing.JComboBox<String> combox_registros;
    private javax.swing.JButton jButton_Consultar;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea txt_observacion;
    // End of variables declaration//GEN-END:variables
}
