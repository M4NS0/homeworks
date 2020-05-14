/*
 ============================================================================
 Name  		: Busca Sequencial
 Livro		: Estrutura de Dados e Técnicas de Programação
 Autores    : Bianchi, Dilermando, Nakamiti, Freitas, Xastre
 Página		: 73
 Descrição	: Busca em vetor de números embaralhados
 			  Algorítmo de Busca em vetor Embaralhado com tempo 
 			  de processamento MAIOR que vetor Ordenado
 ============================================================================
*/

import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static int Escolha() {
		System.out.println("\n---------------------------------------\n" 
							+ "1. Imprime Vetor\n"
							+ "2. Verifica se número existe no vetor\n" 
							+ "3. Embaralha Vetor\n" 
							+ "0. Sair\n"
							+ "---------------------------------------\n");
		int e = leia.nextInt();
		return e;
	}

	public static void main(String[] args) {
		int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int n = 20;
		int e = 0;
		do {
			e = Escolha();
			switch (e) {
			
			case 1:
				System.out.println("\nA lista contém:");
				Funcao.imprime(v);
				break;
			
			case 2:
				System.out.println("\nInsira o número inteiro que deseja buscar no vetor: ");
				int k = leia.nextInt();
				
				if (Funcao.achaNumero(v, n, k) == -1) System.out.println("Valor não encontrado na lista!");
				
				else  {
					Funcao.iniciaTempo();
					System.out.println("\nO número " + k + " foi encontrado na posição " + (Funcao.achaNumero(v, n, k) + 1));
					System.out.println("O tempo de processamento da busca de Números embaralhados foi de: " + Funcao.finalizaTempo() + " Milisegundos");

				}
				break;
				
			case 3:
				Funcao.embaralha(v); // Embaralha Vetor
				System.out.println("\nOs numeros foram embaralhados!");
				break;

			}
		} while (e != 0);
		System.out.println("\nArrivederci!");
	}
}
