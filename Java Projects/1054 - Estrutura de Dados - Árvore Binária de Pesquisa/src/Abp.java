public class Abp {
	public class No {
		private Item dados;
		private No fd, fe, pai;

		public No(Item aux) {
			dados = aux;
			fd = fe = pai = null;
		}
	}

	private No raiz;
	private int tamanho;

	public Abp() {
		raiz = null; // inicializa a raiz com null
	}

	public int getTamanho() {
		return tamanho;
	}

	public boolean vazia() {
		return (raiz == null); // retorna true caso raiz == null
	}

	private No consultar(Item obj) {
		No aux = raiz;
		while (aux != null) {
			if (obj.getNome().compareTo(aux.dados.getNome()) < 0)
				aux = aux.fe;
			else if (obj.getNome().compareTo(aux.dados.getNome()) > 0)
				aux = aux.fd;
			else
				return aux; // Sucesso(encontrou)
		}
		return null; // Insucesso --> null
	}

	public Item pesquisar(Item obj) {
		No aux = consultar(obj);
		if (aux == null) {
			return null; // Insucesso à não encontrou
		}
		return (new Item(aux.dados.getNome(), aux.dados.getFone())); // Ssucesso --> encontrou
	}

	public boolean inserir(Item obj) {
		// cria-se um novo nó
		No aux = new No(obj);
		// verifica-se a árvore está vazia e caso afirmativo faz do nó aux a raiz da
		// árvore
		if (vazia()) {
			raiz = aux;
			return true;
		}
		// encontra o local de inserção que é sempre numa folha
		No ptr = raiz;
		No ant = raiz;
		while (ptr != null) {
			if (obj.getNome().compareTo(ptr.dados.getNome()) < 0) {
				ant = ptr;
				ptr = ptr.fe;
			} else if (obj.getNome().compareTo(ptr.dados.getNome()) > 0) {
				ant = ptr;
				ptr = ptr.fd;
			} else
				return false; // Insucesso --> item já está na árvore
		}
		// faz o nó referenciado por ant o pai do nó aux
		aux.pai = ant;
		// verifica-se é filho a esquerda ou a direita
		if (obj.getNome().compareTo(ant.dados.getNome()) < 0) {
			ant.fe = aux;
		} else {
			ant.fd = aux;
		}
		return true; // Sucesso
	}

	private No maximo(No obj) {
		// implementar depois
		return obj;
	}

	private No minimo(No obj) {
		// implementar depois
		return obj;
	}

	private No antecessor(No obj) {
		// implementar depois
		return obj;
	}

	private No sucessor(No obj) {
		// implementar depois
		return obj;
	}

	public Item retirar(Item obj) {
		// implementar depois
		return obj;
	}

	public void visitaEmOrdem(StringBuffer aux) {
		// chamar método recursivo
	}

	public void visitaEmPreOrdem(StringBuffer aux) {
		// chamar método recursivo
	}

	public void visitaEmPosOrdem(StringBuffer aux) {
		// chamar método recursivo
	}

	public void testaIntegridade(StringBuffer aux) {
		// chamar método recursivo
	}
}
