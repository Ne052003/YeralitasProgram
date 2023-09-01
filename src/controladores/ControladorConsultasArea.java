package vistas;

import modelos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ConsultaArea_JFrame implements ActionListener {

  private final AgregarArea_JFrame areaVista;

  public ConsultaArea_JFrame(AgregarArea_JFrame areaVista) {
    this.areaVista = areaVista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    DefaultTableModel tmodelo;

    String dato = areaVista.txt_dato.getText();
    LinkedList<Area> areas = Gestor_Area.Consultar_Area(dato);

    String[] registro = new String[2];
    String[] titulos = {"Código", "Nombre"};

    tmodelo = new DefaultTableModel();
    tmodelo.setColumnIdentifiers(titulos);

    for (Area area : areas) {
      registro[0] = area.getCodigoArea() + "";
      registro[1] = area.getNomArea();
      tmodelo.addRow(registro);
    }

    areaVista.table_area.setModel(tmodelo);
  }
}
