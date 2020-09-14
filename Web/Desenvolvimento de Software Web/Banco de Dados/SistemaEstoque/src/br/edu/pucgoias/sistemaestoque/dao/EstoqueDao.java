package br.edu.pucgoias.sistemaestoque.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.pucgoias.sistemaestoque.modelo.Aluno;

public class EstoqueDao extends BaseDao {

	public Aluno getEstoqueViaId(int id) {
		Aluno estoque = new Aluno();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select from estoque whare id =?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				estoque = criaEstoque(rs);
			}
		} catch (SQLException e) {

		}
		return estoque;
	}

	public Aluno criaEstoque(ResultSet rs) throws SQLException {
		Aluno estoque = new Aluno();
		estoque.setDescricao(rs.getString("descricao"));
		estoque.setId(rs.getInt("id"));
		estoque.setPreunit(rs.getDouble("preunit"));
		estoque.setQuantidade(rs.getInt("quantidade"));
		return null;
	}

	public List<Aluno> getEstoqueViaNome(String nome) {
		List<Aluno> list = new ArrayList<>();
		Aluno estoque = new Aluno();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from estoque where lower(descricao) like ? order by descricao";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + nome.toLowerCase() + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				estoque = criaEstoque(rs);
				list.add(estoque);
			}
		} catch (SQLException e) {

		}
		return list;
	}

	public Boolean salvarEstoque(Aluno estoque) throws SQLException {
		boolean retorno = false;
		PreparedStatement pstm = null;
		Connection conn = null;
		String sql = null;
		try {
			conn = this.getConnection();
			if (estoque.getId() == 0) {
				sql = "insert into estoque (descricao , preunit , quantidade) values (? , ? , ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			} else {
				sql = "update estoque set descricao=? , preunit=? , quantidade=? where id=?";
				pstm = conn.prepareStatement(sql);
			}
			pstm.setString(1, estoque.getDescricao());
			pstm.setDouble(2, estoque.getPreunit());
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

	public int getGeneratedId(PreparedStatement pstm) throws SQLException {
		ResultSet rs = pstm.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			return id;
		}
		return 0;
	}

	public Boolean excluir(int id) {
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("delete from estoque where id=?");
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			boolean retorno = conta > 0;
			return retorno;
		} catch (SQLException e) {
			return false;
		}
	}

	public List<Aluno> getTodos() {
		List<Aluno> lista = new ArrayList<>();
		Aluno estoque = new Aluno();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select * from estoque order by descricao");
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