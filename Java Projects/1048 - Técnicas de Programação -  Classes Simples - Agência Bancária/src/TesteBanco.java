import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBanco {
	static Scanner leia = new Scanner(System.in);

	private static void depositar(int cpf, float valor, List<ContaPoupanca> banco, int dia) {
		boolean found = false;
		for (int i = 0; i < banco.size(); i++) {

			if (banco.get(i).getCliente().getCpf() == cpf) {
				found = true;
			} else { System.out.println(" Cpf inválido!");
			
			}

			if (found == true) {
				banco.get(i).setDiaDeposito(dia);
				banco.get(i).setSaldo(banco.get(i).getSaldo() + valor);

			}

		}

	}

	public static void busca(int cpf, List<ContaPoupanca> banco) {
		boolean found = false;
		for (int i = 0; i < banco.size(); i++) {
			if (banco.get(i).getCliente().getCpf() == cpf) {
				found = true;

			} else {
				found = false;
				
			}
			if (found == true) {
				System.out.println("\n--------------");
				System.out.println(" Nome: " + banco.get(i).getCliente().getNome());
				System.out.println("  Cpf: " + banco.get(i).getCliente().getCpf());
				System.out.println("  Tel: " + banco.get(i).getCliente().getTelefone());
				System.out.println("  C/C: " + banco.get(i).getContaCorrente());
				System.out.println("   Ag: " + banco.get(i).getAgencia());
				System.out.println("saldo: " + banco.get(i).getSaldo());
				System.out.println("Dia D: " + banco.get(i).getDiaDeposito());
				System.out.println("Lucro: " + banco.get(i).verLucro(banco, cpf));

				System.out.println("--------------\n");
			} else {
				
				
			}

		}

	}

	public static void addCliente(List<ContaPoupanca> banco) {
		Cliente novo = new Cliente();
		ContaPoupanca cp = new ContaPoupanca();

		System.out.print(" Nome: ");
		novo.setNome(leia.next());
		System.out.print("  Cpf: ");
		novo.setCpf(leia.nextInt());
		System.out.print("  Tel: ");
		novo.setTelefone(leia.next());
		System.out.print("  Ag: ");
		cp.setAgencia(leia.nextInt());
		cp.setContaCorrente(Random());
		cp.setSaldo(0f);
		cp.setCliente(novo);
		banco.add(cp);

	}

	public static String Escolha() {
		String e;
		System.out.println("\n----- Área de Correntistas -----\n");
		System.out.print(" [A]diciona\n");
		System.out.print(" [B]usca cliente\n");
		System.out.print(" [D]epositar\n");
		System.out.print(" [S]air\n");
		System.out.print("\n Escolha: ");
		e = leia.next().toLowerCase();
		return e;

	}

	public static String Random() {
		int random1 = (int) Math.round(Math.random() * 100000);
		int random2 = (int) Math.round(Math.random() * 100);
		return random1 + "-" + random2;

	}

	public static void main(String[] args) {
		String e = "";
	

		List<ContaPoupanca> banco = new ArrayList<ContaPoupanca>();
		do {
			e = Escolha();
			switch (e) {
			case "a":
				addCliente(banco);
				break;
			case "b":
				System.out.print(" Digite o CPF a ser buscado: ");
				int cpf1 = leia.nextInt();
				busca(cpf1, banco);

				break;

			case "d":
				System.out.print(" Informe o Cpf: ");
				int cpf2 = leia.nextInt();
				System.out.print(" Informe o valor para depósito: ");
				float valor = leia.nextFloat();
				System.out.print(" Informe o dia :");
				depositar(cpf2, valor, banco, leia.nextInt());

				break;
			case "s":
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println("Go awaaaay!");
				System.exit(0);
			}

		} while (!e.equalsIgnoreCase("a") || !e.equalsIgnoreCase("b") || !e.equalsIgnoreCase("d")
				|| !e.equalsIgnoreCase("s"));

	}

}
