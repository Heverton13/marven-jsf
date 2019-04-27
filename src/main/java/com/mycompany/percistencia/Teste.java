/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percistencia;


import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Dev
 */
public class Teste {
    
    public static void main(String[] args) {
        
            Connection connection = null;
	    try {   
	    	connection = Conexao.getConnection();
	    } catch (SQLException ex) {   
	    	          System.out.println("Connection Failed! Check output console");   
	    }
	    
	    if(connection!= null){
			System.out.println("A conexão com o banco foi realizada!");
	    }else{
	    	System.out.println("A conexão com o banco falhou!");
	    }
	    
	    try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
}
