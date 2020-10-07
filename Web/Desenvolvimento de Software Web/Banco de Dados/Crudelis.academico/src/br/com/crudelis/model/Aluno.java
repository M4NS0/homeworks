package br.com.crudelis.model;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	int registoDoAlunos;
	String curso;
	ArrayList<Disciplina> materias;

	public Aluno(String nome, String dataDeNascimento, String email, int registoDoAlunos, String curso, ArrayList<Disciplina> materias ) {
		super(nome, dataDeNascimento, email);
		this.registoDoAlunos = registoDoAlunos;
		this.curso = curso;
		this.materias = materias;
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