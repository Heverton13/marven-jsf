
package com.mycompany.persistencia;

import com.mycompany.modelo.Filme;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Dev
 */
public class FilmeDAO {
    
    private final String INSERTFILME = "INSERT INTO FILMES (TITULO, DATA_LANCAMENTO, NOTA, DESCRICAO, QUANTIDADE) VALUES (?,?,?,?,?);";
    private final String DELETEFILME = "DELETE FROM FILMES WHERE ID_FILME = ?";
    private final String LISTAFILME = "SELECT * FROM FILMES WHERE ORDER BY";
    
    public boolean inserirFilme(Filme filme){
        
        Conexao.dbConnection();
        
        try {
            
            PreparedStatement preparaInstrucao;
            preparaInstrucao = Conexao.getConexao().prepareStatement(INSERTFILME);
            
            preparaInstrucao.setString(1, filme.getTitulo());
            preparaInstrucao.setDate(2, (Date) filme.getData_lancamento());
            preparaInstrucao.setInt(3, filme.getNota());
            preparaInstrucao.setString(4, filme.getDescricao());
            preparaInstrucao.setInt(5, filme.getQuantidade());
            
            Conexao.closeConnection();
            System.out.println("Adicionou");
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
