import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	static int Escolha() {
		System.out.println("\n-----------------------------------\n"
				+ "1. Imprime Vetor\n"
				+ "2. Verifica se nome existe no vetor\n"
				+ "3. Ordenação Alfabética\n"
				+ "0. Sair"
				+ "\n-----------------------------------\n");
		int e = leia.nextInt();
		return e;
	}
	public static void main(String[] args) {
		String [] v = {"Bob", "Theodora", "Peggy", "Bruno", "Campbell", "Lilian", "Betty", "Hendrix", "Don", "Alice", "Thomas", "Joan", "Roger"};
		int n = 13;
		int e = 0;
		do {
			e = Escolha();
			switch(e) {
			case 1:
				Funcao.imprime(v);
				break;
			case 2:
				Funcao.ordena(v);
				System.out.println("\nDigite o nome que deseja buscar: ");
				String k = leia.next();
				if (Funcao.buscaBinaria(v, n, k) != -1)	System.out.println("\n" + k + " foi encontrado!");
				else System.out.println("\n" + k + " não foi encontrado!");
				System.out.println("O tempo de processamento da busca Binária foi de: " + Funcao.finalizaTempo() + " Milisegundos");
				break;
			case 3: 
				Funcao.ordena(v);
				break;
			}

		} while (e != 0);
		System.out.println("Arrivederci amici!");
	}
	
}
