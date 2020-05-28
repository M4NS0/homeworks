import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String selecionararvore () {
		System.out.println("\n Árvore [A]");
		System.out.println(" Árvore [B]");
		System.out.print(" Escolha: ");
		String s = leia.next().toLowerCase();
		return s;
	}
	public static Item obtemItem() {
		String nome, fone;
		leia.skip("\\R");
		System.out.print("\n Nome:");
		nome = leia.nextLine();
		//System.out.print("Telefone:");
		//fone = leia.next();
		Item aux = new Item(nome, "000");
		return aux;
	}

	public static int menu() {
		int valor;

		System.out.println("\n 1 - para adicionar um item.");
		System.out.println(" 2 - para remover um item.");
		System.out.println(" 3 - para pesquisar um item.");
		System.out.println(" 4 - para imprimir a árvore.");
		System.out.println(" 5 - Informações Sobre a Árvore");
		System.out.println(" 6 - para encerrar o programa.");
		System.out.print("\n  Escolha: ");
		valor = Integer.parseInt(leia.next());
		return valor;
	}

	public static void main(String[] args) {
		Abp arvoreA = new Abp();
		Abp arvoreB = new Abp();
		Abp teste = new Abp();
		int n;
		String s;
		boolean ok = false;
		Item novo = null;
		do {
			n = menu();
			switch (n) {
			case 1:
				switch (s = selecionararvore()) {
				case "a":
					novo = obtemItem();
					ok = arvoreA.inserir(novo);
					if (ok)
						System.out.println("\n Adicionado na Árvore A");
					else
						System.out.println("\n O item já está na lista!");
					System.out.println(" Árvore com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;
				case "b":
					novo = obtemItem();
					ok = arvoreB.inserir(novo);
					if (ok)
						System.out.println("\n Adicionado na Árvore B");
					else
						System.out.println("\n O item já está na lista!");
					System.out.println(" Árvore com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;
				}
				
				break;
			case 2:
				switch (s = selecionararvore()) {
				case "a":
					novo = obtemItem();
					novo = arvoreA.retirar(novo);
					if (novo == null)
						System.out.println("Erro!");
					else
						System.out.println(novo.toString());
					System.out.println(" Árvore A com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;
				case "b":
					novo = obtemItem();
					novo = arvoreB.retirar(novo);
					if (novo == null)
						System.out.println("Erro!");
					else
						System.out.println(novo.toString());
					System.out.println(" Árvore B com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;
				}
				break;
			case 3:
				switch (s = selecionararvore()) {
				
				case "a":
					novo = obtemItem();
					novo = arvoreA.pesquisar(novo);
					if (novo == null)
						System.out.println(" Erro!");
					else
						System.out.println(novo.toString());
					System.out.println(" Árvore com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;
				case "b":
					novo = obtemItem();
					novo = arvoreB.pesquisar(novo);
					if (novo == null)
						System.out.println(" Erro!");
					else
						System.out.println(novo.toString());
					System.out.println(" Árvore com " + arvoreA.getTamanho() + " itens.");
					novo = null;
					break;
				}
				break;
			case 4:
				switch (s = selecionararvore()) {
				case "a": 
					StringBuffer aux = new StringBuffer();
					System.out.println("\n Visita em Ordem\n");
					arvoreA.visitaEmOrdem(aux);
					System.out.println(aux.toString() + "\n----------------------------\n");
					StringBuffer aux2 = new StringBuffer();
					System.out.println("\n Visita em Pré Ordem\n");
					arvoreA.visitaEmPreOrdem(aux2);
					System.out.println(aux2.toString() + "\n----------------------------\n");
					StringBuffer aux3 = new StringBuffer();
					System.out.println("\n Visita em Pós Ordem\n");
					arvoreA.visitaEmPosOrdem(aux3);
					System.out.println(aux3.toString() + "\n----------------------------\n");
					break;
				case "b":
					StringBuffer auxI = new StringBuffer();
					System.out.println("\n Visita em Ordem\n");
					arvoreB.visitaEmOrdem(auxI);
					System.out.println(auxI.toString() + "\n----------------------------\n");
					StringBuffer auxII = new StringBuffer();
					System.out.println("\n Visita em Pré Ordem\n");
					arvoreB.visitaEmPreOrdem(auxII);
					System.out.println(auxII.toString() + "\n----------------------------\n");
					StringBuffer auxIII = new StringBuffer();
					System.out.println("\n Visita em Pós Ordem\n");
					arvoreB.visitaEmPosOrdem(auxIII);
					System.out.println(auxIII.toString() + "\n----------------------------\n");
					break;
					
				}
				break;
				
			case 5:

				StringBuffer auxA = new StringBuffer();
				StringBuffer auxB = new StringBuffer();
				StringBuffer auxAI = new StringBuffer();
				StringBuffer auxBI = new StringBuffer();
				
				System.out.println("\n Árvore A - Número  de  Nós: " + arvoreA.getNos());
				System.out.println(" Árvore A - Número de Folhas: " + arvoreA.getFolhas());
				
				arvoreA.isBinary(auxA);
				System.out.println(" A " + auxA.toString());
				arvoreA.testaIntegridade(auxAI);
				
				System.out.println("\n Árvore B - Número  de  Nós: " + arvoreB.getNos());
				System.out.println(" Árvore B - Número de Folhas: " + arvoreB.getFolhas());
				
				arvoreB.isBinary(auxB);
				System.out.println(" B " + auxB.toString());
				arvoreB.testaIntegridade(auxBI);
				
				teste.areEquals(arvoreA, arvoreB);
				
				
				
				
				break;

			case 6:
				System.out.println(" Árvore com " + arvoreA.getTamanho() + " itens.");
				System.out.println(" Programa encerrando!");
			}
		} while (n != 6);
	}
}
