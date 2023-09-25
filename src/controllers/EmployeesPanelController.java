package controllers;

import javax.swing.JOptionPane;
import models.Empleado;
import models.GestorEmpleado;
import resources.GeneralMethods;
import views.AgregarEmpl_JFrame;
import views.Consultas_JFrame;

public class EmployeesPanelController implements PanelActionController {

    private final GestorEmpleado gestorEmpleado;
    public int row = 0;

    public EmployeesPanelController() {
        gestorEmpleado = new GestorEmpleado();
    }

    @Override
    public EventoAccionTabla obtenerAccionEvento(Consultas_JFrame queryFrame) {
        return new EventoAccionTabla() {
            @Override
            public void onAdd() {
                GeneralMethods.openFrame(new AgregarEmpl_JFrame());
                queryFrame.dispose();
            }

            @Override
            public void onEdit() {
                queryFrame.actionPanel.btn_edit.setEnabled(false);
                row = queryFrame.table.getSelectedRow();
                if (row != -1) {
                    javax.swing.JTable table = new javax.swing.JTable() {
                        final boolean[] canEdit = new boolean[]{
                            false, true, true, true, true, true, true, true
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
                    String[] empleadoArr = new String[columnas];
                    for (int i = 0; i < columnas; i++) {
                        empleadoArr[i] = queryFrame.table.getValueAt(row, i).toString();
                    }
                    Empleado empleado = new Empleado(empleadoArr[0], empleadoArr[1], empleadoArr[2], empleadoArr[3], empleadoArr[4], empleadoArr[5], Integer.parseInt(empleadoArr[6]), empleadoArr[7]);
                    gestorEmpleado.update(empleado);
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
                    int res = JOptionPane.showConfirmDialog(queryFrame, "Are you sure you want to delete the employee with name: " + name + " and id: " + id, "Delete", 0, 3);
                    if (res == 0) {
                        System.out.println(id);
                        gestorEmpleado.eliminar(Long.parseLong(id));
                        queryFrame.controller.traerTodo();
                    }
                }
            }
        };
    }

}
