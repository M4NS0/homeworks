package br.com.cadastro.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastro.modelo.Departamento;

public class DepartamentoDao extends BaseDao {

	public Departamento getDepartamentoId(int id) {

		Departamento departamento = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			pstm = conn.prepareStatement("select * from cadastros.departamento where departamentoID=?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				departamento = criaDepartamento(rs);
			}

		} catch (SQLException e) {
			departamento = null;
		}
		return departamento;
	}

	public Departamento getDepartamentoAtravesDoNome(String nome) {

		Departamento departamento = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			pstm = conn.prepareStatement("select * from cadastros.departamento where nomeDepartamentoID=?");
			pstm.setString(1, nome);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				departamento = criaDepartamento(rs);
			}

		} catch (SQLException e) {
			departamento = null;
		}
		return departamento;
	}

	public Departamento criaDepartamento(ResultSet rs) throws SQLException {
		Departamento departamento = new Departamento();

		departamento.setNomeDepartamento(rs.getString("nomeDepartamento"));
		departamento.setIdDepartamento(rs.getInt("departamentoID"));

		return departamento;
	}

	public List<Departamento> getDepartamentoNome(String nome) {

		List<Departamento> lista = new ArrayList<>();
		Departamento departamento = new Departamento();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.departamento where lower(nomeDepartamento) like ? order by nomeDepartamento";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + nome.toLowerCase() + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				departamento = criaDepartamento(rs);
				lista.add(departamento);
			}

		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}

	public boolean salvarDepartamento(Departamento departamento) {
		boolean retorno = false;
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			if (departamento.getIdDepartamento() == 0) {
				sql = "insert into cadastros.departamento (nomeDepartamento, departamentoID) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			} else {
				sql = "update departamento set nomeDepartamento=?, departamentoID=?";
				sql += " where departamentoID = ?";
				pstm = conn.prepareStatement(sql);
			}
			pstm.setString(1, departamento.getNomeDepartamento());
			pstm.setInt(2, departamento.getIdDepartamento());
			if (departamento.getIdDepartamento() != 0) {
				pstm.setInt(3, departamento.getIdDepartamento());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0)
				return false;
			if (departamento.getIdDepartamento() == 0) {
				int idInserir = getGeneratedId(pstm);
				departamento.setIdDepartamento(idInserir);
			}
			retorno = true;
		} catch (SQLException e) {
			retorno = false;
		}
		return retorno;
	}

	public Departamento salvarDepartamentoMsg(Departamento departamento) {
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			if (departamento.getIdDepartamento() == 0) {
				sql = "insert into cadastros.departamento (nomeDepartamento, departamentoID) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				departamento.setControle(1);
			} else {
				sql = "update departamento set nomeDepartamento=?, departamentoID=? where departamentoID = ?";
				pstm = conn.prepareStatement(sql);
				departamento.setControle(2);
			}
			pstm.setString(1, departamento.getNomeDepartamento());
			pstm.setInt(2, departamento.getIdDepartamento());
			if (departamento.getIdDepartamento() != 0) {
				pstm.setInt(3, departamento.getIdDepartamento());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				if (departamento.getControle() == 1)
					departamento.setMensagem("Inclusão não foi realizada");
				if (departamento.getControle() == 2)
					departamento.setMensagem("Alteração não foi realizada");
			} else {
				if (departamento.getIdDepartamento() == 0) {
					int idInserir = getGeneratedId(pstm);
					departamento.setIdDepartamento(idInserir);
				}
				if (departamento.getControle() == 1)
					departamento.setMensagem("Inclusão realizada com sucesso!!");
				if (departamento.getControle() == 2)
					departamento.setMensagem("Alteração realizada com sucesso!!");
			}
		} catch (SQLException e) {
			departamento.setMensagem("Erro de atualização");
		}
		return departamento;
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
			String sql = "delete from cadastros.departamento where departamentoID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			boolean retorno = conta > 0;
			return retorno;
		} catch (SQLException e) {
			return false;
		}
	}

	public Departamento excluirMsg(int id) {
		Departamento departamento = new Departamento();

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "delete from cadastros.departamento where departamentoID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			if (conta > 0) {
				departamento.setControle(3);
				departamento.setMensagem("Exclusão efetuada com sucesso");
			}
		} catch (SQLException e) {
			departamento.setMensagem("Erro de exclusão");
		}
		return departamento;
	}

	public List<Departamento> getTodos() {

		List<Departamento> lista = new ArrayList<>();
		Departamento departamento = new Departamento();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.departamento order by nomeDepartamento";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				departamento = criaDepartamento(rs);
				lista.add(departamento);
			}

		} catch (SQLException e) {
			return lista;
		}
		return lista;

	}

	public List<Departamento> getDepartamentoListaId(int id) {

		List<Departamento> lista = new ArrayList<>();
		Departamento departamento = new Departamento();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.departamento where departamentoID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				departamento = criaDepartamento(rs);
				lista.add(departamento);
			}

		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}
}
