package recursos;

import modelos.Login;
import vistas.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MetodosGenerales {

  private MetodosGenerales() {}

  public static boolean validarContraseña(String contra) {
    final int MIN = 8;
    final int MIN_Uppercase = 1;
    final int MIN_Lowercase = 1;
    final int Special = 1;
    final int NUM_Digits = 1;

    int uppercaseCounter = 0;
    int lowercaseCounter = 0;
    int digitCounter = 0;
    int specialCounter = 0;

    for (int i = 0; i < contra.length(); i++) {
      char c = contra.charAt(i);
      if (Character.isUpperCase(c)) {
        uppercaseCounter++;
      } else if (Character.isLowerCase(c)) {
        lowercaseCounter++;
      } else if (Character.isDigit(c)) {
        digitCounter++;
      }
      if (c >= 33 && c <= 47 || c == 64) {
        specialCounter++;
      }
    }
    return contra.length() >= MIN
        && uppercaseCounter >= MIN_Uppercase
        && lowercaseCounter >= MIN_Lowercase
        && digitCounter >= NUM_Digits
        && specialCounter >= Special;
  }

  public static boolean validarId(String id) {
    int num = 0;
    boolean verificacion = false;
    for (int i = 0; i < id.length(); i++) {
      char l = id.charAt(i);
      if (Character.isAlphabetic(l)) {
        num++;
      }
    }

    if (num == 0) {
      verificacion = true;
    }
    return verificacion;
  }

  public static boolean validarEmail(String correo) {
    Pattern pattern =
        Pattern.compile(
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    Matcher matcher = pattern.matcher(correo);
    return matcher.find();
  }

  public static void abrirVentana(JFrame ventana) {
    ventana.setVisible(true);
  }

  public static void RolMenu() {
    String rol = Login.getRol();

    switch (rol) {
      case "usuarios" -> {
        MenuEmpl_JFrame menu = MenuEmpl_JFrame.getMenu();
        menu.show();
      }
      case "gerente" -> {
        MenuGer_JFrame menu1 = MenuGer_JFrame.getMenu();
        menu1.show();
      }
      case "administrador" -> {
        MenuAdmin_JFrame menu2 = MenuAdmin_JFrame.getMenu();
        menu2.show();
      }
      default -> JOptionPane.showMessageDialog(null, "No hay rol definido");
    }
  }

  public static void RolConfig() {
    String rol = Login.getRol();

    switch (rol) {
      case "usuarios" -> {
        ConfigUser_JFrame menu = new ConfigUser_JFrame();
        menu.show();
      }
      case "gerente" -> {
        ConfigGeren_JFrame menu1 = new ConfigGeren_JFrame();
        menu1.show();
      }
      case "administrador" -> {
        ConfigAdmin_JFrame menu2 = new ConfigAdmin_JFrame();
        menu2.show();
      }
      default -> JOptionPane.showMessageDialog(null, "No hay rol definido");
    }
  }
}
