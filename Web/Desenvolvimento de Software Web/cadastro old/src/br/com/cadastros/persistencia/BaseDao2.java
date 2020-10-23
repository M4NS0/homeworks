package br.com.cadastros.old;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao1 {
	public BaseDao1 () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
					
		}
	}
	
	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3336/cadastros;";
		Connection conn = ((Connection) DriverManager.getConnection(url,"root", "B4p7ist@"));
		return conn;
	}
	public static void main(String[] args) throws SQLException {
		BaseDao1 bd = new BaseDao1();
		Connection conn = bd.getConnection();
		if (conn != null) {
			System.out.println("Conectou!");
		} else {
			System.out.println("Não Conectou!");
		}
		
	}
}
