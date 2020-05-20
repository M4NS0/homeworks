import java.util.Scanner;

public class App {
	static public Scanner leia = new Scanner(System.in);

	static public int menu() {
		System.out.println(
				"1. Adicionar\n" + "2. Retirar\n" + "3. Consultar\n" + "4. Modificar\n" + "5. Sair\n" + "Digite:");
		int n = leia.nextInt();
		return n;
	}

	static public Item obterItem() {
		Item novo = new Item();
		leia.nextLine();
		System.out.println("Descrição: ");
		String aux = leia.nextLine();
		novo.setDescricao(aux);
		int valor = 0;

		do {
			System.out.println("Quantidade: ");
			valor = leia.nextInt();
		} while (valor <= 0 || valor > 10);
		novo.setQuantidade(valor);
		do {
			System.out.println("Prioridade: ");
			valor = leia.nextInt();
		} while (valor <= 0 || valor > 5);
		novo.setPrioridade(valor);
		return novo;
	}

	public static void main(String[] args) {
		Lista lista = new Lista();
		int n;
		Item novo = null;
		Item mod = null;
		do {
			System.out.println("Tamanho: ");
			n = leia.nextInt();
		} while (!lista.setTamanho(n));

		do {
			n = menu(); // recebe o valor do menu
			switch (n) {
			case 1:
				novo = obterItem();
				if (lista.adicionanaFila(novo)) {
					System.out.println("Sucesso!");
				} else
					System.out.println("Lista cheia");
				break;
			
			// retirar e consultar pede novamente descrição, quantidade e prioridade //
			// não retira e não faz consulta // 
			
			case 2: // bug
				novo = obterItem();
				novo = lista.retira(novo);
				if (novo == null) {
					System.out.println("Insucesso!");
				} else {
					System.out.println(novo.getItem());
					break;
				}
			case 3: // bug
				//novo = obterItem();
				novo = lista.consultar(novo);
				if (novo == null)
					System.out.println("Insucesso!");
				else System.out.println(novo.getItem());
				break;

			case 4:
				novo = obterItem();
				mod = lista.consultar(novo);
				if (mod == null)
					System.out.println("Insucesso!");
				else
					System.out.println(mod.getItem());
				novo = obterItem();
				lista.modificarItem(mod, novo);
				break;
			case 5:
				System.out.println("Terminado");

			}
		} while (n != 5);
	}
}
