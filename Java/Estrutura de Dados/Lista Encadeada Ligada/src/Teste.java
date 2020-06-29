import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		System.out.println("\n---------------------\n" 
						+ "(I)nserir pessoa\n" 
						+ "(V)isualizar lista\n"
						+ "(B)usca pessoa\n"
						+ "(R)emover primeiro da lista\n"
						+ "(L)impar lista\n"
						+ "(S)air\n" 
						+ "---------------------\n");
		String e = leia.next();
		return e;
	}

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.criaLista();
		String e = "";
		String nome = "";
		do {
			e = Escolha().toLowerCase();
			switch (e) {
			case "i":
				System.out.println("Digite o nome: ");
				nome = leia.next();
				lista.add(nome);
				break;
			case "v":
				if (lista.isEmpty() == true) {
					System.out.println("A lista está vazia");
				} else {
					lista.print();
				}
				break;
			case "b":
				System.out.println("Digite o nome da pessoa que deseja buscar:");
				lista.search(leia.next());
				break;
			case "r":
				// removeu o primeiro da lista apenas
				System.out.println("Digite o nome da primeira pessoa que deseja remover:");
				lista.remove(leia.next());
				break;
			case "l":
				lista.free();
				break;
			case "s":
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println("Hasta la vista!");
				System.exit(0);
			}

		} while (!e.equalsIgnoreCase(""));

	}
}
