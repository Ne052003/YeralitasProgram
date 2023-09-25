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

public class GestorManufactura implements Gestor<Manufactura> {

    private static Connection conn;

    public GestorManufactura() {
        Conexion conexion = Conexion.getConexion();
        conn = conexion.getConnection();
    }

    @Override
    public void agregar(Manufactura manufactura) {
        PreparedStatement manu;
        try {
            manu = conn.prepareStatement("Insert into manufactura values(?,?)");
            manu.setString(1, manufactura.getNom_manufac());
            manu.setString(2, manufactura.getPrec_manufac() + "");
            manu.executeUpdate();
            JOptionPane.showMessageDialog(null, "Manufactura guardada");
        } catch (SQLException ex) {
            Logger.getLogger(GestorManufactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LinkedList<Manufactura> obtener(int atributo, String dato) {
        LinkedList<Manufactura> resultado = new LinkedList<>();
        String columnName;

        switch (atributo) {

            case 0 ->
                columnName = "id_manufac";
            case 1 ->
                columnName = "nom_manufac";
            case 2 ->
                columnName = "prec_manufac";
            default -> {
                Logger.getLogger(GestorManufactura.class.getName()).log(Level.SEVERE, null, "Wrong ComboBox index");
                return new LinkedList();
            }
        }

        try ( java.sql.Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from manufactura where " + columnName + "='" + dato + "'");
            while (rs.next()) {
                resultado.add(new Manufactura(rs.getInt("id_manufac"), rs.getString("nom_manufac"), rs.getFloat("prec_manufac")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El dato no corresponde con el filtro");
            Logger.getLogger(GestorManufactura.class.getName()).log(Level.SEVERE, null, e);
        }

        return resultado;
    }

    @Override
    public LinkedList<Manufactura> obtenerTodas() {
        LinkedList<Manufactura> resultado = new LinkedList<>();
        String sql = "select * from manufactura";

        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Manufactura(rs.getInt("id_manufac"), rs.getString("nom_manufac"), rs.getFloat("prec_manufac")));
            }
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
    }

    @Override
    public void eliminar(Long id) {
        String sql = "delete from manufactura where Id_Manufac='" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void update(Manufactura entity) {
        PreparedStatement manu;
        try {
            manu = conn.prepareStatement("update manufactura set nom_manufac=?, prec_manufac=?  where id_produ='" + entity.getId_manufac() + "'");
            manu.setString(1, entity.getNom_manufac());
            manu.setString(2, entity.getPrec_manufac() + "");
            manu.executeUpdate();

            int rows = manu.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Manufacture updated");
            }

        } catch (SQLException e) {
            Logger.getLogger(GestorManufactura.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
