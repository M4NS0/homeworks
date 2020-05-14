package tentativa;

public class Livro extends Produto {
	private String autor;
	private int paginas;

	public Livro(String autor, String nome, String status, int paginas, double preco) {
		super(nome, preco, status);
		this.autor = autor;
		this.paginas = paginas;

	}

	public void getLivro() {
		
		// nao esquecer do super.getAlgo() //
		
		System.out.println("   Nome: " + super.getNome());
		System.out.println("  Autor: " + autor);
		System.out.println("Páginas: " + paginas);
		System.out.println(" Status: " + super.getStatus());
		System.out.println("  Preço: " + super.getPreco() + "R$");
	}

}
