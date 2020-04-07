import java.time.Instant;
import java.util.Arrays;

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

public class Funcao {
	private static long startTime;

	public static int buscaBinRec(int v[], int inicio, int fim, int k) {
		int centro; 											// Posição central do vetor
		while (inicio <= fim) {									// Enquanto existir elementos no vetor
			centro = inicio + (fim - inicio)/2;					// Recebe a posição central do vetor
			if (k == v[centro]) return centro;					// caso (1) encontrou valor no centro
			else if (k > v[centro]) 							// caso (2) o valor do elemento central é menor q k
				return buscaBinRec(v, centro +1, fim, k);		// caso (2) o novo vetor passa ser parte superior
			else 												// caso (3) o valor do elemento central é maior q k
				return buscaBinRec(v, inicio, centro -1, k);	// caso (3) o novo vetor é a parte inferior
		}
		return -1;	
	}
	
	public static void imprime(int[] v) {
		System.out.println(Arrays.toString(v));
		
	}
	
	public static long iniciaTempo() {
		startTime = Instant.now().toEpochMilli();
		return startTime;
	}
	
	public static  long finalizaTempo() {
		long endTime = Instant.now().toEpochMilli();
		long timeElapsed = endTime - startTime;
		return timeElapsed;
	}
}
