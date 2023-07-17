/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gestor_Venta {
    
     private static Connection conn;
     private int msg=0;
    
    public Gestor_Venta(){
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn=conexion.getConnection();
    }
    
    public void Agregar_Venta(Venta venta){
        PreparedStatement ven;
        try {
            ven= conn.prepareStatement("Insert into venta values(?,?,?,?,?,?)");
            ven.setString(1,venta.getIdEmpl());
            ven.setString(2,venta.getIdCli()+"");
            ven.setString(3,venta.getId_manufac()+"");
            ven.setString(4,venta.getCantidadManufac()+"");
            ven.setString(5,venta.getFechVenta());
            ven.setString(6,venta.getPrecVenta()+"");
            ven.executeUpdate();
            msg=JOptionPane.showConfirmDialog(null,"Venta registrada, ¿Desea agregar otro registro?");
            
        }catch(SQLException ex){
            Logger.getLogger(Gestor_Venta.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public int getMsg(){
        return msg;
    }
    
    public static LinkedList<Venta> Consultar_Venta(int atributo, String dato){
        LinkedList<Venta> resultado= new LinkedList<>();
        String sql="";
            switch(atributo){
                
                case 1:
                  sql="select * from venta where id_manufac_2='"+dato+"'";
                break;
                case 2:
                    sql= "select * from venta where idCli_2='"+dato+"'";
                break;
                case 3: 
                    sql= "select * from venta where id_empl_2='"+dato+"'";
                break;
                case 4: 
                    sql= "select * from venta where prec_venta='"+dato+"'";
                break;
                case 5: 
                    sql= "select * from venta where fech_venta='"+dato+"'";
                break;
            }
            
            try{
            try (Statement st = conn.createStatement()) {
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    resultado.add(new Venta(rs.getInt("id_venta"), rs.getString("id_empl_2"), rs.getInt("idCli_2"),rs.getInt("id_manufac_2"),rs.getInt("cantidad_manufac"),rs.getString("fech_venta"),rs.getFloat("prec_venta")));
                }
            }
            }catch(SQLException e){
                Logger.getLogger(Gestor_Venta.class.getName()).log(Level.SEVERE,null, e);
            }
        
        
        return resultado;
    }
}
