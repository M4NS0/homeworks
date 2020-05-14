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
public class Test {

	public static void main(String[] args) {
		String v[] = {"Misha", "Dimitri", "Ruslan", "Natasha", "Svetlana", "Iuri", "Rashkolnikov", "Kalashnikov"};
		BubbleSort classifica = new BubbleSort();
		System.out.println(classifica.BubbleSort(v));
	}

}
