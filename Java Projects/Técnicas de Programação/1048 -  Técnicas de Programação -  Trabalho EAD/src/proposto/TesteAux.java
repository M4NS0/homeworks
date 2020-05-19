package proposto;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteAux {
	public static Scanner leia = new Scanner(System.in);
	public static ArrayList<String> vendidos = new ArrayList<String>();

	private static double totalMeias;
	private static double totalInteiras;
	private static int contaMeias = 0;
	private static int contaInteiras = 0;
	public static int MAX = 1019;
	public static int MIN = 1000;

	private static void fim() {
		for (int j = 0; j < 100; j++) {
			System.out.println();
		}
		System.out.println(" Fim do Programa");
		System.exit(0);

	}

	private static void imprimeLista() {
		System.out.println("\n -----------------------------");
		System.out.println("  Lista de Ingressos Vendidos  ");
		System.out.println(" -----------------------------");
		System.out.println("    No     Tipo      Valor\n");
		for (int j = 0; j < vendidos.size(); j++) {
			System.out.println("   " + vendidos.get(j));
		}
		System.out.println("\n    Lucro: R$" + (totalInteiras + totalMeias));
		System.out.println(" -----------------------------");

	}

	private static void imprimeSaldo() {
		Meia me = new Meia();
		Inteira in = new Inteira();
		System.out.println("\n ------------------------------------");
		System.out.println("                Extrato                 ");
		System.out.println(" ------------------------------------");
		System.out.println("   Qt   Valor Unit    Sub-Total\n");
		System.out.println("   " +contaMeias + "    R$" + me.getValor() + "        R$" + totalMeias);
		System.out.println("   " +contaInteiras + "    R$" + in.getValor() + "        R$" + totalInteiras);
		System.out.println("\n ------------------------------------");
		System.out.println("   Vendidos: " + (contaMeias + contaInteiras) + "        Lucro: R$" + (totalInteiras + totalMeias));
		System.out.println(" ------------------------------------\n");

	}

	private static void InteiraVendida(int i) {
		contaInteiras++;
		MAX--;
		Inteira inteira = new Inteira();
		System.out.println();
		System.out.println(" - " + i + " Retirado do topo");
		inteira.setId(i);
		inteira.venderIngresso();
		totalInteiras = totalInteiras + inteira.getValor();
		String aux = " " + i + "   " + "Inteira" + "   R$" + inteira.getValor();
		vendidos.add(aux);
	}

	private static void MeiaVendida(int i) {
		contaMeias++;
		MAX--;
		Meia meia = new Meia();
		System.out.println();
		System.out.println(" - " + i + " Retirado do topo");
		meia.setId(i);
		meia.venderIngresso();
		totalMeias = totalMeias + meia.getValor();
		String aux = " " + i + "   " + "Meia   " + "   R$" + meia.getValor();
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

		String e = "";
		do {
			switch (e = menuEscolha()) {
			case "v":
				if (MAX == MIN) {
					System.out.println(" Ingressos Esgotados!");
					break;
				}
			
				switch (escolhaTipo()) {
				case "m":
					MeiaVendida(MAX - 1);
					break;
				case "i":
					InteiraVendida(MAX - 1);
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
