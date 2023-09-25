package models;

import resources.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestorGerente implements Gestor<Gerente> {

    private static Connection conn;
    private int msg = 0;

    public GestorGerente() {
        Conexion conexion = Conexion.getConexion();
        conn = conexion.getConnection();
    }

    @Override
    public void agregar(Gerente gerente) {
        PreparedStatement ger;
        try {
            ger = conn.prepareStatement("Insert into gerente values(?,?,?,?,?,?,?)");
            ger.setString(1, gerente.getId_geren());
            ger.setString(2, gerente.getNom_geren());
            ger.setString(3, gerente.getApe_geren());
            ger.setString(4, gerente.getContraseña());
            ger.setString(5, gerente.getNum_geren());
            ger.setString(6, gerente.getCorreo());
            ger.setString(7, gerente.getFech_nac_geren());
            ger.executeUpdate();
            msg = JOptionPane.showConfirmDialog(null, "Gerente registrado, ¿Desea agregar otro registro?");
        } catch (SQLException e) {
            Logger.getLogger(GestorVenta.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void ModificarGeren(String identificacion, String nuevoNombre, String apellido, String nuevoNumero, String nuevoCorreo, String nuevaFecha) {
        try {
            try ( PreparedStatement update = conn.prepareStatement("update gerente set nom_geren='" + nuevoNombre + "',ape_geren='" + apellido + "',num_geren='" + nuevoNumero + "',correo='" + nuevoCorreo + "',fech_nac_geren='" + nuevaFecha + "' where id_geren='" + identificacion + "'")) {
                update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cambio realizado correctamente");
            }
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Error al verificar los datos"+e.getMessage());
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int getMsg() {
        return msg;
    }

    @Override
    public LinkedList<Gerente> obtener(int atributo, String dato) {
        LinkedList<Gerente> resultado = new LinkedList<>();
        String columnName;
        switch (atributo) {
            case 0 ->
                columnName = "id_geren";
            case 1 ->
                columnName = "nom_geren";
            case 2 ->
                columnName = "num_geren";
            default -> {
                Logger.getLogger(GestorGerente.class.getName()).log(Level.SEVERE, null, "Wrong ComboBox index");
                return new LinkedList();
            }
        }
        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from gerente where " + columnName + "='" + dato + "'");
            while (rs.next()) {
                resultado.add(new Gerente(rs.getString("id_geren"), rs.getString("nom_geren"), rs.getString("ape_geren"), rs.getString("num_geren"), rs.getString("correo"), rs.getString("fech_nac_geren")));
            }
        } catch (SQLException e) {
            Logger.getLogger(GestorVenta.class.getName()).log(Level.SEVERE, null, e);
        }
        return resultado;
    }

    @Override
    public List<Gerente> obtenerTodas() {
        LinkedList<Gerente> resultado = new LinkedList<>();

        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from gerente");
            while (rs.next()) {
                resultado.add(new Gerente(rs.getString("id_geren"), rs.getString("nom_geren"), rs.getString("ape_geren"), rs.getString("num_geren"), rs.getString("correo"), rs.getString("fech_nac_geren")));
            }
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
    }

    @Override
    public void eliminar(Long id) {
        String sql = "delete from gerente where id_geren=" + id;

        try ( Statement st = conn.createStatement()) {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GestorGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Gerente entity) {
        PreparedStatement ger;
        try {
            ger = conn.prepareStatement("update gerente set nom_geren=?, ape_geren=?, num_geren=?, correo=?, fech_nac_geren=? where id_geren='" + entity.getId_geren() + "'");
            ger.setString(2, entity.getNom_geren());
            ger.setString(3, entity.getApe_geren());
            ger.setString(4, entity.getContraseña());
            ger.setString(5, entity.getNum_geren());
            ger.setString(6, entity.getCorreo());
            ger.setString(7, entity.getFech_nac_geren());
            ger.executeUpdate();

            int rows = ger.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Manager updated");
            }

        } catch (SQLException e) {
            Logger.getLogger(GestorGerente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
