import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static Item adicionaItem() {
		String desc;
		int qt, pri;
		leia.skip("\n");
		System.out.print("Item:");
		desc = leia.nextLine();
		System.out.print("Quantidade:");
		qt = Integer.parseInt(leia.next());
		System.out.print("Prioridade:");
		pri = Integer.parseInt(leia.next());
		Item aux = new Item(desc, qt, pri);
		return aux;
	}

	public static Item obtemItem() {
		String desc;
		leia.skip("\n");
		System.out.print("Item:");
		desc = leia.nextLine();
		Item aux = new Item(desc, 0, 0);
		return aux;
	}
	public static String  menu() {
		String valor;
		System.out.println("\n------------------------");
		System.out.println("[A]dicionar um item");
		System.out.println("[R]emover um item");
		System.out.println("[B]uscar um item");
		System.out.println("[V]isualizar a lista");
		System.out.println("[S]ubstituir um item");
		System.out.println("[F]im do programa");
		System.out.println("------------------------");
		valor = leia.next();
		return valor;
	}

	public static void main(String[] args) {
		Lista lista = new Lista();
		String n;
		Item novo = null;
		do {
			n = menu().toLowerCase();
			switch (n) {
			case "a":
				novo = adicionaItem();
				lista.adicionaFim(novo);
				System.out.println("\n - Lista com " + lista.getTam() + " itens");
				novo = null;
				break;
			case "r":
				novo = obtemItem();
				novo = lista.retira(novo);
				if (novo == null) System.out.println("Item não encontrado!");
				else System.out.println("Removido!");
				
				novo = null;
				break;
			case "b":
				novo = obtemItem();
				novo = lista.busca(novo);
				if (novo == null) {
					System.out.println("\nItem não encontrado!");
				}
				else System.out.println("Encontrado!");
				
				novo = null;
				break;
			case "v":
				System.out.println("\n------Lista------\n");
				System.out.println("Descrição" + "\tQuantidade "  + "\t Prioridade" );
				System.out.println(lista.imprima() + "\n");
				break;
			case "s":
				if (lista.vazia() == true) { 
					System.out.println("A lista está vazia!");
				} else {
				
				
				System.out.println("Sobre o novo item, digite:");
				novo = adicionaItem();
				System.out.print("Deseja substituir qual item: ");
				String velho = leia.next();
				
				lista.alterar(novo, velho);
				}
				break;
				
			case "f":
				System.out.println("Lista  " + lista.getTam() + " itens.");
				System.out.println(lista.imprima());
				break;
			
			}
		} while (!n.equalsIgnoreCase("e"));
		System.exit(0);
	}

}
// fim do .. while
