
package com.mycompany.controller;

import com.mycompany.modelo.Filme;
import com.mycompany.persistencia.FilmeDAO;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Dev
 */
@ManagedBean(name="cesta")
@SessionScoped
public class ControlerCesta {
    
    private ArrayList<Filme> cesta = new ArrayList<Filme>();
    FilmeDAO fdao = new FilmeDAO();
    Filme f = new Filme();
    private float valor;
    private int qtdCesta;

    public ArrayList<Filme> getCesta() {
        return cesta;
    }

    public void setCesta(ArrayList<Filme> cesta) {
        this.cesta = cesta;
    }

    public FilmeDAO getFdao() {
        return fdao;
    }

    public void setFdao(FilmeDAO fdao) {
        this.fdao = fdao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtdCesta() {
        return qtdCesta;
    }

    public void setQtdCesta(int qtdCesta) {
        this.qtdCesta = qtdCesta;
    }

    public void addFilme(Filme f) {
       
         System.out.println("Quantidade add antes: "+f.getQuantidade());
            qtdCesta++;
            fdao.updateQuantidade(f.getQuantidade()-1, f.getId());
            f.setQuantidade(f.getQuantidade()-1);
            cesta.add(f);

    }

    public void removerFilme(Filme f) {

        qtdCesta--;
        
        fdao.updateQuantidade(f.getQuantidade()+1, f.getId());
        f.setQuantidade(f.getQuantidade()+1);
        cesta.remove(f);
}
    
}
