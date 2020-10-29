package br.com.cadastros.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3336/cadastros";
	private static final String USER = "root";
	private static final String PASSWORD = "B4p7ist@";

	// 5.1.36 ate o 7.7
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			System.out.print("Erro ao conectar no BD!" + e.getMessage());
			return null;
		}
	}
	public static void main(String[] args) {

		Connection conn = BaseDao.getConnection();
		
		if (conn != null) {
			System.out.println("Conectou!");
		} else {
			System.out.println("Não Conectou!");
		}
	}
}
