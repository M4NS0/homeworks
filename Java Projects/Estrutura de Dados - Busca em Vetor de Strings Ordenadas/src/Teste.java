import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);
	
	public static int Escolha() {
		System.out.println("\n---------------------------------------\n" 
							+ "1. Imprime Vetor\n"
							+ "2. Verifica se Nome existe no vetor\n" 
							+ "3. Ordenação Alfabética\n" 
							+ "0. Sair\n"
							+ "---------------------------------------\n");
		int e = leia.nextInt();
		return e;
	}
	public static void main(String[] args) {
		String [] v = {"Bob", "Theodora", "Peggy", "Bruno", "Campbell", "Lilian", "Betty", "Hendrix", "Don", "Alice", "Thomas", "Joan", "Roger"};
		int e = 0;
		do {
			e = Escolha();
			switch (e) {
			case 1: 
				Funcao.imprime(v);
				break;
			case 2:
				System.out.println("\nInsira o Nome que deseja buscar no vetor: ");
				String k = leia.next();
				if (Funcao.achaNome(v, k) == -1) System.out.println("Valor não encontrado na lista!");
				else System.out.println("\nO nome " + k + " foi encontrado na posição " + (Funcao.achaNome(v, k) + 1));
				System.out.println("O tempo de processamento da busca de Números embaralhados foi de: " + Funcao.finalizaTempo() + " Milisegundos");
			
			case 3:
				Funcao.ordena(v);
				break;
						
			case 4:
			}
			
		} while (e != 0);
	}

}
