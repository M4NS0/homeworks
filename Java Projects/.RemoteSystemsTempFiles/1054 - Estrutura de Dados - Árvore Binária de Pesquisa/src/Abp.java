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
		if (obj == null)
			return null;
		// é necessário usar outra referencia
		// para não alterar a referencia passada no paramentro
		No atual = obj;
		// laço para encontrar o máximo
		while (atual.fd != null) {
			atual = atual.fd;
		}
		return atual; // maior valor na árvore

	}

	private No minimo(No obj) {
		if (obj == null)
			return null;
		// é necessário usar outra referencia
		// para não alterar a referencia passada no paramentro
		No atual = obj;
		while (atual.fe != null) {
			atual = atual.fe;
		}
		return atual; // maior valor na árvore
	}

	private No antecessor(No obj) {
		if (obj == null)
			return null;
		// Se tem filho a esquerda o antecessor é o máximo da sub-árvore da esquerda
		if (obj.fe != null)
			return (maximo(obj.fe));
		// Caso contrário o antecessor pode estar nos ancestrais
		// O antecessor pode ser o primeiro ancestral do qual o nó é filho a direita
		// Pode não ter antecessor
		No atual = obj.pai;
		No ant = obj;
		while (atual != null && ant == atual.fe) {
			ant = atual;
			atual = atual.pai;
		}

		// Se atual é nulo então não existe antecessor
		// Sucessor caso seja diferente de nulo
		return atual;
	}

	private No sucessor(No obj) {
		if (obj == null)
			return null;
		// Se tem filho a direito o sucessor é o mínimo da sub-árvore da direita
		if (obj.fd != null)
			return (minimo(obj.fd));
		// Caso contrário o sucessor pode estar nos ancestrais
		// O sucessor pode ser o primeiro ancestral do qual o nó é filho a esquerda
		// Pode não ter sucessor
		No atual = obj.pai;
		No ant = obj;
		while (atual != null && ant == atual.fd) {
			ant = atual;
			atual = atual.pai;
		}
		// Se atual é nulo então não existe sucessor
		// Sucessor caso seja diferente de nulo
		return atual;
	}

	public Item retirar(Item obj) {
		Item aux = null;
		No z = consultar(obj);
		if (z != null) {
			aux = new Item(z.dados.getNome(), z.dados.getFone());
			No y = null;
			No x = null;
			
			// o no z tem 1 filho só ou nenhum filho
			if (z.fd == null || z.fe == null) {
				y = z;
			} 
			
			// o no z tem dois filhos
			else {
				y = sucessor(z);
			} 
			if (y.fe != null) {
				x = y.fe;
			} else {
				x = y.fd;
			}
			
			// pois y tem um filho
			if (x != null) {
				x.pai = y.pai;
			} 
			
			// y é a raiz
			if (y.pai == null) {
				raiz = x;
				
				// pois y tem um filho
				if (x != null) {
					x.pai = null;
				} 
				
				// y não é raiz
			} else {
				if (y == y.pai.fe) {
					y.pai.fe = x;
				} else {
					y.pai.fd = x;
				}
			}
			
			// y é o sucessor de z --> copia dados de y para z
			if (y != z) {
				z.dados = y.dados;
			} 
			tamanho--;
		}
		return aux;
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
