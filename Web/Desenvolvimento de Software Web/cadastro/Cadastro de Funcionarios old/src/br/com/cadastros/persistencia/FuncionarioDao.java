package br.com.cadastros.old;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.cadastros.modelo.Funcionario;

public class FuncionarioDao {
	public static Boolean adicionaFuncionario(Funcionario funcionario) {
		try {
			String mySql = "insert into funcionario (cpf,IDcargo,IDdepartamento,nome,nascimento,salario) values (?,?,?,?,?,?)";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(mySql);
			pstm.setString(1, funcionario.getCpf());
//			pstm.setLong(2, funcionario.getCargoId());
//			pstm.setLong(3, funcionario.getDepartamentoId());
			pstm.setString(4, funcionario.getNome());
			pstm.setString(5, funcionario.getNascimento());
			pstm.setDouble(6, funcionario.getSalario());
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print(
					" \n >> Erro ao inserir funcionário\n >> Função: Boolean adicionaFuncionario(Funcionario funcionario) \n"
							+ e.getMessage() + "\n");
			return false;
		}
	}

	public static Boolean alterarFuncionario(Funcionario funcionario, String cpf) {
		try {
			String MySql = "update funcionario set nome=? where cpf=?";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(MySql);
			pstm.setString(1, funcionario.getNome());
			pstm.setString(2, cpf);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print(
					"\n >> Erro ao alterar funcionario por cpf \n >> Função: Boolean alteraDuncionario(Funcionario funcionario, String cpf) \n"
							+ e.getMessage() + "\n");
			return false;
		}
	}

	public static Boolean excluirFuncionario(String cpf) {
		try {
			String sql = "delete from funcionario where cpf =?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, cpf);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print(
					"\n >> Erro ao excluir funcionario por cpf \n >> Função: Boolean xcluirFuncionario(String cpf) \n"
							+ e.getMessage() + "\n");
			return false;
		}
	}

	public static ArrayList<Funcionario> listaFuncionarios() {

		try {
			String sql = "select * from funcionario order by nome";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
			while (rs.next()) {
				Funcionario m = new Funcionario();
				m.setNome(rs.getString("nome"));
				m.setNascimento(rs.getString("nascimento"));
				m.setCpf(rs.getString("cpf"));
				m.setSalario(rs.getDouble("salario"));
//				m.setCargoId(rs.getInt("cargoID"));
//				m.setDepartamentoId(rs.getInt("departamentoID"));
				listaFuncionarios.add(m);
			}
			return listaFuncionarios;
		} catch (Exception e) {
			System.out.print(
					"\n >> Erro ao listar funcionario em array \n >> Função: ArrayList<Funcionario> listaFuncionário() \n"
							+ e.getMessage() + "\n");
			return null;
		}
	}
	
	

	public static Funcionario retornaPorCpf(String cpf) {
		try {
			String sql = "select * from funcionario where cpf = ?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, cpf);
			ResultSet rs = pstm.executeQuery();

			rs.next();
			Funcionario m = new Funcionario();
			m.setNome(rs.getString("nome"));
			m.setSalario(rs.getDouble("salario"));
			m.setNascimento(rs.getString("nascimento"));
			m.setCpf(rs.getString("cpf"));
//			m.setCargoId(rs.getInt("cargoId"));
//			m.setDepartamentoId(rs.getInt("departamentoId"));
			return m;
		} catch (Exception e) {
			System.out.print(
					"\n >> Erro ao listar cpf do funcionario \n >> Função: Funcionario retornaPorCpf(String cpf) \n"
							+ e.getMessage() + "\n");
			return null;
		}
	}

//	public static int retornaUltimoCpf() {
//		try {
//			String sql = "select max(cpf) as ultimo from funcionario";
//
//			Connection conn = Conexao.getConnection();
//			PreparedStatement pstm = conn.prepareStatement(sql);
//			ResultSet rs = pstm.executeQuery();
//
//			rs.next();
//			return rs.getInt("ultimo");
//		} catch (Exception e) {
//			return 0;
//		}
//	}
}