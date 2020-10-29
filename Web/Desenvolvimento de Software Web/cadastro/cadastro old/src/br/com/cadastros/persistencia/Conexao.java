package br.com.cadastros.old;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3336/cadastros";
	// private static final String URL = "jdbc:mysql://localhost:3336/cadastros"; // Conexão João
	private static final String USER = "root";
	private static final String PASSWORD = "B4p7ist@";
	// private static final String PASSWORD = "root";  // Senha João
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			System.out.print("Erro ao conectar no BD!" + e.getMessage());
			return null;
		}
	}
}
