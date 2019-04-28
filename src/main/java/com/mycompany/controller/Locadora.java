/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.modelo.Filme;
import com.mycompany.persistencia.FilmeDAO;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Aluno
 */
@ManagedBean
@SessionScoped
public class Locadora {
   
    public ArrayList<Filme> lista = null;
    
    
    public void listar(){
        lista = FilmeDAO.listar();
    }

    public ArrayList<Filme> getFilmes() {
       
        if(lista == null){
            lista = FilmeDAO.listar();
        }
        
        return lista;
    } 
    
    public void adicionarFilme(Filme f){
        
    }
        
}
    
