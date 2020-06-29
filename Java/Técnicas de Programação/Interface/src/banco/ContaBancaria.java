package banco;

public abstract class ContaBancaria {
	int numerodaConta;
	double saldo;

	public ContaBancaria(int numerodaConta, double saldo) {
		this.numerodaConta = numerodaConta;
		this.saldo = saldo;
	}
	
	abstract void sacar(double valor);
	abstract void depositar(double valor);

	public int getNumerodaConta() {
		return numerodaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumerodaConta(int numerodaConta) {
		this.numerodaConta = numerodaConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void transferir(double valor, ContaBancaria conta) {
		if(this instanceof ContaCorrente) {
			ContaCorrente cc = ((ContaCorrente)this);
			boolean condicao = (this.getSaldo() - valor - cc.getTaxadeOperacao() > 0);
			
			if (condicao) {
				cc.sacar(valor);
				conta.depositar(valor);
			}
		} else {
			ContaPoupanca cp = ((ContaPoupanca)this);
			 boolean condicao = (cp.getSaldo()-valor) >= cp.getLimite();
	            if(condicao){
	                cp.sacar(valor);
	                conta.depositar(valor);                 
	            }
	        	
		}
	}
	
}
