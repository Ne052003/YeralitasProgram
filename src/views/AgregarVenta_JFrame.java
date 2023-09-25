package views;

import java.awt.Image;
import java.awt.Toolkit;
import resources.Colors;

import controllers.ControladorVenta;
import resources.GeneralMethods;
import static resources.GeneralMethods.openFrame;

public class AgregarVenta_JFrame extends javax.swing.JFrame {

    public AgregarVenta_JFrame() {
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
        ControladorVenta ventaControl = new ControladorVenta(this);
        btn_guardar.addActionListener(ventaControl);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        txt_manufacturas = new javax.swing.JTextField();
        combox_manufac = new javax.swing.JComboBox<>();
        chooser_venta = new com.toedter.calendar.JDateChooser();
        txt_precio = new javax.swing.JTextField();
        txt_idcli = new javax.swing.JTextField();
        txt_IdEmpl = new javax.swing.JTextField();
        combox_registros = new javax.swing.JComboBox<>();
        jButton_Consultar = new javax.swing.JButton();
        lbl_header = new javax.swing.JLabel();
        btn_calculadora = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar registro");
        setIconImage(getIconImage());
        setName("Agregar_JFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(Colors.FONDO);
        jPanel1.setPreferredSize(new java.awt.Dimension(518, 609));

        jButton_Volver.setBackground(Colors.FONDOBOTONES);
        jButton_Volver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Volver.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Volver.setText("Menú");
        jButton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Volver.setPreferredSize(new java.awt.Dimension(32, 30));
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Precio de venta:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Fecha de venta:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("# manufactura:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID manufactura:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ID cliente:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ID empleado:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 20));

        btn_guardar.setBackground(Colors.FONDOBOTONES);
        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_manufacturas.setPreferredSize(new java.awt.Dimension(175, 20));

        combox_manufac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        combox_manufac.setPreferredSize(new java.awt.Dimension(175, 20));

        chooser_venta.setPreferredSize(new java.awt.Dimension(175, 20));

        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });

        txt_idcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idcliActionPerformed(evt);
            }
        });

        txt_IdEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdEmplActionPerformed(evt);
            }
        });

        combox_registros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Registro de clientes", "Registro de productos", "Registro de observaciones" }));
        combox_registros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combox_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_registrosActionPerformed(evt);
            }
        });

        jButton_Consultar.setBackground(Colors.FONDOBOTONES);
        jButton_Consultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Consultar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Consultar.setText("Consultar registros");
        jButton_Consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarActionPerformed(evt);
            }
        });

        lbl_header.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        lbl_header.setForeground(Colors.LETRAFONDO);
        lbl_header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_header.setText("Registro de Ventas");
        lbl_header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_calculadora.setBackground(Colors.FONDOBOTONES);
        btn_calculadora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_calculadora.setForeground(new java.awt.Color(255, 255, 255));
        btn_calculadora.setText("Open calculator");
        btn_calculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calculadora.setPreferredSize(new java.awt.Dimension(397, 26));
        btn_calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculadoraActionPerformed(evt);
            }
        });

        btn_clean.setBackground(Colors.FONDOBOTONES);
        btn_clean.setText("Clean");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(combox_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_clean)
                        .addGap(35, 35, 35))
                    .addComponent(jButton_Volver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_calculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(222, 222, 222)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_manufacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combox_manufac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_IdEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_idcli)
                                .addComponent(chooser_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton_Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(combox_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_header)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IdEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combox_manufac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_manufacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chooser_venta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clean))
                .addGap(46, 46, 46)
                .addComponent(jButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addComponent(btn_calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        txt_IdEmpl.setText("");
        txt_idcli.setText("");
        txt_manufacturas.setText("");
        txt_precio.setText("");
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
            case "Registro de areas" -> {
                openFrame(new AgregarArea_JFrame());
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
        GeneralMethods.openQueryFrame(2);
        this.dispose();
    } // GEN-LAST:event_jButton_ConsultarActionPerformed

    private void txt_precioActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_txt_precioActionPerformed

    private void btn_calculadoraActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btn_calculadoraActionPerformed
        // TODO add your handling code here:
        Calculadora_JFrame herramienta = Calculadora_JFrame.getCalculadora();
        herramienta.setVisible(true);
    } // GEN-LAST:event_btn_calculadoraActionPerformed

    private void txt_idcliActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txt_idcliActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_txt_idcliActionPerformed

    private void txt_IdEmplActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txt_IdEmplActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_txt_IdEmplActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculadora;
    private javax.swing.JButton btn_clean;
    public javax.swing.JButton btn_guardar;
    public com.toedter.calendar.JDateChooser chooser_venta;
    public javax.swing.JComboBox<String> combox_manufac;
    private javax.swing.JComboBox<String> combox_registros;
    private javax.swing.JButton jButton_Consultar;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_header;
    public javax.swing.JTextField txt_IdEmpl;
    public javax.swing.JTextField txt_idcli;
    public javax.swing.JTextField txt_manufacturas;
    public javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
