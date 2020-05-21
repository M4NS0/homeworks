import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static Produto obtemProduto() {
		String descricao;
		int matricula;
		double preco;

		leia.skip("\\R");
		System.out.print("\n Matrícula:");
		matricula = leia.nextInt();
		// adicionar outros imputs (matricula/preco) apos testes
		Produto aux = new Produto(matricula , 12.0, "blabla");
		return aux;
	}

	public static String escolha() {
		System.out.println("\n Em qual Árvore deseja adicionar? ");
		System.out.println(" Árvore - A");
		System.out.println(" Árvore - B");
		System.out.print("\n Escolha: ");
		String e = leia.next();
		return e.toLowerCase();

	}

	public static int menu() {
		int valor;
		
		System.out.println("\n1 - para adicionar um Produto.");
		System.out.println("2 - para remover um Produto.");
		System.out.println("3 - para pesquisar um Produto.");
		System.out.println("4 - para ver o número de nós e o numero de folhas das Árvores e se elas são iguais");
		System.out.println("5 - para imprimir a árvore.");
		System.out.println("6 - para testar integridade da árvore.");
		System.out.println("7 - para encerrar o programa.");
		System.out.print("\n  Escolha: ");
		valor = Integer.parseInt(leia.next());
		return valor;
	}

	public static void main(String[] args) {
		Abp arvoreA = new Abp();
		Abp arvoreB = new Abp();
		int n;
		String e;
		boolean ok = false;
		Produto novo = null;
		do {
			n = menu();
			switch (n) {

			case 1:

				switch (e = escolha()) {

				case "a":
					novo = obtemProduto();
					ok = arvoreA.inserir(novo);
					if (ok)
						System.out.println(" Sucesso!");
					else
						System.out.println(" Insucesso - Produto já está na lista!");
					System.out.println(" Árvore com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;

				case "b":

					novo = obtemProduto();

					ok = arvoreB.inserir(novo);
					if (ok)
						System.out.println("\n Sucesso!\n");
					else
						System.out.println("\n Insucesso - Produto já está na lista!");
					System.out.println("\n Árvore com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;
				}
				break;

			case 2:

				switch (e = escolha()) {

				case "a":
					novo = obtemProduto();
					novo = arvoreA.retirar(novo);
					if (novo == null)
						System.out.println(" Erro!");
					else
						System.out.println(novo.toString());
					System.out.println("\n Árvore com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;

				case "b":
					novo = obtemProduto();
					novo = arvoreB.retirar(novo);
					if (novo == null)
						System.out.println(" Erro!");
					else
						System.out.println(novo.toString());
					System.out.println("\n Árvore com " + arvoreB.getTamanho() + " itens.");
					novo = null;
					break;
				}
				break;

			case 3:

				switch (e = escolha()) {

				case "a":
					novo = obtemProduto();
					novo = arvoreA.pesquisar(novo);
					if (novo == null)
						System.out.println(" Erro!");
					else
						System.out.println(novo.toString());
					System.out.println("\n Árvore com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;
				case "b":
					novo = obtemProduto();
					novo = arvoreB.pesquisar(novo);
					if (novo == null)
						System.out.println(" Erro!");
					else
						System.out.println(novo.toString());
					System.out.println("\n Árvore com " + arvoreB.getTamanho() + " itens.");
					novo = null;
					break;
				}
				break;
			case 4:
				System.out.println("\n -----------------------------------");
				System.out.println(" Árvore A");
				System.out.println(" A  quantidade  de  Nós: " + arvoreA.getNos());
				System.out.println(" A quantidade de Folhas: " + arvoreA.getFolhas());
				System.out.println("\n Árvore B");
				System.out.println(" A  quantidade  de  Nós: " + arvoreB.getNos());
				System.out.println(" A quantidade de Folhas: " + arvoreB.getFolhas());
				System.out.println(" -----------------------------------\n");
				if (arvoreA.vazia() && arvoreB.vazia()) 
					System.out.println(" As Árvores A e B são iguais");
				// else if ... tentar max e min 
				System.out.println(arvoreA.maximo());
				break;

			case 5:

				switch (e = escolha()) {

				case "a":
					System.out.println(" Visita em Ordem:");
					StringBuffer aux = new StringBuffer();
					arvoreA.visitaEmOrdem(aux);
					System.out.println(aux.toString() + "\n Fim ............. \n");
					System.out.println(" Visita em Pré Ordem:");
					StringBuffer aux2 = new StringBuffer();
					arvoreA.visitaEmPreOrdem(aux2);
					System.out.println(aux2.toString() + "\n Fim ............. \n");
					System.out.println(" Visita em Pós Ordem:");
					StringBuffer aux3 = new StringBuffer();
					arvoreA.visitaEmPosOrdem(aux3);
					System.out.println(aux3.toString() + "\nFim ............. \n");
					break;

				case "b":
					System.out.println(" Visita em Ordem:");
					StringBuffer aux4 = new StringBuffer();
					arvoreB.visitaEmOrdem(aux4);
					System.out.println(aux4.toString() + "\n Fim ............. \n");
					System.out.println(" Visita em Pré Ordem:");
					StringBuffer aux5 = new StringBuffer();
					arvoreB.visitaEmPreOrdem(aux5);
					System.out.println(aux5.toString() + "\n Fim ............. \n");
					System.out.println(" Visita em Pós Ordem:");
					StringBuffer aux6 = new StringBuffer();
					arvoreB.visitaEmPosOrdem(aux6);
					System.out.println(aux6.toString() + "\nFim ............. \n");
					break;
				}
				break;

			case 6:

				switch (e = escolha()) {

				case "a":
					System.out.println(" Testendo Integridade da Árvore A");
					StringBuffer aux7 = new StringBuffer();
					arvoreA.testaIntegridade(aux7);
					System.out.println(aux7.toString() + "\nFim .............. \n");
					break;
				case "b":
					System.out.println(" Testendo Integridade da Árvore B");
					StringBuffer aux8 = new StringBuffer();
					arvoreB.testaIntegridade(aux8);
					System.out.println(aux8.toString() + "\nFim .............. \n");
					break;
				}

				break;

			case 7:
				System.out.println("Árvore A com " + arvoreA.getTamanho() + " itens.");
				System.out.println("Árvore B com " + arvoreB.getTamanho() + " itens.");
				System.out.println("Programa encerrando!");
			}

		} while (n != 7);
	}

}
