package models;

import resources.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestorVenta implements Gestor<Venta> {

    private static Connection conn;
    private int msg = 0;

    public GestorVenta() {
        Conexion conexion = Conexion.getConexion();
        conn = conexion.getConnection();
    }

    @Override
    public void agregar(Venta venta) {
        PreparedStatement ven;
        try {
            ven = conn.prepareStatement("Insert into venta values(?,?,?,?,?,?)");
            ven.setString(1, venta.getIdEmpl());
            ven.setString(2, venta.getIdCli() + "");
            ven.setString(3, venta.getId_manufac() + "");
            ven.setString(4, venta.getCantidadManufac() + "");
            ven.setString(5, venta.getFechVenta());
            ven.setString(6, venta.getPrecVenta() + "");
            ven.executeUpdate();
            msg = JOptionPane.showConfirmDialog(null, "Venta registrada, ¿Desea agregar otro registro?");

        } catch (SQLException ex) {
            Logger.getLogger(GestorVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LinkedList<Venta> obtener(int atributo, String dato) {
        LinkedList<Venta> resultado = new LinkedList<>();
        String columnName;
        switch (atributo) {

            case 0 ->
                columnName = "id_manufac_2";
            case 1 ->
                columnName = "id_cli_2";
            case 2 ->
                columnName = "id_empl_2";
            case 3 ->
                columnName = "prec_venta";
            case 4 ->
                columnName = "fech_venta";
            default -> {
                Logger.getLogger(GestorVenta.class.getName()).log(Level.SEVERE, null, "Wrong ComboBox index");
                return new LinkedList();
            }
        }
        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from venta where " + columnName + "='" + dato + "'");
            while (rs.next()) {
                resultado.add(new Venta(rs.getInt("id_venta"), rs.getString("id_empl_2"), rs.getInt("id_cli_2"), rs.getInt("id_manufac_2"), rs.getInt("cantidad_manufac"), rs.getString("fech_venta"), rs.getFloat("prec_venta")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El dato no corresponde con el filtro");
            Logger.getLogger(GestorVenta.class.getName()).log(Level.SEVERE, null, e);
        }

        return resultado;
    }

    @Override
    public LinkedList<Venta> obtenerTodas() {
        LinkedList<Venta> ventas = new LinkedList<>();
        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from venta");
            while (rs.next()) {
                ventas.add(
                        new Venta(rs.getInt("id_venta"), rs.getString("id_empl_2"), rs.getInt("id_cli_2"), rs.getInt("id_manufac_2"), rs.getInt("cantidad_manufac"), rs.getString("fech_venta"), rs.getFloat("prec_venta"))
                );
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return ventas;
    }

    @Override
    public void eliminar(Long id) {
        String sql = "delete from venta where id_venta='" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void update(Venta entity) {
        PreparedStatement venta;
        try {
            venta = conn.prepareStatement("update venta set id_empl_2=?, id_cli_2=?, id_manufac_2=?, cantidad_manufac=?, fech_venta=?, prec_venta=? where id_venta='" + entity.getIdVenta() + "'");
            venta.setString(1, entity.getIdEmpl());
            venta.setString(2, entity.getIdCli() + "");
            venta.setString(3, entity.getId_manufac() + "");
            venta.setString(4, entity.getCantidadManufac() + "");
            venta.setString(5, entity.getFechVenta());
            venta.setString(6, entity.getPrecVenta() + "");
            int rows = venta.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Sale updated");
            }
        } catch (SQLException e) {
            Logger.getLogger(GestorVenta.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int getMsg() {
        return msg;
    }
}
