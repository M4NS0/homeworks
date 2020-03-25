// OBS:. Algorítmo de Busca em vetor Sequenciado com 
// tempo de processamento MAIOR que algoritmo Embaralhado

import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static int Escolha() {
		System.out.println("\n-----------------------------------------------------------------------------------\n" 
							+ "1. Imprime Vetor\n"
							+ "2. Verifica se número existe no vetor\n" 
							+ "3. Embaralha Vetor (verificação só funciona com números ordenados)\n"
							+ "4. Ordena Vetor\n" 
							+ "0. Sair\n"
							+ "-----------------------------------------------------------------------------------\n");
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
				Funcao.iniciaTempo();
				if (Funcao.achaNumero(v, n, k) == -1) System.out.println("Valor não encontrado na lista!");
				else System.out.println("\nO número " + k + " foi encontrado na posição " + (Funcao.achaNumero(v, n, k) + 1));
				System.out.println("O tempo de processamento da busca Sequencial foi de: " + Funcao.finalizaTempo() + " Milisegundos");

				break;
			case 3:
				Funcao.embaralha(v); // Embaralha Vetor
				System.out.println("\nOs numeros foram embaralhados!");
				break;
			case 4: 
				Funcao.ordena(v);
			}
		} while (e != 0);
		System.out.println("\nArrivederci!");
	}
}
