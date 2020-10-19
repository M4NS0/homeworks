package br.com.cadastro.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class novoBaseDao {
	public static void main(final String [] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/cadastros";


        Connection connection = DriverManager.getConnection(url, "postgres", "postgres");
        Statement statement = connection.createStatement();

        // final int updated = statement.executeUpdate("insert into cadastros.funcionario(cpf, IDcargo, IDdepartamento, nome, nascimento, salario) values('70399247149',2,2,'Bruno C. Manso','30/10/1980',5000.00);");
        int updated = statement.executeUpdate("insert into cadastros.funcionario(cpf, IDcargo, IDdepartamento, nome, nascimento, salario) values('70399247149',2,2,'Bruno C. Manso','30/10/1980',5000.00);");
        System.out.println(" -> " + updated);

        statement.close();
        connection.close();
        
    }
}
