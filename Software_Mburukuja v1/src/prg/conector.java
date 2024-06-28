/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author loncharich
 */
public class conector {
    
public static Connection getConexion(){
    Connection cn= null;
    

     try{
        Class.forName("org.postgresql.Driver");
        cn=(Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_prueba","postgres","12345");
        System.out.println("se hizo la conexion exitosa");

        
                
        }catch (Exception e){ 
            System.out.println(e.getMessage());
            
            
        }return cn;
         }
 Statement createStatement(){
     throw new UnsupportedOperationException("no soportado"); 
 }   

    public ResultSet consulta(String select_ci_from_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DefaultTableModel restornarDatos(String SQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
