package controladores;

import java.awt.event.ActionListener;
import vistas.*;
import modelos.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ControladorConsultasCli implements ActionListener {

  private final ConsultasCli_JFrame consultarCli;

  public ControladorConsultasCli(ConsultasCli_JFrame consultarCli) {
    this.consultarCli = consultarCli;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    DefaultTableModel tmodelo;
    String filtro = consultarCli.combox_filtro.getSelectedItem().toString();
    String dato = consultarCli.txt_dato.getText();

    int atributo = 0;

    switch (filtro) {
      case "ID" -> atributo = 1;
      case "Nombre" -> atributo = 2;
      case "Número celular" -> atributo = 3;
    }

    LinkedList<Cliente> clientes = Gestor_Cliente.Consultar_Cliente(atributo, dato);

    String[] registro = new String[4];
    String[] titulos = {"ID", "Nombre", "Número de celular", "Dirección"};

    tmodelo = new DefaultTableModel();
    tmodelo.setColumnIdentifiers(titulos);

    for (Cliente cli : clientes) {
      registro[0] = cli.getIdCli() + "";
      registro[1] = cli.getNomCli();
      registro[2] = cli.getNumCli();
      registro[3] = cli.getDirCli();
      tmodelo.addRow(registro);
    }

    consultarCli.table_cli.setModel(tmodelo);
  }
}
