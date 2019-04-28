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
        
        Date data = Date.valueOf("2010-10-10");
        Filme f = new Filme(" ABC", data, 4,"Filme que quero testar", 3);
        
        FilmeDAO dao = new FilmeDAO();
        if(dao.inserirFilme(f)){
            System.out.println("Deu certo");
        }else{
            System.out.println("Erro");
        }
		
	}
    
}
