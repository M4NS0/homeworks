
import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);
	private static Lista lista;

	public static int Escolha() {
		
		System.out.println("\n\n\t    Lista de Convidados"
						 + "\n ________________________________________"
						 + "\n|________________________________________|" 
						 + "\n|  1. Configurar o tamanho da lista      |"
						 + "\n|  2. Conferir tamanho da lista          |"
						 + "\n|  3. Inserir Pessoa                     |"
						 + "\n|  4. Ver lista de Convidados            |"
						 + "\n|  5. Busca por Pessoa                   |"
						 + "\n|  6. Retira Pessoa                      |"
						 + "\n|  7. Insere Entre                       |"
						 + "\n|  8. Ver em ordem Alfabética            |"		
						 + "\n|  0. Sair                               |"
						 + "\n|________________________________________|\n");
		
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
				int tamanhoMax = leia.nextInt();
				lista = new Lista(tamanhoMax);
				lista.limpaTela();
				break;
			case 2:
				lista.limpaTela();
				System.out.println("\n\t   A lista tem tamanho " + lista.tamanho());
				break;
			case 3: 
				if (lista.cheia() == true) {
					lista.limpaTela();
					System.out.println("\t  - A lista está cheia -\n");
					break;
				} else {
					System.out.println("Insira Pessoa: ");
					String pessoa = leia.next();
					lista.insere(pessoa);
					System.out.println();
				}
				lista.limpaTela();
				break;
			case 4:
				lista.limpaTela();
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
			case 6:
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
			case 7:
				System.out.println("Digite a posição que gostaria de colocar a nova pessoa: ");
				int posicao = leia.nextInt();
				
				System.out.println("Digite a nova pessoa que sera inserida na posição " + posicao);
				String pessoaNova = leia.next();
				
				lista.inserirEntre(pessoaNova, posicao);
				break;
			case 8:
				System.out.println("\t   Sua lista em ordem:\n");
				lista.ordena();
				break;
				
			}

		} while (n != 0);
		System.out.println("\t    Arrivederci!");
	}

}
