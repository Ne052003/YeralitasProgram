package views;

import controllers.ControladorGerente;
import java.awt.Image;
import java.awt.Toolkit;
import resources.Colors;
import resources.GeneralMethods;
import static resources.GeneralMethods.openFrame;

public class AgregarGeren_JFrame extends javax.swing.JFrame {

    public AgregarGeren_JFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        ControladorGerente gerenControl = new ControladorGerente(this);
        btn_guardar.addActionListener(gerenControl);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        chooser_nac = new com.toedter.calendar.JDateChooser();
        txt_identificacion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        combox_registros = new javax.swing.JComboBox<>();
        jButton_Consultar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(Colors.LETRABOTONES);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Número Celular:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(190, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(Colors.LETRABOTONES);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Apellidos:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(190, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(Colors.LETRABOTONES);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Correo electrónico:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setPreferredSize(new java.awt.Dimension(190, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(Colors.LETRABOTONES);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 20));

        txt_correo.setPreferredSize(new java.awt.Dimension(175, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(Colors.LETRABOTONES);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Identificación:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(190, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(Colors.LETRABOTONES);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Fecha de nacimiento:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setPreferredSize(new java.awt.Dimension(190, 20));

        btn_guardar.setBackground(Colors.FONDOBOTONES);
        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_guardar.setForeground(Colors.LETRABOTONES);
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_identificacion.setPreferredSize(new java.awt.Dimension(175, 20));

        txt_nombre.setPreferredSize(new java.awt.Dimension(175, 20));

        txt_apellidos.setPreferredSize(new java.awt.Dimension(175, 20));

        txt_celular.setPreferredSize(new java.awt.Dimension(175, 20));

        combox_registros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Registro de empleados", "Registro de clientes", "Registro de ventas", "Registro de productos", "Registro de observaciones", "Registro de manufacturas", "Registro de areas" }));
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
        jButton_Consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel10.setForeground(Colors.LETRABOTONES);
        jLabel10.setText("Registro de Gerentes");

        btn_clean.setText("Clean");
        btn_clean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clean.setBackground(Colors.FONDOBOTONES);
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(combox_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_clean)
                            .addComponent(chooser_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(combox_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooser_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clean))
                .addGap(106, 106, 106)
                .addComponent(jButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void jButton_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarActionPerformed
        GeneralMethods.openQueryFrame(1);
        this.dispose();
    }//GEN-LAST:event_jButton_ConsultarActionPerformed

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        txt_nombre.setText("");
        txt_celular.setText("");
        txt_apellidos.setText("");
        txt_identificacion.setText("");
        txt_correo.setText("");
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void jButton_VolverActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton_VolverActionPerformed
        // TODO add your handling code here:
        Menu_JFrame.getMenu().setVisible(true);
        this.dispose();
    }

    private void combox_registrosActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_combox_registrosActionPerformed
        String seleccionado = combox_registros.getSelectedItem().toString();
        switch (seleccionado) {
            case "Registro de empleados" -> {
                openFrame(new AgregarEmpl_JFrame());
                this.dispose();
            }
            case "Registro de areas" -> {
                openFrame(new AgregarGeren_JFrame());
                this.dispose();
            }
            case "Registro de clientes" -> {
                openFrame(new AgregarArea_JFrame());
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_clean2;
    public javax.swing.JButton btn_guardar;
    public com.toedter.calendar.JDateChooser chooser_nac;
    private javax.swing.JComboBox<String> combox_registros;
    private javax.swing.JButton jButton_Consultar;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_apellidos;
    public javax.swing.JTextField txt_celular;
    public javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_identificacion;
    public javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}