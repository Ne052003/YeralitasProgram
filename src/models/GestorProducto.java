package models;

import resources.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class GestorProducto implements Gestor<Producto> {

    private static Connection conn;

    public GestorProducto() {
        Conexion conexion = Conexion.getConexion();
        conn = conexion.getConnection();
    }

    @Override
    public void agregar(Producto producto) {
        PreparedStatement produ;
        try {
            produ = conn.prepareStatement("Insert into PRODUCTO values(?,?,?,?,?,?)");
            produ.setString(1, producto.getId_geren_2());
            produ.setString(2, producto.getNom_produ());
            produ.setString(3, producto.getPrec_produ() + "");
            produ.setString(4, producto.getUnidad_medida_2());
            produ.setString(5, producto.getFech_ingreso_produ());
            produ.setString(6, producto.getFech_caducidad());
            produ.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product registered");
        } catch (SQLException ex) {
            Logger.getLogger(GestorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LinkedList<Producto> obtener(int atributo, String valor) {
        LinkedList<Producto> resultado = new LinkedList<>();
        String column;
        switch (atributo) {
            case 0 ->
                column = "id_produ";
            case 1 ->
                column = "nom_produ";
            case 2 ->
                column = "prec_produ";
            case 3 ->
                column = "fech_ingreso_produ";
            default -> {
                Logger.getLogger(GestorProducto.class.getName()).log(Level.SEVERE, null, "Wrong ComboBox index");
                return new LinkedList();
            }

        }
        try {
            try ( Statement st = conn.createStatement()) {
                ResultSet rs = st.executeQuery("select * from Producto where " + column + "='" + valor + "'");
                while (rs.next()) {
                    resultado.add(new Producto(rs.getInt("id_produ"), rs.getString("id_geren_2"), rs.getString("nom_produ"), rs.getFloat("prec_produ"), rs.getString("unidad_medida_2"), rs.getString("fech_ingreso_produ"), rs.getString("fech_caducidad")));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "The data does not aply for the filter");
            Logger.getLogger(GestorProducto.class.getName()).log(Level.SEVERE, null, e);
        }

        return resultado;
    }

    @Override
    public LinkedList<Producto> obtenerTodas() {
        LinkedList<Producto> todoproducto = new LinkedList<>();
        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from producto");
            while (rs.next()) {
                todoproducto.add(new Producto(rs.getInt("id_produ"), rs.getString("id_geren_2"), rs.getString("nom_produ"), rs.getFloat("prec_produ"), rs.getString("unidad_medida_2"), rs.getString("fech_ingreso_produ"), rs.getString("fech_caducidad")));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return todoproducto;
    }

    @Override
    public void eliminar(Long id) {
        String sql = "delete from producto where id_produ='" + id + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void update(Producto entity) {
        PreparedStatement produ;
        try {
            produ = conn.prepareStatement("update producto set nom_produ=?, id_geren_2=?, prec_produ=?, unidad_medida_2=?, fech_ingreso_produ=?, fech_caducidad=? where id_produ='" + entity.getId_produ() + "'");
            produ.setString(1, entity.getNom_produ());
            produ.setString(2, entity.getId_geren_2());
            produ.setString(3, entity.getPrec_produ() + "");
            produ.setString(4, entity.getUnidad_medida_2());
            produ.setString(5, entity.getFech_ingreso_produ());
            produ.setString(6, entity.getFech_caducidad());
            produ.executeUpdate();

            int rows = produ.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Product updated");
            }

        } catch (SQLException e) {
            Logger.getLogger(GestorProducto.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
