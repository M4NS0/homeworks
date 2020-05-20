import java.util.Scanner;

public class TesteCarro {
	static Scanner leia = new Scanner(System.in);

	public static int Escolha() {
		System.out.println("\n1. Liga/Desliga carro" + "\n2. Calibra os pneus" + "\n3. Mostra Status" + "\n4. Sair\n");

		int n = leia.nextInt();
		return n;
	}

	public static void main(String[] args) {
		Carro fusca = new Carro();
		int n = 0;
		do {
			n = Escolha();
			switch (n) {

			case 1:
				if (fusca.getLigado().equals("on")) {
					fusca.setLigado("off");
					System.out.println("Puff\n");
				}
				
				else if (fusca.getLigado().equals("off")) {
					fusca.setLigado("on");
					System.out.println("Vruuuummm\n");
				}
				break;

			case 2:
				fusca.calibrar();
				break;

			case 3:
				fusca.Status();
				break;
			case 4:
				System.out.println("Asta la vista");
			}

		} while (n != 4);
	}
}
