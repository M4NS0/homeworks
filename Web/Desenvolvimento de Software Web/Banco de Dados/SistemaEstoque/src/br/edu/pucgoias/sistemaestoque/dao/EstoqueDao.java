package br.edu.pucgoias.sistemaestoque.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.pucgoias.sistemaestoque.modelo.Estoque;

public class EstoqueDao extends BaseDao {
	public Estoque getEstoqueViaId(int id) {
		Estoque estoque = new Estoque();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement

			("SELECT * FROM estoque WHERE id=?");

			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {
				estoque = criaEstoque(rs);
			}

		} catch (SQLException e) {

		}
		return estoque;
	}

	private Estoque criaEstoque(ResultSet rs) throws SQLException {
		Estoque estoque = new Estoque();
		estoque.setDescricao(rs.getNString("descricao"));
		estoque.setId(rs.getInt("id"));
		estoque.setQuantidade(rs.getDouble("quantidade"));
		estoque.setPrecounit(rs.getDouble("precounit"));

		return estoque;
	}

	public List<Estoque> getEstoqueViaNome(String nome) {
		List<Estoque> lista = new ArrayList<>();
		Estoque estoque = new Estoque();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "SELECT * FROM estoque WHERE LOWER(descricao) LIKE ? ORDER BY nome";
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, "%" + nome.toLowerCase() + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				estoque = criaEstoque(rs);
				lista.add(estoque);
			}
		} catch (SQLException e) {

		}
		return lista;
	}

	public boolean salvarEstoque(Estoque estoque) {
		boolean retorno = false;
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;

		try {
			conn = this.getConnection();
			if (estoque.getId() == 0) {
				sql = "INSERT INTO estoque (descricao, precounit, quantidade) values";
				sql += " (?, ?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			} else {
				sql = "UPDATE estoque SET descricao=?, precounit=?, quantidade=?";
				sql += " WHERE id=?";
				pstm = conn.prepareStatement(sql);
			}
			pstm.setString(1, estoque.getDescricao());
			pstm.setDouble(2, estoque.getPrecounit());
			pstm.setDouble(3, estoque.getQuantidade());
			if (estoque.getId() != 0) {
				pstm.setInt(4, estoque.getId());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				return false;
			}
			if (estoque.getId() == 0) {
				int idInserir = getGeneratedId(pstm);
				estoque.setId(idInserir);
			}
			retorno = true;

		} catch (SQLException e) {
			retorno = false;
		}
		return retorno;

	}

	private int getGeneratedId(PreparedStatement stm) throws SQLException {
		ResultSet rs = stm.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			return id;
		}
		return 0;
	}

	public boolean excluir(int id) {
		List<Estoque> lista = new ArrayList<>();
		Estoque estoque = new Estoque();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "DELETE FROM estoque WHERE id = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			boolean retorno = conta > 0;
			return retorno;
		} catch (SQLException e) {
			return false;
		}
	}

	public List<Estoque> getTodos() {
		List<Estoque> lista = new ArrayList<>();
		Estoque estoque = new Estoque();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "SELECT * FROM estoque ORDER BY descricao";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				estoque = criaEstoque(rs);
				lista.add(estoque);
			}
		} catch (SQLException e) {
			return lista;
		}
		return lista;
	}
}
