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
   
    private ArrayList<Filme> lista = null;
    private Filme filme = new Filme();
    private FilmeDAO filmes = new FilmeDAO();
    

    public Locadora() {
        
        this.filme = new Filme(this.getFilme().getTitulo(),this.getFilme().getData_lancamento(),this.getFilme().getNota(),this.getFilme().getDescricao(),this.getFilme().getQuantidade());
    
    }
    
    public ArrayList<Filme> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Filme> lista) {
        this.lista = lista;
    }
    
    public void listar(){
        lista = FilmeDAO.listar();
    }

    public ArrayList<Filme> getFilmes() {
   
        if(lista == null){
            lista = FilmeDAO.listar();
        }
        
        return lista;
    } 
    
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public void adicionarFilme(){  
        System.out.println("Bean");
        filmes.inserirFilme(filme);
    }

}
    
