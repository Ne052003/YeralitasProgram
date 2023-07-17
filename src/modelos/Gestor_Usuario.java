
package modelos;
import recursos.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

public class Gestor_Usuario {
    
    private static Connection conn;
    private static String rol="";

    public Gestor_Usuario() {
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn = conexion.getConnection();
    }
    
    //Método para agregar un usuario
    public void agregarUsuario(Usuario usuario){
        PreparedStatement usr;
        try{
            usr= conn.prepareStatement("Insert into Usuarios values(?,?,?,?)");
            usr.setString(1,usuario.getIdentificacion());
            usr.setString(2,usuario.getNombre());
            usr.setString(3,usuario.getCorreo());
            usr.setString(4,usuario.getContraseña());
            usr.executeUpdate();
        }catch(SQLException e){
            Logger.getLogger(Gestor_Cliente.class.getName()).log(Level.SEVERE,null, e);
    }
       
    }
    
    //Método para cambiar contraseña
    public static void cambiarContraseña(String correo, String nuevaContra){
        try{
            PreparedStatement update= conn.prepareStatement("UPDATE "+ getRol() + " SET CONTRASEÑA='"+nuevaContra+"' WHERE CORREO='"+correo+"'");
            update.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contraseña actualizada correctamente");
            update.close();
        }catch(SQLException e){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    public static boolean buscarCorreo(String correo){
        boolean verificacion=false;
        String userQuery = "select * from usuarios where correo='" + correo + "'";
        String gerenteQuery = "select * from gerente where correo='" + correo + "'";
        String adminQuery = "select * from administrador where correo='" + correo + "'";
        
        try{
            Statement st= conn.createStatement();
            Statement st1= conn.createStatement();
            Statement st2= conn.createStatement();
            ResultSet rs= st.executeQuery(userQuery);
            ResultSet rs1= st1.executeQuery(gerenteQuery);
            ResultSet rs2= st2.executeQuery(adminQuery);
            
            if(rs.next()){
                verificacion=true;
                rol="usuarios";
                
            }else if(rs1.next()){
                verificacion=true;
                rol="gerente";
                
            }else if(rs2.next()){
                verificacion=true;
                rol="administrador";
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no pertenece a ningún usuario");
            }
            st.close();
            st1.close();
            st2.close();
        }catch(SQLException e){
            Logger.getLogger(Gestor_Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return verificacion;
    }
    
    public static String getRol(){
        return rol;
    }
}
