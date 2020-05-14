import java.util.ArrayList;

public class Produto {
	protected int codigo, quantidade;
	protected String descricao;

	protected Produto(int codigo, int quantidade, String descricao) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}

	public String diminuiQuantidade(int qt, String desc, ArrayList<Produto> estoque) {
		if (estoque.isEmpty()) {
			return " Estoque Vazio!";
		}
		for (int i = 0; i < estoque.size(); i++) {
			if (estoque.get(i).getDescricao().equalsIgnoreCase(desc)) {
				if (estoque.get(i).getQuantidade() == 0) {
					return " Não é possivel retirar, não tem mais " + estoque.get(i).getDescricao() + " no estoque";
				}
				if (estoque.get(i).getQuantidade() < qt) {
					return " Quantidade a ser retirada é superior a quantidade em estoque ("
							+ estoque.get(i).getQuantidade() + " itens)";
				} else {
					estoque.get(i).setQuantidade(quantidade - qt);
					return estoque.get(i).getQuantidade() + " unidades de " + estoque.get(i).getDescricao() + " no estoque";
				}

			}
		}
		return desc + " sem registro no estoque! ";
	}

	public String aumentaQuantidade(int qt, String desc, ArrayList<Produto> estoque) {
		if (estoque.isEmpty()) {
			return " Estoque Vazio!";
		}
		for (int i = 0; i < estoque.size(); i++) {
			estoque.get(i).setQuantidade(quantidade + qt);
			return estoque.get(i).getQuantidade() + " unidades de " + estoque.get(i).getDescricao() + " no estoque";
		}
		return desc + " sem registro no estoque! ";
	}

	public int getCodigo() {
		return codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
