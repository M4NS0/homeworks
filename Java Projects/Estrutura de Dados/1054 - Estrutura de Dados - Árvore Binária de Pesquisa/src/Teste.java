import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static Item obtemItem() {
		String nome, fone;
		leia.skip("\\R");
		System.out.print("Nome:");
		nome = leia.nextLine();
		//System.out.print("Telefone:");
		//fone = leia.next();
		Item aux = new Item(nome, "000");
		return aux;
	}

	public static int menu() {
		int valor;
		System.out.println("Digite:");
		System.out.println("1 - para adicionar um item.");
		System.out.println("2 - para remover um item.");
		System.out.println("3 - para pesquisar um item.");
		System.out.println("4 - para imprimir a árvore.");
		System.out.println("5 - para testar integridade da árvore.");
		System.out.println("6 - para encerrar o programa.");
		System.out.println("\n  Escolha: ");
		valor = Integer.parseInt(leia.next());
		return valor;
	}

	public static void main(String[] args) {
		Abp arvore = new Abp();
		int n;
		boolean ok = false;
		Item novo = null;
		do {
			n = menu();
			switch (n) {
			case 1:
				novo = obtemItem();
				ok = arvore.inserir(novo);
				if (ok)
					System.out.println("Sucesso!");
				else
					System.out.println("Insucesso - item já está na lista!");
				System.out.println("Árvore com " + arvore.getTamanho() + " itens.");
				novo = null;
				break;
			case 2:
				novo = obtemItem();
				novo = arvore.retirar(novo);
				if (novo == null)
					System.out.println("Erro!");
				else
					System.out.println(novo.toString());
				System.out.println("Árvore com " + arvore.getTamanho() + " itens.");
				novo = null;
				break;
			case 3:
				novo = obtemItem();
				novo = arvore.pesquisar(novo);
				if (novo == null)
					System.out.println("Erro!");
				else
					System.out.println(novo.toString());
				System.out.println("Árvore com " + arvore.getTamanho() + " itens.");
				novo = null;
				break;
			case 4:
				StringBuffer aux = new StringBuffer();
				arvore.visitaEmOrdem(aux);
				System.out.println(aux.toString() + "\nFim ............. \n");
				StringBuffer aux2 = new StringBuffer();
				arvore.visitaEmPreOrdem(aux2);
				System.out.println(aux2.toString() + "\nFim ............. \n");
				StringBuffer aux3 = new StringBuffer();
				arvore.visitaEmPosOrdem(aux3);
				System.out.println(aux3.toString() + "\nFim ............. \n");
				break;
			case 5:
				StringBuffer aux4 = new StringBuffer();
				arvore.testaIntegridade(aux4);
				System.out.println(aux4.toString() + "\nFim .............. \n");
				break;
			case 6:
				System.out.println("Árvore com " + arvore.getTamanho() + " itens.");
				System.out.println("Programa encerrando!");
			}
		} while (n != 6);
	}
}
