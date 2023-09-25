package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Entity;
import models.Gestor;
import views.Consultas_JFrame;

public class QueryController implements ActionListener {

    private Consultas_JFrame vistaConsulta;
    private final Gestor gestor;
    private DefaultTableModel tmodelo;
    private final PanelActionController panelController;

    public QueryController(Gestor gestor, PanelActionController panelController) {
        this.gestor = gestor;
        this.panelController = panelController;
    }

    public QueryController setVistaConsulta(Consultas_JFrame vistaConsulta) {
        this.vistaConsulta = vistaConsulta;
        return this;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String dato = vistaConsulta.txtData.getText();
        if (dato.isBlank()) {
            traerTodo();
            return;
        }

        int atributo = vistaConsulta.cmbxFilter.getSelectedIndex();
        List<Entity> lista = gestor.obtener(atributo, dato);
        actualizarTabla(lista);
    }

    public void traerTodo() {
        List<Entity> productos = gestor.obtenerTodas();
        actualizarTabla(productos);
    }

    public EventoAccionTabla obtenerAccionEvento() {
        return panelController.obtenerAccionEvento(vistaConsulta);
    }

    private void actualizarTabla(List<Entity> lista) {
        tmodelo = new DefaultTableModel();
        tmodelo.setColumnIdentifiers(vistaConsulta.frameProperties.getHeadersTable());

        for (Entity entity : lista) {
            tmodelo.addRow(entity.toArray());
        }
        vistaConsulta.table.setModel(tmodelo);
    }
}
