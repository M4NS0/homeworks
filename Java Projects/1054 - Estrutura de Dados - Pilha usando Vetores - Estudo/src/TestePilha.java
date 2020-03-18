import java.util.Scanner;

/*
 * Qual é a diferença entre uma Lista e uma Pilha? 
 * A diferença está nas operações destas duas estruturas de dados. 
 * As operações de uma Pilha são mais restritas do que as de uma Lista. 
 * Por exemplo, você pode adicionar ou remover um elemento em qualquer 
 * posição de uma Lista mas em uma Pilha você só pode adicionar ou remover do topo.
 */

public class TestePilha {
	static Scanner leia = new Scanner(System.in);

	static public int Escolha() {
		int numero;
		System.out.println("1. Inserir Item\n2. Checar se Pilha está vazia\n3. Remover Item\n4. Ler Pilha\n5. Sair");
		numero = leia.nextInt();
		return numero;
	}

	public static void main(String[] args) {

		// cria objeto pilha
		Pilha pilha = new Pilha();

		// cria objeto para inserir peças
		Peca nova = new Peca();

		int n;
		do {
			n = Escolha(); 
			// recebe o valor do menu
			switch (n) {
			
			case 1:
				
				System.out.println("Digite o nome da Peça: ");	
				nova.setNome(leia.next());
				pilha.insere(nova);
				break;
				
				
			case 2:
				
				if (pilha.vazia() == true) System.out.println("Pilha não contêm Itens");
				if (pilha.vazia() == false) System.out.println("Pilha contêm um ou mais Itens");
				break;
				
			case 3:
				if (pilha.vazia() == true) System.out.println("Pilha não contêm Itens");
				pilha.remover(); 
				System.out.println("Último Item removido com sucesso!");
				break;
				

			case 4:
				if (pilha.vazia() == true) System.out.println("Pilha não contêm Itens");
				if (pilha.vazia() == false) System.out.println("Pilha contêm " + pilha.listarQuantidade() + " itens: " + pilha.listarItens());
				// nao consegui printar o conteúdo inteiro da lista! //
				break;
				
			case 5:
				System.exit(0);
			}
		} while (n < 6);

	}
}
