/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCConnector {
    public Connection getConnection() {
    
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
                 
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/system?serverTimezone=UTC"
                , "root", "root");
        
     }catch (ClassNotFoundException |SQLException e){
    Logger.getLogger(JDBCConnector.class.getName()).log(Level.SEVERE, null, e);
    }
        return null;
}
}
