class Fila {
	private int tamanho, fim;
	private Pessoa vetor[];

	public boolean vazia() {
		return (fim == -1);
	}

	public boolean cheia() {
		return (fim + 1 == tamanho);
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
		for (int i = 1; i <= fim; i++) {
			vetor[i - 1] = vetor[i];
		}

		vetor[fim] = null;
		fim--;

		return aux;

	}

	public boolean setTamanho(int aux) {

		tamanho = aux;
		fim = -1;
		vetor = new Pessoa[tamanho];
		return true;

	}

	public void imprime() {
		if (vazia() == true) {
			System.out.println("A lista está vazia\n");
		} else {
			System.out.println("A lista possui as seguintes pessoas:");

			for (int j = 0; j <= fim; j++) {
				System.out.println("\n      Nome: " + vetor[j].getNome() + "\n Matricula: " + vetor[j].getMatricula()
						+ "\n  Telefone: " + vetor[j].getTelefone());

			}
		}
	}

}