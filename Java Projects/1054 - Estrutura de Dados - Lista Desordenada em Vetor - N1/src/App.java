import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);
	static Lista lista;
	static Object x;

	// compareTo
	public static int Escolha() {
		System.out.println("\n__________________________________________\n"
				+ "\n1. Para alterar o tamanho da lista"
				+ "\n2. Inserir um item" 
				+ "\n0. Sair"
				+ "\n__________________________________________\n");
		int n = leia.nextInt();
		return n;

	}

	public static void main(String[] args) throws Exception {
		
		int n = 0;
		do {
			n = Escolha();
			switch (n) {
			case 1:
				
				System.out.println("\nDigite o tamanho da lista:");
				int tamanho = leia.nextInt();
				lista = new Lista(tamanho);
				System.out.println();
				break;

			case 2:
				if (lista.cheia() == true) {
					System.out.println("A lista está cheia!\n");
				} else {
					System.out.print("Insira o valor de 'a': ");
					String a = leia.next();
					System.out.print("Insira o valor de 'k': ");
					int k = leia.nextInt();
					System.out.print("Insira o valor de 's': ");
					float s = leia.nextFloat();
					Item aux = new Item(a, k, s);
					lista.inserirNoFinal(aux);
				}
				break;
			}	
		} while (n != 0);
		System.out.println("\nArivererci!");
	}
}
