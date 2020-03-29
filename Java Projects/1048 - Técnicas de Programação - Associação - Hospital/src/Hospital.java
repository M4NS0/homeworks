import java.util.ArrayList;

public class Hospital {
	private String nomeHosp;
	private ArrayList<String> lista;
	

	public Hospital(String nome) {
		this.nomeHosp = nome;
		this.lista = new ArrayList<String>();

	}

	public String getNomeHosp() {
		return nomeHosp;
	}

	public void setNomeHosp(String nomeHosp) {
		this.nomeHosp = nomeHosp;
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	public void adicionaLista(String nome, String doen) {
		lista.add(nome + " - " + doen);
		

	}
}
