package br.com.crudelis.model;

public class Aluno extends Pessoa {

	int registoDoAlunos;
	String curso;

	public Aluno(String nome, String dataDeNascimento, String email, int registoDoAlunos, String curso) {
		super(nome, dataDeNascimento, email);
		this.registoDoAlunos = registoDoAlunos;
		this.curso = curso;
	}

	public int getRegistoDoAlunos() {
		return registoDoAlunos;
	}

	public void setRegistoDoAlunos(int registoDoAlunos) {
		this.registoDoAlunos = registoDoAlunos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}