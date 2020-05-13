import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static Item ObterDados() {
		String pNome, pFone;
		System.out.print(" Digite o nome: ");
		pNome = leia.next();
		System.out.print(" Digite o fone: ");
		pFone = leia.next();
		Item dados = new Item(pNome, pFone);
		return dados;

	}

	public static String Escolha() {
		System.out.println("----------------------\n");
		System.out.println(" [I]nserir Dados");
		System.out.println(" [P]esquisar ");
		System.out.println(" [R]etirar");
		System.out.println(" [S]air\n");
		System.out.print(" Escolha: ");
		String escolha = leia.next();
		System.out.println();
		return escolha.toLowerCase();
	}

	public static void main(String[] args) {
		
		Abp aux = new Abp();
		String escolha = "";

		do {
			escolha = Escolha();
			switch (escolha) {
			case "i":
				Item pessoa = ObterDados();
				aux.inserir(pessoa);
				break;

			case "p":
				Item emArvore = ObterDados();
				if (aux.vazia() == true) System.out.println("\n -- Árvore Vazia --\n");
				if (aux.pesquisar(emArvore) != null) System.out.println("\n -- Valor Encontrado -- \n");
				else System.out.println("\n -- Valor não Encontrado! -- ");
				break;
	
			case "r":
				Item aRetirar = ObterDados();
				if (aux.vazia() == true) System.out.println("\n -- Árvore Vazia --\n");
				if (aux.pesquisar(aRetirar) == null) System.out.println("\n -- Valor não Encontrado -- \n");
				else System.out.println("\n Valor Removido: \n " + aux.retirar(aRetirar));
				
				break;
			case "s":
				System.exit(0);
				

			}

		} while (escolha != "s");
	}

}
