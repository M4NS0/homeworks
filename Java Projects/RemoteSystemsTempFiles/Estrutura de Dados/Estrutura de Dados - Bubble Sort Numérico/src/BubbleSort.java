import java.util.Arrays;

/*
============================================================================
Name  		: Busca por Bubble Sort Numérico
Livro		: Estrutura de Dados e Técnicas de Programação
Autores     : Bianchi, Dilermando, Nakamiti, Freitas, Xastre
Página		: 108
Descrição	: Técnica de Bubble Sort  empregado a Vetor de Números 
============================================================================
*/

public class BubbleSort {
	public String BubbleSort(int v[], int n) {
		int i;
		System.out.println("\nVetor Original: " + Arrays.toString(v) + "\n");
		for (int j = 0; j < n - 1; j++)
			for (i = 0; i < n - 1; i++)
				if (v[i] > v[i + 1]) {
					int Aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = Aux;

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
