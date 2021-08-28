 
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

 
public class ConnectionFactory {
    
    public Connection getConexao() {
        
        String url = "jdbc:mysql://localhost/ProjetoVulcao";
        String user = "root";
        String pass = "arvore123";
        
        try {
            return DriverManager.getConnection(url,user,pass);
        } catch (Exception erro) {
            throw  new RuntimeException("Erro : 1 "+ erro);
        }
    }
}
