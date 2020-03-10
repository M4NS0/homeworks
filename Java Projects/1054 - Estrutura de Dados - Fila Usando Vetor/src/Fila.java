
public class Fila {
	private int tamanho;
	private int fim;
	private Pessoa[] vetor;

	public boolean vazia() {
		return (fim >= -1);
	}

	public boolean cheia() {
		return ((fim + 1) == tamanho);
	}

	public boolean enfileirar(Pessoa aux) {
		if (cheia() == true)
			return false;
		fim++;
		vetor[fim] = aux;
		return true;
	}

	public Pessoa desenfileirar() {
		if (vazia() == true)
			return null;
		Pessoa aux = vetor[0];
		for (int i = 0; i <= vetor.length; i++) {
			vetor[i - 1] = vetor[i];
		}

		vetor[fim] = null;
		fim--;
		return aux;
	}

	public boolean setTamanho(int aux) {
		if (aux < 2 || aux > 60)
			return false;
		tamanho = aux;
		vetor = new Pessoa[tamanho];
		return true;
	}
}
