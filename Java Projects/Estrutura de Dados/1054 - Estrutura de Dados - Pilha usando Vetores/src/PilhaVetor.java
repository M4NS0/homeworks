public class PilhaVetor {
	final int SUCESSO = 0;
	final int PILHA_CHEIA = 1;
	final int PILHA_VAZIA = 2;
	private final int m = 7;
	private int topo;
	private int[] elem = new int[m];

	public void criaPilha() {
		topo = -1;
	}

	public int push(int dado) {
		if (topo == m - 1) {
			return (PILHA_CHEIA);
		} else {
			topo = topo + 1;
			elem[topo] = dado;
			return (SUCESSO);
		}
	}

	public int pop() {
		if (topo == -1) {
			return (PILHA_VAZIA);
		} else {
			System.out.println("Pop: " + elem[topo]);
			topo = topo - 1;
			return (SUCESSO);
		}
	}

	public int consultaPilha() {
		if (topo == -1) {
			return (PILHA_VAZIA);
		} else {
			System.out.println("Pop: " + elem[topo]);
			return (SUCESSO);
		}
	}

	public void exibePilha() {
		System.out.print("Pilha: ");
		if (topo != -1) {
			for (int i = topo; i >= 0; i--) {
				System.out.print(elem[i] + " ");
			}
			System.out.println();
		}
	}

	public void imprimeErro(int erro) {
		switch (erro) {
		case PILHA_CHEIA:
			System.out.println("ERRO: Pilha Cheia");
			break;
		case PILHA_VAZIA:
			System.out.println("ERRO: Pilha Vazia");
			break;
		}
	}
}