/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.awt.HeadlessException;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author mahes
 */
public class tables {

    /**
     *
     * @param args
     */
    public static void main(String[]args ){
        Connection con=null;
        Statement stmt=null;
        try{
            con=provider.getcon();
            stmt=con.createStatement();
            stmt.executeUpdate(" CREATE TABLE wifiusers1 ( department VARCHAR(200),faculty VARCHAR(200),Q1 VARCHAR(200),Q2 VARCHAR(200),Q3 VARCHAR(200),Q4 VARCHAR(200),Q5 VARCHAR(200),Q6 VARCHAR(200),Q7 VARCHAR(200),Q8 VARCHAR(200),Q9 VARCHAR(200),Q10 VARCHAR(200),Q11 VARCHAR(200),Q12 VARCHAR(200)          ,FEEDBACK VARCHAR(200) ) ");
            JOptionPane.showConfirmDialog(null, "Table create sucessfully");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        finally{
            try{
                con.close();
                stmt.close();
                
            }catch(Exception e){
                
            }
        }
        
    };
    
}
