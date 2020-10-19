package br.com.cadastro.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastro.modelo.Cargo;
import br.com.cadastro.modelo.Departamento;
import br.com.cadastro.modelo.Funcionario;

public class FuncionarioDao extends BaseDao {

	public Funcionario getFuncionarioCpf(String cpf) {

		Funcionario funcionario = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			pstm = conn.prepareStatement("select * from cadastros.funcionario where cpf=?");
			pstm.setString(1, cpf);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				funcionario = criaFuncionario(rs);
			}

		} catch (SQLException e) {
			funcionario = null;
		}
		return funcionario;
	}

	public Funcionario criaFuncionario(ResultSet rs) throws SQLException {
		
		Funcionario funcionario = new Funcionario();
		Departamento departamento = new Departamento();
		Cargo cargo = new Cargo();
		cargo.setIdCargo(rs.getInt("cargoid"));
		cargo.setNomeCargo(rs.getString("nomecargo"));
		departamento.setIdDepartamento(rs.getInt("departamentoid"));
		departamento.setNomeDepartamento(rs.getString("nomedepartamento"));
		funcionario.setCpf(rs.getString("cpf"));
		funcionario.setNome(rs.getString("nome"));
		funcionario.setNascimento(rs.getString("nascimento"));
		funcionario.setSalario(rs.getDouble("salario"));

		funcionario.setCargo(cargo);
		funcionario.setDepartamento(departamento);

		return funcionario;

	}

	public List<Funcionario> getNome(String nome) {

		List<Funcionario> lista = new ArrayList<>();
		Funcionario funcionario = new Funcionario();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.funcionario where lower(nome) like ? order by nome";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + nome.toLowerCase() + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				funcionario = criaFuncionario(rs);
				lista.add(funcionario);
			}

		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}

	public boolean salvarFuncionario(Funcionario funcionario) {
		boolean retorno = false;
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			if (funcionario.getCpf().equals("")) {
				sql = "insert into cadastros.funcionario (nome, cpf, nascimento, salario, IDcargo, IDdepartamento) ";
				sql += " values (?, ?, ?, ?, ?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			} else {
				sql = "update cadastros.funcionario set nome=?, cpf=?, nascimento=?, salario=?, IDcargo=?, IDdepartamento=?";
				sql += " where cpf = ?";
				pstm = conn.prepareStatement(sql);
			}
			pstm.setString(1, funcionario.getNome());
			pstm.setString(2, funcionario.getCpf());
			pstm.setString(3, funcionario.getNascimento());
			pstm.setDouble(4, funcionario.getSalario());
			pstm.setInt(5, funcionario.getCargo().getIdCargo());
			pstm.setInt(6, funcionario.getDepartamento().getIdDepartamento());
			if (funcionario.getCpf().isEmpty()) {
				pstm.setString(7, funcionario.getCpf());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0)
				return false;

			retorno = true;
		} catch (SQLException e) {
			retorno = false;
		}
		return retorno;
	}

	public Funcionario salvarFuncionarioMsg(Funcionario funcionario) {

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String mySql = "insert into cadastros.funcionario(cpf, IDcargo, IDdepartamento, nome, nascimento, salario) values(?,?,?,?,?,?);";
			pstm = conn.prepareStatement(mySql);
			pstm.setString(1, funcionario.getCpf());
			pstm.setInt(2, funcionario.getCargo().getIdCargo());
			pstm.setInt(3, funcionario.getDepartamento().getIdDepartamento());
			pstm.setString(4, funcionario.getNome());
			pstm.setString(5, funcionario.getNascimento());
			pstm.setDouble(6, funcionario.getSalario());
			 

			pstm.executeUpdate();
			conn.close();
			
			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				if (funcionario.getControle() == 1)
					funcionario.setMensagem("Inclusão não foi realizada");
				if (funcionario.getControle() == 2)
					funcionario.setMensagem("Alteração não foi realizada");
			} else {
				
				if (funcionario.getControle() == 1)
					funcionario.setMensagem("Inclusão realizada com sucesso!!");
				if (funcionario.getControle() == 2)
					funcionario.setMensagem("Alteração realizada com sucesso!!");
			}
		} catch (SQLException e) {
			funcionario.setMensagem("Erro de atualização");
		}
		return funcionario;
	}

	public int getGeneratedId(PreparedStatement stm) throws SQLException {
		ResultSet rs = stm.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			return id;
		}
		return 0;
	}

	public boolean excluir(String cpf) {

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "delete from cadastros.funcionario where cpf = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cpf);
			int conta = pstm.executeUpdate();
			boolean retorno = conta > 0;
			return retorno;
		} catch (SQLException e) {
			return false;
		}
	}

	public Funcionario excluirMsg(String cpf) {
		Funcionario funcionario = new Funcionario();

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "delete from cadastros.funcionario where cpf = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cpf);
			int conta = pstm.executeUpdate();
			if (conta > 0) {
				funcionario.setControle(3);
				funcionario.setMensagem("Exclusão efetuada com sucesso");
			}
		} catch (SQLException e) {
			funcionario.setMensagem("Erro de exclusão");
		}
		return funcionario;
	}

	public List<Funcionario> getTodos() {

		List<Funcionario> lista = new ArrayList<>();
		Funcionario funcionario = new Funcionario();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.cargo, cadastros.departamento, cadastros.funcionario where idcargo = cargoid and iddepartamento = departamentoid;";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				funcionario = criaFuncionario(rs);
				lista.add(funcionario);
			}
		} catch (SQLException e) {
			return null;
		}
		
		
		return lista;
	}

	public List<Funcionario> getFuncionarioListaCpf(String cpf) {

		List<Funcionario> lista = new ArrayList<>();
		Funcionario funcionario = new Funcionario();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "select * from cadastros.funcionario where cpf = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cpf);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				funcionario = criaFuncionario(rs);
				lista.add(funcionario);
			}

		} catch (SQLException e) {
			lista = null;
		}
		return lista;
	}
}