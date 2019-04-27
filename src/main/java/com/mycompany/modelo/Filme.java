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
    
    private String titulo;
    private Date datalancamento;
    private int nota;
    private String descricao;
    private int quantidade;

    public Filme() {
    }

    public Filme(String titulo, Date datalancamento, int nota, String descricao, int quantidade) {
        this.titulo = titulo;
        this.datalancamento = datalancamento;
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

    public Date getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(Date datalancamento) {
        this.datalancamento = datalancamento;
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
    
}
