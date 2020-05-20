
import java.util.Arrays;

public class Lista {

	private int primeiro, ultimo, pos;
	private Object[] item;

	// Verifica se a lista está vazia
	public boolean vazia() {
		return (this.primeiro == this.ultimo);
	}

	// Verifica se a lista está cheia
	public boolean cheia() {
		return (this.ultimo == this.tamanho());
	}

	// Setar tamanho da lista
	public Lista(int maxTam) {
		this.item = new Object[maxTam];
		this.pos = -1;
		this.primeiro = 0;
		this.ultimo = this.primeiro;
	}

	// Verifica tamanho da lista
	public int tamanho() {
		return item.length;
	}

	// Insere pessoa na lista
	public void insere(Object x) throws Exception {
		if (this.ultimo >= this.item.length)
			throw new Exception("Erro : A lista esta cheia");
		else {
			this.item[this.ultimo] = x;
			this.ultimo = this.ultimo + 1;
		}
	}

	// Imprime lista de convidados
	public void imprime() {
		if (vazia() == true) {
			System.out.println("A lista está vazia\n");
		} else {
			System.out.println("Sua lista de convidados possui as seguintes pessoas:");
			int i = 0;
			for (int aux = this.primeiro; aux < this.ultimo; aux++) {
				System.out.println(i + "- " + this.item[aux].toString());
				i++;
			}
		}
	}

	// Busca por pessoa na lista pelo nome
	public Object pesquisa(Object pessoa) {
		if (this.vazia() || pessoa == null)
			return null;
		for (int p = 0; p < this.ultimo; p++)
			if (this.item[p].equals(pessoa))
				return this.item[p];
		return null;
	}

	// Retira Pessoa
	public Object retira(Object pessoa) throws Exception {
		if (this.vazia() || pessoa == null)
			throw new Exception("Erro : A lista esta vazia");
		int p = 0;
		while (p < this.ultimo && !this.item[p].equals(pessoa))
			p++;
		if (p >= this.ultimo)
			return null; // Chave não encontrada

		Object item = this.item[p];
		this.ultimo = this.ultimo - 1;
		for (int aux = p; aux < this.ultimo; aux++)
			this.item[aux] = this.item[aux + 1];
		return item;
	}

	// Retira primeira pessoa da lista
	public Object retiraPrimeiro() throws Exception {
		if (this.vazia())
			throw new Exception("Erro : A lista esta vazia");
		Object item = this.item[0];
		this.ultimo = this.ultimo - 1;
		for (int aux = 0; aux < this.ultimo; aux++) {
			this.item[aux] = this.item[aux + 1];

		}
		System.out.println("Pessoa retirada\n");
		return item;
	}

	// Verifica o primeiro da lista
	public Object primeiro() {
		this.pos = -1;
		return this.proximo();
	}

	// Verifica pessoa depois da primeira
	public Object proximo() {
		this.pos++;
		if (this.pos >= this.ultimo)
			return null;
		else
			return this.item[this.pos];
	}

	// Verifica o Ultimo da lista
	public Object ultimo() {
		int aux = item.length - 1;
		Object item = this.item[aux];
		return item;
	}

	// Insere Entre duas pessoas
	public void inserirEntre(String pessoaNova, int posicao) {

		// cria um array novo com uma posicao a mais
		Object[] aux = Arrays.copyOf(this.item, this.item.length + 1);
		item = aux;

		// Incrementa o ultimo item
		ultimo++;

		for (int i = this.ultimo - 1; i >= posicao; i--) {
			this.item[i] = this.item[i - 1];

		}
		

		int p = 0;
		while (p < this.ultimo && !this.item[p].equals(this.item[posicao]))
			p++;
		if (p >= this.ultimo)
			System.out.println("Não encontrado!");

		this.ultimo = this.ultimo - 1;

		for (int j = p; j < this.ultimo; j++)
			this.item[j] = this.item[j + 1];
		this.item[posicao] = pessoaNova;

	}
}
