package alunoseMestres;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author japa
 */
public class Alunos extends Pessoas {
	private int matricula;

	public Alunos(int matricula, String nome, int idade) {
		super(nome, idade);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
