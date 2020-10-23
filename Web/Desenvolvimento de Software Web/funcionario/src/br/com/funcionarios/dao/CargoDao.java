package br.com.funcionarios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.funcionarios.modelo.Cargo;




public class CargoDao extends BaseDao {

	public Cargo criaCargo(ResultSet rs) throws SQLException {
		Cargo cargo = new Cargo();

		cargo.setCargoId(rs.getInt("cargoId"));
		cargo.setNomeCargo(rs.getString("nomeCargo"));
		return cargo;
	}

	public Cargo getCargoViaId(int id) {
		Cargo cargo = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select * from cadastros.cargo where cargoId=?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				cargo = criaCargo(rs);
			}

		} catch (SQLException e) {
			cargo = null;
		}
		return cargo;
	}

	public List<Cargo> getCargoViaNome(String nomeCargo) {

		List<Cargo> lista = new ArrayList<>();
		Cargo cargo = new Cargo();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from cadastros.cargo where lower (nomecargo)=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + nomeCargo.toLowerCase() + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				cargo = criaCargo(rs);
				lista.add(cargo);
			}

		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}

	public boolean salvarCargo(Cargo cargo) {
		boolean retorno = false;
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			if (cargo.getCargoId() == 0) {
				sql = "insert into cadastros.cargo(cargoId,nomeCargo) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			} else {
				sql = "update cadastros.cargo set cargoId=?, nomeCargo=? ";
				sql += " where cargoId = ?";
				pstm = conn.prepareStatement(sql);
			}

			pstm.setString(1, cargo.getNomeCargo());
		
			if (cargo.getCargoId() != 0) {
				pstm.setInt(2, cargo.getCargoId());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0)
				return false;
			if (cargo.getCargoId() == 0) {
				int idInserir = getGeneratedId(pstm);
				cargo.setCargoId(idInserir);
			}
			retorno = true;
		} catch (SQLException e) {
			retorno = false;
		}
		return retorno;
	}

	public Cargo salvarCargoMsg(Cargo cargo) {
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			if (cargo.getCargoId() == 0) {
				// É interessante fazer uma consulta para ver se já existe item com essa descrição
				sql = "insert into cadastros.cargo(cargoId,nomeCargo) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				cargo.setControle(1);
			} else {
				sql = "update cargo set cargoId=?, nomeCargo=? ";
				pstm = conn.prepareStatement(sql);
				cargo.setControle(2);
			}
			
			if (cargo.getCargoId() != 0) {
				pstm.setInt(1, cargo.getCargoId());
			}
			pstm.setString(2, cargo.getNomeCargo());
		
			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				if (cargo.getControle() == 1)
					cargo.setMensagem("Inclusão não foi realizada");
				if (cargo.getControle() == 2)
					cargo.setMensagem("Alteração não foi realizada");
			} else {
				if (cargo.getCargoId() == 0) {
					int idInserir = getGeneratedId(pstm);
					cargo.setCargoId(idInserir);
				}
				if (cargo.getControle() == 1)
					cargo.setMensagem("Inclusão realizada com sucesso!!");
				if (cargo.getControle() == 2)
					cargo.setMensagem("Alteração realizada com sucesso!!");
			}
		} catch (SQLException e) {
			cargo.setMensagem("Erro de atualização");
		}
		return cargo;
	}

	public int getGeneratedId(PreparedStatement stm) throws SQLException {
		ResultSet rs = stm.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			return id;
		}
		return 0;
	}

	public boolean excluir(int cargoId) {

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "delete from cadastros.cargo where cargoId = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, cargoId);
			int conta = pstm.executeUpdate();
			boolean retorno = conta > 0;
			return retorno;
		} catch (SQLException e) {
			return false;
		}
	}

	public Cargo excluirMsg(int cargoId) {
		Cargo cargo = new Cargo();

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "delete from cadastros.cargo where cargoId = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, cargoId);
			int conta = pstm.executeUpdate();
			if (conta > 0) {
				cargo.setControle(3);
				cargo.setMensagem("Exclusão efetuada com sucesso");
			}
		} catch (SQLException e) {
			cargo.setMensagem("Erro de exclusão");
		}
		return cargo;
	}

	public List<Cargo> getTodos() {

		List<Cargo> lista = new ArrayList<>();
		Cargo cargo = new Cargo();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from cadastros.cargo";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				cargo = criaCargo(rs);
				lista.add(cargo);
			}

		} catch (SQLException e) {
			return lista;
		}
		return lista;

	}

	public List<Cargo> getCargoPorIdLista(int idCargo) {

		List<Cargo> lista = new ArrayList<>();
		Cargo cargo = new Cargo();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from cadastros.cargo where cargoId = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idCargo);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				cargo = criaCargo(rs);
				lista.add(cargo);
			}

		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}
}
