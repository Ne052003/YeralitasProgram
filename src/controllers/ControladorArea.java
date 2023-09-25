package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Area;
import models.GestorArea;
import resources.GeneralMethods;
import resources.Titles;
import views.AgregarArea_JFrame;

public class ControladorArea implements ActionListener {

    private final AgregarArea_JFrame areaVista;
    private final GestorArea gestorArea;
    private DefaultTableModel tmodelo;

    public ControladorArea(AgregarArea_JFrame areaVista) {
        this.areaVista = areaVista;
        gestorArea = new GestorArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(areaVista.btn_save)) {
            String nomArea = areaVista.txt_name.getText();
            Area area = new Area(nomArea);
            gestorArea.agregar(area);
        } else {

            String dato = areaVista.txt_data.getText();
            LinkedList<Area> areas = gestorArea.obtener(1, dato);

            actualizarTabla(areas);
        }
    }

    public void traerAreas() {
        LinkedList<Area> areas = gestorArea.obtenerTodas();
        actualizarTabla(areas);
    }

    private void actualizarTabla(List<Area> areas) {
        String registro[] = new String[2];
        tmodelo = new DefaultTableModel();
        tmodelo.setColumnIdentifiers(Titles.AREA.getEncabezado());
        for (Area area : areas) {
            registro[0] = area.getCodigoArea() + "";
            registro[1] = area.getNomArea();
            tmodelo.addRow(registro);
        }
        areaVista.table_area.setModel(tmodelo);
    }

    private EventoAccionTabla obtenerAccionEvento() {
        int row = areaVista.table_area.getSelectedRow();
        EventoAccionTabla accionTabla = new EventoAccionTabla() {
            @Override
            public void onAdd() {
                GeneralMethods.openFrame(new AgregarArea_JFrame());
//                queryFrame.dispose();
            }

            @Override
            public void onEdit() {
                System.out.println("Editando");
            }

            @Override
            public void onSave() {

                System.out.println("Guardado");
            }

            @Override
            public void onDelete() {

                tmodelo.removeRow(row);
            }
        };
        return accionTabla;
    }
}
