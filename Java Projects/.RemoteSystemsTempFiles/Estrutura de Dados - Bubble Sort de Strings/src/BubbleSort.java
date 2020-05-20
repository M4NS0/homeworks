import java.util.Arrays;

/*
============================================================================
Name  		: Busca por Bubble Sort de Strings
Livro		: Estrutura de Dados e Técnicas de Programação
Autores     : Bianchi, Dilermando, Nakamiti, Freitas, Xastre
Página		: 108
Descrição	: Baseado no Exemplo do livro, a técnica de Bubble 
			  Sort  empregado a Vetor de Strings disponível em 
			  https://www.tutorialspoint.com/perform-bubble-sort-on-strings-in-java
============================================================================
*/

public class BubbleSort {
	

	public String BubbleSort(String v[]) {
		String aux;
		System.out.println("\nVetor Original: " + Arrays.toString(v) + "\n");
		for (int j = 0; j < v.length; j++) {
			for (int i = j + 1; i < v.length; i++) {
				// comparing strings
				if (v[i].compareTo(v[j]) < 0) {
					aux = v[j];
					v[j] = v[i];
					v[i] = aux;
				}
			}
		}

		System.out.println("Processando bolhas oOoooOOoo");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "\nVetor Ordenado: " + Arrays.toString(v);

	}
}
