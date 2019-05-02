/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import java.util.Date;


/**
 *
 * @author Dev
 */

public class Filme{
    
    private int id;
    private String titulo;
    private Date data_lancamento;
    private int nota;
    private String descricao;
    private int quantidade;

    public Filme() {
    }

    public Filme(String titulo, Date datalancamento, int nota, String descricao, int quantidade) {
        this.titulo = titulo;
        this.data_lancamento = datalancamento;
        this.nota = nota;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    public Filme(int id, String titulo, Date datalancamento, int nota, String descricao, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.data_lancamento = datalancamento;
        this.nota = nota;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
    
    
    
}
