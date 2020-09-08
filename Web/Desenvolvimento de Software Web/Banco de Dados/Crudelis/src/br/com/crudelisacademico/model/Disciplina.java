package br.com.crudelisacademico.model;

public class Disciplina {

	String curso;
	String nome;
	int cid;

	public Disciplina(String curso, String nome, int cid) {
		super();
		this.curso = curso;
		this.nome = nome;
		this.cid = cid;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
}