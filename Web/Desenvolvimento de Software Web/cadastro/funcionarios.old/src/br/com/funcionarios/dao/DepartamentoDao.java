package br.com.funcionarios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.funcionarios.modelo.Departamento;




public class DepartamentoDao extends BaseDao {

	public Departamento criaDepartamento(ResultSet rs) throws SQLException {
		Departamento departamento = new Departamento();

		departamento.setDepartamentoid(rs.getInt("departamentoId"));
		departamento.setNomeDepartamento(rs.getString("nomeDepartamento"));
		return departamento;
	}

	public Departamento getDepartamentoViaId(int id) {
		Departamento departamento = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select * from cadastros.departamento where departamentoId=?");
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

	public List<Departamento> getDepartamentoViaNome(String nomeDepartamento) {

		List<Departamento> lista = new ArrayList<>();
		Departamento departamento = new Departamento();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from cadastros.departamento where lower(nomeDepartamento)=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, nomeDepartamento);
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
			conn = this.getConnection();
			if (departamento.getDepartamentoid() == 0) {
				sql = "insert into from cadastros.departamento(departamentoId,nomeDepartamento) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			} else {
				sql = "update from cadastros.departamento set departamentoId=?, nomeDepartamento=? ";
				sql += " where from cadastros.departamentoId = ?";
				pstm = conn.prepareStatement(sql);
			}

			pstm.setString(1, departamento.getNomeDepartamento());
		
			if (departamento.getDepartamentoid() != 0) {
				pstm.setInt(2, departamento.getDepartamentoid());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0)
				return false;
			if (departamento.getDepartamentoid() == 0) {
				int idInserir = getGeneratedId(pstm);
				departamento.setDepartamentoid(idInserir);
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
			conn = this.getConnection();
			if (departamento.getDepartamentoid() == 0) {
				// É interessante fazer uma consulta para ver se já existe item com essa descrição
				sql = "insert into from cadastros.departamento (departamentoId,nomeDepartamento) ";
				sql += " values (?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				departamento.setControle(1);
			} else {
				sql = "update from cadastros.departamento set departamentoId=?, nomeDepartamento=? ";
				pstm = conn.prepareStatement(sql);
				departamento.setControle(2);
			}
			
			if (departamento.getDepartamentoid() != 0) {
				pstm.setInt(1, departamento.getDepartamentoid());
			}
			pstm.setString(2, departamento.getNomeDepartamento());
		
			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				if (departamento.getControle() == 1)
					departamento.setMensagem("Inclusão não foi realizada");
				if (departamento.getControle() == 2)
					departamento.setMensagem("Alteração não foi realizada");
			} else {
				if (departamento.getDepartamentoid() == 0) {
					int idInserir = getGeneratedId(pstm);
					departamento.setDepartamentoid(idInserir);
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

	public boolean excluir(int departamentoId) {

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "delete from from cadastros.departamento where departamentoId = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, departamentoId);
			int conta = pstm.executeUpdate();
			boolean retorno = conta > 0;
			return retorno;
		} catch (SQLException e) {
			return false;
		}
	}

	public Departamento excluirMsg(int departamentoId) {
		Departamento departamento = new Departamento();

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "delete from from cadastros.departamento where departamentoId = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, departamentoId);
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
			conn = this.getConnection();
			String sql = "select * from from cadastros.departamento";
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

	public List<Departamento> getDepartamentoPorIdLista(int idDepartamento) {

		List<Departamento> lista = new ArrayList<>();
		Departamento departamento = new Departamento();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from from cadastros.departamento where departamentoId = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idDepartamento);
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
