package br.com.cadastros.old;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.cadastros.modelo.Cargo;

public class CargoDao {

	public static Boolean adicionaCargo(Cargo cargo) {
		try {
			String mySql = "INSERT INTO cargo (cargoID,nomeCargo) VALUES (?,?)";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(mySql);
			pstm.setLong(1, 0);
			pstm.setString(2, cargo.getNomeCargo());
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao inserir por cargo \n >> Função: Boolean adicionaCargo(Cargo cargo) \n"
					+ e.getMessage() + "\n");
			return false;
		}
	}

	public static Boolean alterarCargo(Cargo cargo, int id) {
		try {
			String MySql = "update cargo set nomeCargo=? where cargoID=?";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(MySql);
			pstm.setString(1, cargo.getNomeCargo());
			pstm.setLong(2, id);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print(
					"\n >> Erro ao alterar por cargo usando ID \n >> Função: Boolean alterarCargo(Cargo cargo, int id) \n"
							+ e.getMessage() + "\n");
			return false;
		}
	}

	public static Boolean excluirCargo(int id) {
		try {
			String sql = "delete from cargo where cargoID =?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao excluir cargo por ID \n >> Função: Boolean excluirCargo(int id) \n"
					+ e.getMessage() + "\n");
			return false;
		}
	}

	public static ArrayList<Cargo> listaCargos() {

		try {
			String sql = "select * from cargo order by nomeCargo";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			ArrayList<Cargo> listaCargos = new ArrayList<Cargo>();
			while (rs.next()) {
				Cargo m = new Cargo();
				m.setNomeCargo(rs.getString("nomeCargo"));
				listaCargos.add(m);
			}
			return listaCargos;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao listar array de cargos \n >> Função: ArrayList<Cargo> listaCargos() \n"
					+ e.getMessage() + "\n");
			return null;
		}
	}

	public static Cargo retornaPorId(int id) {
		try {
			String sql = "select * from cargo where cargoID = ?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();

			rs.next();
			Cargo m = new Cargo();
			m.setIdCargo(rs.getInt("cargoID"));
			m.setNomeCargo(rs.getString("nomeCargo"));
			return m;
		} catch (Exception e) {
			System.out.print("\n >> Erro ao listar cargo por ID \n >> Função: Cargo retornaPorId(int id) \n "
					+ e.getMessage() + "\n");
			return null;
		}
	}

	public static int retornaPorNome(String nomeCargo) {
		try {
			String sql = "select (cargoID) from cargo where nomeCargo=?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, nomeCargo);
			ResultSet rs = pstm.executeQuery();

			rs.next();
			Cargo m = new Cargo();
			m.setIdCargo(rs.getInt("cargoID"));
			return m.getIdCargo();
		} catch (Exception e) {
			System.out
					.print("\n >> Erro ao listar cargo por nome \n >> Função: int retornaPorNome(String nomeCargo) \n"
							+ e.getMessage() + "\n");
			return 0;
		}
	}

	public static int retornaUltimoId() {
		try {
			String sql = "select max(cargoID) as ultimo from cargo";

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
