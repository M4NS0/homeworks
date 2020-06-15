package banco;

import java.util.Scanner;

public class Programa {

	public static Scanner leia = new Scanner(System.in);

	private static String Tratamento(String m, String[] letras) {
		try {
			Character caractere = m.charAt(0);

			if (Character.isDigit(caractere)) {
				throw new Exception("\nNão pode conter números\n");
				
			}
				
				

			String aux = null;
			for (int i = 0; i < letras.length; i++) {
				if (m.equalsIgnoreCase(letras[i])) {
					aux = letras[i];
					return aux;
				} else {
					aux = null;
				}
			}
			if (aux == null)
				throw new Exception("\nLetra não existe no menu\n");

		} catch (Exception e) {
			System.out.println();
			System.err.println(e);
			System.out.println();
		}
		return m;
	}

	private static String Menu3(String[] letras) {
		System.out.println(" [P]oupança");
		System.out.println(" [C]onta corrente");
		System.out.print("\n Escolha:");
		String e = leia.next();
		return Tratamento(e, letras);
		
	}
	
	private static String Menu2(String[] escolhas) {
		
		System.out.print(" [S]im" + "\n [N]ão" + "\n\n Escolha:");
		String e = leia.next().toLowerCase();
		return Tratamento(e, escolhas);
	}

	public static String Menu1(String[] letras) {
		String m = "";

		System.out.println(" [I]nserir nova Conta");
		System.out.println(" [D]epositar");
		System.out.println(" [S]acar");
		System.out.println(" [R]emover conta");
		System.out.println(" [L]istar contas");
		System.out.println(" [V]isualizar contas");
		System.out.println(" [T]erminar");
		System.out.print("\n Escolha: ");

		m = leia.next().toLowerCase();
		return Tratamento(m, letras);

	}

	public static void main(String[] args) {
		Relatorio r = new Relatorio();
		Banco b = new Banco();
		String m = "";
		String[] letras = { "i", "d", "s", "r", "l", "v", "t" };

		do {

			m = Menu1(letras);
			ContaCorrente cc = null;
			ContaPoupanca cp = null;
			switch (m) {

			case "i":

				System.out.print(" Digite o número da nova conta: ");
				cc = new ContaCorrente(leia.nextInt(), 0);
				b.inserir(cc);
				r.gerarRelatorio(cc);
				System.out.println(" Além da conta corrente, deseja criar uma conta poupança?");
				String[] escolhas = { "s", "n" };
				if (Menu2(escolhas) == "s") {
					System.out.print(" Digite o número da nova conta: ");
					cp = new ContaPoupanca(leia.nextInt(), 0);
					b.inserir(cp);
					r.gerarRelatorio(cp);
				} else
				break;
				
			case "d":
				String[] escolha = { "p", "c" };
				String e;
				System.out.println(" Deseja depositar em uma conta Corrente ou conta Poupança?");
				switch (e = Menu3(escolha)) {
				case "p":
					System.out.print(" Digite o numero da conta poupança: ");
					cp.setNumerodaConta(leia.nextInt());
					System.out.print(" Digite o valor a ser depositado:");
					cp.depositar(leia.nextDouble());
					break;
				case "c":
					System.out.print(" Digite o numero da conta corrente: ");
					cc.setNumerodaConta(leia.nextInt());
					System.out.print(" Digite o valor a ser depositado:");
					cc.depositar(leia.nextDouble());
					break;				
				}
				break;
			case "s":
				break;
			case "r":
				break;
			case "l":
				System.out.println(" - Contas - ");
				b.listar();
				System.out.println();
				break;
			case "v":
				b.mostrarDados();
				
				break;
			case "t":
				System.exit(0);
			}

		} while (m != "t");

	}

	

}
