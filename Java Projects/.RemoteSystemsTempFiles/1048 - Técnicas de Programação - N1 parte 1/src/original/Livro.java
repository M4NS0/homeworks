package original;


public class Livro extends Produto {
	private String autor;
	private int paginas;
	
	public Livro(String autor, int paginas, String nome, Double preco, String status) {
		super(nome, preco, status);
		this.autor = autor;
		this.paginas = paginas;
	}
	public void getLivro() {
		System.out.println(" Autor: " + autor);
		System.out.println(" Paginas: " + paginas);
		
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
}
