package listaDuplamenteEncadeadaOrdenada;

public class Item {
	private String descricao;
	private int quantidade, prioridade;

	public Item(String desc, int qt, int pri) {
		descricao = desc;
		quantidade = qt;
		prioridade = pri;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int getPrioridade() {
		return prioridade;
	}

	@Override
	public String toString() {
		String aux = descricao + "\n";
		aux = aux + Integer.toString(quantidade) + "\n";
		aux = aux + Integer.toString(prioridade) + "\n";
		return aux;
	}
}