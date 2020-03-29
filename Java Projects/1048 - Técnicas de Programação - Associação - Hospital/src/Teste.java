import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		System.out.println("\n---------------------------\n" 
						+ "(I)nserir Paciente\n" 
						+ "(L)istar\n" + "(S)air"
						+ "\n---------------------------\n");
		String escolha = leia.next();
		return escolha;

	}

	public static void main(String[] args) {

		String escolha = "";
		Hospital h = new Hospital("Albert Einstein");
		Paciente p = new Paciente();

		do {
			escolha = Escolha();

			switch (escolha.toLowerCase()) {
			case "i":
				System.out.println("Digite o nome:");
				String nome = leia.next();
				System.out.println("Digite a doença:");
				String doen = leia.next();
				p.setNome(nome);
				p.setDoenca(doen);
				h.adicionaLista(nome, doen);

				break;
			case "l":

				System.out.println("\n-----" + h.getNomeHosp() + "-----\n");
				for (int i = 0; i < h.getLista().size(); i++) {
					System.out.println(h.getLista().get(i));

				}
				break;
			case "s":
				for (int i = 0; i < 100; i++) {
					System.out.println("\n");
				}
				System.out.println("See you later Aligator!");
				System.exit(0);

			}
		} while (!escolha.equalsIgnoreCase("i") || !escolha.equalsIgnoreCase("l") || !escolha.equalsIgnoreCase("s"));
	}
}
