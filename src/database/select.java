/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mahes
 */
public class select {
    public static ResultSet getData(String Query){
     
       Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try{
            
           con=provider.getcon();
           stmt=con.createStatement();
           rs=stmt.executeQuery(Query);
           return rs;
           
           
           
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
                    return null;
        }
        
        

     
        
        
        
    }
    
}
