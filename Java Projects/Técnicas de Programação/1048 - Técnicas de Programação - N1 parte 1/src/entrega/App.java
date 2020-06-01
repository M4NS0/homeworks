package entrega;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);

	static int Escolha() {
		System.out.println("\n------------------\n");
		System.out.println(" 1 - Add Livro");
		System.out.println(" 2 - Add CD");
		System.out.println(" 3 - Add DVD");
		System.out.println(" 4 - Listar Produtos");
		System.out.println(" 9 - Sair");
		System.out.print("\n Escolha: ");
		int e = leia.nextInt();
		return e;
	}

	public static void main(String[] args) {
		List<Produto> livros = new ArrayList<Produto>();
		List<Produto> cds = new ArrayList<Produto>();
		List<Produto> dvds = new ArrayList<Produto>();
		List<Box> boxes = new ArrayList<Box>();
		int e = 0;

		do {
			switch (e = Escolha()) {
			case 1:
				System.out.print(" Digite o autor: ");
				String autor = leia.next();
				System.out.print(" Digite o numero de páginas: ");
				int paginas = leia.nextInt();
				System.out.print(" Digite o nome do livro: ");
				String nome1 = leia.next();
				System.out.print(" Digite o preço do livro: ");
				Double preco1 = leia.nextDouble();
				System.out.print(" Digite o status do livro: ");
				String status1 = leia.next();
				Livro l = new Livro(autor, paginas, nome1, preco1, status1);
				livros.add(l);
				break;
			case 2:
				System.out.print(" Digite o nome do cd: ");
				String nome2 = leia.next();
				System.out.print(" Digite o preço do cd: ");
				Double preco2 = leia.nextDouble();
				System.out.print(" Digite o status do cd: ");
				String status2 = leia.next();
				System.out.print(" Digite do Artista: ");
				String artista1 = leia.next();
				System.out.print(" Digite o numero de faixas: ");
				int faixa = leia.nextInt();
				CD c = new CD(nome2, preco2, status2, artista1, faixa);
				cds.add(c);
				break;
			case 3:
				System.out.println(" Quantos Box possui esse DVD? ");
				int b = leia.nextInt();
				Box bx = new Box(); 
				
				for (int i = 0; i < b; i++) {
					System.out.print(" Digite o nome do dvd: ");
					String nome = leia.next();
					System.out.print(" Digite o preço do dvd: ");
					Double preco = leia.nextDouble();
					System.out.print(" Digite o status do cd: ");
					String status = leia.next();
					System.out.print(" Digite do Artista: ");
					String artista = leia.next();
					System.out.print(" Digite a duração: ");
					int duracao = leia.nextInt();
					DVD dvd = new DVD(nome, preco, status, artista, duracao);
					dvds.add(dvd);
				}
				break;
			case 4:
				System.out.println(" --- Livros ---\n");
				
				for (int i = 0; i < livros.size(); i++) {
					System.out.println("Nome: " + livros.get(i).getNome());
					System.out.println("Preço: " + livros.get(i).getPreco());
					System.out.println("Status: " + livros.get(i).getStatus());
					System.out.println();

				}
				System.out.println(" --- CD's ---\n");
				for (int i = 0; i < cds.size(); i++) {
					System.out.println("Nome: " + cds.get(i).getNome());
					System.out.println("Preço: " + cds.get(i).getPreco());
					System.out.println("Status: " + cds.get(i).getStatus());
					System.out.println();

				}
				System.out.println(" --- DVD's ---\n");
				for (int i = 0; i < dvds.size(); i++) {
					System.out.println("Nome: " + dvds.get(i).getNome());
					System.out.println("Preço: " + dvds.get(i).getPreco());
					System.out.println("Status: " + dvds.get(i).getStatus());
					System.out.println();
				}
				break;
			case 9: 
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println(" Programa saindo.....Oremos!");
				System.exit(0);
				
				// professor a parte dos metodos gets (getLivro, getMidia...)  nao entendi como implementa.
				// foi o q deu pra fazer com o tempo :S
			}

		} while (e != 1 || e != 2 || e != 3 || e != 4 || e != 9);

	}

}
