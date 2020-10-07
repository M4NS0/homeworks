package br.edu.pucgoias.sistemaestoque.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.pucgoias.sistemaestoque.dao.EstoqueDao;
import br.edu.pucgoias.sistemaestoque.modelo.Aluno;

public class EstoqueControle{

	private EstoqueDao ed = new EstoqueDao();

	public List<Aluno> getTodos() {
		return ed.getTodos();
	}

	public Aluno getPorId(int id) {
		return ed.getEstoqueViaId(id);
	}

	public Boolean excluir(int id) {
		return ed.excluir(id);
	}

	public Boolean salvar(Aluno estoque) throws SQLException {
		return ed.salvarEstoque(estoque);
	}

	public List<Aluno> buscaPorDescricao(String nome) {
		return ed.getEstoqueViaNome(nome);
	}
}