/*
============================================================================

Instituição     : Pontifícia Universidade Católica de Goiás
Departamento    : Escola de Ciências Exatas e da Computação
Curso           : Análise e Desenvolvimento de Sistemas
Matéria         : Estrutura de Dados
Professor       : José Olímpio Ferreira
Período         : Segundo
Avaliação       : Trabalho EAD / N2
Título          : Agenda em Lista Encadeada e Ordenada
Autor           : Bruno Camargo Manso
Descrição       : Essa classe contém o algoritmo necessário para  guardar 
                  Objetos do tipo Pessoa de maneira ordenada. A ordenação 
                  dependerá do método ‘Inserir’  que sempre  irá comparar 
                  valores antes da inserção, garantindo  que  tal  pessoa 
                  seja inserida de forma alfabeticamente correta.

============================================================================
*/

package agenda;

public class Lista {
	public class No {
		private Pessoa dados;
		private No proximo;

		public No(Pessoa aux) {
			dados = aux;
			proximo = null;
		}
	}
	private int tamanho;
	private No inicio;

	public Lista() {
		tamanho = 0;
		inicio = null;
	}

	public boolean vazia() {
		return (inicio == null);
	}

	public int getTam() {
		return tamanho;
	}

	public Pessoa busca(Pessoa aux) {
		if (vazia())
			return null;
		No i = null;
		for (i = inicio; i != null && !aux.getNome().equals(i.dados.getNome()); i = i.proximo);
		if (i == null) {
			return null;
		}
		Pessoa novo = new Pessoa(i.dados.getNome(), i.dados.getTelefone(), i.dados.getEndereco());
		return novo;
	}

	public boolean adicionaOrdenado(Pessoa aux) {
		Pessoa buscado = busca(aux);
		if (buscado != null)
			return false;
		No novo = new No(aux);
		if (vazia()) {
			inicio = novo;
			tamanho++;
			return true;
		}
		No i = inicio;
		No ant = inicio;
		for (; i != null && aux.getNome().compareTo(i.dados.getNome()) > 0; ant = i, i = i.proximo)
			;
		if (i == ant) {
			novo.proximo = inicio;
			inicio = novo;
		} else {
			ant.proximo = novo;
			novo.proximo = i;
		}
		tamanho++;
		return true;
	}

	public Pessoa retira(Pessoa aux) {
		if (vazia())
			return null;
		No i = inicio;
		No ant = inicio;
		for (; i != null && !aux.getNome().equals(i.dados.getNome()); ant = i, i = i.proximo)
			;
		if (i == null) {
			return null;
		}
		Pessoa novo = i.dados;
		if (i == ant) {
			inicio = inicio.proximo;
		} else {
			ant.proximo = i.proximo;
		}
		tamanho--;
		return novo;
	}

	public String imprima() {
		String aux = new String("");

		for (No i = inicio; i != null; i = i.proximo) {
			aux = aux + i.dados.toString();
		}

		return aux.toString();
	}

	public String imprimaInv() {
		String[] aux = imprima().split("\n");
		String reverso = "";

		for (int i = 0; i < aux.length; i++) {
			if (i == aux.length - 1)
				reverso = aux[i] + reverso;
			else
				reverso = "\n" + aux[i] + reverso;
		}
		return reverso;
	}
}


