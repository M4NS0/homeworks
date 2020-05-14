/**
 *
 * Classe que gerencia a conexão ao BD entre o Java e o MySql
 * 
 * @author barcelosluan
 */

package conexao;

// conexão SQL para Java
import java.sql.Connection;
// driver de conexão SQL para Java
import java.sql.DriverManager;
// classe para tratamento de exceções
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/crud", "crud", "crud");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
    
}
