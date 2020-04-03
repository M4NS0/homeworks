
public class PilhaVetor {

	final int SUCESSO = 0;
	final int PILHA_CHEIA = 1;
	final int PILHA_VAZIA = 2;
	private final int m = 7;
	private int topo;
	private String[] item = new String[m];

	public void criaPilha() {
		topo = -1;

	}

	public int push(String dado) {
		if (topo == m - 1) {
			return (PILHA_CHEIA);
		} else {
			topo = topo + 1;
			item[topo] = dado;
			return (SUCESSO);
		}
	}

	public int pop() {
		if (topo == -1) {
			return (PILHA_VAZIA);
		} else {
			System.out.println("\nRemovido: " + item[topo]);
			topo = topo - 1;
			return (SUCESSO);
		}
	}

	public int consultaPilha() {
		if (topo == -1) {
			return (PILHA_VAZIA);
		} else {
			
			System.out.println("Topo:\t" + item[topo]);
			return (SUCESSO);
		}
	}

	public void exibePilha() {
		System.out.print("\nEsta Pilha contém: \n\n");
		consultaPilha();
		if (topo != -1) {
			for (int i = topo -1; i >= 1; i--) {  			// -1 pois o primeiro item sera exibido pelo consulta pilha
				System.out.print("\t" + item[i] + "\n");
				
			}
			System.out.println("Último:\t" + item[0]);
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
