package controllers;

import javax.swing.JOptionPane;
import models.GestorVenta;
import models.Venta;
import resources.GeneralMethods;
import views.AgregarVenta_JFrame;
import views.Consultas_JFrame;

public class SalesPanelController implements PanelActionController {

    private final GestorVenta gestorVenta;
    public int row = 0;

    public SalesPanelController() {
        gestorVenta = new GestorVenta();
    }

    @Override
    public EventoAccionTabla obtenerAccionEvento(Consultas_JFrame queryFrame) {
        return new EventoAccionTabla() {

            @Override
            public void onAdd() {
                GeneralMethods.openFrame(new AgregarVenta_JFrame());
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
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit[columnIndex];
                        }
                    };
                    queryFrame.setTable(table);
                    queryFrame.table.changeSelection(row, 0, true, true);
                    queryFrame.actionPanel.btn_save.setEnabled(true);
                }
            }

            @Override
            public void onSave() {
                int columnas = queryFrame.table.getColumnCount();
                String[] ventaArr = new String[columnas];
                for (int i = 0; i < columnas; i++) {
                    ventaArr[i] = queryFrame.table.getValueAt(row, i).toString();
                }
                Venta venta = new Venta(Integer.parseInt(ventaArr[0]), ventaArr[1], Integer.parseInt(ventaArr[2]), Integer.parseInt(ventaArr[3]), Integer.parseInt(ventaArr[4]), ventaArr[5], Float.parseFloat(ventaArr[6]));
                gestorVenta.update(venta);
                queryFrame.actionPanel.btn_edit.setEnabled(true);
                queryFrame.actionPanel.btn_save.setEnabled(false);
                queryFrame.setTable(queryFrame.getNotEditableTable());
            }

            @Override
            public void onDelete() {
                row = queryFrame.table.getSelectedRow();
                if (row != -1) {
                    String id = queryFrame.table.getValueAt(row, 0).toString();
                    int res = JOptionPane.showConfirmDialog(queryFrame, "Are you sure you want to delete the sale with id: " + id, "Delete", 0, 3);
                    if (res == 0) {
                        System.out.println(id);
                        gestorVenta.eliminar(Long.parseLong(id));
                        queryFrame.controller.traerTodo();
                    }
                }
            }
        };
    }

}
