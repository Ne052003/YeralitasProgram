package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;
import java.util.Optional;
import javax.swing.JOptionPane;
import models.GestorSesion;
import models.Sesion;
import views.Login_JFrame;
import views.Menu_JFrame;

public class ControladorSesion implements ActionListener {

    private final Login_JFrame loginVista;
    private final GestorSesion gestorSesion;

    public ControladorSesion(Login_JFrame loginVista) {
        this.loginVista = loginVista;
        gestorSesion = new GestorSesion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String identificacion = loginVista.txt_id.getText();
        String contrasena = loginVista.pass_contrasena.getText();
        Optional<Sesion> optSesion = gestorSesion.iniciarSesion(identificacion, contrasena);
        if (optSesion.isPresent()) {
            try {
                Menu_JFrame.getMenu().setVisible(true);
                loginVista.dispose();
                System.gc();
            } catch (NoSuchElementException ex) {
                JOptionPane.showMessageDialog(loginVista, "Datos incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(loginVista, "Datos incorrectos");
        }

    }
}
