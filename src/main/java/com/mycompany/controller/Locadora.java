/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.modelo.Filme;
import com.mycompany.persistencia.FilmeDAO;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private FilmeDAO filmes = new FilmeDAO();
    
    private String titulo;
    private Date data;
    private Integer nota;
    private String descricao;
    private Integer quantidade;
    

    public Locadora() throws ParseException {
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
java.   sql.Date datas = new java.sql.Date(df.parse("000-00-00").getTime());
        filme = new Filme("Titulo do Filme",datas,0,"Descricao",0);
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

    public void setFilmes(FilmeDAO filmes) {
        this.filmes = filmes;
    }
    
    public void adicionarFilme(String titulo, Date data_lancamento, int nota, String descricao,int quantidade){

        filme.setTitulo(titulo);
        filme.setData_lancamento(data_lancamento);
        filme.setNota(nota);
        filme.setDescricao(descricao);
        filme.setQuantidade(quantidade);
        
        System.out.println(filme.getDescricao() + filme.getData_lancamento() + filme.getNota() + filme.getDescricao() + filme.getQuantidade());
        filmes.inserirFilme(filme.getTitulo(), filme.getData_lancamento(), filme.getNota(), filme.getDescricao(), filme.getQuantidade());
    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
    
