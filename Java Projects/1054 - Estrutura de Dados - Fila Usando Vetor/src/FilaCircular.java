public class FilaCircular {
	final int SUCESSO = 0;
	final int FILA_CHEIA = 1;
	final int FILA_VAZIA = 2;
	private int m = 3;
	private int tamanho;
	private int primeiro;
	private int ultimo;
	private String [] elem = new String[m];

	public void criaFila() {
		primeiro = 0;
		tamanho = 0;
		ultimo = -1;
	}

	public int enfilera(Pessoa dado) {
		if (ultimo == m) {
			return (FILA_CHEIA);
		} else {
			tamanho++;
			ultimo = (ultimo + 1) % m;
			elem[ultimo] = "\t" + dado.nome + ", " + dado.matricula + ", " + dado.telefone + "\n";
			return (SUCESSO);
		}
	} 

	public int desenfilera() {
		if (ultimo == -1) {
			return (FILA_VAZIA);
		} else {
			System.out.println("Dado Excluído: " + elem[primeiro]);
			tamanho--;
			primeiro = (primeiro + 1) % m;
			return (SUCESSO);
		}
	}

	public String consultaFila() {
		if (ultimo == -1) {
			return null;
		} else {
			
			return ("Primeiro: " + elem[primeiro] + "Último:\t" + elem[ultimo]);
		}
	}

	public void exibeFila() {
		int t = primeiro;
		System.out.print("\nA Fila Contém  \n\n");
		System.out.print("\t\t  --Primeiro-- \n\n");
		if (tamanho != 0) {
			for (int i = primeiro ; i < tamanho ; i++) {
				System.out.print("\t" + elem[t]);
				t = (t + 1) % m;
			}
			System.out.print("\n\t\t   --Último-- ");
			
		}
	
	}

}