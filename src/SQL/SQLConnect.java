/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bruna
 */
public class SQLConnect {
    
    Connection con;

    public SQLConnect() {
    }
    
    
    public void SQLConnection() throws SQLException{
        
        String url = "jdbc:sqlserver://localhost;database=Condominio";
        String username = "sa";
        String password = "1234";
        
        ResultSet resultSet = null;
        

        try{
           con = DriverManager.getConnection(url,username,password); 
            System.out.println("Conectado");
            
                  
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erro de conexão");
        }

    }

    public Connection getCon() {
        return con;
    }
    
        
}
