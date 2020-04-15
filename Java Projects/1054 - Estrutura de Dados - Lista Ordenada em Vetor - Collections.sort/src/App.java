import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		System.out.println("\n--------------------------\n");
		System.out.println(" [D]efine o tamanho da Lista");
		System.out.println(" [I]nsere");
		System.out.println(" [V]erifica Lista");
		System.out.println();
		System.out.print(" Escolha:");

		String e = leia.next();
		return e;

	}

	public static void main(String[] args) {
		int m = 0;
		String e = "";
		int[] v = null;
		do {
			switch (e = Escolha().toLowerCase()) {
			case "d":
				System.out.print(" Insira o tamanho da lista: ");
				m = leia.nextInt();
				v = new int[m];
				Lista.criaLista(v);
				System.out.println(" Lista criada com tamanho " + m);
				break;

			case "i":
				Lista.insere(m);
				break;
				
			case "v":
				Lista.exibeLista(v);
				break;
			}

		} while (!e.equalsIgnoreCase("d") || !e.equalsIgnoreCase("i") || !e.equalsIgnoreCase("v"));

	}
}