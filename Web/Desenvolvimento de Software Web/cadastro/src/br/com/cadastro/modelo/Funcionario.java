package br.com.cadastro.modelo;

public class Funcionario {
	String nome;
	String cpf;
	String nascimento;
	Double salario;
	Cargo cargo;
	Departamento departamento;
	private int controle;
	String memsagem;

	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, String nascimento, Double salario, Cargo cargo, Departamento dep) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.salario = salario;
		this.cargo = cargo;
		this.departamento = dep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	public String getMensagem() {
		return memsagem;
	}

	public void setMensagem(String memsagem) {
		this.memsagem = memsagem;
	}

	public int getControle() {
		return controle;
	}
	
	public void setControle(int controle) {
		this.controle = controle;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", salario=" + salario
				+ ", cargo=" + cargo + ", dep=" + departamento + "]";
	}
}
