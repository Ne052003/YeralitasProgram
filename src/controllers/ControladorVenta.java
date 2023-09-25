package controllers;

import models.Venta;
import models.GestorVenta;
import views.Menu_JFrame;
import views.AgregarVenta_JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import resources.GeneralMethods;

public class ControladorVenta implements ActionListener {

    private final AgregarVenta_JFrame ventaVista;

    private final GestorVenta gestorVenta;
    private final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public ControladorVenta(AgregarVenta_JFrame ventaVista) {
        this.ventaVista = ventaVista;
        gestorVenta = new GestorVenta();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Venta ventaModelo;
        if (e.getSource().equals(ventaVista.btn_guardar)) {
            String id_empl = ventaVista.txt_IdEmpl.getText();
            int id_cli = Integer.parseInt(ventaVista.txt_idcli.getText());
            int id_manufac = Integer.parseInt(ventaVista.combox_manufac.getSelectedItem().toString());
            int cantidad_manufac = Integer.parseInt(ventaVista.txt_manufacturas.getText());
            String fech_venta = formato.format(ventaVista.chooser_venta.getDate());
            Float prec_venta = Float.parseFloat(ventaVista.txt_precio.getText());

            ventaModelo
                    = new Venta(id_empl, id_cli, id_manufac, cantidad_manufac, fech_venta, prec_venta);
            gestorVenta.agregar(ventaModelo);

            int msg = gestorVenta.getMsg();
            if (msg == JOptionPane.YES_OPTION) {
                GeneralMethods.openFrame(new AgregarVenta_JFrame());
            } else {
                Menu_JFrame.getMenu().setVisible(true);
            }
            ventaVista.dispose();
        }
    }
}
