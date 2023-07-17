package recursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

  private Connection connection;

  public Conexion(String ip, String bd, String usr, String pass) {
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:" + "1433" + ";" + "databaseName=" + bd;
    try {
      Class.forName(driver).newInstance();
      connection = DriverManager.getConnection(url, usr, pass);
    } catch (ClassNotFoundException
        | IllegalAccessException
        | InstantiationException
        | SQLException e) {
      JOptionPane.showMessageDialog(
          null, "Error al intentar conectarse a la base de datos" + e.toString());
    }
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

    connection = null;
    return connection;
  }
}
