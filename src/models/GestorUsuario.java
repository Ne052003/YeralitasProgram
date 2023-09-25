package models;

import java.awt.HeadlessException;
import resources.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.Optional;
import javax.swing.JOptionPane;

public class GestorUsuario {

    private final Connection conn;

    public GestorUsuario() {
        Conexion conexion = Conexion.getConexion();
        conn = conexion.getConnection();
    }

    public void agregar(Sesion sesion, Usuario usuario) {
        if (sesion.getUsuario().getRol() == 'A' || sesion.getUsuario().getRol() == 'G') {
            PreparedStatement usr;
            try {
                usr = conn.prepareStatement("Insert into Usuarios values(?,?,?,?)");
                usr.setString(1, usuario.getIdentificacion());
                usr.setString(2, usuario.getNombre());
                usr.setString(3, usuario.getCorreo());
                usr.setString(3, String.valueOf(usuario.getRol()));
                usr.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No fue posible guardar el usuario");
                Logger.getLogger(GestorCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void cambiarContraseña(Sesion sesion, String contrasenaActual, String nuevaContra) {
        try ( Statement query = conn.createStatement()) {
            ResultSet result = query.executeQuery("SELECT * FROM USUARIOS WHERE IDENTIFICACION='" + sesion.getUsuario().getIdentificacion() + "' AND WHERE CONTRASEÑA='" + contrasenaActual + "'");
            if (result.next()) {
                PreparedStatement update = conn.prepareStatement("UPDATE USUARIOS " + "SET CONTRASEÑA='" + nuevaContra + "' WHERE IDENTIFICACION='" + sesion.getUsuario().getIdentificacion() + "'");
                update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Contraseña actualizada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Datos erróneos");
            }
        } catch (SQLException e) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void cambiarContraseña(Sesion sesion, String nuevaContra) {
        try ( PreparedStatement update = conn.prepareStatement("UPDATE USUARIOS " + "SET CONTRASEÑA='" + nuevaContra + "' WHERE IDENTIFICACION='" + sesion.getUsuario().getIdentificacion() + "'")) {
            update.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contraseña actualizada correctamente");
        } catch (SQLException e) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Optional<Usuario> obtenerByCorreo(String correo) {
        String query = "select * from usuarios where correo='" + correo + "'";

        try ( Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                Usuario usuario = new Usuario(rs.getString("identificacion"), rs.getString("nombre"), rs.getString("correo"), rs.getString("rol").charAt(0));
                st.close();
                return Optional.of(usuario);
            } else {
                JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no pertenece a ningún usuario");
                st.close();

            }
        } catch (SQLException e) {
            Logger.getLogger(GestorUsuario.class
                    .getName()).log(Level.SEVERE, null, e);
        }
        return Optional.empty();
    }
    //Método que permite modificar los datos de un empleado o un administrador

    public void ModificarUsuario(Sesion sesion, String identificacion, String nombre, String correo) {
        try {
            try ( PreparedStatement update = conn.prepareStatement("update usuarios " + "set identificacion='" + identificacion + "', nombre='" + nombre + "', correo='" + correo + "' where identificacion='" + sesion.getUsuario().getIdentificacion() + "'")) {
                update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cambio realizado correctamente");

            }

        } catch (HeadlessException | SQLException e) {

            Logger.getLogger(Sesion.class
                    .getName()).log(Level.SEVERE, null, e);
        }
    }
}
