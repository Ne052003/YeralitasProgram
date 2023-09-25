package controllers;

import models.Manufactura;
import models.GestorManufactura;
import views.AgregarManu_JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorManufactura implements ActionListener {

  AgregarManu_JFrame manufacturaVista;
  Manufactura manufacturaModelo;
  GestorManufactura gestorManufactura;

  public ControladorManufactura(AgregarManu_JFrame manufacturaVista) {
    this.manufacturaVista = manufacturaVista;
    gestorManufactura = new GestorManufactura();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(manufacturaVista.btn_guardar)) {
      String nom_manufac = manufacturaVista.txt_nombre.getText();
      Float prec_manufac = Float.parseFloat(manufacturaVista.txt_precio.getText());

      manufacturaModelo = new Manufactura(nom_manufac, prec_manufac);
      gestorManufactura.agregar(manufacturaModelo);
    }
  }
}
