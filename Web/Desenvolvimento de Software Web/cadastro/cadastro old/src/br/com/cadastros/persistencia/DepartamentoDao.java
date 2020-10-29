package br.com.cadastros.old;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.cadastros.modelo.Departamento;


public class DepartamentoDao {
	public static Boolean adicionaDepartamento(Departamento departamento) {
		try {
			String mySql = "INSERT INTO departamento (departamentoID,nomeDepartamento) VALUES (?,?)";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(mySql);
			pstm.setLong(1, 0);
			pstm.setString(2, departamento.getNomeDepartamento());
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao inserir departamento \n Função: Boolean adicionaDepartamento(Departamento departamento) \n" + e.getMessage() + "\n");
			return false;
		}
	}

	public static Boolean alterarDepartamento(Departamento departamento, int id) {
		try {
			String MySql = "update departamento set nomeDepartamento=? where departamentoID=?";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(MySql);
			pstm.setString(1, departamento.getNomeDepartamento());
			pstm.setLong(2, id);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao alterar departamento por id \n Função: Boolean alterarDepartamento(Departamento departamento, int id) \n" + e.getMessage() + "\n");
			return false;
		}
	}

	public static Boolean excluirDepartamento(int id) {
		try {
			String sql = "delete from departamento where departamentoID =?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao excluir departamento por ID \n Função: Boolean excluirDepartamento(int id) \n" + e.getMessage() + "\n");
			return false;
		}
	}

	public static ArrayList<Departamento> listaDepartamentos() {

		try {
			String sql = "select * from departamento order by nomeDepartamento";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();
			while (rs.next()) {
				Departamento m = new Departamento();
				m.setNomeDepartamento(rs.getString("nomeDepartamento"));
				listaDepartamentos.add(m);
			}
			return listaDepartamentos;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao listar departamentos por array \n Função: ArrayList<Departamento> listaDepartamentos() \n" + e.getMessage() + "\n");
			return null;
		}
	}

	public static Departamento retornaPorId(int id) {
		try {
			String sql = "select * from departamento where departamentoID = ?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();

			rs.next();
			Departamento m = new Departamento();
			m.setIdDepartamento(rs.getInt("departamentoID"));
			m.setNomeDepartamento(rs.getString("nomeDepartamento"));
			return m;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao listar departamento por id \n Função: Departamento retornaPorId(int id) \n" + e.getMessage() + "\n");
			return null;
		}
	}

	public static int retornaPorNome(String nomeDepartamento) {
		try {
			String sql = "select (departamentoID) from departamento where nomeDepartamento=?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, nomeDepartamento);
			ResultSet rs = pstm.executeQuery();

			rs.next();
			Departamento m = new Departamento();
			m.setIdDepartamento(rs.getInt("departamentoID"));
			return m.getIdDepartamento();
		} catch (Exception e) {
			System.out.print("\n >> Erro ao listar departamento por nome \n Função: int retornaPorNome(String nomeDepartamento) \n" + e.getMessage() + "\n");
			return 0;
		}
	}

	public static int retornaUltimoId() {
		try {
			String sql = "select max(departamentoID) as ultimo from departamento";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			rs.next();
			return rs.getInt("ultimo");
		} catch (Exception e) {
			return 0;
		}
	}

}
