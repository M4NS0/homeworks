package br.com.cadastro.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastro.modelo.Cargo;

public class CargoDao extends BaseDao {

	public Cargo getCargoId(int id) {

		Cargo cargo = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			pstm = conn.prepareStatement("select * from cadastros.cargo where cargoID=?");
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

	public Cargo getCargoAtravesDoNome(String nome) {

		Cargo cargo = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			pstm = conn.prepareStatement("select * from cadastros.cargo where nomeCargo=?");
			pstm.setString(1, nome);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				cargo = criaCargo(rs);
			}

		} catch (SQLException e) {
			cargo = null;
		}
		return cargo;
	}

	public Cargo criaCargo(ResultSet rs) throws SQLException {
		Cargo cargo = new Cargo();

		cargo.setNomeCargo(rs.getString("nomeCargo"));
		cargo.setIdCargo(rs.getInt("cargoID"));

		return cargo;
	}

	public List<Cargo> getCargoNome(String nome) {

		List<Cargo> lista = new ArrayList<>();
		Cargo cargo = new Cargo();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.cargo where lower(nomeCargo) like ? order by nomeCargo";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + nome.toLowerCase() + "%");
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
			conn = BaseDao.getConnection();
			if (cargo.getIdCargo() == 0) {
				sql = "insert into cadastros.cargo (cargoID,nomeCargo) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			} else {
				sql = "update cargo set cargoID=?, nomeCargo=?";
				sql += " where cargoID = ?";
				pstm = conn.prepareStatement(sql);
			}
			pstm.setString(1, cargo.getNomeCargo());
			pstm.setInt(2, cargo.getIdCargo());
			if (cargo.getIdCargo() != 0) {
				pstm.setInt(3, cargo.getIdCargo());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0)
				return false;
			if (cargo.getIdCargo() == 0) {
				int idInserir = getGeneratedId(pstm);
				cargo.setIdCargo(idInserir);
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
			conn = BaseDao.getConnection();
			if (cargo.getIdCargo() == 0) {

				sql = "insert into cadastros.cargo (nomeCargo, cargoID) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				cargo.setControle(1);
			} else {
				sql = "update cargo set nomeCargo=?, cargoID=? where cargoID = ?";
				pstm = conn.prepareStatement(sql);
				cargo.setControle(2);
			}
			pstm.setString(1, cargo.getNomeCargo());
			pstm.setInt(2, cargo.getIdCargo());
			if (cargo.getIdCargo() != 0) {
				pstm.setInt(3, cargo.getIdCargo());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				if (cargo.getControle() == 1)
					cargo.setMensagem("Inclusão não foi realizada");
				if (cargo.getControle() == 2)
					cargo.setMensagem("Alteração não foi realizada");
			} else {
				if (cargo.getIdCargo() == 0) {
					int idInserir = getGeneratedId(pstm);
					cargo.setIdCargo(idInserir);
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

	public boolean excluir(int id) {

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "delete from cadastros.cargo where cargoID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			boolean retorno = conta > 0;
			return retorno;
		} catch (SQLException e) {
			return false;
		}
	}

	public Cargo excluirMsg(int id) {
		Cargo cargo = new Cargo();

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "delete from cadastros.cargo where cargoID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
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
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.cargo order by nomeCargo";
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

	public List<Cargo> getCargoListaId(int id) {

		List<Cargo> lista = new ArrayList<>();
		Cargo cargo = new Cargo();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.cargo where cargoID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
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
