package listaDuplamenteEncadeadaOrdenada;

import java.util.Scanner;

public class Main {

	static Scanner leia = new Scanner(System.in);

	public static Item obtemItem() {
		String desc;
		int qt, pri;
		leia.skip("\\R");
		System.out.println("Descrição:");
		desc = leia.nextLine();
		System.out.println("Quantidade:");
		qt = Integer.parseInt(leia.next());
		System.out.println("Prioridade:");
		pri = Integer.parseInt(leia.next());
		Item aux = new Item(desc, qt, pri);
		return aux;
	}

	public static int menu() {
		int valor;
		System.out.println("Digite:");
		System.out.println("1 - para adicionar um item.");
		System.out.println("2 - para remover um item.");
		System.out.println("3 - para pesquisar um item.");
		System.out.println("4 - para imprimir a lista.");
		System.out.println("5 - para encerrar o programa.");
		valor = Integer.parseInt(leia.next());
		return valor;
	}

	public static void main(String[] args) {

		Lista lista = new Lista();
		int n;
		Item novo = null;
		do

		{
			n = menu();
			switch (n) {

			case 1:
				novo = obtemItem();
				lista.adicionaOrdenado(novo);
				System.out.println("Lista com " + lista.getTam() + " itens.");
				novo = null;
				break;

			case 2:
				novo = obtemItem();
				novo = lista.retira(novo);

				if (novo == null)
					System.out.println("Erro!");

				else
					System.out.println(novo.toString());

				System.out.println("Lista " + lista.getTam() + " itens.");
				novo = null;
				break;

			case 3:
				novo = obtemItem();
				novo = lista.busca(novo);

				if (novo == null)
					System.out.println("Erro!");

				else
					System.out.println(novo.toString());

				System.out.println("Lista " + lista.getTam() + " itens.");
				novo = null;
				break;

			case 4:
				System.out.println("Lista " + lista.getTam() + " itens.");
				System.out.println(lista.imprima());
				break;

			case 5:
				System.out.println("Lista com " + lista.getTam() + " itens.");
				System.out.println("Programa encerrando!");

			} // fim switc() … case

		} while (n != 5); // fim do .. while

	} 

} 
