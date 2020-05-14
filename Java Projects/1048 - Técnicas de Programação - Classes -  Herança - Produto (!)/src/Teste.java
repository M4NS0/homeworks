import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Busca(ArrayList<Produto> estoqueNormal, ArrayList<ProdutoPerecivel> estoquePerecivel) {
		
		System.out.print(" Digite o nome do produto: ");
		String prod = leia.next();
		String resp = "";
		

		do {
			switch (resp = Escolha2().toLowerCase()) {
			case "s":
				for (int i = 0; i < estoquePerecivel.size(); i++) {
					if (estoquePerecivel.get(i).getDescricao().equalsIgnoreCase(prod)) {
						return " \nEncontrado no estoque\n " 
								+ "\n   Produto: " + prod 
								+ "\n    Codigo: " + estoquePerecivel.get(i).getCodigo() 
								+ "\nQuantidade: " + estoquePerecivel.get(i).getQuantidade() + " itens" 
								+ "\nFabricação: " + estoquePerecivel.get(i).getData();
					}
				}
				break;

			case "n":
				for (int i = 0; i < estoqueNormal.size(); i++) {
					if (estoqueNormal.get(i).getDescricao().equalsIgnoreCase(prod)) {
						return " \nEncontrado no estoque\n " + "\n   Produto: " + prod + "\n    Codigo: "
								+ estoqueNormal.get(i).getCodigo() + "\nQuantidade: "
								+ estoqueNormal.get(i).getQuantidade() + " itens";
					}
				}
				break;
			}
		} while (resp != "s" || resp != "n");

		return prod + " não existe no registro do estoque";
	}

	public static String Escolha2() {
		System.out.println("\n O produto é perecivel? ");
		System.out.println(" [S]im");
		System.out.println(" [N]ão");
		System.out.print("\n Escolha: ");
		String e2 = leia.next();
		return e2;
	}

	public static String Escolha1() {
		System.out.println("\n---------------------");
		System.out.println(" [I]nserir produto");
		System.out.println(" [B]uscar produto");
		System.out.println(" [V]erificar vencimento");
		System.out.println(" [O]lhar estoque");
		System.out.println(" [S]air");
		System.out.print("\n Escolha: ");
		String e1 = leia.next();
		return e1;
	}

	public static void main(String[] args) {
		ArrayList<Produto> estoqueNormal = new ArrayList<Produto>();
		ArrayList<ProdutoPerecivel> estoquePerecivel = new ArrayList<ProdutoPerecivel>();
		ProdutoPerecivel perecivel = null;
		
		String e1 = "";

		do {
			switch (e1 = Escolha1().toLowerCase()) {

			case "i":
				String e2 = "";

				switch (e2 = Escolha2().toLowerCase()) {
				case "s":
					System.out.print(" Digite a descrição do produto: ");
					String descricao = leia.next();
					System.out.print(" Digite o código do Produto: ");
					int codigo = leia.nextInt();
					System.out.print(" Digite a quantidade: ");
					int quantidade = leia.nextInt();
					System.out.print(" Digite a data de Vencimento:");
					String vencimento = leia.next();
					perecivel = new ProdutoPerecivel(codigo, quantidade, descricao, vencimento);
					estoquePerecivel.add(perecivel);
					break;
				case "n":
					System.out.print(" Digite a descrição do produto: ");
					String desc = leia.next();
					System.out.print(" Digite o código do Produto: ");
					int cod = leia.nextInt();
					System.out.print(" Digite a quantidade: ");
					int quant = leia.nextInt();
					Produto normal = new Produto(cod, quant, desc);
					estoqueNormal.add(normal);
					break;
				}
				break;

			case "b":
				System.out.println(Busca(estoqueNormal, estoquePerecivel));
				break;
			case "v":
				System.out.print(" Digite o nome do Item: ");
				System.out.println(perecivel.CalculaVencimento(leia.next(), estoquePerecivel));
				break;
			case "o":
				String e3 = "";
				switch (e3 = Escolha2().toLowerCase()) {
				case "s" :
					System.out.println(" Digite o nome do produto: ");
					ProdutoPerecivelEsp esp = null;
					
				}
				
				
			case "s":
					
					
				
			}

		} while (!e1.equalsIgnoreCase("i") || !e1.equalsIgnoreCase("b") || !e1.equalsIgnoreCase("v")
				|| !e1.equalsIgnoreCase("o"));

	}

}
