package controllers;

import models.Producto;
import models.GestorProducto;
import views.AgregarPro_JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class ControladorProducto implements ActionListener {

  AgregarPro_JFrame productoVista;
  Producto productoModelo;
  GestorProducto gestorProducto;
  SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

  public ControladorProducto(AgregarPro_JFrame productoVista) {
    this.productoVista = productoVista;
    gestorProducto = new GestorProducto();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(productoVista.btn_guardar)) {
      String id_geren_2 = productoVista.combox_gerente.getSelectedItem().toString();
      String nom_produ = productoVista.txt_nombre.getText();
      Float prec_produ = Float.parseFloat(productoVista.txt_precio.getText());
      String unidad_medid = productoVista.combox_unidad.getSelectedItem().toString();
      String fech_ingreso = formato.format(productoVista.chooser_ingreso.getDate());
      String fech_caducidad = formato.format(productoVista.chooser_caducidad.getDate());

      productoModelo =
          new Producto(
              id_geren_2, nom_produ, prec_produ, unidad_medid, fech_ingreso, fech_caducidad);
      gestorProducto.agregar(productoModelo);
    }
  }
}
