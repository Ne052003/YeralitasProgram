package controllers;

import javax.swing.JOptionPane;
import models.GestorProducto;
import models.Producto;
import resources.GeneralMethods;
import views.AgregarPro_JFrame;
import views.Consultas_JFrame;

public class ProductPanelController implements PanelActionController {

    private final GestorProducto gestorProducto;
    public int row = 0;

    public ProductPanelController() {
        gestorProducto = new GestorProducto();
    }

    @Override
    public EventoAccionTabla obtenerAccionEvento(Consultas_JFrame queryFrame) {

        return new EventoAccionTabla() {
            @Override
            public void onAdd() {
                GeneralMethods.openFrame(new AgregarPro_JFrame());
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
                    String[] productoArr = new String[columnas];
                    for (int i = 0; i < columnas; i++) {
                        productoArr[i] = queryFrame.table.getValueAt(row, i).toString();
                    }
                    Producto producto = new Producto(Integer.parseInt(productoArr[0]), productoArr[1], productoArr[2], Float.parseFloat(productoArr[3]), productoArr[4], productoArr[5], productoArr[6]);
                    gestorProducto.update(producto);
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
                    String name = queryFrame.table.getValueAt(row, 2).toString();
                    int res = JOptionPane.showConfirmDialog(queryFrame, "Are you sure you want to delete the product with name: " + name + " and id: " + id, "Delete", 0, 3);
                    if (res == 0) {
                        System.out.println(id);
                        gestorProducto.eliminar(Long.parseLong(id));
                        queryFrame.controller.traerTodo();
                    }
                }

            }
        };
    }
}
