package br.com.cadastros.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastros.modelo.Cargo;
import br.com.cadastros.modelo.Departamento;
import br.com.cadastros.modelo.Funcionario;

public class CadastroDao extends BaseDao {
	
	public Funcionario criaFuncionario (ResultSet rs) throws SQLException {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(rs.getNString("nome"));
		funcionario.setCpf(rs.getString("cpf"));
		funcionario.setNascimento(rs.getString("nascimento"));
		
		Departamento departamento = new Departamento();
		departamento.setNomeDepartamento(rs.getString("nomeDepartamento"));
		departamento.setIdDepartamento(rs.getInt("departamentoID"));
		
		Cargo cargo = new Cargo();
		cargo.setNomeCargo(rs.getNString("nomeCargo"));
		cargo.setIdCargo(rs.getInt("cargoID"));
		
		funcionario.setDepartamento(departamento);
		funcionario.setCargo(cargo);
		
		return funcionario;
	}
	public Funcionario getFuncionarioById(long cpf) {
		Funcionario funcionario = null;
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			pstm = conn.prepareStatement("SELECT * FROM funcionario WHERE cpf=?");
			pstm.setLong(1, cpf);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				funcionario = criaFuncionario(rs);
			}
		} catch (SQLException e) {
			funcionario = null;
		}
		return funcionario;
	} 
	
	public List<Funcionario> getFuncionarioByName(String nome) {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		Funcionario funcionario = new Funcionario();
		PreparedStatement pstm = null;
		Connection conn = null;
		try {
			conn = BaseDao.getConnection();
			String sql = "SELECT * FROM funcionario WHERE LOWER(nome) LIKE ? ORDER BY nome";
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
}
