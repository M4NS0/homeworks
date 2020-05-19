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
			
			list.imprima();
			
		}
		
		
	}
	private static void imprimeLista(ArrayList<Pessoa> lista) {
		System.out.println("\n ---------------------------------------");
		System.out.println("           Lista de Ingressos  ");
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

	private static Pessoa inteiraVendida(int i, Inteira inteira, Fila fila, Pilha pilha,ArrayList<Pessoa> lista, Lista list) {
		
		MAX--;                                                                  // Decrementa o índice máximo
		System.out.println("\n -------------------------------------------");
		String nome = fila.desenfileirar().getNome();                           // Desenfileira fila de Pessoas, passada por parâmetro, e guarda o nome em uma variável
		System.out.println("\n Vendido para " + nome + " [Saiu da Fila]");      // Informa que pessoa de nome x saiu da fila  
		pilha.pop();                                                            // Retira ingresso da pilha de Ingressos
		System.out.println(" Retirado da Pilha [" + i + "] \n");                 // Informa que Ingresso de número, passado por parâmetro, saiu da lista
		inteira.setId(i);                                                       // Configura o id da classe Meia com o número que foi passado por parâmetro
		inteira.venderIngresso();                                               // Chama método da classe e imprime para o Usuário
		System.out.println(" -------------------------------------------\n");
		totalInteiras = totalInteiras + inteira.getValor();                     // Guarda na variável, passada por parâmetro, incrementando o valor do ingresso (meia) cada vez que é comprado
		Pessoa p = new Pessoa(nome, i, "Inteira", inteira.getValor());          // Cria um objeto do tipo Pessoa instanciado pelos valores colhidos
		return p;
	}

	private static Pessoa meiaVendida(int i, Meia meia, Fila fila, Pilha pilha, ArrayList<Pessoa> lista, Lista list ) {
		
		MAX--;                                                                  // Decrementa o índice máximo
		System.out.println("\n -------------------------------------------");
		String nome = fila.desenfileirar().getNome();                           // Desenfileira fila de Pessoas, passada por parâmetro, e guarda o nome em uma variável
		System.out.println("\n Vendido para " + nome + " [Saiu da Fila]");      // Informa que pessoa de nome x saiu da fila
		pilha.pop();                                                            // Retira ingresso da pilha de Ingressos
		System.out.println(" Retirado da Pilha [" + i + "] \n");                 // Informa que Ingresso de número, passado por parâmetro, saiu da lista
		meia.setId(i);                                                          // Configura o id da classe Meia com o número que foi passado por parâmetro
		meia.venderIngresso();                                                  // Chama método da classe e imprime para o Usuário
		System.out.println(" -------------------------------------------\n");
		totalMeias = totalMeias + meia.getValor();                              // Guarda na variável, passada por parâmetro, incrementando o valor do ingresso (meia) cada vez que é comprado
		Pessoa p = new Pessoa(nome, i, "Meia   ", meia.getValor());             // Cria um objeto do tipo Pessoa instanciado pelos valores colhidos
		return p;
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
			Pessoa aux = new Pessoa(nome, i, " ", 0);
			pessoas.enfileirar(aux);
			j++;

		}

	}

	public static String menuEscolha() {
		System.out.println();
		System.out.println(" [E]nfileirar Pessoas");
		System.out.println(" [C]ontar Fila");
		System.out.println(" [V]ender ingresso");
		System.out.println(" [T]udo  - imprimir lista de ingresso");
		System.out.println(" [A]rray - imprimir extrato das vendas");
		System.out.println(" [L]ista Encadeada Ordenada - imprimir");
		System.out.println(" [B]uscar pessoa na Lista");
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
		Pessoa p = new Pessoa();
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
					contaMeias++; 
					p = new Pessoa();
					p = meiaVendida(MAX - 1, meia, pessoas, ingressos, lista, list);
					lista.add(p);                                                           
					list.adicionaOrdenado(p);                                             
					break;
				case "i":
					contaInteiras++;
					p = new Pessoa();
					p = inteiraVendida(MAX - 1, inteira, pessoas, ingressos, lista, list);
					lista.add(p);                                                           
					list.adicionaOrdenado(p);
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
			case "b":
				p = new Pessoa();
				System.out.print("\n Digite o nome que deseja buscar: ");
				p.setNome(leia.next());
				System.out.println(list.busca(p));
				break;
			case "s":
				fim();
			}
			
		} while (!e.equalsIgnoreCase("v") || !e.equalsIgnoreCase("i") || !e.equalsIgnoreCase("s"));
	}

	

	

}
