package banco;

/**
 *
 * @author Bruno C. Manso
 */
public class Teste {

	public static void main(String[] args) {
		operacoes();
	}

	public static void operacoes() {

		Banco b = new Banco();
		ContaCorrente cc = new ContaCorrente(1234, 0);
		b.inserir(cc);
		ContaPoupanca cp = new ContaPoupanca(5678, 0);
		b.inserir(cp);

		cp.depositar(1500);
		cc.depositar(1000);

		cp.sacar(2000);
		cc.sacar(2000);

		Relatorio r = new Relatorio();

		r.gerarRelatorio(cc);
		r.gerarRelatorio(cp);

		b.listar();
		
		int conta = 5678;
		System.out.println(" Conta encontrada: " + b.procura(conta).getNumerodaConta());
		
		if (b.remover(cp) == true) {
			System.out.println(" Conta removida: " + conta);
		}
		b.mostrarDados();

	}

}