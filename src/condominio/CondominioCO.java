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
import java.sql.PreparedStatement;

/**
 *
 * @author Bruna
 */
public class CondominioCO {
    ArrayList<Condominio> condominios;

    public CondominioCO() {
        condominios = new ArrayList<>();
    }
    
    public ArrayList<Condominio> selectCondominio(Connection con) throws SQLException{
        ResultSet resultSet = null;
        Condominio condominio;
        try{
            java.sql.Statement statement = con.createStatement();

            String selectSql = "SELECT [id_condominio],[nome],[valor_condominio],[estado],[cidade],[bairro],[rua],[numero] "
                    + "FROM condominio";
            resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()) {
                condominio = new Condominio(Integer.parseInt(resultSet.getString(1)), resultSet.getString(2), Float.parseFloat(resultSet.getString(3)), Integer.parseInt(resultSet.getString(4)), 
                        resultSet.getString(5) , resultSet.getString(6), resultSet.getString(7), Integer.parseInt(resultSet.getString(8)));
                
                adicionarCondominio(condominio);
                
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + resultSet.getString(3) + " " + resultSet.getString(4)+ " "+ 
                        resultSet.getString(5) + " " + resultSet.getString(6) +" " + resultSet.getString(7) + " " + resultSet.getString(8));
            }
                  
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erro de conexão");
        }
        
        return this.condominios;
    }
    
    
    public void adicionarCondominio(Condominio condominio){
        condominios.add(condominio);
    }
    
    public void insertCondominio(Condominio condominio, Connection con){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            java.sql.Statement statement = con.createStatement();
            
            pstmt = con.prepareStatement(
            "INSERT INTO condominio([nome],[valor_condominio],[estado],[cidade],[bairro],[rua],[numero]) values(?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, condominio.getNome());
            pstmt.setDouble(2, condominio.getValorCondominio());
            pstmt.setInt(3, condominio.getEstado());
            pstmt.setString(4, condominio.getCidade());
            pstmt.setString(5, condominio.getBairro());
            pstmt.setString(6, condominio.getRua());
            pstmt.setInt(7, condominio.getNumero());
            pstmt.executeUpdate();
            pstmt.close();
                  
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erro de conexão");
        }
    }
    
    public void updateCondominio(Condominio condominio, Connection con){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            java.sql.Statement statement = con.createStatement();
            
            pstmt = con.prepareStatement(
            "UPDATE condominio SET [nome] = ?,[valor_condominio] = ?,[estado] = ?,[cidade] = ?,[bairro] = ?,[rua] = ?,[numero] = ? WHERE id_condominio = ?");
            pstmt.setString(1, condominio.getNome());
            pstmt.setDouble(2, condominio.getValorCondominio());
            pstmt.setInt(3, condominio.getEstado());
            pstmt.setString(4, condominio.getCidade());
            pstmt.setString(5, condominio.getBairro());
            pstmt.setString(6, condominio.getRua());
            pstmt.setInt(7, condominio.getNumero());
            pstmt.setInt(8, condominio.getIdCondominio());
            pstmt.executeUpdate();
            pstmt.close();
                  
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erro de conexão");
        }
    }
    
    public void deleteCondominio(int id, Connection con){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            java.sql.Statement statement = con.createStatement();
            
            pstmt = con.prepareStatement(
            "DELETE FROM condominio WHERE id_condominio = ?");
            pstmt.setInt(1, id);

            pstmt.executeUpdate();
            pstmt.close();
                  
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erro de conexão");
        }
    }
}
