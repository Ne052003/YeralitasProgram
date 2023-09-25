package models;

import resources.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestorEmpleado implements Gestor<Empleado> {

    private static Connection conn;
    private int msg = 0;

    public GestorEmpleado() {
        Conexion conexion = Conexion.getConexion();
        conn = conexion.getConnection();
    }

    @Override
    public void agregar(Empleado entity) {
        PreparedStatement Emp;

        try {
            Emp = conn.prepareStatement("insert into Empleado values(?,?,?,?,?,?,?,?)");
            Emp.setString(1, entity.getIdEmpleado());
            Emp.setString(2, entity.getIdGerente2());
            Emp.setString(3, entity.getNomEmpl());
            Emp.setString(4, entity.getApeEmpl());
            Emp.setString(5, entity.getNumEmpl());
            Emp.setString(6, entity.getFechIngresoEmpl());
            Emp.setString(7, entity.getAreaEmpl() + "");
            Emp.setString(8, entity.getFechNacEmpl());
            Emp.executeUpdate();
            msg = JOptionPane.showConfirmDialog(null, "Employee saved, Do you want to add another employee?");

        } catch (SQLException ex) {
            Logger.getLogger(GestorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Incorrect credentials");
        }
    }

    public int getMsg() {
        return msg;
    }

    @Override
    public LinkedList<Empleado> obtener(int atributo, String valor) {
        LinkedList<Empleado> resultado = new LinkedList<>();
        String columnName;

        switch (atributo) {
            case 0 ->
                columnName = "id_empl";
            case 1 ->
                columnName = "nom_empl";
            case 2 ->
                columnName = "num_empl";
            case 3 ->
                columnName = "fech_ingreso_empl";
            default -> {
                Logger.getLogger(GestorEmpleado.class.getName()).log(Level.SEVERE, null, "Wrong ComboBox index");
                return new LinkedList();
            }
        }

        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from empleado where " + columnName + "='" + valor + "'");
            while (rs.next()) {
                resultado.add(new Empleado(rs.getString("id_empl"), rs.getString("id_geren_2"), rs.getString("nom_empl"), rs.getString("ape_empl"), rs.getString("num_empl"), rs.getString("fech_ingreso_empl"), Integer.parseInt(rs.getString("area_empl")), rs.getString("fech_nac_empl")));
            }
            st.close();
        } catch (NumberFormatException | SQLException ex) {
            Logger.getLogger(GestorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public List<Empleado> obtenerTodas() {
        LinkedList<Empleado> resultado = new LinkedList<>();
        String sql = "select * from empleado";

        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Empleado(rs.getString("id_empl"), rs.getString("id_geren_2"), rs.getString("nom_empl"), rs.getString("ape_empl"), rs.getString("num_empl"), rs.getString("fech_ingreso_empl"), Integer.parseInt(rs.getString("area_empl")), rs.getString("fech_nac_empl")));
            }
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
    }

    @Override
    public void eliminar(Long id) {
        String sql = "delete from empleado where Id_empl='" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void update(Empleado entity) {
        PreparedStatement empl;
        try {
            empl = conn.prepareStatement("update empleado set nom_produ=?, id_geren_2=?, prec_produ=?, unidad_medida_2=?, fech_ingreso_produ=?, fech_caducidad=? where id_produ='" + entity.getIdEmpleado() + "'");
            empl.setString(1, entity.getIdGerente2());
            empl.setString(3, entity.getNomEmpl());
            empl.setString(4, entity.getApeEmpl());
            empl.setString(5, entity.getNumEmpl());
            empl.setString(6, entity.getFechIngresoEmpl());
            empl.setString(7, entity.getAreaEmpl() + "");
            empl.setString(8, entity.getFechNacEmpl());
            empl.executeUpdate();

            int rows = empl.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Employee updated");
            }

        } catch (SQLException e) {
            Logger.getLogger(GestorProducto.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
