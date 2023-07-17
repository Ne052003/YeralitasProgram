package controladores;

import vistas.*;
import modelos.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class ControladorCliente implements ActionListener {

  private final AgregarCliente_JFrame clienteVista;

  private final Gestor_Cliente gestorCliente;

  public ControladorCliente(AgregarCliente_JFrame clienteVista) {
    this.clienteVista = clienteVista;
    gestorCliente = new Gestor_Cliente();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Cliente clienteModelo;
    if (e.getSource().equals(clienteVista.btn_guardar)) {
      String nom_cli = clienteVista.txt_nombre.getText();
      String num_cli = clienteVista.txt_celular.getText();
      String dir_cli = clienteVista.txt_direccion.getText();

      clienteModelo = new Cliente(nom_cli, num_cli, dir_cli);
      gestorCliente.Agregar_Cliente(clienteModelo);
      clienteVista.dispose();
    }
  }
}
