import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);
	
	public static Livro obtemLivro() {
		Livro aux = new Livro();
		String str;
		str = leia.nextLine();
		System.out.println("Digite o Título do livro:\n");
		aux.setTitulo(str);
		str = leia.nextLine();
		System.out.println("Digite o autor do Livro:\n");
		aux.setAutor(str);
		str = leia.nextLine();
		System.out.println("Digite a Editora do Livro:\n");
		str = leia.nextLine();
		aux.setEditora(str);
		return aux;
	}
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		int n;
		Livro novo = null;
		do {
			System.out.println("\n-----------------------------\n"
					+ "1. Empilha Livro\n"
					+ "2. Desempilha Livro\n"
					+ "3. Imprimir"
					+ "4. Sair\n"
					+ "-----------------------------\n");
			n = leia.nextInt();
			switch (n) {
			case 1:
				novo = obtemLivro();
				pilha.push(novo);
				System.out.println("Pilha com " + pilha.getTam() + " livros");
				novo = null;
				break;
			case 2:
				novo = pilha.pop();
				if (novo == null) System.out.println("Erro!");
				else System.out.println(novo.getLivro());
				novo = null;
				break;
			case 3:
				
				break;
				
			case 4:
				System.out.println("Programa encerrado");
			}
		} while (n != 3);
	}

}
