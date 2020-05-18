package alterado;

import java.util.ArrayList;
import java.util.Scanner;

import proposto.Inteira;
import proposto.Meia;

public class Teste {
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
	private static void imprimeListaEncadeada(Lista list) {
		if (list.vazia() == true) System.out.println("\n -- A lista está vazia -- ");
		else { 
			String aux = list.imprima();
			System.out.println(aux);
		}
		
		
	}
	private static void imprimeLista(ArrayList<Pessoa> lista) {
		System.out.println("\n ---------------------------------------");
		System.out.println("       Lista de Ingressos lista  ");
		System.out.println(" ---------------------------------------");
		System.out.println("    No    Tipo      Valor  Comprador\n");
		for (int j = 0; j < lista.size(); j++) {
			System.out.println("   " + lista.get(j).getNumero() 
							 + "   " + lista.get(j).getTipo()
							 + "   " + lista.get(j).getValor()
							 + "   " + lista.get(j).getNome());
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
		System.out.println("   lista: " + (contaMeias + contaInteiras) + "        Lucro: R$" + (totalInteiras + totalMeias));
		System.out.println(" -------------------------------------\n");

	}

	private static void inteiraVendida(int i, Inteira inteira, Fila fila, Pilha pilha, int contaInteiras,ArrayList<Pessoa> lista, Lista list) {
		pilha.pop();
		contaInteiras++;
		MAX--;
		String nome = fila.desenfileirar().getNome();
		System.out.println("\n Vendido para " + nome + " [Saiu da Fila]");
		System.out.println(" Retirado do topo [" + i + "] \n");
		inteira.setId(i);
		inteira.venderIngresso();
		totalInteiras = totalInteiras + inteira.getValor();
		Pessoa p = new Pessoa(i, "Inteira", inteira.getValor(), nome);
		lista.add(p);
		list.adicionaOrdenado(p);
	}

	private static void meiaVendida(int i, Meia meia, Fila fila, Pilha pilha, int contaMeias,ArrayList<Pessoa> lista, Lista list ) {
		pilha.pop();
		contaMeias++;
		MAX--;
		String nome = fila.desenfileirar().getNome();
		System.out.println("\n Vendido para " + nome + " [Saiu da Fila]");
		System.out.println(" Retirado do topo [" + i + "] \n");
		meia.setId(i);
		meia.venderIngresso();
		totalMeias = totalMeias + meia.getValor();
		Pessoa p = new Pessoa(i, "Meia   ", meia.getValor(), nome);
		lista.add(p);
		list.adicionaOrdenado(p);

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
			leia.skip("\\R");
			System.out.print(" Número " + j + " da fila:" );
			String nome = leia.next();
			Pessoa aux = new Pessoa(i, " ", 0, nome);
			pessoas.enfileirar(aux);
			j++;

		}

	}

	public static String menuEscolha() {
		System.out.println();
		System.out.println(" [E]nfileirar Pessoas");
		System.out.println(" [C]ontar Fila");
		System.out.println(" [V]ender ingresso");
		System.out.println(" [A]rray - imprimir");
		System.out.println(" [L]ista Encadeada Ordenada - imprimir");
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
		Thread.sleep(200);
		for (int i = MIN; i <= MAX; i++) {
			Thread.sleep(200);
			ingressos.push(i);
			System.out.println("          - " + i + " - ");

		}
		Thread.sleep(200);
		System.out.println("\n       [Topo da Pilha] ");

	}

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		Lista list = new Lista();
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
					meiaVendida(MAX - 1, meia, pessoas, ingressos, contaMeias, lista, list);
					break;
				case "i":
					inteiraVendida(MAX - 1, inteira, pessoas, ingressos, contaInteiras, lista, list);
					break;
				}
				break;
			case "a":
				imprimeSaldo(contaMeias, contaInteiras);
				break;
			case "l":
				imprimeListaEncadeada(list);
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
