import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);
	static Lista lista;
	static Object x;

	public static int Escolha() {
		System.out.println("\n__________________________________________\n"
				+ "\n1. Para alterar o tamanho da lista"
				+ "\n2. Para checar o tamanho da lista" 
				+ "\n3. Inserir uma pessoa" 
				+ "\n4. Imprime Lista de Convidados"
				+ "\n5. Busca por Pessoa" 
				+ "\n6. Retira primeira Pessoa da lista" 
				+ "\n7. Verifica o Primeiro da lista"
				+ "\n8. Retira Pessoa"
				+ "\n9. Checar pessoa depois da primeira"
				+ "\n10. Verifica ultimo da lista"
				+ "\n0. Sair"
				+ "\n__________________________________________\n");
		int n = leia.nextInt();
		return n;

	}

	public static void main(String[] args) throws Exception {

		int n = 0;
		do {
			n = Escolha();
			switch (n) {
			case 1:

				System.out.println("\nDigite o tamanho da lista:");
				int tamanho = leia.nextInt();
				lista = new Lista(tamanho);
				System.out.println();
				break;

			case 2:
				try {
					System.out.println("Sua lista tem tamanho: " + lista.tamanho() + "\n");
					break;
				} catch (Exception e) {
					System.out.println("Nenhuma lista criada!\n");
					break;
				}

			case 3:
				if (lista.cheia() == true) {
					System.out.println("A lista está cheia!\n");
				} else {
					System.out.println("Insira Pessoa: ");
					String pessoa = leia.next();
					lista.insere(pessoa);
					System.out.println();
				}
				break;
			case 4:
				lista.imprime();
				break;
			case 5:
				if (lista.vazia() == true) {
					System.out.println("A lista está vazia\n");
				} else {
					System.out.println("\nDigite um nome para verificar se existe na lista:");

					if (lista.pesquisa(leia.next()) != null) {
						System.out.println("Essa pessoa já está na lista!\n");
						break;
					} else {
						System.out.println("Essa pessoa ainda não foi incluida!\n");
						break;
					}

				}
				break;
			case 6:
				if (lista.vazia() == true) {
					System.out.println("A lista está vazia\n");
				} else {

					lista.retiraPrimeiro();
				}
			case 7:
				System.out.println(lista.primeiro());
				break;

			case 8:
				if (lista.vazia() == true) {
					System.out.println("A lista está vazia!\n");
				} else {
					System.out.println("Digite o nome da pessoa que deseja retirar:");
					String nome = leia.next();
					if (lista.pesquisa(nome) == null) {
						System.out.println("Essa pessoa não está na lista e não pode ser retirada\n");
						break;
					} else {
						lista.retira(nome);
						System.out.println("Pessoa " + nome + " foi retirada com sucesso!\n");
						break;
					}
				}
			case 9:
				if (lista.vazia() == true) {
					System.out.println("A lista está vazia!\n");
				} else {

					System.out.println("A pessoa depois de " + lista.primeiro() + " é " +lista.proximo());
					break;
				}

				
			case 10:
				
				System.out.println("O último da lista é: " + (lista.ultimo()));
				break;
			}	
		} while (n != 0);
		System.out.println("\nArivererci!");
	}
}
