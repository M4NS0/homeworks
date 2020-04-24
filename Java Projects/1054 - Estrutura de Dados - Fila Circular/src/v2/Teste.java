package v2;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		String e;
		System.out.print("\n----------------------------\n" 
				+ " [C]onfigurar o tamanho da fila\n" 
				+ " [E]nfilera\n"
				+ " [D]esenfilera\n"
				+ " [I]mprime Fila\n"
				+ " [S]air\n" + "---------------------------\n"
				+ "\n\n Escolha: ");
		
		e = leia.next();
		return e;
	}

	public static void main(String[] args) {
		Fila fila = null;
		Pessoa nova = null;
		String e = "";

		do {
			e = Escolha().toLowerCase();
			switch (e) {
			case "c":
				System.out.print(" Digite o tamanho da fila:");
				fila = new Fila(leia.nextInt());
				break;
			case "e":
				nova = new Pessoa();
				System.out.print(" Digite o nome:");
				nova.setNome(leia.next());
				System.out.print(" Digite a matricula:"); 
				nova.setMatricula(leia.next());
				System.out.print(" Digite o telefone:"); 
				nova.setTelefone(leia.next());
				fila.enfileirar(nova);
				break;
			case "d":
				fila.desenfileirar();
				break;
			case "i":
				fila.imprimir();
			case "s":
				System.exit(0);
			}

		} while (!e.equalsIgnoreCase("c")||!e.equalsIgnoreCase("e")||!e.equalsIgnoreCase("d")||!e.equalsIgnoreCase("i")||!e.equalsIgnoreCase("s"));

	}

}
