
/*
 ============================================================================
 Name  		: Busca Binária Recursiva
 Livro		: Estrutura de Dados e Técnicas de Programação
 Autores    : Bianchi, Dilermando, Nakamiti, Freitas, Xastre
 Página		: 74
 Descrição	: Busca Binária Recursiva em vetor de números 
 			  Algorítmo de Busca Binária Recursiva em vetor com tempo 
 			  de processamento MENOR que Busca Binária
 ============================================================================
*/
import java.util.Arrays;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);
	
	public static int Escolha() {
		System.out.println("\n---------------------------------------\n" 
							+ "1. Imprime Vetor\n"
							+ "2. Verifica se número existe no vetor\n" 
							+ "0. Sair\n"
							+ "---------------------------------------\n");
		int e = leia.nextInt();
		return e;
	}
	public static void main(String[] args) {
		
		int v[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int inicio = 0;
		int fim = 15;
		int k = 0;
		int e = 0;
		do {
			e = Escolha();
			switch(e) {
			case 1:
				Funcao.imprime(v);
				break;
			case 2:
				System.out.print("Insira o valor buscado: ");
				k = leia.nextInt();
				if (Funcao.buscaBinRec(v, inicio, fim, k) == -1) System.out.println("-Valor Inexistente!\n");
				else {
					Funcao.iniciaTempo();
					System.out.println("    Busca em método: " + Funcao.buscaBinRec(v, inicio, fim, k)+ "a posição" );
					System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(v, k)+ "a posição" );
					System.out.println("O tempo de processamento da busca de Números embaralhados foi de: " + Funcao.finalizaTempo() + " Milisegundos");
					System.out.println();
					break;
				}
			}
			
		} while (k != 0);

	}

}
