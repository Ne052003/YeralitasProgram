package controladores;

import modelos.*;
import modelos.Producto;
import vistas.Eliminar_JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorEliminado implements ActionListener {

  Eliminar_JFrame eliminarVista;
  GestorEliminado gestorEliminado;

  // Constructor
  public ControladorEliminado(Eliminar_JFrame eliminarVista) {
    this.eliminarVista = eliminarVista;
    gestorEliminado = new GestorEliminado();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource().equals(eliminarVista.btn_buscar)) {
      DefaultTableModel tmodelo;

      String tabla = eliminarVista.combox_tabla.getSelectedItem().toString();
      String dato = eliminarVista.txt_dato.getText();
      String[] registro = new String[2];
      String[] titulos = {"ID", "Nombre"};

      tmodelo = new DefaultTableModel();
      tmodelo.setColumnIdentifiers(titulos);

      switch (tabla) {
        case "Cliente" -> {
          LinkedList<Cliente> clientes = gestorEliminado.consultar_Registro_Eliminar(dato, tabla);
          for (Cliente cli : clientes) {
            registro[0] = cli.getIdCli() + "";
            registro[1] = cli.getNomCli();
            tmodelo.addRow(registro);
          }
        }
        case "Producto" -> {
          LinkedList<Producto> productos = gestorEliminado.consultar_Registro_Eliminar(dato, tabla);
          for (Producto produ : productos) {
            registro[0] = produ.getId_produ() + "";
            registro[1] = produ.getNom_produ();
            tmodelo.addRow(registro);
          }
        }
        case "Venta" -> {
          LinkedList<Venta> ventas = gestorEliminado.consultar_Registro_Eliminar(dato, tabla);
          for (Venta vent : ventas) {
            registro[0] = vent.getIdVenta() + "";
            registro[1] = vent.getId_manufac() + "";
            tmodelo.addRow(registro);
          }
        }
        case "Empleado" -> {
          LinkedList<Empleado> empleados = gestorEliminado.consultar_Registro_Eliminar(dato, tabla);
          for (Empleado empl : empleados) {
            registro[0] = empl.getIdEmpleado() + "";
            registro[1] = empl.getNomEmpl();
            tmodelo.addRow(registro);
          }
        }
        case "Observación" -> {
          LinkedList<Observacion> observaciones =
              gestorEliminado.consultar_Registro_Eliminar(dato, tabla);
          for (Observacion observ : observaciones) {
            registro[0] = observ.getId_observ() + "";
            registro[1] = observ.getId_produ_2() + "";
            tmodelo.addRow(registro);
          }
        }
      }

      eliminarVista.table_eliminar.setModel(tmodelo);

      // Cuando se precione el botón eliminar
    } else if (e.getSource().equals(eliminarVista.btn_eliminar)) {
      String tabla = eliminarVista.combox_tabla.getSelectedItem().toString();
      // String registro= eliminarVista.table_eliminar.

      int id = Integer.parseInt(eliminarVista.txt_dato.getText());

      gestorEliminado.eliminar_Registro(tabla, id);
    }
  }
}
