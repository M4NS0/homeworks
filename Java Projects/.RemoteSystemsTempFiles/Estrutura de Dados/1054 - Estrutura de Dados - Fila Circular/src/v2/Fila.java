package v2;

public class Fila {
	int frente, tras;
	Pessoa [] lista;

	public Fila(int size) {
	     
	      lista = new Pessoa[size+1];
	      frente = 0;
	      tras = 0;
	    }

	public void enfileirar(Pessoa aux) {
		tras = (tras + 1) % lista.length;
		if (tras == frente) { 
			System.out.println(" Impossível adicionar " + aux.getNome() + " a fila está Cheia!");
			if (tras == 0)
				tras = lista.length - 1;
			else
				tras = tras - 1;
			return;
		}
		lista[tras] = aux;
	}

	public Pessoa desenfileirar() {
		if (tras == frente) {
			System.out.println(" A fila está vazia!");
			return null;
		}
		Pessoa aux = lista[frente];
		frente = (frente + 1) % lista.length;
		return aux;
	}

	public void imprimir() {
		int atual = frente;
		System.out.print("\n Estado da Fila:\n\n");
		System.out.println("  vv Início vv");
		if (atual == tras) {
			System.out.print("    (Vazia)");
		} else
			while (atual != tras) {
				atual = (atual + 1) % lista.length;
				System.out.print(lista[atual].getPessoa() + "\n");
			}
		System.out.println("\n   ^^ Fim ^^");
	}
}
