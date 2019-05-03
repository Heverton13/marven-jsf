
package com.mycompany.persistencia;

import com.mycompany.modelo.Cesta;
import com.mycompany.modelo.Filme;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Dev
 */
public class FilmeDAO {
    
    private final String INSERTFILME = "insert into filmes (TITULO, DATA_LANCAMENTO, NOTA, DESCRICAO, QUANTIDADE) values (?,?,?,?,?);";
    private final String DELETEFILME = "DELETE FROM FILMES WHERE ID_FILME = ?";
    private final String LISTAFILME = "SELECT * FROM FILMES WHERE ORDER BY";
    
    public boolean inserirFilme(Filme f){
        
        
        Conexao.dbConnection();
        System.out.println(f);
        try {
            
           
            PreparedStatement preparaInstrucao;
            preparaInstrucao = Conexao.getConexao().prepareStatement(INSERTFILME);
            
            preparaInstrucao.setString(1,f.getTitulo());
            preparaInstrucao.setDate(2, new java.sql.Date(new Date().getTime()));
            preparaInstrucao.setInt(3, f.getNota());
            preparaInstrucao.setString(4, f.getDescricao());
            preparaInstrucao.setInt(5, f.getQuantidade());
            preparaInstrucao.executeUpdate();
            System.out.println("Adicionou");
            Conexao.closeConnection();
            return true;
        } catch (SQLException ex) {
            
            System.err.println(ex);
            ex.printStackTrace();
            return false;
        }
        
    }
    
    /**
     *
     * @return
     */
    public static ArrayList<Filme> listar(){
        
        ArrayList<Filme> lista = new ArrayList<Filme>();
        Conexao.dbConnection();
        String query = "SELECT * FROM FILMES";
        
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Filme f = new Filme(
                    rs.getInt("ID_FILME"),
                    rs.getString("TITULO"),
                    rs.getDate("DATA_LANCAMENTO"), 
                    rs.getInt("NOTA"),
                    rs.getString("DESCRICAO"),
                    rs.getInt("QUANTIDADE"));  
                lista.add(f);
            }  
            Conexao.closeConnection();
        } catch (Exception e) {
            System.err.println(e);
        }
        return lista;
    }
    
}
