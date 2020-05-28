package proposto;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteOld {
	public static Scanner leia = new Scanner(System.in);
	

	private static double totalMeias;
	private static double totalInteiras;
	public static int MAX = 1003;
	public static int MIN = 1000;


	private static void fim() {
		for (int j = 0; j < 100; j++) {
			System.out.println();
		}
		System.out.println(" Fim do Programa");
		System.exit(0);

	}

	private static void imprimeLista(ArrayList<String> vendidos) {
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

	private static void imprimeSaldo(int contaMeias, int contaInteiras) {
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

	private static void InteiraVendida(int i, ArrayList<String> vendidos) {
		MAX--;                                                                  // Decrementa o índice máximo
		Inteira inteira = new Inteira();                                        // Cria objeto do tipo Inteira
		inteira.setId(i);                                                       // Configura o id da classe Meia com o número que foi passado por parâmetro
		System.out.println("\n ------------------------------------");
		System.out.println(" Ingresso Retirado - No" + i);                      // Imprime para o Usuário a confirmação da retirada relativo ao numero de ingresso passado por parâmetro
		inteira.venderIngresso();                                               // Chama método da classe e imprime para o Usuário
		System.out.println(" ------------------------------------\n");
		totalInteiras = totalInteiras + inteira.getValor();                     // Guarda na variável, passada por parâmetro, incrementando o valor do ingresso (inteira) cada vez que é comprado
		String aux = " " + i + "   " + "Inteira" + "   R$" + inteira.getValor();// Gera uma String auxiliar com os dados para ser armazenada no ArrayList (vendidos)
		vendidos.add(aux);                                                      // Guarda String auxiliar no ArrayList passado por parâmetro
	}

	private static void MeiaVendida(int i, ArrayList<String> vendidos) {
		
		MAX--;                                                                  // Decrementa o índice máximo
		Meia meia = new Meia();                                                 // Cria objeto do tipo Meia
		meia.setId(i);                                                          // Configura o id da classe Meia com o número que foi passado por parâmetro
		System.out.println("\n ------------------------------------");
		System.out.println(" Ingresso Retirado - No" + i);                      // Imprime para o Usuário a confirmação da retirada relativo ao numero de ingresso passado por parâmetro
		meia.venderIngresso();                                                  // Chama método da classe e imprime para o Usuário
		System.out.println(" ------------------------------------\n");
		totalMeias = totalMeias + meia.getValor();                              // Guarda na variável, passada por parâmetro, incrementando o valor do ingresso (meia) cada vez que é comprado
		String aux = " " + i + "   " + "Meia   " + "   R$" + meia.getValor();   // Gera uma String auxiliar com os dados para ser armazenada no ArrayList (vendidos)
		vendidos.add(aux);                                                      // Guarda String auxiliar no ArrayList passado por parâmetro

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
		ArrayList<String> lista = new ArrayList<String>();
		int contaMeias = 0;
		int contaInteiras = 0;
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
					contaMeias++;                                                           // Contador de Ingressos (meia) vendidos
					MeiaVendida(MAX - 1, lista);
					break;
				case "i":
					contaInteiras++;                                                        // Contador de Ingressos (meia) vendidos													
					InteiraVendida(MAX - 1, lista);
					break;
				}
				break;
			case "i":
				imprimeSaldo(contaMeias, contaInteiras);
				break;
			case "t":
				imprimeLista(lista);
				break;
			case "s":
				fim();
			}
		} while (!e.equalsIgnoreCase("v") || !e.equalsIgnoreCase("i") || !e.equalsIgnoreCase("s"));
	}
}
