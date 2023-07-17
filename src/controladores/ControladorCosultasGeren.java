package controladores;

import modelos.*;
import vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorCosultasGeren implements ActionListener {

  private final ConsultasGeren_JFrame consultaGerenVista;

  public ControladorCosultasGeren(ConsultasGeren_JFrame consultaGerenVista) {
    this.consultaGerenVista = consultaGerenVista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    DefaultTableModel tmodelo;

    String dato = consultaGerenVista.txt_dato.getText();
    int atributo = 0;

    switch (consultaGerenVista.combox_filtro.getSelectedItem().toString()) {
      case "Identificación" -> atributo = 1;

      case "Nombre" -> atributo = 2;

      case "Número Celular" -> atributo = 3;
    }

    LinkedList<Gerente> gerentes = Gestor_Gerente.Consultar_Gerente(atributo, dato);

    String[] registro = new String[6];
    String[] titulos = {
      "Identificación",
      "Nombres",
      "Apellidos",
      "Número celular",
      "Correo electrónico",
      "Fecha de nacimiento"
    };

    tmodelo = new DefaultTableModel();
    tmodelo.setColumnIdentifiers(titulos);

    for (Gerente geren : gerentes) {
      registro[0] = geren.getId_geren();
      registro[1] = geren.getNom_geren();
      registro[2] = geren.getApe_geren();
      registro[3] = geren.getNum_geren();
      registro[4] = geren.getCorreo();
      registro[5] = geren.getFech_nac_geren();
      tmodelo.addRow(registro);
    }
    consultaGerenVista.table_geren.setModel(tmodelo);
  }
}
