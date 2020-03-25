/*
 ============================================================================
 Name  		: Busca Binária
 Livro		: Estrutura de Dados e Técnicas de Programação
 Autores    : Bianchi, Dilermando, Nakamiti, Freitas, Xastre
 Página		: 74
 Descrição	: Busca Binária em vetor de números 
 			  Algorítmo de Busca Binária em vetor com tempo 
 			  de processamento MAIOR que Busca Sequencial
 ============================================================================
*/

import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);
	static int Escolha() {
		System.out.println("\n-----------------------------------\n"
				+ "1. Imprime Vetor\n"
				+ "2. Verifica se número existe no vetor\n"
				+ "0. Sair"
				+ "\n-----------------------------------\n");
		int e = leia.nextInt();
		return e;
	}
	public static void main(String[] args) {
		int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int n = 20;
		int e = 0;
		do {
			e = Escolha();
			switch(e) {
			case 1:
				Funcao.imprime(v);
				break;
			case 2:
				System.out.println("\nDigite o número que deseja buscar: ");
				int k = leia.nextInt();
				if (Funcao.buscaBinaria(v, n, k) != -1)	System.out.println("\nO número " + k + " foi encontrado!");
				else System.out.println("\nO número " + k + " não foi encontrado!");
				System.out.println("O tempo de processamento da busca Binária foi de: " + Funcao.finalizaTempo() + " Milisegundos");
				break;
			case 3: 
				System.out.println("Arrivederci!");
			}
			

		} while (e != 0);
		
	}
	
}
