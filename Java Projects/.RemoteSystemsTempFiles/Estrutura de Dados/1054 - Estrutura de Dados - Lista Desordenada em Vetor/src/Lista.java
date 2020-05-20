
public class Lista {
	private int tamanho;
	private int fim;
	private Item vetor[];

	public void ListaDV() {
		fim = -1;
		tamanho = 0;
		vetor = null;
	}

	public boolean setTamanho(int aux) {
		// retorna falso se a lista for menor q 2 e maior q 20
		if (aux <= 2 || aux >= 20)
			return false;

		// retorna verdadeiro quando é criado uma lista de tamanho 3 a 19
		fim = -1;
		tamanho = aux;
		vetor = new Item[tamanho];
		return true;
	}

	public boolean vazia() {
		// se a lista estiver vazia, retorna a posição do fim para -1
		return (fim == -1);
	}

	public boolean cheia() {
		// se a lista estiver cheia fim + 1 será igual ao tamanho dela
		return ((fim + 1) == tamanho);
	}

	public boolean adicionanaFila(Item aux) {
		if (cheia() == true)
			return false;
		fim++;
		vetor[fim] = aux;
		return true;
	}

	public Item consultar(Item aux) {
		if (vazia() == true) return null;
		int i;
		for (i = 0; i <= fim && aux.getDescricao() != vetor[i].getDescricao(); i++);

		if (i > fim)
			return null;

		Item retorno = new Item();
		
		retorno.setDescricao(vetor[i].getDescricao());
		retorno.setQuantidade(vetor[i].getQuantidade());
		retorno.setPrioridade(vetor[i].getPrioridade());
		
		return retorno;
	}

	public Item retira(Item aux) {
		if (vazia() == true)return null;
		int i;
		for (i = 0; i <= fim && aux.getDescricao() != vetor[i].getDescricao(); i++);
		if (i > fim) return null;
		
		Item achei = vetor[i];
		
		for (; i < fim; i++) {
			vetor[i] = vetor[i + 1];
			vetor[i] = null;
			fim--;
		}
		return achei;
	}
	public boolean modificarItem (Item antigo ,Item modificado) {
		if(vazia()) return false;
		int i;
		for (i = 0; i <= fim && !antigo.getDescricao().equals(vetor[i].getDescricao()); i ++);
		if (i > fim) return false;
		vetor[i] = modificado;
		return true;
	}
	
	public String getLista() {
		if (vazia()) return "lista vazia\n";
		String aux = null;
		for (int i = 0; i <= fim; i++) {
			aux = aux + vetor[i].getItem() + "\n";
		}
		return aux;
	}

}
