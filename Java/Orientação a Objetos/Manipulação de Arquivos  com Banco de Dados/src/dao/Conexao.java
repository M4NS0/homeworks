package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/testebd";
	private static final String USER = "root";
	private static final String PASSWORD = "00loki00";
	
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
