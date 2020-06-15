package banco;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
	private final double limite = -100;

	public ContaPoupanca(int numerodaConta, double saldo) {
		super(numerodaConta, saldo);

	}

	@Override
	void sacar(double valor) {
		System.out.println(" - Saques na poupança - ");
		if (valor > (super.getSaldo() + limite)) {
			System.out.println(" O Limite foi ultrapassado ");
			System.out.println(" Disponível: " + (super.getSaldo() + limite) +"R$" );

		} else {
			super.setSaldo(super.getSaldo() - valor);
			System.out.println(" Valor de " + valor + " sacado ");
		}
		System.out.println();

	}

	@Override
	void depositar(double valor) {
		System.out.println(" - Depositos na poupança - ");
		super.setSaldo(super.getSaldo() + valor);
		System.out.println(" Valor de " + valor + " depositado \n ");

	}

	@Override
	public void mostrarDados() {
		System.out.println(" ---------------------------------------");
		System.out.println("        Numero da C.P: " + super.getNumerodaConta());
		System.out.println("                Saldo: " + this.saldo + "R$");
		System.out.println(" Limite para retirada: " + this.limite + "R$");
		System.out.println("      Retirada máxima: " + (this.saldo + this.limite) + "R$");
		System.out.println(" ---------------------------------------");

	}

	public double getLimite() {
		return limite;
	}

}
