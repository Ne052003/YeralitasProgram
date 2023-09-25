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

public class GestorArea implements Gestor<Area> {

    private static Connection conn;

    public GestorArea() {
        Conexion conexion = Conexion.getConexion();
        conn = conexion.getConnection();
    }

    @Override
    public LinkedList<Area> obtener(int atributo, String dato) {
        LinkedList<Area> resultado = new LinkedList<>();
        String sql = "select * from area where codig_area='" + dato + "'";

        try ( java.sql.Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Area(rs.getInt("codigo_area"), rs.getString("nom_area")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
    }

    @Override
    public LinkedList<Area> obtenerTodas() {
        LinkedList<Area> resultado = new LinkedList<>();
        String sql = "select * from manufactura";

        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Area(rs.getInt("codigo_area"), rs.getString("nom_area")));
            }
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
    }

    @Override
    public void eliminar(Long id) {
        String sql = "delete from area where codigo_area='" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void agregar(Area area) {
        PreparedStatement areaStatement;
        try {
            areaStatement = conn.prepareStatement("Insert into area values(?)");
            areaStatement.setString(1, area.getNomArea());
            areaStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Area guardada");
        } catch (SQLException ex) {
            Logger.getLogger(GestorArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Area entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
