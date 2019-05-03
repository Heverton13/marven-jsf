
package com.mycompany.persistencia;


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
    private final String UPDATEQUANTIDADE = "UPDATE FILMES SET QUANTIDADE = ? WHERE ID_FILME = ?";
    
    public boolean inserirFilme(Filme f){
        
        
        Conexao.dbConnection();
        System.out.println(f);
        try {
            
           
            PreparedStatement preparaInstrucao;
            preparaInstrucao = Conexao.getConexao().prepareStatement(INSERTFILME);
            
            preparaInstrucao.setString(1,f.getTitulo());
            f.setData_lancamento(new java.util.Date());
            java.sql.Date dataSQL = new java.sql.Date(f.getData_lancamento().getTime());
            preparaInstrucao.setDate(2, dataSQL);
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
    
    public boolean updateQuantidade(int u, int id) {
        try {
            // CONECTA
            Conexao.dbConnection();
            
            PreparedStatement preparaInstrucao;
            preparaInstrucao = Conexao.getConexao().prepareStatement(UPDATEQUANTIDADE);
        
            preparaInstrucao.setInt(1, u);
            preparaInstrucao.setInt(2, id);

            // EXECUTA A INSTRUCAO
            preparaInstrucao.execute();
            System.out.println("atualizaou a quantidade");

            // DESCONECTA
            Conexao.closeConnection();

            return true;

        } catch (SQLException e) {
            return false;

        }

}
    
}
