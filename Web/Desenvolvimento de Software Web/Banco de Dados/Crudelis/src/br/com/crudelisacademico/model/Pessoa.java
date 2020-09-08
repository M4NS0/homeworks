package br.com.crudelisacademico.model;

import java.util.Date;

public class Pessoa {

	String nome;
	Date dataDeNascimento;
	String email;

	public Pessoa(String nome, Date dataDeNascimento, String email) {
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

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}