package alterado;

public class Pilha {
	public class No {
		Object dados;
		No prox;

		public No(Object aux) {
			dados = aux;
			prox = null;
		}
	}

	private int tam;
	No topo;

	public Pilha() {
		tam = 0;
		topo = null;
	}

	public int getTam() {
		return tam;
	}
	
	public boolean vazia() {
		return (topo == null);
	}

	public void push(Object aux) {
		No novo = new No(aux);
		if (vazia()) {
			topo = novo;
			tam++;
		} else {
			novo.prox = topo;
			topo = novo;
			tam++;
		}
	}

	public Object pop() {
		if (!vazia()) {
			Object aux = topo.dados;
			topo = topo.prox;
			tam--;
			return aux;
		}
		return null;
	}
}
