package br.com.crudelis.model;

import java.util.Date;

public class Funcionario extends Pessoa {

	int cnh;
	String cargo;

	public Funcionario(String nome, Date dataDeNascimento, String email, int cnh, String cargo) {
		super(nome, dataDeNascimento, email);
		this.cnh = cnh;
		this.cargo = cargo;
	}

	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}