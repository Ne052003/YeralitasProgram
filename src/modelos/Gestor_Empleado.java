package modelos;

import recursos.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Gestor_Empleado {

    //Se declara la lista de empleados
    private static Connection conn;
    private int msg = 0;

    //Constructor
    public Gestor_Empleado() {
        Conexion conexion = new Conexion("localhost", "Yeralitas_Database", "Neoly", "SQLSERVERlexis_22");
        conn = conexion.getConnection();
        //empleados = new LinkedList<Empleado>();
    }

    //Método para agregar empleados
    public void Agregar_Empleado(Empleado empleado) {
        PreparedStatement Emp;

        try {
            Emp = conn.prepareStatement("insert into Empleado values(?,?,?,?,?,?,?,?)");
            Emp.setString(1, empleado.getIdEmpleado());
            Emp.setString(2, empleado.getIdGerente2());
            Emp.setString(3, empleado.getNomEmpl());
            Emp.setString(4, empleado.getApeEmpl());
            Emp.setString(5, empleado.getNumEmpl());
            Emp.setString(6, empleado.getFechIngresoEmpl());
            Emp.setString(7, empleado.getAreaEmpl() + "");
            Emp.setString(8, empleado.getFechNacEmpl());
            Emp.executeUpdate();
            msg = JOptionPane.showConfirmDialog(null, "Empleado registrado, ¿Desea agregar otro registro?");

        } catch (SQLException ex) {
            Logger.getLogger(Gestor_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
        //empleados.add(empleado);
    }

    public int getMsg() {
        return msg;
    }

    //Método para obtener todos los empleados
    /*public static LinkedList<Cliente> ObtenerClientes(){
        return clientes;
    }*/
    //Método para consultar empleados
    public static LinkedList<Empleado> Consultar_Empleado(int atributo, String valor) {
        LinkedList<Empleado> resultado = new LinkedList<Empleado>();
        String sql = "";

        switch (atributo) {
            case 1 ->
                sql = "select * from empleado where id_empl='" + valor + "'";
            case 2 ->
                sql = "select * from empleado where nom_empl='" + valor + "'";
            case 3 ->
                sql = "select * from empleado where num_empl='" + valor + "'";
            case 4 ->
                sql = "select * from empleado where fech_ingreso_empl='" + valor + "'";

        }

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Empleado(rs.getString("id_empl"), rs.getString("id_geren_2"), rs.getString("nom_empl"), rs.getString("ape_empl"), rs.getString("num_empl"), rs.getString("fech_ingreso_empl"), Integer.parseInt(rs.getString("area_empl")), rs.getString("fech_nac_empl")));
            }
            st.close();
        } catch (NumberFormatException | SQLException ex) {
            Logger.getLogger(Gestor_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
