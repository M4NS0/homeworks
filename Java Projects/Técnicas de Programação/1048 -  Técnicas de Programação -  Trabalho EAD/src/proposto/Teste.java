package proposto;

import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);
	

	private static double totalMeias;
	private static double totalInteiras;
	public static int MAX = 1019;
	public static int MIN = 1000;


	private static void fim() {
		for (int j = 0; j < 100; j++) {
			System.out.println();
		}
		System.out.println(" Fim do Programa");
		System.exit(0);

	}


	private static void imprimeSaldo(int contaMeias, int contaInteiras) {
		Meia me = new Meia();
		Inteira in = new Inteira();
		System.out.println("\n ------------------------------------------");
		System.out.println("                   Extrato                 ");
		System.out.println(" ------------------------------------------");
		System.out.println("\t       Qt   Valor Unit    Sub-Total\n");
		System.out.println("    Meias -    " + contaMeias    + "    R$" + me.getValor() + "        R$" + totalMeias);
		System.out.println(" Inteiras -    " + contaInteiras + "    R$" + in.getValor() + "        R$" + totalInteiras);
		System.out.println("\n ------------------------------------------");
		System.out.println(" Vendidos:     " + (contaMeias + contaInteiras) +   "    Lucro:        R$" + (totalInteiras + totalMeias));
		System.out.println(" ------------------------------------------\n");

	}

	private static void InteiraVendida(int i) {
		MAX--;                                                                  // Decrementa o índice máximo
		Inteira inteira = new Inteira();                                        // Cria objeto do tipo Inteira
		inteira.setId(i);                                                       // Configura o id da classe Meia com o número que foi passado por parâmetro
		System.out.println("\n ------------------------------------");
		System.out.println(" Ingresso Retirado - No" + i);                      // Imprime para o Usuário a confirmação da retirada relativo ao numero de ingresso passado por parâmetro
		inteira.venderIngresso();                                               // Chama método da classe e imprime para o Usuário
		System.out.println(" ------------------------------------\n");
		totalInteiras = totalInteiras + inteira.getValor();                     // Guarda na variável, passada por parâmetro, incrementando o valor do ingresso (inteira) cada vez que é comprado
	}

	private static void MeiaVendida(int i) {
		
		MAX--;                                                                  // Decrementa o índice máximo
		Meia meia = new Meia();                                                 // Cria objeto do tipo Meia
		meia.setId(i);                                                          // Configura o id da classe Meia com o número que foi passado por parâmetro
		System.out.println("\n ------------------------------------");
		System.out.println(" Ingresso Retirado - No" + i);                      // Imprime para o Usuário a confirmação da retirada relativo ao numero de ingresso passado por parâmetro
		meia.venderIngresso();                                                  // Chama método da classe e imprime para o Usuário
		System.out.println(" ------------------------------------\n");
		totalMeias = totalMeias + meia.getValor();                              // Guarda na variável, passada por parâmetro, incrementando o valor do ingresso (meia) cada vez que é comprado

	}

	public static String escolhaTipo() {
		System.out.println();
		System.out.println(" [M]eia");
		System.out.println(" [I]nteira");
		System.out.print("\n Escolha: ");
		String escolha = leia.next();
		return escolha.toLowerCase();
	}

	public static int menuEscolha() {
		System.out.println("\n 1 - Vender ingresso");
		System.out.println(" 2 - Imprimir Saldo");
		System.out.println(" 3 - Sair");
		System.out.print("\n Escolha: ");
		int escolha = leia.nextInt();
		return escolha;
	}

	public static void main(String[] args) throws InterruptedException {
		
		int contaMeias = 0;
		int contaInteiras = 0;
		int e = 0;
	
		do {
			switch (e = menuEscolha()) {
			case 1:
				if (MAX == MIN) {
					System.out.println(" Ingressos Esgotados!");
					break;
				}
			
				switch (escolhaTipo()) {
				case "m":
					contaMeias++;             
					MeiaVendida(MAX - 1);
					break;
				case "i":
					contaInteiras++;                              													
					InteiraVendida(MAX - 1);
					break;
				}
				break;
			case 2:
				imprimeSaldo(contaMeias, contaInteiras);
				break;
			case 3:
				fim();
			}
		} while (e != 1 || e != 2 || e != 3);
	}
}
