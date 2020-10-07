package br.com.hiccupSolucoes.cadastro.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.hiccupSolucoes.cadastro.modelo.Cargo;

public class cargoDao {

	public static Boolean adicionaCargo(Cargo estagio) {
		try {
			String mySql = "INSERT INTO cargo (cargoID,nome) VALUES (?,?)";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(mySql);
			pstm.setLong(1, 0);
			pstm.setString(2, estagio.getnomeCargo());
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("Erro ao inserir! " + e.getMessage());
			return false;
		}
	}

	public static boolean alterarCargo(Cargo estagio, int id) {
		try {
			String MySql = "update cargo set nome = ? cargoID= ?";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(MySql);
			pstm.setString(1, estagio.getnomeCargo());
			pstm.setLong(2, id);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("Erro ao alterar! " + e.getMessage());
			return false;
		}
	}

	public static boolean excluirCargo(int id) {
		try {
			String sql = "delete from cargo where cargoID = ?" + "delete from funcionario where IDcargo = ?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("Erro ao excluir! " + e.getMessage());
			return false;
		}
	}

	public static ArrayList<Cargo> listaCargos() {

		try {
			String sql = "select * from cargo order by nome";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			ArrayList<Cargo> listaCargos = new ArrayList<Cargo>();
			while (rs.next()) {
				Cargo m = new Cargo();
				m.setnomeCargo(rs.getString("nome"));
				listaCargos.add(m);
			}
			return listaCargos;
		} catch (Exception e) {
			System.out.print("Erro ao listar! " + e.getMessage());
			return null;
		}
	}

	public static Cargo retornaPorId(int id) {
		try {
			String sql = "select * from Cargo where cargoID = ?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();

			rs.next();
			Cargo m = new Cargo();
//			m.setId(rs.getInt("cargoID"));
//			m.setNome(rs.getString("mar_nome"));
			return m;
		} catch (Exception e) {
			System.out.print("Erro ao listar! " + e.getMessage());
			return null;
		}
	}

	public static int retornaUltimoId() {
		try {
			String sql = "select max(cargoID) as ultimo from Cargo";

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
