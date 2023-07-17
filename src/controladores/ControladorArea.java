package controladores;

import java.awt.event.ActionListener;
import vistas.*;
import modelos.*;
import java.awt.event.ActionEvent;

public class ControladorArea implements ActionListener {

  private final AgregarArea_JFrame areaVista;

  private final Gestor_Area gestorArea;

  public ControladorArea(AgregarArea_JFrame areaVista) {
    this.areaVista = areaVista;
    gestorArea = new Gestor_Area();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Area areaModelo;
    if (e.getSource().equals(areaVista.btn_guardar)) {
      String nomArea = areaVista.txt_nombre.getText();

      areaModelo = new Area(nomArea);
      gestorArea.Agregar_Area(areaModelo);
    }
  }
}
