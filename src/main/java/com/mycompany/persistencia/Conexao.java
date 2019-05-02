package com.mycompany.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";
    private static final String CAMINHO = "jdbc:postgresql://localhost:5432/locadora";
    private static final String DRIVER = "org.postgresql.Driver";
    
    //jdbc:postgresql://SERVIDOR:PORTA/BANCO?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory

    private static Connection connection;
    
    public static void dbConnection() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(PVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection = DriverManager.getConnection(CAMINHO, USUARIO, SENHA);
            System.out.println("Connected");
        } catch (SQLException ex) {
           //Logger.getLogger(PVendedor.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Not connected");
        }

    }
    
    public static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException ex) {
            //Logger.getLogger(PConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public static Connection getConexao(){
        return connection;
    }
}


