 
package dao;

import java.sql.Connection;
import model.Vulcao;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VulcaoDAO {
  
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Vulcao> lista = new ArrayList<>();

  public VulcaoDAO() {
   conn = new ConnectionFactory().getConexao();
 }
  
 public void inserir (Vulcao vulcao){
     String sql = "INSERT INTO Vulcao (nome,formadoPor,ultimaErupcao,status,coordenadas,pais,tipoLava,descricao,erupcaoVulcanica) VALUES (?,?,?,?,?,?,?,?,?)";
     
     try {
         stmt = conn.prepareStatement(sql);
         stmt.setString(1, vulcao.getNome());
         stmt.setString(2, vulcao.getFormadoPor());
         stmt.setString(3, vulcao.getUltimaErupcao());
         stmt.setString(4, vulcao.getStatus());
         stmt.setString(5, vulcao.getCoordenadas());
         stmt.setString(6, vulcao.getPais());
         stmt.setString(7, vulcao.getTipoLava());
         stmt.setString(8, vulcao.getDescricao());
         stmt.setString(9, vulcao.getErupcaoVulcanica());
         stmt.execute();
         stmt.close();
     } catch (Exception erro) {
         throw new RuntimeException("erro 2 :"+erro);
     }
 }
 
  public void alterar (Vulcao vulcao){
     String sql = "UPDATE Vulcao SET nome = ?, formadoPor = ?, ultimaErupcao = ?, status = ?, coordenadas = ?, pais = ?, tipoLava = ?,descricao = ?,erupcaoVulcanica = ? WHERE id = ?";
     
     try {
         stmt = conn.prepareStatement(sql);
         stmt.setString(1, vulcao.getNome());
         stmt.setString(2, vulcao.getFormadoPor());
         stmt.setString(3, vulcao.getUltimaErupcao());
         stmt.setString(4, vulcao.getStatus());
         stmt.setString(5, vulcao.getCoordenadas());
         stmt.setString(6, vulcao.getPais());
         stmt.setString(7, vulcao.getTipoLava());
         stmt.setString(8, vulcao.getDescricao());
         stmt.setString(9, vulcao.getErupcaoVulcanica());
         stmt.setInt(10, vulcao.getId());
         stmt.execute();
         stmt.close();
         
     } catch (Exception erro) {
         throw new RuntimeException("erro 3 :"+erro);
     }
 }
 
   public void excluir (int valor){
     String sql = "DELETE FROM Vulcao WHERE id = "+ valor;
     
     try {
         st = conn.createStatement();
         st.execute(sql);
         st.close();
     } catch (Exception erro) {
         throw new RuntimeException("erro 4 :"+erro);
     }
 }
   
    public ArrayList<Vulcao> listarTodos(){
     String sql = "SELECT * FROM Vulcao";
     
     try {
         st = conn.createStatement();
         rs = st.executeQuery(sql);
         while(rs.next()){
             Vulcao vulcao = new Vulcao();
             vulcao.setId(rs.getInt("id"));
             vulcao.setNome(rs.getString("nome"));
             vulcao.setFormadoPor(rs.getString("formadoPor"));
             vulcao.setUltimaErupcao(rs.getString("ultimaErupcao"));
             vulcao.setStatus(rs.getString("status"));
             vulcao.setCoordenadas(rs.getString("coordenadas"));
             vulcao.setPais(rs.getString("pais"));
             vulcao.setTipoLava(rs.getString("tipoLava"));
             vulcao.setDescricao(rs.getString("descricao"));
             vulcao.setErupcaoVulcanica(rs.getString("erupcaoVulcanica"));
             lista.add(vulcao);
         }
     } catch (Exception erro) {
         throw new RuntimeException("erro 5 :"+erro);
     }
     return lista;
 }
    
    
    public ArrayList<Vulcao> listarTodosNome(String valor){
     String sql = "SELECT * FROM Vulcao WHERE nome LIKE '%"+valor+"%' ";
     
     try {
         st = conn.createStatement();
         rs = st.executeQuery(sql);
         while(rs.next()){
             Vulcao vulcao = new Vulcao();
             vulcao.setId(rs.getInt("id"));
             vulcao.setNome(rs.getString("nome"));
             vulcao.setFormadoPor(rs.getString("formadoPor"));
             vulcao.setUltimaErupcao(rs.getString("ultimaErupcao"));
             vulcao.setStatus(rs.getString("status"));
             vulcao.setCoordenadas(rs.getString("coordenadas"));
             vulcao.setPais(rs.getString("pais"));
             vulcao.setTipoLava(rs.getString("tipoLava"));
             vulcao.setDescricao(rs.getString("descricao"));
             vulcao.setErupcaoVulcanica(rs.getString("erupcaoVulcanica"));
             lista.add(vulcao);
         }
     } catch (Exception erro) {
         throw new RuntimeException("erro 6 :"+erro);
     }
     return lista;
 }

}
