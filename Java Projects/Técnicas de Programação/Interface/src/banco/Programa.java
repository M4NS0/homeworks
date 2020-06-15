package banco;

import java.util.Scanner;

public class Programa {

	public static Scanner leia = new Scanner(System.in);

	public static String Menu1(String[] letras) {
		String m = "";

		try {
			
			
			System.out.println(" [I]nserir nova Conta");
			System.out.println(" [D]epositar");
			System.out.println(" [S]acar");
			System.out.println(" [R]emover conta");
			System.out.println(" [L]istar contas");
			System.out.println(" [M]ostrar dados");
			System.out.println(" [T]erminar");
			System.out.print("\n Escolha: ");
			
			m = leia.next().toLowerCase();
			Character caractere = m.charAt(0);
	
			if (Character.isDigit(caractere))
				throw new Exception("\nNão pode conter números\n");
			
			String aux = null;
			for (int i = 0; i < letras.length; i++) {
				if(m.equalsIgnoreCase(letras[i])) {
					aux = letras[i];
					return aux;
				} else {
					aux = null;
				}				
			}
			if (aux == null) throw new Exception("\nLetra não existe no menu\n");
			
		} catch (Exception e) {
			System.out.println();
			System.err.println(e);
			System.out.println();
		}

		return m;

	}

	public static void main(String[] args) {

		String m = "";
		String[] letras = { "i", "d", "s", "r", "l", "m", "t" };


		do {
			
			m = Menu1(letras);
			switch (m) {
			case "i":
				break;
			case "d":
				break;
			case "s":
				break;
			case "r":
				break;
			case "l":
				break;
			case "m":
				break;
			case "t":
				System.exit(0);
			}

		} while (m != "t");

	}
}
