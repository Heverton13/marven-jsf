package com.mycompany.percistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String USUARIO = "hzuzmblqwbnnlt";
    private static final String SENHA = "bdb8cca23afc5e7dd0f7d734a58653d1179d8b466ea73be0236227c38d1ba05b";
    private static final String CAMINHO = "postgres://hzuzmblqwbnnlt:bdb8cca23afc5e7dd0f7d734a58653d1179d8b466ea73be0236227c38d1ba05b@ec2-54-235-114-242.compute-1.amazonaws.com:5432/d31o9kgkqrorvi";
    private static final String DRIVE = "org.postgresql.Driver";
    
    private Connection conexao;
    
    public void conecta() throws ClassNotFoundException{
        
        System.out.println("Com conexao a: " +  CAMINHO);
        
        try {
            Class.forName(DRIVE);
            conexao = DriverManager.getConnection(CAMINHO,USUARIO,SENHA);
        } catch(SQLException e) {
            System.err.println(e);
        }      
    }
    
    public void desconecta(){
        
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    public Connection getConexao(){
        return conexao;
    }
    
}

