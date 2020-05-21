public class Abp {
	public class No {
		private Produto dados;
		private No fd, fe, pai;

		public No(Produto aux) {
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

	private No consultar(Produto obj) {
		No aux = raiz;
		while (aux != null) {
			if (obj.getMatricula() < aux.dados.getMatricula())
				aux = aux.fe;
			else if (obj.getMatricula() > aux.dados.getMatricula())
				aux = aux.fd;
			else
				return aux; // Sucesso(encontrou)
		}
		return null; // Insucesso --> null
	}
	

	public Produto pesquisar(Produto obj) {
		No aux = consultar(obj);
		if (aux == null) {
			return null; // Insucesso à não encontrou
		}
		return (new Produto(aux.dados.getMatricula(), aux.dados.getPreco(),aux.dados.getDescricao())); // Ssucesso --> encontrou
	}

	public boolean inserir(Produto obj) {
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
			if (obj.getMatricula() < aux.dados.getMatricula()) {
				ant = ptr;
				ptr = ptr.fe;
			} else if (obj.getMatricula() > aux.dados.getMatricula()) {
				ant = ptr;
				ptr = ptr.fd;
			} else
				return false; // Insucesso --> Produto já está na árvore
		}
		
		// faz o nó referenciado por ant o pai do nó aux
		aux.pai = ant;
		// verifica-se é filho a esquerda ou a direita
		if (obj.getMatricula() <  aux.dados.getMatricula()) {
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
	public No maximo() {
	    return maximo(raiz);
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
	 public No minimo() { 
		    return minimo(raiz);
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

	public Produto retirar(Produto obj) {
		Produto aux = null;
		No z = consultar(obj);
		if (z != null) {
			aux = new Produto(z.dados.getMatricula(), z.dados.getPreco(), z.dados.getDescricao());
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
		// se a árvore estiver vazia não faz as chamadas recursivas
		if (vazia()) {
			aux.append("Árvore vazia!");
		}
		// chamar método recursivo
		else {
			visitaEmOrdem(aux, raiz);
		}
	}

	private void visitaEmOrdem(StringBuffer aux, No obj) {
		if (obj != null) {
			visitaEmOrdem(aux, obj.fe);
			aux.append(obj.dados.toString());
			visitaEmOrdem(aux, obj.fd);
		}
	}

	public void visitaEmPreOrdem(StringBuffer aux) {
		// se a árvore estiver vazia não faz as chamadas recursivas
		if (vazia()) {
			aux.append("Árvore vazia!");
		}
		// chamar método recursivo
		else {
			visitaEmPreOrdem(aux, raiz);
		}
	}

	private void visitaEmPreOrdem(StringBuffer aux, No obj) {
		if (obj != null) {
			aux.append(obj.dados.toString());
			visitaEmPreOrdem(aux, obj.fe);
			visitaEmPreOrdem(aux, obj.fd);
		}
	}

	public void visitaEmPosOrdem(StringBuffer aux) {
		// se a árvore estiver vazia não faz as chamadas recursivas
		if (vazia()) {
			aux.append("Ärvore vazia!");
		}
		// chamar método recursivo
		else {
			visitaEmPosOrdem(aux, raiz);
		}
	}

	private void visitaEmPosOrdem(StringBuffer aux, No obj) {
		if (obj != null) {
			visitaEmPosOrdem(aux, obj.fe);
			visitaEmPosOrdem(aux, obj.fd);
			aux.append(obj.dados.toString());
		}
	}

	public void testaIntegridade(StringBuffer aux) {
		// se a árvore estiver vazia não faz as chamadas recursivas
		if (vazia()) {
			aux.append("Árvore vazia!");
		}
		// chamar método recursivo
		else {
			testaIntegridade(aux, raiz);
			aux.append("Árvore provavelmente sem erros.\nVeja mensagens de erro a anteriores.\n");
		}
	}

	private void testaIntegridade(StringBuffer aux, No obj) {
		if (obj == null) {
			return;
		}
		if (obj.fe != null) {
			if (obj.dados.getMatricula() > obj.fe.dados.getMatricula()) {
				aux.append("Erro!!! Pai menor que filho da esquerda.\n");
				aux.append("Pai --> " + obj.dados.getMatricula() + " - " + obj.dados.getDescricao() + "\n");
				aux.append("Filho da esquerda --> " + obj.dados.getMatricula() + " - " + obj.fd.dados.getDescricao() + "\n");
			}
		}
		if (obj.fd != null) {
			if (obj.dados.getMatricula() < obj.fd.dados.getMatricula()) {
				aux.append("Erro!!! Pai maior que filho da direita.\n");
				aux.append("Pai --> " + obj.dados.getMatricula() + " - " + obj.dados.getDescricao() + "\n");
				aux.append("Filho da direita --> " + obj.dados.getMatricula() + " - " + obj.fd.dados.getDescricao() + "\n");
			}
		}
		testaIntegridade(aux, obj.fe);
		testaIntegridade(aux, obj.fd);
	}
	
	// 2.Escreva um método em Java para determinar o número de nós em uma árvore binária de pesquisa.
	static int getNos(No raiz) {
		if (raiz == null)
			return 0;

		int res = 0;
		if (raiz.fe != null && raiz.fd != null)
			res++;

		res += (getNos(raiz.fe) + getNos(raiz.fd));
		return res;
	}

	public int getNos() {
		return getNos(raiz);
	}
	
	
	// 3.Escreva um método que conta o número de folhas de uma Árvores binária de pesquisa (ABP).
		int getFolhas() {
			return getFolhas(raiz);
		}

		int getFolhas(No no) {
			if (no == null)
				return 0;
			if (no.fe == null && no.fd == null)
				return 1;
			else
				return getFolhas(no.fe) + getFolhas(no.fd);
		}

	// 4. Duas Árvores binárias de pesquisa(ABP) são IGUAIS (ou similares) se são ambas vazias ou então se
	// armazenam valores iguais em suas raízes, suas sub-árvores esquerdas são iguais, e suas sub-árvores
	// direitas são iguais. Implemente um método que verifica se duas a árvores são iguais (ou similares).

		
	// 5.Uma ABP é estritamente binária se todos os nós da árvore tem 2 filhos. 
	// Implemente um método que verifica se uma ABP e ́ estritamente binária.
		
	// 6.Implemente um método para testar se uma a Árvore binária é uma ABP.
		
		private void isBinary(StringBuffer aux, No obj) {
			if (obj != null) {
				visitaEmOrdem(aux, obj.fe);
				aux.append(obj.dados.toString());
				visitaEmOrdem(aux, obj.fd);
			}
		}
}











