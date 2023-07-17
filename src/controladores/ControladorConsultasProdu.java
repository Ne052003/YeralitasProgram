package controladores;

import modelos.*;
import vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorConsultasProdu implements ActionListener {

  Inventario_JFrame consultarCliVista;
  Gestor_Producto gestorProducto;
  Gestor_Observacion gestorObservacion;

  public ControladorConsultasProdu(Inventario_JFrame consultarCliVista) {
    this.consultarCliVista = consultarCliVista;
    gestorProducto = new Gestor_Producto();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    DefaultTableModel tmodelo;

    String dato = consultarCliVista.dato_txt.getText();
    int atributo = 0;

    switch (consultarCliVista.combox_filtro.getSelectedItem().toString()) {
      case "ID" -> atributo = 1;

      case "Nombre" -> atributo = 2;

      case "Precio" -> atributo = 3;

      case "Fecha de ingreso" -> atributo = 4;
    }
    LinkedList<Producto> productos = gestorProducto.Consultar_Producto(atributo, dato);

    String[] registro = new String[7];
    String[] titulos = {
      "ID Gerente",
      "ID",
      "Nombre",
      "Precio",
      "Unidad de medida",
      "Fecha de ingreso",
      "Fecha de vencimiento"
    };

    tmodelo = new DefaultTableModel();
    tmodelo.setColumnIdentifiers(titulos);

    for (Producto produ : productos) {
      registro[0] = produ.getId_produ() + "";
      registro[0] = produ.getId_geren_2();
      registro[1] = produ.getId_produ() + "";
      registro[2] = produ.getNom_produ();
      registro[3] = produ.getPrec_produ() + "";
      registro[4] = produ.getUnidad_medida_2() + "";
      registro[5] = produ.getFech_ingreso_produ();
      registro[6] = produ.getFech_caducidad();
      tmodelo.addRow(registro);
    }

    consultarCliVista.table_inventario.setModel(tmodelo);
  }
}
