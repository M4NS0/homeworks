public class Lista {

	private int primeiro, ultimo, pos;
	private Object[] item;

	// define o tamanho da lista
	public Lista(int maxTam) {
		this.item = new Object[maxTam];
		this.pos = -1;
		this.primeiro = 0;
		this.ultimo = this.primeiro;
	}

	// Verifica se a lista está vazia
	public boolean vazia() {
		return (this.primeiro == this.ultimo);
	}

	// Verifica se a lista está cheia
	public boolean cheia() {
		return (this.ultimo == this.tamanho());
	}

	// Verifica tamanho da lista
	public int tamanho() {
		return item.length;
	}

	// Insere pessoa na lista
	public void inserirNoFinal(Object x) throws Exception {
		if (this.ultimo >= this.item.length)
			throw new Exception("Erro : A lista esta cheia");
		else {
			this.item[this.ultimo] = x;
			this.ultimo = this.ultimo + 1;
		}
	}
}
