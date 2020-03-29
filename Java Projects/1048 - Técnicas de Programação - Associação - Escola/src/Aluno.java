import java.util.ArrayList;

public class Aluno {
	private String nomeAluno;
	private String matricula;
	private ArrayList<String> listaJava = new ArrayList<String>();
	private ArrayList<String> listaAndroid = new ArrayList<String>();

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void adicionaJava() {
		listaJava.add(nomeAluno + " - " + matricula);

	}

	public void adicionaAndroid() {
		listaAndroid.add(nomeAluno + " - " + matricula);

	}

	public ArrayList<String> getListaJava() {
		return listaJava;
	}

	public ArrayList<String> getListaAndroid() {
		return listaAndroid;
	}

}
