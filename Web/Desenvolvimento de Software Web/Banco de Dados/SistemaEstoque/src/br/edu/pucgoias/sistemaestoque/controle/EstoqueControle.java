package br.edu.pucgoias.sistemaestoque.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.pucgoias.sistemaestoque.dao.EstoqueDao;
import br.edu.pucgoias.sistemaestoque.modelo.Estoque;

public class EstoqueControle {

	private EstoqueDao ed = new EstoqueDao();

	public List<Estoque> getTodos() {
		return ed.getTodos();
	}

	public Estoque getPorId(int id) {
		return ed.getEstoqueViaId(id);
	}

	public Boolean excluir(int id) {
		return ed.excluir(id);
	}

	public Boolean salvar(Estoque estoque) throws SQLException {
		return ed.salvarEstoque(estoque);
	}

	public List<Estoque> buscaPorDescricao(String nome) {
		return ed.getEstoqueViaNome(nome);
	}
}