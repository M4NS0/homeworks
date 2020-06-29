/*
 ============================================================================
 Name  					: Busca Sequencial
 Baseado no Livro		: Estrutura de Dados e Técnicas de Programação
 Autores    			: Bianchi, Dilermando, Nakamiti, Freitas, Xastre
 Descrição				: Busca em vetor de Strings embaralhadas
			 			  Algorítmo de Busca em vetor Embaralhado com tempo 
			 			  de processamento MAIOR que vetor Ordenado
 ============================================================================
*/


import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Funcao {

	private static long startTime;

	public static void imprime(String[] v) {
		System.out.println(Arrays.toString(v));
	}

	public static int achaNome(String v[], String k, int n) {
		int i;
		for (i = 0; i < n; i++) { 							// Percorre todo o vetor v
			if (v[i].equalsIgnoreCase(k))
				return i; 									// Se encontrar um valor igual, retorna posição i
		}
		return -1; 											// caso o valor não seja encontrado, retorna valor -1

	}

	public static String[] embaralha(String[] v) {
		Random rgen = new Random(); // Randomizador
		for (int i = 0; i < v.length; i++) {
			int randomPosition = rgen.nextInt(v.length); 	// Randomiza posição dos números
			String temp = v[i];
			v[i] = v[randomPosition];
			v[randomPosition] = temp;
		}

		return v;
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
