package alterado;

import java.util.ArrayList;
import java.util.Scanner;

import proposto.Inteira;
import proposto.Meia;

public class Teste {
	public static Scanner leia = new Scanner(System.in);
	private static double totalMeias;
	private static double totalInteiras;
	public static int MAX = 1004;
	public static int MIN = 1019;

	private static void fim() {
		for (int j = 0; j < 100; j++) {
			System.out.println();
		}
		System.out.println(" Fim do Programa");
		System.exit(0);

	}

	private static void imprimeLista(ArrayList<String> vendidos) {
		System.out.println("\n ---------------------------------------");
		System.out.println("       Lista de Ingressos Vendidos  ");
		System.out.println(" ---------------------------------------");
		System.out.println("    No     Tipo    Valor    Comprador\n");
		for (int j = 0; j < vendidos.size(); j++) {
			System.out.println("   " + vendidos.get(j));
		}
		System.out.println("\n    Lucro: R$" + (totalInteiras + totalMeias));
		System.out.println(" ---------------------------------------");

	}

	private static void imprimeSaldo(int contaMeias, int contaInteiras) {
		Meia me = new Meia();
		Inteira in = new Inteira();
		System.out.println("\n -------------------------------------");
		System.out.println("                Extrato                 ");
		System.out.println(" ------------------------------------");
		System.out.println("   Qt   Valor Unit    Sub-Total\n");
		System.out.println("   " + contaMeias + "    R$" + me.getValor() + "        R$" + totalMeias);
		System.out.println("   " + contaInteiras + "    R$" + in.getValor() + "        R$" + totalInteiras);
		System.out.println("\n -------------------------------------");
		System.out.println(
				"   Vendidos: " + (contaMeias + contaInteiras) + "        Lucro: R$" + (totalInteiras + totalMeias));
		System.out.println(" -------------------------------------\n");

	}

	private static void inteiraVendida(int i, Inteira inteira, Fila fila, Pilha pilha, int contaInteiras,
			ArrayList<String> vendidos) {
		pilha.pop();
		contaInteiras++;
		MAX--;
		String nome = fila.desenfileirar().getNome();
		System.out.println("\n Vendido para " + nome + " [Saiu da Fila]");
		System.out.println(" Retirado do topo [" + i + "] \n");
		inteira.setId(i);
		inteira.venderIngresso();
		totalInteiras = totalInteiras + inteira.getValor();
		String aux = " " + i + "  " + "Inteira" + "  R$" + inteira.getValor() + "   " + nome;
		vendidos.add(aux);
	}

	private static void meiaVendida(int i, Meia meia, Fila fila, Pilha pilha, int contaMeias,
			ArrayList<String> vendidos) {
		pilha.pop();
		contaMeias++;
		MAX--;
		String nome = fila.desenfileirar().getNome();
		System.out.println("\n Vendido para " + nome + " [Saiu da Fila]");
		System.out.println(" Retirado do topo [" + i + "] \n");
		meia.setId(i);
		meia.venderIngresso();
		totalMeias = totalMeias + meia.getValor();
		String aux = " " + i + "  " + "Meia   " + "  R$" + meia.getValor() + "   " + nome;
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

	private static void obterPessoa(Fila pessoas) {
		int j = 1;

		for (int i = MIN; i < MAX; i++) {
			System.out.print(" Número [" + j + "] Nome:");
			Pessoa aux = new Pessoa(leia.next());
			pessoas.enfileirar(aux);
			j++;

		}

	}

	public static String menuEscolha() {
		System.out.println();
		System.out.println(" [E]nfileirar Pessoas");
		System.out.println(" [C]ontar Fila");
		System.out.println(" [V]ender ingresso");
		System.out.println(" [I]mprimir Saldo");
		System.out.println(" [T]odas as vendas");
		System.out.println(" [S]air");
		System.out.print("\n Escolha: ");
		String escolha = leia.next();
		return escolha.toLowerCase();
	}

	private static void Empilhando(Pilha ingressos) throws InterruptedException {
		System.out.println("----------------------------");
		System.out.println(" -- Empilhando Ingressos -- ");
		System.out.println("\n       [Fim da Pilha] \n");
		Thread.sleep(400);
		for (int i = MIN; i <= MAX; i++) {
			Thread.sleep(400);
			ingressos.push(i);
			System.out.println("          - " + i + " - ");

		}
		Thread.sleep(400);
		System.out.println("\n       [Topo da Pilha] ");

	}

	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> vendidos = new ArrayList<String>();
		Fila pessoas = new Fila();
		pessoas.setTamanho(MAX - MIN);
		Pilha ingressos = new Pilha();
		Meia meia = new Meia();
		Inteira inteira = new Inteira();
		int contaMeias = 0;
		int contaInteiras = 0;
		String e = "";
		Empilhando(ingressos);

		do {
			switch (e = menuEscolha()) {
			case "e":
				obterPessoa(pessoas);
				break;
			case "c":
				pessoas.imprime();
				break;
			case "v":
				if (ingressos.vazia() == true)
					System.out.println("\n -- Ingressos Esgotados --");
				if (pessoas.vazia() == true) {
					System.out.println("\n -- A Fila está vazia --");
					break;
				}

				switch (escolhaTipo()) {
				case "m":
					meiaVendida(MAX - 1, meia, pessoas, ingressos, contaMeias, vendidos);
					break;
				case "i":
					inteiraVendida(MAX - 1, inteira, pessoas, ingressos, contaInteiras, vendidos);
					break;
				}
				break;
			case "i":
				imprimeSaldo(contaMeias, contaInteiras);
				break;
			case "t":
				imprimeLista(vendidos);
				break;
			case "s":
				fim();
			}
		} while (!e.equalsIgnoreCase("v") || !e.equalsIgnoreCase("i") || !e.equalsIgnoreCase("s"));
	}

}
