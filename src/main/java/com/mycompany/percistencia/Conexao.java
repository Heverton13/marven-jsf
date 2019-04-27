package com.mycompany.percistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String USUARIO = "hzuzmblqwbnnlt";
    private static final String SENHA = "bdb8cca23afc5e7dd0f7d734a58653d1179d8b466ea73be0236227c38d1ba05b";
    private static final String CAMINHO = "jdbc:postgresql://ec2-54-235-114-242.compute-1.amazonaws.com:5432/d31o9kgkqrorvi";
    private static final String DRIVER = "org.postgresql.Driver";
    
    //jdbc:postgresql://SERVIDOR:PORTA/BANCO?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory

    private Connection conexao;
    
  public static Connection getConnection() throws SQLException {
		try {   
			Class.forName(DRIVER);   
		} catch (ClassNotFoundException ex) {   
			System.out.println("Where is your PostgreSQL JDBC Driver? Include in your library path!");   
			return null;   
		}   
		Connection conn = DriverManager.getConnection(CAMINHO, USUARIO, SENHA); 
		return conn;   
	}

    public Connection getConexao(){
        return conexao;
    }
}


