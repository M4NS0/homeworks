package Trabalhadores;

public class TesteTrabalhadores {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("João", 33, "Masculino");
		Empregado empregado = new Empregado("Ana", 21, "Feminino", 5000.00, "1400");
		Cliente cliente = new Cliente("Almir", 40, "Masculino", 2000.00, 1976);
		Gerente gerente = new Gerente("Tania", 30, "-", 15000.00, "1300", "Atendimento");
		Vendedor vendedor = new Vendedor("Igor", 0, "-", 7000.00, "-", 14000.00, 120);
		
		System.out.println("\n---------------------\n");
		pessoa.imprimePessoa();
		System.out.println("\n---------------------\n");
		empregado.imprimeEmpregado();
		System.out.println("Valor Inss: " + empregado.valorInss());
		System.out.println("\n---------------------\n");
		cliente.imprimeCliente();
		System.out.println("\n---------------------\n");
		gerente.imprimeGerente();
		System.out.println("Valor Inss: " + gerente.valorInss());
		System.out.println("\n---------------------\n");
		vendedor.imprimeVendedor();
		System.out.println("\n---------------------\n");
	}
}
