package empresa;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);
	private static Empresa e1;

	public static int Escolha() {
		System.out.println("\n---------Cadastro---------\n" + "\n1. Adicionar" + "\n2. Imprimir" + "\n3. Sair\n");
		int n = leia.nextInt();
		return n;
	}

	public static void main(String[] args) {

		int n = 0;
		do {
			n = Escolha();
			switch (n) {
			case 1:

				System.out.println("Insira o nome:");
				String nome = leia.next();

				System.out.println("Insira o Endereço:");
				String end = leia.next();

				System.out.println("Insira o cep:");
				String cep = leia.next();

				System.out.println("Insira o telefone:");
				String fone = leia.next();

				e1 = new Empresa(nome, end, cep, fone);
				break;
			case 2:
				System.out.println(e1.toString());
				break;

			}

		} while (n != 3);

	}

}
