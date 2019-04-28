/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.modelo.Filme;
import com.mycompany.persistencia.FilmeDAO;
import java.sql.Date;
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
    private Filme filme;
    private  FilmeDAO filmes = new FilmeDAO();
    
    
    public Locadora() {
        
        Date data = Date.valueOf("2018-10-19");
        filme = new Filme("Mogli",data,3,"O menino Lobo", 20);
        
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
    
    public void adicionarFilme(String titulo, Date data_lancamento, int nota, String descricao,int quantidade){
        
        filme.setTitulo(titulo);
        filme.setData_lancamento(data_lancamento);
        filme.setNota(nota);
        filme.setDescricao(descricao);
        filme.setQuantidade(quantidade);
        
        filmes.inserirFilme(filme.getTitulo(), (Date) filme.getData_lancamento(), filme.getNota(), filme.getDescricao(), filme.getQuantidade());
        
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    
    
}
    
