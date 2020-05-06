package tentativa;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);

	public static void Escolha() {
		System.out.println("\n----- Menu -----\n");
		System.out.println(" add [L]ivro");
		System.out.println(" add [C]D");
		System.out.println(" add [D]VD");
		System.out.println("     [V]er");
		System.out.println("     [S]air");
		System.out.println("\n----------------");
		System.out.print("\n Escolha: ");
	
	}

	public static void main(String[] args) {

		ArrayList<Produto> livros = new ArrayList<Produto>();
		ArrayList<Produto> cds = new ArrayList<Produto>();
		ArrayList<Produto> dvds = new ArrayList<Produto>();
		String e = "";

		do {
			Escolha();
			e = leia.next();
			switch (e.toLowerCase()) {
			case "l":
				addLivro(livros);
				break;
			case "c":
				addCD(cds);
				break;
			case "d":
				addDVD(dvds);
				break;
			case "v":
				verListas(livros, cds, dvds);
				break;
			case "s" : 
				System.out.println("-- Finalizado! -- ");
				System.exit(0);
			}

		} while (!e.equalsIgnoreCase("l") ||!e.equalsIgnoreCase("c")|| !e.equalsIgnoreCase("d")|| !e.equalsIgnoreCase("v")|| !e.equalsIgnoreCase("s"));
		
	}

	private static void addLivro(ArrayList<Produto> livros) {
		System.out.println("\n---- Cadastro ----\n");
		System.out.print("   Autor: ");
		String autor = leia.next();
		System.out.print("    Nome: ");
		String nome = leia.next();
		System.out.print("  Status: ");
		String status = leia.next();
		System.out.print(" Páginas: ");
		int paginas = leia.nextInt();
		System.out.print("   Preço: ");
		int preco = leia.nextInt();
		Livro livro = new Livro(autor, nome, status, paginas, preco);
		livros.add(livro);

	}

	private static void addCD(ArrayList<Produto> cds) {
		System.out.println("\n---- Cadastro ----\n");
		System.out.print(" Artista: ");
		String artista = leia.next();
		System.out.print("    Nome: ");
		String nome = leia.next();
		System.out.print("   Preço: ");
		int preco = leia.nextInt();
		System.out.print("  Status: ");
		String status = leia.next();
		System.out.print("  Faixas: ");
		int faixas = leia.nextInt();

		CD cd = new CD(artista, nome, preco, status, faixas);
		cds.add(cd);

	}

	private static void addDVD(ArrayList<Produto> dvds) {
		System.out.println("\n---- Cadastro ----\n");
		System.out.print("    Artista: ");
		String artista = leia.next();
		System.out.print("       Nome: ");
		String nome = leia.next();
		System.out.print("      Preço: ");
		int preco = leia.nextInt();
		System.out.print("     Status: ");
		String status = leia.next();
		System.out.print("    Duração: ");
		int duracao = leia.nextInt();
		System.out.println("Qt. Boxes: ");
		int qt = leia.nextInt();
		ArrayList<Box> boxes = new ArrayList<Box>();
		System.out.print(" Título: ");
		for (int i = 0; i < qt; i++) {
			Box caixa = new Box();
			System.out.print((i + 1) + "o Box: ");
			caixa.setTitulo(leia.next());
			boxes.add(caixa);

		}
		DVD listaDvds = new DVD(artista, nome, preco, status, duracao, boxes);
		dvds.add(listaDvds);

	}

	private static void verListas(ArrayList<Produto> livros, ArrayList<Produto> cds, ArrayList<Produto> dvds) {
		System.out.println("\n----- Lista de Produtos da Loja -----");
		System.out.println(" Livros: ");
		if (livros.isEmpty()) {
			System.out.println(" -- Nenhum livro cadastrado ainda -- ");
		} else {
			
			// Parte sobre downcasting //
			
			for (int i = 0; i < livros.size(); i++) {
				Produto produto = new Produto();
				produto = livros.get(i);
				if (Livro.class.isInstance(produto)) { 			// se livro for uma instancia de produtos
					Livro livro = Livro.class.cast(produto);	
					livro.getLivro();
				}
			}
		}
		
		System.out.println(" CDS: ");
		if (cds.isEmpty()) {
			System.out.println(" -- Nenhum CD cadastrado ainda -- ");

		} else {
			
			// Parte sobre downcasting //
			
			for (int i = 0; i < cds.size(); i++) {
				Produto produto = new Produto();
				produto = cds.get(i);
				if (CD.class.isInstance(produto)) {
					CD cedes = CD.class.cast(produto);
					cedes.getCD();
				}
			}
		}

		System.out.println(" DVDS: ");
		if (dvds.isEmpty()) {
			System.out.println(" -- Nenhum DVD cadastrado ainda -- ");
		} else {
			
			// Parte sobre downcasting //
			
			for (int i = 0; i < dvds.size(); i++) {
				Produto produto = new Produto();
				produto = dvds.get(i);
				if (DVD.class.isInstance(produto)) {
					DVD dvd = DVD.class.cast(produto);
					dvd.getDVD();
				}
			}
		}
	}
}
