/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

/**
 *
 * @author Aluno
 */
public class Cesta {
    
    private Filme filmes;
    private int qtd;

    public Cesta(Filme filmes, int qtd) {
        this.filmes = filmes;
        this.qtd = qtd;
    }

    public Cesta() {
    }

    public Filme getFilmes() {
        return filmes;
    }

    public void setFilmes(Filme filmes) {
        this.filmes = filmes;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
}
