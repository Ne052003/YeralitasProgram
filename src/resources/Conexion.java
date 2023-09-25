package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection connection;
    private static Conexion conexion;

    static {
        conexion = new Conexion();
    }

    private Conexion() {
        String url = "jdbc:sqlserver://localhost:" + "1433" + ";" + "databaseName=Yeralitas_Database";
        String user = "Neoly";
        String password = "SQLSERVERlexis_22";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null, "Error al intentar conectarse a la base de datos" + e.toString());
        }
    }

    public static Conexion getConexion() {

        if (conexion == null) {
            conexion = new Conexion();
            return conexion;
        }
        return conexion;

    }

    public Connection getConnection() {
        return connection;
    }

    public Connection desconectarDB() {
        try {
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible finalizar la conexión" + e);
        }

        conexion = null;
        connection = null;
        System.gc();
        return connection;
    }
}
