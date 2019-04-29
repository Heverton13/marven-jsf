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

/**
 *
 * @author Aluno
 */
@ManagedBean(name="locadora")
public class Locadora {
   
    private ArrayList<Filme> lista = null;
    FilmeDAO filmes = new FilmeDAO();
    private Filme dados = new Filme();

    public Locadora() {
        
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

    public Filme getDados() {
        return dados;
    }

    public void setDados(Filme dados) {
        this.dados = dados;
    }
    
    public void adicionarFilme(){  
        System.out.println("Bean");
        System.out.println(dados.getTitulo());
        filmes.inserirFilme(dados);
        
    }

}
    
