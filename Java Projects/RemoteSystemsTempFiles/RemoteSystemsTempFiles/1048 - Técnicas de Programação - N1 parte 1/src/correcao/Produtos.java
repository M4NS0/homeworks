package correcao;
import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {

	public static void menu() {
		System.out.println("#########################");
		System.out.println("#  1-Add Livro          #");
		System.out.println("#  2-Add CD             #");
		System.out.println("#  3-Add DVD            #");
		System.out.println("#  4-Listar Produtos    #");
		System.out.println("#  9-Sair               #");
		System.out.println("#########################");
		System.out.print("Opcao: ");
	}

	public static void addLivro(ArrayList<Produto> livros) {
		Scanner sc = new Scanner(System.in);
		String nome, autor;
		double preco;
		String status;
		int paginas;

		System.out.println("Nome do livro:");
		nome = sc.next();
		System.out.println("Preço do livro:");
		preco = sc.nextDouble();
		System.out.println("Status do livro:");
		status = sc.next();
		System.out.println("Autor do livro:");
		autor = sc.next();
		System.out.println("Qtde de Páginas do livro:");
		paginas = sc.nextInt();
		Produto livro = new Livro(autor, paginas, nome, preco, status);
		livros.add(livro);

	}

	public static void addCD(ArrayList<Produto> cds) {
		Scanner sc = new Scanner(System.in);
		String nome, artista;
		double preco;
		String status;
		int faixas;

		System.out.println("Nome do CD:");
		nome = sc.next();
		System.out.println("Preço do CD:");
		preco = sc.nextDouble();
		System.out.println("Status do CD:");
		status = sc.next();
		System.out.println("Artista do CD:");
		artista = sc.next();
		System.out.println("Qtde de Faixas do CD:");
		faixas = sc.nextInt();
		Produto cd = new CD(faixas, artista, nome, preco, status);
		cds.add(cd);

	}

	public static void addDVD(ArrayList<Produto> dvds) {
		Scanner sc = new Scanner(System.in);
		String nome, artista;
		double preco;
		String status;
		int duracao, qtdeBoxes;
		ArrayList<Box> bxs = new ArrayList<Box>();

		System.out.println("Nome do DVD:");
		nome = sc.next();
		System.out.println("Preço do DVD:");
		preco = sc.nextDouble();
		System.out.println("Status do DVD:");
		status = sc.next();
		System.out.println("Artista do DVD:");
		artista = sc.next();
		System.out.println("Duracao do DVD:");
		duracao = sc.nextInt();
		System.out.println("São quantos BOXES?");
		qtdeBoxes = sc.nextInt();
		for (int i = 0; i < qtdeBoxes; i++) {
			Box caixa = new Box();
			System.out.print("Digite o nome do box " + (i + 1) + ":");
			caixa.setTitulo(sc.next());
			bxs.add(caixa);
		}
		Produto dvd = new DVD(duracao, artista, nome, preco, status, bxs);
		dvds.add(dvd);

	}

	public static void imprimirProdutos(ArrayList<Produto> livros, ArrayList<Produto> cds, ArrayList<Produto> dvds) {
		int i;
		//ArrayList<Box> bxs = new ArrayList<Box>();

		System.out.println("PRODUTOS:");
		if (!livros.isEmpty()) {
			System.out.println("LIVROS:");
			for (i = 0; i < livros.size(); i++) {
				Produto produto = new Produto();
				produto = livros.get(i);
				if (Livro.class.isInstance(produto)) {
					Livro livro = Livro.class.cast(produto);
					livro.getLivro();
				}
			}
		}
		if (!cds.isEmpty()) {
			System.out.println("CDS:");
			for (i = 0; i < cds.size(); i++) {
				Produto produto = new Produto();
				produto = cds.get(i);
				if (CD.class.isInstance(produto)) {
					CD cd = CD.class.cast(produto);
					cd.getCD();
				}
			}
		}
		if (!dvds.isEmpty()) {
			System.out.println("DVDS:");
			for (i = 0; i < dvds.size(); i++) {
				Produto produto = new Produto();
				produto = dvds.get(i);
				if (DVD.class.isInstance(produto)) {
					DVD dvd = DVD.class.cast(produto);
					dvd.getDVD();

				}
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Produto> livros = new ArrayList<Produto>();
		ArrayList<Produto> cds = new ArrayList<Produto>();
		ArrayList<Produto> dvds = new ArrayList<Produto>();

		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 9) {
			menu();
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				addLivro(livros);
				break;
			case 2:
				addCD(cds);
				break;
			case 3:
				addDVD(dvds);
				break;
			case 4:
				imprimirProdutos(livros, cds, dvds);
				break;
			}

		}
	}

}
