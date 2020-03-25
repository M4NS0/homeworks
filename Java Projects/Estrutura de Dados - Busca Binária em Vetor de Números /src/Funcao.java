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


import java.time.Instant;
import java.util.Arrays;

public class Funcao {
	static int inicio = 0;										// Inicio do vetor ou de parte do vetor (1o elemento)
	static int fim;												// Final do vetor ou de parte do vetor (último elemento)
	static int centro;											// Posição central do vetor
	private static long startTime;

	public static int buscaBinaria(int v[], int n, int k) {		// v[] - vetor // n - No de elementos // k - item buscado
		fim = n -1;
		iniciaTempo();
		do {					
			centro = inicio + (fim - inicio) / 2;				// Recebe a posição central do vetor
			if (k == v[centro])	return centro;					// Caso(1) encontrou o vetor				
			else if (k > v[centro])								// Caso(2) o valor do elemento central é menor q k
				inicio = centro + 1;							// Caso(2) O novo vetor passa ser a parte superior
			else												// Caso(3) o valor do elemento central é maior q k
				fim = centro - 1;								// Caso(3) o novo vetor passa a ser parte inferior

		} while (inicio <= fim);								// enquanto existir elementos no vetor
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
	
	

