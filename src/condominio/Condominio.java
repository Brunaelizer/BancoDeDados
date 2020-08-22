/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bruna
 */
public class Condominio {
    Integer idCondominio;
    String nome;
    float valorCondominio;
    Integer estado;
    String cidade;
    String bairro;
    String rua;
    Integer numero;

    public Condominio(Integer id_condominio, String nome, float valor_condominio, Integer estado, String cidade, String bairro, String rua, Integer numero) {
        this.idCondominio = id_condominio;
        this.nome = nome;
        this.valorCondominio = valor_condominio;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Condominio() {
        
    }

    public String getNome() {
        return nome;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public Integer getEstado() {
        return estado;
    }

    public Integer getIdCondominio() {
        return idCondominio;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public float getValorCondominio() {
        return valorCondominio;
    }
    
    
    
    


    
}
