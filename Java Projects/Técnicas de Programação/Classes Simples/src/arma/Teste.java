package arma;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	static public int Escolha() {
		int numero;
		System.out.println("\n1. Verificar Capacidade da Arma\n" + "2. Verificar quantidade de Balas\n"
				+ "3. Recarregar\n" + "4. Atirar\n" + "5. Sair do estande de tiros\n" + "\nEscolha:");
		numero = leia.nextInt();
		return numero;
	}

	public static void main(String[] args) {
		Arma thaurus = new Arma();
		int n = 0;
		do {
			n = Escolha();
			switch (n) {
			case 1:
				System.out.println("\nA capacidade da sua arma é de: " + thaurus.getCapacidade() + " disparos\n");
				break;

			case 2:
				System.out.println("\nSua arma contém " + thaurus.getQuantidade() + " balas\n");
				break;

			case 3:
				thaurus.Recarregar();
				System.out.println("\nRecarregando....\n");
				break;

			case 4:
				
				if (thaurus.Disparar() == true) {
				System.out.println("\nBang!\n");
				}
				
				else if (thaurus.Disparar() == false) {
				System.out.println("\nA arma precisa ser recarregada!\n");
				}
				break;
			case 5:
				System.out.println("\nBye Bye Birdie...");

			}
		} while (n != 5);
	}
}
