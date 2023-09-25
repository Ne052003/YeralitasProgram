package controllers;

import javax.swing.JOptionPane;
import models.Cliente;
import models.GestorCliente;
import resources.GeneralMethods;
import views.AgregarCliente_JFrame;
import views.Consultas_JFrame;

public class ClientsPanelController implements PanelActionController {

    private final GestorCliente gestorCliente;
    public int row = 0;

    public ClientsPanelController() {
        this.gestorCliente = new GestorCliente();
    }

    @Override
    public EventoAccionTabla obtenerAccionEvento(Consultas_JFrame queryFrame) {
        return new EventoAccionTabla() {
            @Override
            public void onAdd() {
                GeneralMethods.openFrame(new AgregarCliente_JFrame());
                queryFrame.dispose();
            }

            @Override
            public void onEdit() {
                queryFrame.actionPanel.btn_edit.setEnabled(false);
                row = queryFrame.table.getSelectedRow();
                if (row != -1) {
                    javax.swing.JTable table = new javax.swing.JTable() {
                        final boolean[] canEdit = new boolean[]{
                            false, true, true, true, true, true, true
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
                    String[] clientArr = new String[columnas];
                    for (int i = 0; i < columnas; i++) {
                        clientArr[i] = queryFrame.table.getValueAt(row, i).toString();
                    }
                    Cliente client = new Cliente(Integer.parseInt(clientArr[0]), clientArr[1], clientArr[2], clientArr[3]);
                    gestorCliente.update(client);
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
                    int res = JOptionPane.showConfirmDialog(queryFrame, "Are you sure you want to delete the client with name: " + name + " and id: " + id, "Delete", 0, 3);
                    if (res == 0) {
                        System.out.println(id);
                        gestorCliente.eliminar(Long.parseLong(id));
                        queryFrame.controller.traerTodo();
                    }
                }

            }
        };
    }

}
