package controladores;

import modelos.*;
import vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorConsultasEmpl implements ActionListener {

  private final ConsultasEmpl_JFrame consultarEmpl;

  public ControladorConsultasEmpl(ConsultasEmpl_JFrame consultarEmpl) {
    this.consultarEmpl = consultarEmpl;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    DefaultTableModel tmodelo;
    String dato = consultarEmpl.txt_dato.getText();
    int atributo = 0;
    String filtro = consultarEmpl.combox_filtro.getSelectedItem().toString();

    switch (filtro) {
      case "Identificación" -> atributo = 1;
      case "Nombre" -> atributo = 2;
      case "Número celular" -> atributo = 3;
      case "Fecha de ingreso" -> atributo = 4;
    }

    LinkedList<Empleado> empleados = Gestor_Empleado.Consultar_Empleado(atributo, dato);

    String[] registro = new String[8];
    String[] titulos = {
      "Identificación",
      "ID Gerente",
      "Nombres",
      "Apellidos",
      "Celular",
      "Fecha de ingreso",
      "Fecha de nacimiento",
      "Area"
    };

    tmodelo = new DefaultTableModel();
    tmodelo.setColumnIdentifiers(titulos);

    for (Empleado empl : empleados) {
      registro[0] = empl.getIdEmpleado();
      registro[1] = empl.getIdGerente2();
      registro[2] = empl.getNomEmpl();
      registro[3] = empl.getApeEmpl();
      registro[4] = empl.getNumEmpl();
      registro[5] = empl.getFechIngresoEmpl();
      registro[6] = empl.getFechNacEmpl();
      registro[7] = empl.getAreaEmpl() + "";

      tmodelo.addRow(registro);
    }

    consultarEmpl.table_empl.setModel(tmodelo);
  }
}
