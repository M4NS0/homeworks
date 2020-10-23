package br.com.funcionarios.modelo;

public class Funcionario {
	private int funcionarioId;
	private String nomeFuncionario;
	private String cpf;
	private String nascimento;
	private Double salario;
	private Departamento departamento;
	private Cargo cargo;

	private String mensagem;
	private int controle;

	public int getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(int funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getControle() {
		return controle;
	}

	public void setControle(int controle) {
		this.controle = controle;
	}

	@Override
	public String toString() {
		return "Funcionario [funcionarioId=" + funcionarioId + ", nomeFuncionario=" + nomeFuncionario + ", cpf=" + cpf
				+ ", nascimento=" + nascimento + ", salario=" + salario + ", departamento=" + departamento + ", cargo="
				+ cargo + ", mensagem=" + mensagem + ", controle=" + controle + "]";
	}

}
