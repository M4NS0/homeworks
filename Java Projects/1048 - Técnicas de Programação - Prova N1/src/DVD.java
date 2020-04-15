import java.util.ArrayList;

public class DVD extends Midia {
	private int duracao;
	ArrayList<Box> lista = new ArrayList<Box>();
	
	protected DVD(String nome, Double preco, String status, String artista, int duracao) {
		super(nome, preco, status, artista);
		this.duracao = duracao;
		//this.lista = lista;
	}
	protected void getDVD() {
		System.out.println("Duração: "  + duracao);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(" " +lista.get(i).getTitulo());
			
		}
		
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public ArrayList<Box> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Box> lista) {
		this.lista = lista;
	}
	

}
