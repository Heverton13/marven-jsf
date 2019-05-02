/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencia;


import com.mycompany.modelo.Filme;
import java.sql.Date;

/**
 *
 * @author Dev
 */
public class Teste {
    
    public static void main(String[] args) {
        
        
        FilmeDAO filmes = new FilmeDAO();
        
        Date data = Date.valueOf("2010-10-10");
        
        Filme f2 = new Filme("Os vingadores",data,5,"Filme massa",5);
        filmes.inserirFilme(f2);
       
		
	}
    
}
