/*
 ============================================================================
 Name  					: Busca Binária
 Baseado no Livro		: Estrutura de Dados e Técnicas de Programação
 Autores    			: Bianchi, Dilermando, Nakamiti, Freitas, Xastre
 Descrição				: Busca Binária em vetor de String 
			 			  Algorítmo de Busca Binária em vetor com tempo 
			 			  de processamento MENOR que Busca Sequencial
 ============================================================================
*/

import java.time.Instant;
import java.util.Arrays;

public class Funcao {
	
	private static long startTime;

	public static int buscaBinaria(String v[], int n, String k) {
		int esquerda = 0;
		int direita = n - 1; 
        while (esquerda <= direita) { 
            int centro = esquerda + (direita - esquerda) / 2;  	// Calcula onde está o centro
            int res = k.compareTo(v[centro]); 
            if (res == 0) return centro; 						// Verifica se k está no centro 
            if (res > 0)  esquerda = centro + 1; 				// Se k é maior, ignora a parte esquerda
            else direita = centro - 1; 							// Se k é menor, ignora a parte direita
        } 
  
        return -1; 
	}
	
	public static Object ordena(String v[]) {
		Arrays.sort(v);
		return v;
	}
	public static void imprime(String[] v) {
		System.out.println(Arrays.toString(v));

	}

	public static long iniciaTempo() {
		startTime = Instant.now().toEpochMilli();
		return startTime;
	}

	public static long finalizaTempo() {
		long endTime = Instant.now().toEpochMilli();
		long timeElapsed = endTime - startTime;
		return timeElapsed;
	}

}
