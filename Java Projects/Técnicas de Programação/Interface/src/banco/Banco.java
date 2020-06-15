package banco;

import java.util.ArrayList;

public class Banco implements Imprimivel {
	private ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
	int totalContas = contas.size();

	public Banco() {

	}

	public void inserir(ContaBancaria conta) {
		contas.add(conta);
		System.out.println(" Conta adicionada com sucesso \n" + " O seu número de conta é:" + conta.getNumerodaConta() + "\n");
	}

	public boolean remover(ContaBancaria conta) {
		contas.remove(conta);
		return true;

	}

	public void listar() {
		int i = 0;
		for (ContaBancaria contaBancaria : contas) {
			System.out.println(" Conta " + i + " - " + contaBancaria.getNumerodaConta());
			i++;
		}
	}

	public ContaBancaria procura(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumerodaConta() == numero)
				return contas.get(i);

		}
		return null;

	}

	@Override
	public void mostrarDados() {
		for (ContaBancaria n : contas) {
			if(n instanceof ContaCorrente) {
				((ContaCorrente) n).mostrarDados();
			} else {
				 ((ContaPoupanca)n).mostrarDados();
			}	
		}
	}

	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}

}
