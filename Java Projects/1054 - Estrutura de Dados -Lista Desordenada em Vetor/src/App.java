import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);
	private static Lista lista;

	public static void main(String[] args) {

		Menu();
	}

	private static void Menu() {
		System.out.println("\n########   Lista de Compras   ########\n");
		System.out.println("1. Consultar Lista\n" + "2. Inserir Item\n" + "3. Retirar Item\n0. Sair\n\nDigite:");

		int escolha = leia.nextInt();

		if (escolha == 1) {
			Consulta();
		}
		if (escolha == 2) {
			Insere();
		}
		if (escolha == 3) {
			Retira();
		}
		if (escolha == 0) {

		}

	}

	private static void Consulta() {
		lista = new Lista();
		if (lista.vazia() == false) {
			System.out.println("A lista está vazia!");
		} else {
			System.out.println(lista);

		}
		Menu();
	}

	private static void Insere() {
		Item item = new Item();
		System.out.println("Insira a Descrição: ");
		item.setDescricao(leia.next());
		System.out.println("Insira a Quantidade: ");
		item.setQuantidade(leia.nextInt());
		System.out.println("Insira a Prioridade: ");
		item.setPrioridade(leia.nextInt());
		
		lista.adicionanaFila(item);

		Menu();
	}

	private static void Retira() {
		System.out.println("retira");

	}

}
