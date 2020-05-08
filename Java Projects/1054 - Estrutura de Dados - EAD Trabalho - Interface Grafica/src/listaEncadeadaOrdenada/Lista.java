package listaEncadeadaOrdenada;

public class Lista {

	public class No {
		private Pessoa dados;
		private No prox;
		

		public No(Pessoa aux) {
			dados = aux;
			prox = null;
		}
	}

	private int tam;
	private No inicio;
	private int index;

	public Lista() {
		tam = 0;
		inicio = null;
	}

	public boolean vazia() {
		return (inicio == null);
	}

	public int getTam() {
		return tam;
	}

	public Pessoa busca(Pessoa aux) {
		if (vazia())
			return null;
		No i = null;
		for (i = inicio; i != null && !aux.getNome().equals(i.dados.getNome()); i = i.prox);
		
		if (i == null) {
			return null;
		}
		Pessoa novo = new Pessoa(i.dados.getNome(), i.dados.getTelefone(), i.dados.getEndereco());
		return novo;
	}

	public boolean adicionaOrdenado(Pessoa aux) {
		Pessoa buscado = busca(aux);
		if (buscado != null)
			return false;
		No novo = new No(aux);
		if (vazia()) {
			inicio = novo;
			tam++;
			return true;
		}
		No i = inicio;
		No ant = inicio;
		for (; i != null && aux.getNome().compareTo(i.dados.getNome()) > 0; ant = i, i = i.prox)
			;
		if (i == ant) {
			novo.prox = inicio;
			inicio = novo;
		} else {
			ant.prox = novo;
			novo.prox = i;
		}
		tam++;
		return true;
	}

	public Pessoa retira(Pessoa aux) {
		if (vazia())
			return null;
		No i = inicio;
		No ant = inicio;
		for (; i != null && !aux.getNome().equals(i.dados.getNome()); ant = i, i = i.prox);
		if (i == null) {
			return null;
		}
		Pessoa novo = i.dados;
		if (i == ant) {
			inicio = inicio.prox;
		}
		else {
			ant.prox = i.prox;
		}
		tam--;
		return novo;
	}

	

	public String imprima() {
		String aux = new String("");

		if (vazia()) {
			aux = "Lista vazia.";
		}

		else {
			for (No i = inicio; i != null; i = i.prox) {
				aux = aux + i.dados.toString();
			}
		}
 
		return aux.toString();
	}

	public String imprimaInv() {
		String[] aux = imprima().split("\n");
		String reverso = "";

		for (int i = 0; i < aux.length; i++) {
			if (i == aux.length - 1)
				reverso = aux[i] + reverso;
			else
				reverso = "\n" + aux[i] + reverso;
		}
		return reverso;

	}

}