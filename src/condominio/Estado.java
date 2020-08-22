/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */
public class Estado {
    int idEstado;
    String nomeEstado;

    public Estado() {
    }

    public Estado(int idEstado, String nomeEstado) {
        this.idEstado = idEstado;
        this.nomeEstado = nomeEstado;
    }
    
    public ArrayList<Estado> listaEstados(Connection con){
        ResultSet resultSet = null;
        Estado estado;
        ArrayList<Estado> estados = new ArrayList<>();
        
        try{
            java.sql.Statement statement = con.createStatement();

            String selectSql = "SELECT [id_estado],[nome]"
                    + "FROM estado";
            resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()) {
                estado = new Estado(Integer.parseInt(resultSet.getString(1)), resultSet.getString(2));
                
                estados.add(estado);
                
               
            }
                  
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erro de conexão");
        }
        
        return estados;     
    } 

    public String getNomeEstado() {
        return nomeEstado;
    }
    
   

    
}
