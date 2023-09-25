package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import models.Gerente;
import models.GestorGerente;
import resources.GeneralMethods;
import views.AgregarEmpl_JFrame;
import views.AgregarGeren_JFrame;
import views.Menu_JFrame;

public class ControladorGerente implements ActionListener {

    private final AgregarGeren_JFrame gerenteVista;

    private final GestorGerente gestorGerente;
    private final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public ControladorGerente(AgregarGeren_JFrame gerenteVista) {
        this.gerenteVista = gerenteVista;
        gestorGerente = new GestorGerente();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Gerente gerenteModelo;
        if (e.getSource().equals(gerenteVista.btn_guardar)) {
            String id_geren = gerenteVista.txt_identificacion.getText();
            String nom_geren = gerenteVista.txt_nombre.getText();
            String ape_geren = gerenteVista.txt_apellidos.getText();
            String num_geren = gerenteVista.txt_celular.getText();
            String correo = gerenteVista.txt_correo.getText();
            String fech_nac_geren = formato.format(gerenteVista.chooser_nac.getDate());

            gerenteModelo
                    = new Gerente(
                            id_geren, nom_geren, ape_geren, num_geren, correo, fech_nac_geren);
            gestorGerente.agregar(gerenteModelo);
            int msg = gestorGerente.getMsg();
            if (msg == JOptionPane.YES_OPTION) {
                GeneralMethods.openFrame(new AgregarEmpl_JFrame());
                gerenteVista.dispose();
            } else {
                Menu_JFrame.getMenu().setVisible(true);
                gerenteVista.dispose();
            }
            gerenteVista.dispose();
        }
    }
}
