package controladores;

import vistas.*;
import modelos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorConsultasManu implements ActionListener {

  private final ConsultasManu_JFrame manufacturaVista;
  private final Gestor_Manufactura gestorManufactura;

  public ControladorConsultasManu(ConsultasManu_JFrame manufacturaVista) {
    this.manufacturaVista = manufacturaVista;
    gestorManufactura = new Gestor_Manufactura();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    DefaultTableModel tmodelo;

    String dato = manufacturaVista.txt_dato.getText();
    int atributo = 0;

    switch (manufacturaVista.combox_filtro.getSelectedItem().toString()) {
      case "ID" -> atributo = 1;

      case "Nombre" -> atributo = 2;

      case "Precio" -> atributo = 3;
    }

    LinkedList<Manufactura> manufacturas = gestorManufactura.Consultar_Manufactura(atributo, dato);

    String[] registro = new String[3];
    String[] titulos = {"ID", "Nombre", "Precio"};

    tmodelo = new DefaultTableModel();
    tmodelo.setColumnIdentifiers(titulos);

    for (Manufactura manu : manufacturas) {
      registro[0] = manu.getId_manufac() + "";
      registro[1] = manu.getNom_manufac();
      registro[2] = manu.getPrec_manufac() + "";
      tmodelo.addRow(registro);
    }
    manufacturaVista.table_manu.setModel(tmodelo);
  }
}
