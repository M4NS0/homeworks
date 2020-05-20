import java.util.ArrayList;

public class Aluno {
	private String nomeAluno;
	private ArrayList<Materia> materias;
	
	public Aluno(String nome,ArrayList<Materia> materias) {
		this.nomeAluno = nome;
		this.materias = materias;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}
	
}
