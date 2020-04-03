public class Fila {
	final int SUCESSO = 0;
	final int FILA_CHEIA = 1;
	final int FILA_VAZIA = 2;
	private final int m = 7;
	private int primeiro;
	private int ultimo;
	private String [] elem = new String[m];

	public void criaFila() {
		primeiro = 0;
		ultimo = -1;
	}

	public int insereFila(Pessoa dado) {
		if (ultimo == m - 1) {
			return (FILA_CHEIA);
		} else {
			ultimo++;
			elem[ultimo] = "\t" + dado.nome + ", " + dado.matricula + ", " + dado.telefone + "\n";
			return (SUCESSO);
		}
	} 

	public int excluiFila() {
		if (ultimo == -1) {
			return (FILA_VAZIA);
		} else {
			System.out.println("Dado Excluído: " + elem[primeiro]);
			primeiro++;
			if (primeiro > ultimo) {
				primeiro = 0;
				ultimo = -1;
			}
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
		System.out.print("\nA Fila Contém  \n\n");
		System.out.print("Primeiro: " + elem[primeiro]);
		if (ultimo != -1) {
			for (int i = primeiro + 1; i <= ultimo -1; i++) {
				System.out.print("\t" + elem[i]);
			}
			System.out.print("Último: " + elem[ultimo] );
			
		}
	}

	public void imprimeErro(int erro) {
		switch (erro) {
		case FILA_CHEIA:
			System.out.println("ERRO: Fila Cheia");
			break;
		case FILA_VAZIA:
			System.out.println("ERRO: Fila Vazia");
			break;
		}
	}

}