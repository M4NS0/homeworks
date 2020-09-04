package br.edu.pucgoias.sistemaestoque.controle;

import java.util.List;

import br.edu.pucgoias.sistemaestoque.dao.EstoqueDao;
import br.edu.pucgoias.sistemaestoque.modelo.Estoque;

public class EstoqueControle {
	private EstoqueDao ed = new EstoqueDao();
	
	public List<Estoque> getEstoque() {
		List<Estoque> estoques = ed.getTodos();
		return estoques;
	}
	public Estoque getEstoquePorId (int id) {
		return ed.getEstoqueViaId(id);
	}
	public boolean excluir(int id) {
		return ed.excluir(id);
	}
	public boolean salvar(Estoque estoque) {
		return ed.salvarEstoque(estoque);
	}
	public List<Estoque> buscaEstoquePorNome(String nome) {
		return ed.getEstoqueViaNome(nome);
	}
}
