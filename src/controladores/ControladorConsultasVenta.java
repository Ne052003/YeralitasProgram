package controladores;

import modelos.*;
import vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorConsultasVenta implements ActionListener {
  ConsultasVen_JFrame consultaVenVista;
  Gestor_Venta gestorVenta;

  public ControladorConsultasVenta(ConsultasVen_JFrame consultaVenVista) {
    this.consultaVenVista = consultaVenVista;
    gestorVenta = new Gestor_Venta();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    DefaultTableModel tmodelo;

    String dato = consultaVenVista.txt_dato.getText();
    int atributo = 0;

    switch (consultaVenVista.combox_filtro.getSelectedItem().toString()) {
      case "ID Manufactura" -> atributo = 1;

      case "ID Cliente" -> atributo = 2;

      case "ID Empleado" -> atributo = 3;

      case "Precio" -> atributo = 4;

      case "Fecha" -> atributo = 5;
    }

    LinkedList<Venta> ventas = gestorVenta.Consultar_Venta(atributo, dato);

    String[] registro = new String[7];
    String[] titulos = {
      "ID",
      "ID Empleado",
      "ID Cliente",
      "ID Manufactura",
      "Cantidad de manufacturas",
      "Fecha",
      "Precio"
    };

    tmodelo = new DefaultTableModel();
    tmodelo.setColumnIdentifiers(titulos);

    for (Venta ven : ventas) {
      registro[0] = ven.getIdVenta() + "";
      registro[1] = ven.getIdEmpl() + "";
      registro[2] = ven.getIdCli() + "";
      registro[3] = ven.getId_manufac() + "";
      registro[4] = ven.getCantidadManufac() + "";
      registro[5] = ven.getFechVenta() + "";
      registro[6] = ven.getPrecVenta() + "";
      tmodelo.addRow(registro);
    }

    consultaVenVista.table_venta.setModel(tmodelo);
  }
}
