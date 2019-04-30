package com.mycompany.controller;

import com.mycompany.modelo.Filme;
import com.mycompany.persistencia.FilmeDAO;
import java.sql.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Dev
 */
@ManagedBean(name="controler")
public class ControlerFilme {
    
    private Filme filme = new Filme();
    FilmeDAO dao = new FilmeDAO();

    public ControlerFilme() {
           
        filme = new Filme();
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public void salvarFilme(){
        dao.inserirFilme(filme);
    }
    
}
