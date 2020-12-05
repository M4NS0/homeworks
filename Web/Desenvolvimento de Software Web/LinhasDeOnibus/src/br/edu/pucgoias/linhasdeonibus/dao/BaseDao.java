package br.edu.pucgoias.linhasdeonibus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * BaseDao � a classe de conex�o com o banco de dados, que no caso foi escolhido o postgresql.
 * A classe conta com um construtor indicando aonde est� o driver de conex�o e um m�todo que
 * reune as informa��es salvas em atributos String e d� in�cio a conex�o;
 * 
 * @author Jo�o Victor
 * @data 30/11/2020
 */
public class BaseDao {

	static final String URL = "jdbc:postgresql://localhost:5432/Linhas_De_Onibus"; // Conferir se a porta � a mesma
	static final String USER = "postgres"; // Usuario Jo�o
	static final String PASS = "postgres"; // Senha Jo�o

	public BaseDao() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conecta = DriverManager.getConnection(URL, USER, PASS);
		if (conecta != null) {
			return conecta;
		}
		return null;
	}

	/**
	 * M�todo main usado para testes de conex�o.
	 * 
	 * @autor Jo�o Victor
	 * @data 30/11/2020
	 */
	public static void main(String[] args) throws SQLException {
		BaseDao bd = new BaseDao();
		Connection conn = bd.getConnection();
		if (conn != null)
			System.out.println("Conectou !");
		else
			System.out.println("N�o conectou");
	}
}