package br.com.cadastros.old;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.cadastros.modelo.Cadastros;
import br.com.cadastros.modelo.Cargo;
import br.com.cadastros.modelo.Departamento;
import br.com.cadastros.modelo.Funcionario;

public class CadastroDao {
	public static ArrayList<Cadastros> listaFuncionarios() {
		try {
			String sql = 
					  "SELECT"
					+    " cpf,IDcargo,nomeCargo,IDdepartamento,nomeDepartamento,nome,nascimento,salario"
					+ " FROM"
					+    " funcionario, cargo, departamento"
					+ " WHERE "
					+    " IDcargo = cargoID "
					+ " AND"
					+    " IDdepartamento = departamentoID"
					+ " ORDER BY"
					+    " nome;";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			ArrayList<Cadastros> cadastros = new ArrayList<Cadastros>();
			
			while (rs.next()) {
				
				Cargo c = new Cargo();
				c.setNomeCargo(rs.getString("nomeCargo")); 
				c.setIdCargo(rs.getInt("IDcargo"));
				
				Departamento d = new Departamento();
				d.setNomeDepartamento(rs.getNString("nomeDepartamento"));
				d.setIdDepartamento(rs.getInt("IDdepartamento"));
				
				Funcionario f = new Funcionario();
				f.setNome(rs.getString("nome"));
				f.setCpf(rs.getString("cpf"));
				f.setNascimento(rs.getString("nascimento"));
				f.setSalario(rs.getDouble("salario"));
//				f.setCargoId(rs.getInt("IDcargo"));
				
//				Cadastros cadastro = new Cadastros(c, d, f);
//				cadastros.add(cadastro);
			}
			return cadastros;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao listar funcionario em array \n >> Função: ArrayList<Funcionario> listaFuncionário() \n" + e.getMessage() + "\n");
			return null;
		}
	}
}
