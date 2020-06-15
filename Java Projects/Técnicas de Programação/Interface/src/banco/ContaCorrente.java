package banco;


/**
*
* @author Bruno C. Manso
* @see ContaBancaria
* @see Imprimivel
* Sub-classe da classe ContaBancaria que implementa a interface imprimivel
* 
*/

public class ContaCorrente extends ContaBancaria implements Imprimivel {
	private double taxadeOperacao = 0.50;

	public ContaCorrente(int numerodaConta, double saldo) {
		super(numerodaConta, saldo);

	}

	

	@Override
	void sacar(double valor) {
		System.out.println(" - Saques na conta corrente - ");
		if (super.getSaldo() > (valor + taxadeOperacao)) {
			super.setSaldo(super.getSaldo() - valor - taxadeOperacao);
			System.out.println(" Valor sacado menos taxas: " + (valor - this.taxadeOperacao)+ "R$");

		} else{ 
			System.out.println(" Não há Saldo");
			System.out.println(" Disponível: " + (super.getSaldo()) );
		}
		System.out.println();


	}

	@Override
	void depositar(double valor) {
		this.saldo += valor - (valor * this.taxadeOperacao);
		System.out.println(" - Deposito na conta corrente - ");
		System.out.println(" Valor de " + valor + "R$ depositado com sucesso ");
		System.out.println();


	}
	
	@Override
	public void mostrarDados() {
		System.out.println(" ---------------------------------------");
		System.out.println("        Número da C.C: " + super.getNumerodaConta());
		System.out.println("                Saldo: " + super.getSaldo() + "R$");
		System.out.println("     Taxa de Operação: " + this.taxadeOperacao);
		System.out.println(" ---------------------------------------");
	

	}



	public double getTaxadeOperacao() {
		return taxadeOperacao;
	}

	

}
