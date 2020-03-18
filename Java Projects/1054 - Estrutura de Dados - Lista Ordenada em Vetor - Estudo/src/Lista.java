import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Lista {
	private Object[] item;
	private Pessoa p;

	// Construtor da classe
	public Lista(int tamanhoMax) {
		this.item = new Object[tamanhoMax];
		p = new Pessoa();
		p.setPosicao(-1);
		p.setPrimeiro(0);
		p.setUltimo(p.getPrimeiro());
	}

	// Limpa a tela do console
	public void limpaTela() {
		for (int i = 0; i < 30; ++i)
			System.out.println();
	}

	// Verifica o tamanho da Lista
	public int tamanho() {
		return item.length;
	}

	// Insere nova pessoa
	public void insere(Object pessoaNova) throws Exception {
		if (p.getUltimo() >= this.item.length) {

		} else {
			this.item[p.getUltimo()] = pessoaNova;
			p.setUltimo(p.getUltimo() + 1);
		}
	}

	// Verifica se esta Cheia
	public boolean cheia() {
		return (p.getUltimo() == this.tamanho());

	}

	// Verifica se a lista está vazia
	public boolean vazia() {
		return (p.getPrimeiro() == p.getUltimo());
	}

	// Imprime lista de convidados
	public void imprime() {
		if (vazia() == true) {
			System.out.println("   A lista está vazia\n");
		} else {
			System.out.println("\t    Serão convidados:\n");
			int i = 0;
			for (int aux = p.getPrimeiro(); aux < p.getUltimo(); aux++) {
				System.out.println("\t\t" + i + "- " + this.item[aux].toString());
				i++;
			}
		}
	}

	// Busca por pessoa na lista pelo nome
	public Object pesquisa(Object pessoa) {
		if (this.vazia() || pessoa == null)
			return null;
		for (int p = 0; p < this.p.getUltimo(); p++)
			if (this.item[p].equals(pessoa))
				return this.item[p];
		return null;
	}

	// Retira Pessoa
	public Object retira(Object pessoa) throws Exception {
		if (this.vazia() || pessoa == null)
			throw new Exception("Erro : A lista esta vazia");
		int p = 0;
		while (p < this.p.getUltimo() && !this.item[p].equals(pessoa))
			p++;
		if (p >= this.p.getUltimo())
			return null; // Chave não encontrada

		Object item = this.item[p];
		this.p.setUltimo(this.p.getUltimo() - 1);
		for (int aux = p; aux < this.p.getUltimo(); aux++)
			this.item[aux] = this.item[aux + 1];
		return item;
	}

	public void inserirEntre(String pessoaNova, int posicao) {

		// cria um array novo com uma posicao a mais
		Object[] aux = Arrays.copyOf(this.item, this.item.length + 1);
		item = aux;

		// Incrementa o ultimo item
		this.p.setUltimo(this.p.getUltimo() + 1);

		for (int i = this.p.getUltimo() - 1; i >= posicao; i--) {
			this.item[i] = this.item[i - 1];

		}

		int p = 0; 
		while (p < this.p.getUltimo() && !this.item[p].equals(this.item[posicao]))
			p++;
		if (p >= this.p.getUltimo())
			System.out.println("Não encontrado!");

		this.p.setUltimo(this.p.getUltimo() - 1);

		for (int j = p; j < this.p.getUltimo(); j++)
			this.item[j] = this.item[j + 1];
		this.item[posicao] = pessoaNova;
		
	}
	public void ordena() {
		List lista = new ArrayList<Pessoa>();
		
		for (int i = 0; i < item.length; i++) {
			lista.add(this.item[i]);
		}

		Collections.sort(lista);
		int j = 0;
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t\t" + j + " - " + lista.get(i));
			j++;
			
		}
	
		
	}
	
}
