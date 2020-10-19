package br.com.cadastros.persistencia;

import java.sql.SQLException;



public class TesteCadastroDao {
	public static void main(String[] args) throws SQLException {
		CadastroDao novo = new CadastroDao();
		System.out.println(novo.getFuncionarioById(70399247149L));
		

	}
}
