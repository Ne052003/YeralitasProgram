package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import models.GestorObservacion;
import models.Observacion;
import views.AgregarObs_JFrame;

public class ControladorObservacion implements ActionListener {

    AgregarObs_JFrame observacionVista;
    Observacion observacionModelo;
    GestorObservacion gestorObservacion;

    public ControladorObservacion(AgregarObs_JFrame observacionVista) {
        this.observacionVista = observacionVista;
        gestorObservacion = new GestorObservacion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(observacionVista.btn_guardar)) {
            int id_produ
                    = Integer.parseInt(observacionVista.combox_producto.getSelectedItem().toString());
            Date fech_obs = observacionVista.chooser_fecha.getDate();
            String observacion = observacionVista.txt_observacion.getText();

            observacionModelo = new Observacion(id_produ, fech_obs.toString(), observacion);
            gestorObservacion.agregar(observacionModelo);
        }
    }
}
