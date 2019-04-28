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
       
        filmes.inserirFilme("A morte da bezerra",data,5,"O filme de todos os tempos",10);
       
		
	}
    
}
