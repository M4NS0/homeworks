
public class Item {

	String descricao;
	int quantidade;
	int prioridade;
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public String getItem() {
		return (descricao + "\n" + Integer.toString(quantidade) + "\n" + Integer.toString(prioridade));
	}

}
