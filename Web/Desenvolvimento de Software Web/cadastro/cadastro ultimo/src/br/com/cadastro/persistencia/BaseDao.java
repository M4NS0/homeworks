package br.com.cadastro.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDao {

	public BaseDao() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:postgresql://127.0.0.1:5432/cadastros";
		Connection conn = (Connection) DriverManager.getConnection(url, "postgres", "postgres");
		return conn;
	}

	public static  void main(String[] args) throws SQLException {

		Connection conn = BaseDao.getConnection();
		if (conn != null) {
			System.out.println("Conectou !");
			String mySql = "insert into cadastros.funcionario(cpf, IDcargo, IDdepartamento, nome, nascimento, salario) values('teste',2,2,'Testando de tal','teste',5000.00);";
			PreparedStatement pstm = conn.prepareStatement(mySql);
			pstm.executeUpdate();
			conn.close();
		}
		else 
			System.out.println("Não conectou");

	}
}
/*
 * public boolean Conexao () { try (Connection conn =
 * DriverManager.getConnection( "jdbc:postgresql://127.0.0.1:5432/cadastro",
 * "postgres", "postgres")) {
 * 
 * if (conn != null) { System.out.println("Connected to the database!"); return
 * true; } else { System.out.println("Failed to make connection!"); }
 * 
 * } catch (SQLException e) { System.err.format("SQL State: %s\n%s",
 * e.getSQLState(), e.getMessage()); } catch (Exception e) {
 * e.printStackTrace(); } return false;
 * 
 * }
 */
