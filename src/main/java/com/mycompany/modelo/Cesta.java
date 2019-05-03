
package com.mycompany.modelo;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Cesta {
    
    private int id;
    private String nome;
    private Date data;
    private int nota;
    private String descricao;
    private int quantidade;

    public Cesta(int id, String nome, Date data, int nota, String descricao, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.nota = nota;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Cesta(String nome, Date data, int nota, String descricao, int quantidade) {
        this.nome = nome;
        this.data = data;
        this.nota = nota;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Cesta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    @Override
    public String toString() {
        return "Cesta{" + "id=" + id + ", nome=" + nome + ", data=" + data + ", nota=" + nota + ", descricao=" + descricao + ", quantidade=" + quantidade + '}';
    }
    
    
}
