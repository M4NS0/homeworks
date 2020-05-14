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
Descrição       :

============================================================================
*/

package agenda;

import java.io.IOException;
import java.util.Scanner;

public class Teste {

	static Scanner leia = new Scanner(System.in);

	public static Pessoa obtemItem() {
		String nome, telefone, endereco;

		leia.skip("\\R");
		System.out.print("Nome:");
		nome = leia.nextLine();
		System.out.print("Telefone:");
		telefone = (leia.next());
		leia.skip("\\R"); // para que na hora do espaço entre palavras nao de erro
		System.out.print("Endereço:");
		endereco = leia.nextLine();
		Pessoa aux = new Pessoa(nome, telefone, endereco);
		return aux;
	}

	public static int menu() {
		int valor;
		System.out.println("\nDigite:");
		System.out.println("1 - para adicionar um item.");
		System.out.println("2 - para remover um item.");
		System.out.println("3 - para pesquisar um item.");
		System.out.println("4 - para imprimir a lista em ordem crescente.");
		System.out.println("5 - para imprimir a lista em ordem decrescente.");
		System.out.println("6 - para gravar arquivo");
		System.out.println("7 - para encerrar o programa.");
		System.out.print("\nEscolha: ");
		valor = Integer.parseInt(leia.next());
		return valor;
	}

	public static void main(String[] args) throws IOException {
		int n;
		Lista lista = new Lista();
		Pessoa novo = null;
		GerArquivo.lerArquivo(lista);

		do {
			n = menu();
			switch (n) {

			case 1:
				novo = obtemItem();
				lista.adicionaOrdenado(novo);
				System.out.println("\n --- Agenda com " + lista.getTam() + " itens ---\n");
				novo = null;
				break;
			case 2:
				Pessoa aux1 = new Pessoa();
				leia.skip("\\R");
				System.out.print("\nDigite o nome que deseja remover: ");
				aux1.setNome(leia.next());
				novo = lista.retira(aux1);
				if (novo == null)
					System.out.println("Erro!");
				else
					System.out.println("\n" +novo.toString() + "Removido(a) com sucesso");
				novo = null;
				break;
			case 3:
				Pessoa aux2 = new Pessoa();
				System.out.print("\nDigite o nome que deseja pesquisar: ");
				aux2.setNome(leia.next());
				novo = lista.busca(aux2);
				if (novo == null)
					System.out.println("Erro!");

				else
					System.out.println(novo.toString());
				System.out.println("\n --- Agenda " + lista.getTam() + " itens ---\n");
				novo = null;
				break;
			case 4:
				System.out.println("\n--- Agenda " + lista.getTam() + " itens ---\n");
				System.out.println(lista.imprima());
				break;
			case 5:
				System.out.println("\n --- Agenda com " + lista.getTam() + " itens ---\n");
				System.out.println(lista.imprimaInv());
				break;
			case 6:
				GerArquivo.gravarArquivo(lista);
				System.out.println("Arquivo gravado com sucesso");
				break;
			case 7:
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println("Programa encerrando!");

			}

		} while (n != 7);

	}

}
