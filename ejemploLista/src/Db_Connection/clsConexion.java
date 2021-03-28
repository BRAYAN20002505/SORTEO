/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db_Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author PC-ELHID
 */
public class clsConexion {
    //conexion de base de datos
    public Connection conexion;//?autoReconnect=true&useSSL=false
    private final String servidor_conexion = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
    static private final String usuario="root";
   static private final String clave = "";

     public Connection getConexion()
    {
        Connection conn;
        try{
            conn = DriverManager.getConnection(servidor_conexion, usuario,clave);
            return conn;
        }catch (Exception ex){
            System.out.println("Error: "+ex.getMessage());
            return null;
        }
    }
     
     public ArrayList<String> getNomsLista()
    {
     
        ArrayList<String> list = new ArrayList<String>();
        
        Connection conn = getConexion();
        String query = "SELECT * FROM `tabla sorteo`.tb_names;";
        Statement st;
        ResultSet rs;

        try{
            st = conn.createStatement();
            rs  = st.executeQuery(query);
            
            while(rs.next()){
            list.add(rs.getString("name"));
          
            }
            
        }catch (SQLException ex){
                ex.printStackTrace();
        }
        return list;
    }
     
     
}
