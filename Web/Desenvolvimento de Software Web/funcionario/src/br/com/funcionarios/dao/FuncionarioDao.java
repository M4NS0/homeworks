package br.com.funcionarios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.funcionarios.modelo.Cargo;
import br.com.funcionarios.modelo.Departamento;
import br.com.funcionarios.modelo.Funcionario;

public class FuncionarioDao extends BaseDao {
	
	public List<Funcionario> getTodos() {

		List<Funcionario> lista = new ArrayList<>();
		Funcionario funcionario = new Funcionario();
		PreparedStatement pstm = null;
		ResultSet rs;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select cadastros.funcionario.idFuncionario, cadastros.funcionario.cpf, cadastros.cargo.cargoId, cadastros.cargo.nomeCargo, cadastros.funcionario.nomeFuncionario, cadastros.funcionario.nascimento, cadastros.funcionario.salario,\r\n" + 
					" cadastros.departamento.departamentoid, cadastros.departamento.nomedepartamento from cadastros.funcionario\r\n" + 
					" inner join cadastros.departamento on cadastros.departamento.departamentoid = cadastros.funcionario.iddepartamento\r\n" + 
					" inner join cadastros.cargo on cadastros.cargo.cargoId = cadastros.funcionario.idcargo;";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				funcionario = criaFuncionario(rs);
				lista.add(funcionario);

			}

		} catch (SQLException e) {
			return lista;
		}
		return lista;

	}


	public Funcionario criaFuncionario(ResultSet rs) throws SQLException {
		Funcionario funcionario = new Funcionario();
		Cargo cargo = new Cargo();
		Departamento departamento = new Departamento();


		funcionario.setFuncionarioId(rs.getInt("idfuncionario"));
		funcionario.setNomeFuncionario(rs.getString("nomefuncionario"));
		funcionario.setCpf(rs.getString("cpf"));
		funcionario.setNascimento(rs.getString("nascimento"));
		funcionario.setSalario(rs.getDouble("salario"));

		
		cargo.setCargoId(rs.getInt("cargoid"));
		cargo.setNomeCargo(rs.getString("nomeCargo"));
		cargo.setControle(1);
		funcionario.setCargo(cargo);
	
		departamento.setDepartamentoid(rs.getInt("departamentoid"));
		departamento.setNomeDepartamento(rs.getString("nomedepartamento"));
		departamento.setControle(1);
		funcionario.setDepartamento(departamento);
		funcionario.setControle(1);

		return funcionario;
	}

	public Funcionario getFuncionarioViaId(int id) {
		Funcionario funcionario = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstm = conn.prepareStatement("select * from cadastros.funcionario where idFuncionario=?");
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				funcionario = criaFuncionario(rs);
			}

		} catch (SQLException e) {
			funcionario = null;
		}
		return funcionario;
	}

	public List<Funcionario> getFuncionarioViaNome(String nomeFuncionario) {

		List<Funcionario> lista = new ArrayList<>();
		Funcionario funcionario = new Funcionario();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from cadastros.funcionario where lower(nomeFuncionario) like ? order by nomeFuncionario";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + nomeFuncionario.toLowerCase() + "%");
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
			conn = this.getConnection();
			if (funcionario.getFuncionarioId() == 0) {
				sql = "insert into cadastros.funcionario(cpf, idcargo, iddepartamento, nome, nascimento, salario) ";
				sql += " values (?, ?, ?, ?, ?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			} else {
				sql = "update cadastros.funcionario set cpf=?, idCargo=?, idDepartamento=?, nomeFuncionario=?, nascimento=?, salario=? ";
				sql += " where idFuncionario = ?";
				pstm = conn.prepareStatement(sql);
			}
			pstm.setString(1, funcionario.getCpf());
			pstm.setInt(2, funcionario.getCargo().getCargoId());
			pstm.setInt(3, funcionario.getDepartamento().getDepartamentoid());
			pstm.setString(4, funcionario.getNomeFuncionario());
			pstm.setString(5, funcionario.getNascimento());
			pstm.setDouble(6, funcionario.getSalario());

			if (funcionario.getFuncionarioId() != 0) {
				pstm.setInt(4, funcionario.getFuncionarioId());
			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0)
				return false;
			if (funcionario.getFuncionarioId() == 0) {
				int idInserir = getGeneratedId(pstm);
				funcionario.setFuncionarioId(idInserir);
			}
			retorno = true;
		} catch (SQLException e) {
			retorno = false;
		}
		return retorno;
	}

	public Funcionario salvarFuncionarioMsg(Funcionario funcionario) {
		String sql = "";
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			if (funcionario.getFuncionarioId() == 0) {
				// É interessante fazer uma consulta para ver se já existe item com essa
				// descrição
				sql = "insert into cadastros.funcionario(cpf,IDcargo,IDdepartamento,nomeFuncionario,nascimento,salario) ";
				sql += " values (?, ?, ?, ?, ?, ?)";
				pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				funcionario.setControle(1);
			} else {
				sql = "update cadastros.funcionario set cpf=?, idCargo=?, idDepartamento=?, nomeFuncionario=?, nascimento=?, salario=? ";
				pstm = conn.prepareStatement(sql);
				funcionario.setControle(2);
			}
			pstm.setString(1, funcionario.getCpf());
			pstm.setInt(2, funcionario.getCargo().getCargoId());
			pstm.setInt(3, funcionario.getDepartamento().getDepartamentoid());
			pstm.setString(4, funcionario.getNomeFuncionario());
			pstm.setString(5, funcionario.getNascimento());
			pstm.setDouble(6, funcionario.getSalario());

//			if (funcionario.getFuncionarioId() != 0) {
//				pstm.setInt(4, funcionario.getFuncionarioId());
//			}
			int idAux = pstm.executeUpdate();
			if (idAux == 0) {
				if (funcionario.getControle() == 1)
					funcionario.setMensagem("Inclusão não foi realizada");
				if (funcionario.getControle() == 2)
					funcionario.setMensagem("Alteração não foi realizada");
			} else {
//				if (funcionario.getFuncionarioId() == 0) {
//					int idInserir = getGeneratedId(pstm);
//					funcionario.setId(idInserir);
//				}
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

	public boolean excluir(int id) {

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "delete from cadastros.funcionario where idFuncionario = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int conta = pstm.executeUpdate();
			boolean retorno = conta > 0;
			return retorno;
		} catch (SQLException e) {
			return false;
		}
	}

	public Funcionario excluirMsg(int idFuncionario) {
		Funcionario funcionario = new Funcionario();

		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "delete from cadastros.funcionario where idFuncionario = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idFuncionario);
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

	
	public List<Funcionario> getFuncionarioPorIdLista(int idFuncionario) {

		List<Funcionario> lista = new ArrayList<>();
		Funcionario funcionario = new Funcionario();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select * from cadastros.funcionario where idFuncionario = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idFuncionario);
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
