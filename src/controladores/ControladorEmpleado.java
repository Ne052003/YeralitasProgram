package controladores;

import vistas.*;
import modelos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import recursos.MetodosGenerales;
import static recursos.MetodosGenerales.RolMenu;

public class ControladorEmpleado implements ActionListener {

  private final AgregarEmpl_JFrame empleadoVista;

  private final Gestor_Empleado gestorEmpleado;
  private final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

  public ControladorEmpleado(AgregarEmpl_JFrame empleadoVista) {
    this.empleadoVista = empleadoVista;
    gestorEmpleado = new Gestor_Empleado();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Empleado empleadoModelo;
    if (e.getSource().equals(empleadoVista.btn_guardar)) {

      if (MetodosGenerales.validarId(empleadoVista.txt_identificacion.getText())) {
        String id_empleado = empleadoVista.txt_identificacion.getText();
        String id_gerente = empleadoVista.combox_gerente.getSelectedItem().toString();
        String nom_empl = empleadoVista.txt_nombre.getText();
        String ape_empl = empleadoVista.txt_apellidos.getText();
        String num_empl = empleadoVista.txt_celular.getText();
        String fech_ingreso_empl = formato.format(empleadoVista.choose_ingreso.getDate());
        String fech_nac_empl = formato.format(empleadoVista.choose_nacimiento.getDate());
        int area_empl = Integer.parseInt(empleadoVista.combox_area.getSelectedItem().toString());
        empleadoModelo =
            new Empleado(
                id_empleado,
                id_gerente,
                nom_empl,
                ape_empl,
                num_empl,
                fech_ingreso_empl,
                area_empl,
                fech_nac_empl);
        gestorEmpleado.Agregar_Empleado(empleadoModelo);
        int msg = gestorEmpleado.getMsg();

        if (msg == JOptionPane.YES_OPTION) {
          MetodosGenerales.abrirVentana(new AgregarEmpl_JFrame());
          empleadoVista.dispose();
        } else {
          RolMenu();
          empleadoVista.dispose();
        }
      } else {
        JOptionPane.showMessageDialog(empleadoVista, "Ingrese un número de identificación válido");
      }
    }
  }
}
