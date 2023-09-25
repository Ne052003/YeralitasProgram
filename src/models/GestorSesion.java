package models;

import java.sql.*;
import java.time.LocalTime;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import resources.Conexion;

public class GestorSesion {

    private Connection conn;
    private final Conexion conexion;
    private static Sesion sesion;

    public GestorSesion() {
        conexion = Conexion.getConexion();
        conn = conexion.getConnection();
    }

    public Optional<Sesion> iniciarSesion(String id, String pass) {
        String sql = "select * from usuarios where identificacion='" + id + "'";

        try ( Statement st = conn.createStatement()) {

            ResultSet rs = st.executeQuery(sql);
            if (rs.next() && rs.getString("contraseña").equals(pass)) {
                Usuario usuario = new Usuario(rs.getString("identificacion"), rs.getString("nombre"), rs.getString("correo"), rs.getString("rol").charAt(0));
                sesion = new Sesion(usuario, LocalTime.now());
                st.close();
                return Optional.of(sesion);
            }

        } catch (SQLException e) {
            Logger.getLogger(GestorSesion.class.getName()).log(Level.SEVERE, null, "Error al verificar los datos" + e.getMessage());
        }
        return Optional.empty();
    }

    public int cerrarSesion() {
        conn = conexion.desconectarDB();
        sesion = null;
        return conn == null ? 1 : 0;
    }

    public static Sesion getSesion() {
        return sesion;
    }

}
