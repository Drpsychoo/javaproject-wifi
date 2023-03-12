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
public class insert {
    public static void setDate(String Query,String msg){
        Connection con=null;
        Statement stmt=null;
        try{
            
           con=provider.getcon();
           stmt=con.createStatement();
           stmt.executeUpdate(Query);
           if(!msg.equals("")){
               JOptionPane.showConfirmDialog(null, "");
           }
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
            
}}
