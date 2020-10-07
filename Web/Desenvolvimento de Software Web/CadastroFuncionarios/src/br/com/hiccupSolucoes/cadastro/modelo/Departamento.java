package br.com.hiccupSolucoes.cadastro.modelo;

public class Departamento {
	String nomeDepartamento;
	Cargo nomeCargo;
	Funcionario dadosPessoa;
	
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public Cargo getNomeCargo() {
		return nomeCargo;
	}
	public void setNomeCargo(Cargo nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	public Funcionario getDadosPessoa() {
		return dadosPessoa;
	}
	public void setDadosPessoa(Funcionario dadosPessoa) {
		this.dadosPessoa = dadosPessoa;
	}

	

}
