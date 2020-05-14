public class Fila {

	public class No {
		private Pessoa dados;
		private No anterior;

		public No(Pessoa aux) {
			dados = aux;
			anterior = null;
		}
	}

	private int tamanho;
	No inicio;
	No fim;

	public Fila() {
		tamanho = 0;
		fim = inicio = null;
	}

	public int getTamanho() {
		return tamanho;
	}

	public boolean vazia() {
		return (inicio == null);
	}

	public void enfilerar(Pessoa aux) {
		No novo = new No(aux);
		if (vazia()) {
			fim = inicio = novo;
			tamanho++;
		} else {
			fim.anterior = novo;
			fim = novo;
			tamanho++;
		}
	}

	public Pessoa desenfileirar() {
		if (vazia())
			return null;
		Pessoa aux = inicio.dados;
		inicio = inicio.anterior;
		tamanho--;
		if (inicio == null)
			fim = null;
		return aux;
	}
}
