package com.mycompany.controller;

import com.mycompany.modelo.Cesta;
import com.mycompany.modelo.Filme;
import com.mycompany.persistencia.FilmeDAO;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Dev
 */
@ManagedBean(name="controler")
public class ControlerFilme {
  
    private Filme filme = new Filme();
    FilmeDAO fdao = new FilmeDAO();
    private ArrayList<Filme> lista = null;

    public ControlerFilme() {
    }
    
    public void cadastraFilme() {        
        fdao.inserirFilme(filme);
     }
      
    
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
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
    
}
