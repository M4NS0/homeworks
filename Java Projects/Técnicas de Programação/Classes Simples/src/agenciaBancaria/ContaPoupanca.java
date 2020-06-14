package agenciaBancaria;
import java.util.List;

public class ContaPoupanca extends Conta {
	private int diaDeposito;
	private Cliente cliente;

	public float verLucro(List<ContaPoupanca> conta,int cpf) {
		if (diaDeposito != 0) {
			return  (diaDeposito*(6.16f/12) + Saldo(conta,cpf));
			// Rendimento anual da poupança 6.16%
		}
		return 0;

	}

	private float Saldo(List<ContaPoupanca> conta,int cpf) {
		for (int i = 0; i < conta.size(); i++) {
			if (conta.get(i).getCliente().getCpf() == cpf) {
				return conta.get(i).getSaldo();
			}
			
		}
		
		return 0;
	}

	public int getDiaDeposito() {
		return diaDeposito;
	}

	public void setDiaDeposito(int diaDeposito) {
		this.diaDeposito = diaDeposito;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
