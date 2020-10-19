package br.com.cadastro.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastro.modelo.Cargo;
import br.com.cadastro.modelo.Departamento;
import br.com.cadastro.modelo.Funcionario;

public class TestePersistencia {
	public static void main(String[] args) throws SQLException {
		Departamento departamento = new Departamento();
		departamento.setNomeDepartamento("TI");
		departamento.setIdDepartamento(0);
		
		Cargo cargo = new Cargo();
		cargo.setNomeCargo("Diretor");
		cargo.setIdCargo(0);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Bruno");
		funcionario.setCpf("70399247149");
		funcionario.setSalario(6000.00);
		funcionario.setNascimento("30/10/1980");
		funcionario.setDepartamento(departamento);
		funcionario.setCargo(cargo);
		
		Connection conn = BaseDao.getConnection();
		String mySql = "insert into cadastros.funcionario(cpf, IDcargo, IDdepartamento, nome, nascimento, salario) values(?,?,?,?,?,?);";
		PreparedStatement pstm = conn.prepareStatement(mySql);
		pstm.setString(1, funcionario.getCpf());
		pstm.setInt(2, funcionario.getCargo().getIdCargo());
		pstm.setInt(3, funcionario.getDepartamento().getIdDepartamento());
		pstm.setString(4, funcionario.getNome());
		pstm.setString(5, funcionario.getNascimento());
		pstm.setDouble(6, funcionario.getSalario());
		 

		pstm.executeUpdate();
		conn.close();
		getTodos();
		
	}
		
		public static  void getTodos(){

			 List<Funcionario> lista = new ArrayList<>();
			 Funcionario funcionario = new Funcionario();
			 PreparedStatement pstm = null;
			 ResultSet rs;
			 Connection conn = null;
			 try {
				 conn = BaseDao.getConnection();
				 //String sql="select (cpf,departamentoID,cargoID,nome,nascimento,salario,nomeDepartamento,nomeCargo) from cadastros.cargo, cadastros.departamento, cadastros.funcionario where idcargo = cargoid and iddepartamento = departamentoid;";
				 String sql = "select * from cadastros.cargo, cadastros.departamento, cadastros.funcionario where idcargo = cargoid and iddepartamento = departamentoid;";
				 pstm = conn.prepareStatement(sql);
				 rs = pstm.executeQuery();
				 while (rs.next())
				 {
					 funcionario = criaFuncionario(rs);
					 lista.add(funcionario);
				 }
				 
			 }
			 catch(SQLException e)
			 {
				System.out.println("Erro: " + e);
			 }
			 for (int i = 0; lista.size() > i; i ++ ) {
				 System.out.println(lista.get(i).getNome());
			 }
			 
		 }
		
		public static Funcionario criaFuncionario(ResultSet rs) throws SQLException {
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
}
