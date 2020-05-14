/*
============================================================================
Name  		: Busca por Bubble Sort Numérico
Livro		: Estrutura de Dados e Técnicas de Programação
Autores     : Bianchi, Dilermando, Nakamiti, Freitas, Xastre
Página		: 108
Descrição	: Técnica de Bubble Sort  empregado a Vetor de Números 
============================================================================
*/

public class Test {

	public static void main(String[] args) {
		
		
		int[] Vet_Ch = {9,8,6,12,10,4,11,3,5,1,7,2};
		int n = Vet_Ch.length;
		BubbleSort classifica = new BubbleSort();
		System.out.println(classifica.BubbleSort(Vet_Ch, n));
		
		
		
		
	}

}
