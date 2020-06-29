
public class Livro {
	private String autor;
	private String editora;
	private String titulo;

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getLivro() {
		return (titulo + "\n" + autor + "\n" + editora + "\n");
	}
	
}
