import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);
	public static ArrayList<String> vendidos = new ArrayList<String>();

	private static double totalMeias;
	private static double totalInteiras;
	private static int contaMeias;
	private static int contaInteiras;
	public static final int MAX = 1019;
	public static final int MIN = 1000;

	private static void fim() {
		for (int j = 0; j < 100; j++) {
			System.out.println();
		}
		System.out.println(" Fim do Programa");
		System.exit(0);

	}

	private static void imprimeLista() {
		System.out.println("\n ---------- Vendas ----------\n");
		for (int j = 0; j < vendidos.size(); j++) {
			System.out.println("   " + vendidos.get(j));
		}
		System.out.println("    Lucro: " + (totalInteiras + totalMeias));
		System.out.println(" ----------------------------");

	}

	private static void imprimeSaldo() {
		Meia me = new Meia();
		Inteira in = new Inteira();
		System.out.println("\n --------------------------------------------");
		System.out.println("   Vendidos: " + (contaMeias + contaInteiras));
		System.out.println(" Quantidade: " + contaMeias + " - R$" + me.getValor() + " - Total: R$" + totalMeias);
		System.out.println(" Quantidade: " + contaInteiras + " - R$" + in.getValor() + " - Total: R$" + totalInteiras);
		System.out.println("      Lucro: " + (totalInteiras + totalMeias));
		System.out.println(" --------------------------------------------\n");

	}

	private static void InteiraVendida(int i) {
		Inteira inteira = new Inteira();
		System.out.println();
		System.out.println(" - " + i + " Retirado do topo");
		inteira.setId(i);
		inteira.venderIngresso();
		totalInteiras = totalInteiras + inteira.getValor();
		String aux = " " + i + " - " + "Inteira" + " - R$" + inteira.getValor();
		vendidos.add(aux);
	}

	private static void MeiaVendida(int i) {
		Meia meia = new Meia();
		System.out.println();
		System.out.println(" - " + i + " Retirado do topo");
		meia.setId(i);
		meia.venderIngresso();
		totalMeias = totalMeias + meia.getValor();
		String aux = " " + i + " - " + "Meia   " + " - R$" + meia.getValor();
		vendidos.add(aux);

	}

	public static String escolhaTipo() {
		System.out.println();
		System.out.println(" [M]eia");
		System.out.println(" [I]nteira");
		System.out.print("\n Escolha: ");
		String escolha = leia.next();
		return escolha.toLowerCase();
	}

	public static String menuEscolha() {
		System.out.println("\n [V]ender ingresso");
		System.out.println(" [I]mprimir Saldo");
		System.out.println(" [T]odas as vendas");
		System.out.println(" [S]air");
		System.out.print("\n Escolha: ");
		String escolha = leia.next();
		return escolha.toLowerCase();
	}

	public static void main(String[] args) throws InterruptedException {

		Pilha ingressos = new Pilha();
		String e = "";
		contaMeias = 0;
		contaInteiras = 0;
		int i;
		System.out.println(" -- Empilhando Ingressos -- ");
		System.out.println("         -- FIM -- ");
		Thread.sleep(400);
		for (i = MIN; i <= MAX; i++) {
			Thread.sleep(400);
			ingressos.push(i);
			System.out.println("          - " + i + " - ");
			
		}
		Thread.sleep(400);
		System.out.println("         -- TOPO -- ");

		do {
			switch (e = menuEscolha()) {
			case "v":
				if (ingressos.vazia() == true) {
					System.out.println(" Ingressos Esgotados!");
					break;
				}
				switch (escolhaTipo()) {
				case "m":
					MeiaVendida(i - 1);
					ingressos.pop();
					contaMeias++;
					i--;

					break;
				case "i":
					InteiraVendida(i - 1);
					ingressos.pop();
					contaInteiras++;
					i--;
					break;
				}
				break;
			case "i":
				imprimeSaldo();
				break;
			case "t":
				imprimeLista();
				break;
			case "s":
				fim();
			}
		} while (!e.equalsIgnoreCase("v") || !e.equalsIgnoreCase("i") || !e.equalsIgnoreCase("s"));
	}
}
