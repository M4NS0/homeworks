
public class Item {
	private String descricao;
	private int quantidade;
	private int prioridade;

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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		String aux = descricao + "\n";
		aux = aux + Integer.toString(quantidade) + "\n";
		aux = aux + Integer.toString(prioridade) + "\n";
		return aux;
	}
}
