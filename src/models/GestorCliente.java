package models;

import resources.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import resources.GeneralMethods;
import views.AgregarCliente_JFrame;
import views.Menu_JFrame;

public class GestorCliente implements Gestor<Cliente> {

    private LinkedList<Cliente> clientes;
    private static Connection conn;

    public GestorCliente() {
        Conexion conexion = Conexion.getConexion();
        conn = conexion.getConnection();
        clientes = new LinkedList<>();
    }

    @Override
    public void agregar(Cliente cliente) {
        PreparedStatement cli;
        try {
            cli = conn.prepareStatement("Insert into CLIENTE values(?,?,?)");
            cli.setString(1, cliente.getNomCli());
            cli.setString(2, cliente.getNumCli());
            cli.setString(3, cliente.getDirCli());
            cli.executeUpdate();
            int msg = JOptionPane.showConfirmDialog(null, "Cliente registrado, ¿Desea agregar otro registro?");
            if (msg == JOptionPane.YES_OPTION) {
                GeneralMethods.openFrame(new AgregarCliente_JFrame());
            } else {
                Menu_JFrame.getMenu().setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LinkedList<Cliente> obtener(int atributo, String valor) {
        clientes = new LinkedList<>();
        String column;

        switch (atributo) {

            case 0 ->
                column = "id_cli";
            case 1 ->
                column = "nom_cli";
            case 2 ->
                column = "num_cli";
            default -> {
                Logger.getLogger(GestorCliente.class.getName()).log(Level.SEVERE, null, "Wrong ComboBox index");
                return new LinkedList();
            }
        }

        try {
            try ( Statement st = conn.createStatement()) {
                ResultSet rs = st.executeQuery("select * from cliente where " + column + "='" + valor + "'");
                while (rs.next()) {
                    clientes.add(new Cliente(Integer.parseInt(rs.getString("id_cli")), rs.getString("nom_cli"), rs.getString("num_cli"), rs.getString("dir_cli")));
                }
                st.close();
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return clientes;
    }

    @Override
    public List<Cliente> obtenerTodas() {
        LinkedList<Cliente> resultado = new LinkedList<>();

        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from cliente");
            while (rs.next()) {
                resultado.add(new Cliente(Integer.parseInt(rs.getString("id_cli")), rs.getString("nom_cli"), rs.getString("num_cli"), rs.getString("dir_cli")));
            }
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
    }

    @Override
    public void eliminar(Long id) {
        String sql = "delete from cliente where id_cli='" + id + "'";

        try ( Statement st = conn.createStatement()) {
            st.execute(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void update(Cliente entity) {
        PreparedStatement client;
        try {
            client = conn.prepareStatement("update cliente set nom_cli=?, num_cli=?, dir_cli=? where id_cli='" + entity.getIdCli() + "'");
            client.setString(1, entity.getNomCli());
            client.setString(2, entity.getNumCli());
            client.setString(3, entity.getDirCli());
            client.executeUpdate();

            int rows = client.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Client updated");
            }

        } catch (SQLException e) {
            Logger.getLogger(GestorCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
