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
        
        Filme f = new Filme();
        
        f.setTitulo("A morte da vipuva");
        f.setData_lancamento(data);
        f.setNota(3);
        f.setDescricao("Filme novo ");
        f.setQuantidade(50);
        
        FilmeDAO con = new FilmeDAO();
        con.inserirFilme(f);
		
	}
    
}
