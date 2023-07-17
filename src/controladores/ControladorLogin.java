package controladores;

import modelos.Login;
import vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener {

  private final Login_JFrame loginVista;
  private final Login gestorLogin;

  public ControladorLogin(Login_JFrame loginVista) {
    this.loginVista = loginVista;
    gestorLogin = new Login();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String identificacion = loginVista.txt_id.getText();
    String contrasena = loginVista.pass_contrasena.getText();
    int verificacion = gestorLogin.Loguear(identificacion, contrasena);
    switch (verificacion) {
      case 1 -> {
        MenuEmpl_JFrame menuEmpl = MenuEmpl_JFrame.getMenu();
        menuEmpl.show();
        loginVista.dispose();
      }
      case 2 -> {
        MenuGer_JFrame menuGer = MenuGer_JFrame.getMenu();
        menuGer.show();
        loginVista.dispose();
      }
      case 3 -> {
        MenuAdmin_JFrame menuAdmin = MenuAdmin_JFrame.getMenu();
        menuAdmin.show();
        loginVista.dispose();
      }
      default -> JOptionPane.showMessageDialog(loginVista, "Datos incorrectos");
    }
  }
}
