package br.edu.pucgoias.sistemaestoque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {

	public BaseDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		}
	}

	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost/sistema_estoque_web";
		Connection conn = (Connection) DriverManager.getConnection(url, "root", "B4p7ist@");
		return conn;
	}

	public static void main(String[] args) throws SQLException {
		BaseDao bd = new BaseDao();
		Connection conn = bd.getConnection();
		if (conn != null) {
			System.out.println("Conectado!");
		} else {
			System.out.println("Não conectou!");
		}
	}
}