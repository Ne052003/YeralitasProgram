package controllers;

import javax.swing.JOptionPane;
import models.GestorManufactura;
import models.Manufactura;
import resources.GeneralMethods;
import views.AgregarManu_JFrame;
import views.Consultas_JFrame;

public class ManufacturePanelController implements PanelActionController {

    private final GestorManufactura gestorManufactura;
    public int row = 0;

    public ManufacturePanelController() {
        gestorManufactura = new GestorManufactura();
    }

    @Override
    public EventoAccionTabla obtenerAccionEvento(Consultas_JFrame queryFrame) {
        return new EventoAccionTabla() {
            @Override
            public void onAdd() {
                GeneralMethods.openFrame(new AgregarManu_JFrame());
                queryFrame.dispose();
            }

            @Override
            public void onEdit() {
                queryFrame.actionPanel.btn_edit.setEnabled(false);
                row = queryFrame.table.getSelectedRow();
                if (row != -1) {
                    javax.swing.JTable table = new javax.swing.JTable() {
                        final boolean[] canEdit = new boolean[]{
                            false, true, true
                        };

                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex
                        ) {
                            return canEdit[columnIndex] && rowIndex == row;
                        }
                    };
                    queryFrame.setTable(table);
                    queryFrame.table.changeSelection(row, 0, true, true);
                    queryFrame.actionPanel.btn_save.setEnabled(true);
                }
            }

            @Override
            public void onSave() {
                if (queryFrame.table.isEditing()) {
                    int columnas = queryFrame.table.getColumnCount();
                    String[] manufacturaArr = new String[columnas];
                    for (int i = 0; i < columnas; i++) {
                        manufacturaArr[i] = queryFrame.table.getValueAt(row, i).toString();
                    }
                    Manufactura manufactura = new Manufactura(Integer.parseInt(manufacturaArr[0]), manufacturaArr[1], Float.parseFloat(manufacturaArr[2]));
                    gestorManufactura.update(manufactura);
                    queryFrame.actionPanel.btn_edit.setEnabled(true);
                    queryFrame.actionPanel.btn_save.setEnabled(false);
                    queryFrame.setTable(queryFrame.getNotEditableTable());
                }
            }

            @Override
            public void onDelete() {
                row = queryFrame.table.getSelectedRow();
                if (row != -1) {
                    String id = queryFrame.table.getValueAt(row, 0).toString();
                    String name = queryFrame.table.getValueAt(row, 1).toString();
                    int res = JOptionPane.showConfirmDialog(queryFrame, "Are you sure you want to delete the manufacture with name: " + name + " and id: " + id, "Delete", 0, 3);
                    if (res == 0) {
                        System.out.println(id);
                        gestorManufactura.eliminar(Long.parseLong(id));
                        queryFrame.controller.traerTodo();
                    }
                }

            }
        };
    }
}
