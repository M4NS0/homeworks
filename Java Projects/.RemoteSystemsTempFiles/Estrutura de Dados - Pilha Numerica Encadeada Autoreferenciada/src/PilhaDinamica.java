/*
 ============================================================================
 Name  		: Pilha Numérica Encadeada/Autoreferenciada
 Livro		: Estrutura de Dados em Java
 Autores    : Luzzardi
 Página		: 62-64
 Descrição	: O programa abaixo demonstra a inclusão, exclusão
			  e consulta em uma Pilha alocada dinamicamente
 ============================================================================
*/

public class PilhaDinamica {
	final int sucesso = 0;
	final int vazia = 2;
	private Nodo topo;

	public void criaPilha() {
		topo = null;
	}

	public int push(int dado) {
		Nodo t = new Nodo();
		t.info = dado;
		t.seg = topo;
		topo = t;
		return (sucesso);
	}

	public int pop() {
		Nodo t = new Nodo();
		if (topo == null) {
			return (vazia);
		} else {
			t = topo;
			System.out.println("Dado no Topo: " + t.info);
			topo = t.seg;
			return (sucesso);
		}
	}

	public int consultaPilha() {
		Nodo t = new Nodo();
		if (topo == null) {
			return (vazia);
		} else {
			t = topo;
			System.out.println("Topo: " + t.info);
			return (sucesso);
		}
	}

	public void imprimeErro(int erro) {
		switch (erro) {
		case vazia:
			System.out.println("ERRO: Pilha Vazia");
			break;
		}
	}

	public void exibePilha() {
		Nodo t = new Nodo();
		System.out.print("Pilha: ");
		if (topo == null) {
			System.out.print("Vazia");
		} else {
			t = topo;
			while (t != null) {
				System.out.print(t.info + " ");
				t = t.seg;
			}
		}
		System.out.println();
	}
}
