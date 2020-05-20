import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static Item ObterDados() {
		String pNome, pFone;
		System.out.print(" Digite o nome: ");
		pNome = leia.next();
		//System.out.print(" Digite o fone: ");
		//pFone = leia.next();
		Item dados = new Item(pNome, "12345");
		return dados;

	}

	public static int Escolha() {
		System.out.println("\n----------------------");
		System.out.println(" 1.  Inserir Dados");
		System.out.println(" 2.  Pesquisar ");
		System.out.println(" 3.  Retirar");
		System.out.println(" 4.  O maior valor da Árvore");
		System.out.println(" 5.  O menor valor da Árvore");
		System.out.println(" 6.  O antecessor de um Nó");
		System.out.println(" 7.  O sucessor de um Nó");
		System.out.println(" 8.  Visita em Ordem");
		System.out.println(" 9.  Visita em pré Ordem");
		System.out.println(" 10. Visita em pós Ordem");
		System.out.println(" 11. Testa Integridade");
		System.out.println(" 12. Conta quantidade de Folhas");
		System.out.println(" 13. Conta total de Nós");
		System.out.println(" 0. Sair\n");
		System.out.print(" Escolha: ");
		int escolha = leia.nextInt();
		System.out.println();
		return escolha;
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Abp aux = new Abp();
		int escolha = 0;

		do {
			escolha = Escolha();
			switch (escolha) {
			case 1:
				Item pessoa = ObterDados();
				aux.inserir(pessoa);
				break;

			case 2:
				Item emArvore = ObterDados();
				if (aux.vazia() == true) System.out.println("\n -- Árvore Vazia --\n");
				if (aux.pesquisar(emArvore) != null) System.out.println("\n -- Valor Encontrado -- \n");
				else System.out.println("\n -- Valor não Encontrado! -- ");
				break;
	
			case 3:
				Item aRetirar = ObterDados();
				if (aux.vazia() == true) System.out.println("\n -- Árvore Vazia --\n");
				if (aux.pesquisar(aRetirar) == null) System.out.println("\n -- Valor não Encontrado -- \n");
				else System.out.println("\n Valor Removido: \n " + aux.retirar(aRetirar));
				break;
			case 4:
				aux.getMaximo();
				break;
			case 5:
				
				break;
			case 8:
				sb = new StringBuffer();
				System.out.print(" Digite um nome para ser visitado em Ordem: ");
				sb.append(leia.next());
				aux.visitaEmOrdem(sb);
				break;
			case 9:
				sb = new StringBuffer();
				System.out.print(" Digite um nome para ser visitado em Pré Ordem: ");
				sb.append(leia.next());
				aux.visitaEmPreOrdem(sb);
				break;
			case 10:
				sb = new StringBuffer();
				System.out.print(" Digite um nome para ser visitado em Pós Ordem: ");
				sb.append(leia.next());
				aux.visitaEmPosOrdem(sb);
				break;
			case 11:
				sb = new StringBuffer();
				System.out.print(" Digite um nome para Testar sua Integridade na Árvore: ");
				sb.append(leia.next());
				aux.testaIntegridade(sb);
				break;				
			case 12:
				System.out.println(aux.getContaFolhas());
				break;
			case 13:
				System.out.println(aux.getContaNos());
				break;
				

			}

		} while (escolha != 0);
	}

}








