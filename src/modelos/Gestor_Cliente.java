
package modelos;

import recursos.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import recursos.MetodosGenerales;
import vistas.AgregarCliente_JFrame;

public class Gestor_Cliente {
    
    private static LinkedList <Cliente> clientes;
    private static Connection conn;
    
    public Gestor_Cliente() {
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn = conexion.getConnection();
        clientes = new LinkedList<>();
    }
    
    //Método para agregar clientes
    public void Agregar_Cliente(Cliente cliente){
        PreparedStatement cli;
        try {
            cli= conn.prepareStatement("Insert into CLIENTE values(?,?,?)");
            cli.setString(1,cliente.getNomCli());
            cli.setString(2,cliente.getNumCli());
            cli.setString(3,cliente.getDirCli());
            cli.executeUpdate();
            int msg=JOptionPane.showConfirmDialog(null,"Cliente registrado, ¿Desea agregar otro registro?");
            switch (msg) {
                case JOptionPane.YES_OPTION:
                    MetodosGenerales.abrirVentana(new AgregarCliente_JFrame());
                    break;
                case JOptionPane.NO_OPTION:
                    MetodosGenerales.RolMenu();
                    break;
                case JOptionPane.CANCEL_OPTION:
                    MetodosGenerales.RolMenu();
                    break;
                default:
                    break;
            }
        }catch(SQLException ex){
            Logger.getLogger(Gestor_Cliente.class.getName()).log(Level.SEVERE,null, ex);
        }
        //clientes.add(cliente);
    }
    
    //Método para obtener todos los clientes
    public static LinkedList<Cliente> ObtenerClientes(){
        return clientes;
    }
    
    //Método para consultar cliente por parámetros
    public static LinkedList<Cliente> Consultar_Cliente(int atributo, String valor){
        LinkedList<Cliente> resultado= new LinkedList<>();
        String sql="";
        
            switch(atributo){
                
                case 1:
                  sql="select * from cliente where idCli='"+valor+"'";
                break;
                case 2:
                    sql= "select * from cliente where nomCli='"+valor+"'";
                break;
                case 3: 
                    sql= "select * from cliente where numCli='"+valor+"'";
                break;
            }
            
            try{
            try (Statement st = conn.createStatement()) {
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    resultado.add(new Cliente(Integer.parseInt(rs.getString("idCli")), rs.getString("nomCli"), rs.getString("numCli"), rs.getString("dirCli")));
                }
            }
            }catch(NumberFormatException | SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        
        return resultado;
    }
    
    
}
