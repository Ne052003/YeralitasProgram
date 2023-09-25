package views;

import java.awt.*;

import resources.Colors;
import javax.swing.JOptionPane;
import models.GestorSesion;
import models.GestorUsuario;
import resources.GeneralMethods;
import static resources.GeneralMethods.openFrame;

public class ConfigContra_JFrame extends javax.swing.JFrame {

    private final GestorSesion gestorSesion;

    public ConfigContra_JFrame() {
        initComponents();
        gestorSesion = new GestorSesion();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pass_nueva = new javax.swing.JPasswordField();
        pass_actual = new javax.swing.JPasswordField();
        pass_confirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change of password");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(Colors.FONDO);
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 608));

        jLabel2.setBackground(new java.awt.Color(255, 153, 0));
        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setForeground(Colors.LETRABOTONES);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Change of password<hr/></html>");

        btn_exit.setBackground(Colors.FONDO);
        btn_exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_exit.setForeground(Colors.LETRABOTONES);
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btn_exit.setToolTipText("Log out");
        btn_exit.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        btn_exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_exitKeyPressed(evt);
            }
        });

        btn_volver.setBackground(Colors.FONDOBOTONES);
        btn_volver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_volver.setForeground(Colors.LETRABOTONES);
        btn_volver.setText("Return");
        btn_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        btn_volver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_volverKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(Colors.LETRABOTONES);
        jLabel1.setText("Current password");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(Colors.LETRABOTONES);
        jLabel4.setText("Confirm new password");

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(Colors.LETRABOTONES);
        jLabel6.setText("New password");

        btn_guardar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_guardar.setText("Saves changes");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        btn_guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_guardarKeyPressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Loguitox200.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        pass_nueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_nuevaKeyPressed(evt);
            }
        });

        pass_actual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_actualKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pass_confirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_volver)
                    .addComponent(btn_exit))
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)))
                .addGap(15, 15, 15)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        GestorUsuario gestorUsuario = new GestorUsuario();
        if (GeneralMethods.validatePasswordSintax(pass_nueva.getText())) {
            gestorUsuario.cambiarContraseña(GestorSesion.getSesion(), pass_actual.getText(), pass_nueva.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña con:\nMayúsculas, minículas, números y carácteres especiales");
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void pass_actualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_actualKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10 || evt.getKeyCode() == 9) {
            pass_nueva.requestFocus();
        }
    }//GEN-LAST:event_pass_actualKeyPressed

    private void pass_nuevaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_nuevaKeyPressed

        if (evt.getKeyCode() == 10 || evt.getKeyCode() == 9) {
            pass_confirm.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_pass_nuevaKeyPressed

    private void btn_volverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_volverKeyPressed
        if (evt.getKeyCode() == 10) {
            btn_volver.doClick();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btn_volverKeyPressed

    private void btn_guardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_guardarKeyPressed
        if (evt.getKeyCode() == 10) {
            btn_guardar.doClick();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarKeyPressed

    private void btn_exitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_exitKeyPressed
        if (evt.getKeyCode() == 10) {
            btn_exit.doClick();
        }
    }//GEN-LAST:event_btn_exitKeyPressed

    private void btn_exitActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        openFrame(new Inicio_JFrame());
        gestorSesion.cerrarSesion();
        this.dispose();
    } // GEN-LAST:event_btn_exitActionPerformed

    private void btn_volverActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
        GeneralMethods.openFrame(new ConfigUser_JFrame());
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass_actual;
    private javax.swing.JPasswordField pass_confirm;
    private javax.swing.JPasswordField pass_nueva;
    // End of variables declaration//GEN-END:variables
}