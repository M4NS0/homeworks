
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
	public static Scanner leia = new Scanner(System.in);

	static public int menu() {
		int n = 0;
		n = Integer.parseInt(JOptionPane
				.showInputDialog("\n1- Enfileirar\n2- Desenfileirar\n0- Sair\n\\nDigite:"));
		return n;
	}

	public static void main(String[] args) {

		Fila fila = new Fila();
		int n = 0;

		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(
					"\nPara definir o tamanho da lista, \ndigite número inteiro maior que 2 e menor que 60"));
		} while (fila.setTamanho(n) == false);
		n = menu();

		Pessoa nova = null;
		String lista[] = { "" };
		switch (n) {

		case 1:
			nova = obtemPessoa();
			if (fila.enfileirar(nova) == true) {
				JOptionPane.showMessageDialog(null, "Sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Insucesso! 1");
			}
			break;
			

			
		case 2:
			if ((nova = fila.desenfileirar()) == null) {
				JOptionPane.showMessageDialog(null, "Insucesso! 2");
			} else {
				JOptionPane.showMessageDialog(null, nova.getPessoa());
			}
			
			break;
			
		case 0:
			JOptionPane.showMessageDialog(null, "Terminado!");
			break;
			
		}
		menu();
	}

	private static Pessoa obtemPessoa() {

		Pessoa p1 = new Pessoa();
		String lista = "";
		String nome = JOptionPane.showInputDialog("\nDigite o nome: \n");
		String matricula = JOptionPane.showInputDialog("\nDigite a matricula: \n");
		String telefone = JOptionPane.showInputDialog("\nDigite o telefone: \n");

		p1.setNome(nome);
		p1.setMatricula(matricula);
		p1.setTelefone(telefone);
		
		return p1;

	}
}
