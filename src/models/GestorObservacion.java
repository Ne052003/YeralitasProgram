package models;

import resources.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestorObservacion implements Gestor<Observacion> {

    private final Connection conn;

    public GestorObservacion() {
        conn = Conexion.getConexion().getConnection();
    }

    @Override
    public void agregar(Observacion observacion) {
        PreparedStatement observacionPr;
        try {
            observacionPr = conn.prepareStatement("Insert into observacion_producto values(?,?,?)");
            observacionPr.setInt(1, observacion.getId_produ_2());
            observacionPr.setString(2, observacion.getFech_observ());
            observacionPr.setString(3, observacion.getObervacion());
            observacionPr.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestorObservacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public LinkedList<Observacion> obtener(int atributo, String dato) {
        LinkedList<Observacion> resultado = new LinkedList<>();
        String sql = "";

        switch (atributo) {

            case 0 ->
                sql = "select * from observacion_producto where id_observ='" + dato + "'";
            case 1 ->
                sql = "select * from observacion_producto where id_produ_2='" + dato + "'";
            case 2 ->
                sql = "select * from observacion_producto where fech_observ='" + dato + "'";
        }

        try ( java.sql.Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Observacion(rs.getInt("id_observ"), rs.getInt("id_produ_2"), rs.getString("fech_observ"), rs.getString("observacion")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
    }

    @Override
    public void update(Observacion observacion) {

    }

    @Override
    public List<Observacion> obtenerTodas() {
        LinkedList<Observacion> resultado = new LinkedList<>();
        String sql = "select * from observacion_producto";

        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Observacion(rs.getInt("id_observ"), rs.getInt("id_produ_2"), rs.getString("fech_observ"), rs.getString("observacion")));
            }
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
    }

    @Override
    public void eliminar(Long id) {
        String sql = "delete from observacion_producto where id_observ='" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
