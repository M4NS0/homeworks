package br.com.crudelis.model;

import java.util.Date;

public class Pessoa {

	String nome;
	String dataDeNascimento;
	String email;

	public Pessoa(String nome, String dataDeNascimento, String email) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}