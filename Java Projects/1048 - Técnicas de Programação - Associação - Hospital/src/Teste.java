import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		System.out.println("\n-----------------------\n" 
							+ "(I)nserir paciente\n" 
							+ "(L)istar pacientes\n"
							+ "(S)air\n" 
							+ "----------------------\n");
		String escolha = leia.next();
		return escolha;
	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital("Albert Einstein");
		ArrayList<Paciente> lista = new ArrayList<Paciente>();
		String e = "";

		do {
			e = Escolha().toLowerCase();
			switch (e) {
			case "i":
				System.out.println("Insira o nome do paciente: ");
				String n = leia.next();
				System.out.println("Insira a doença de " + n);
				String d = leia.next();
				Paciente paciente = new Paciente(n, d);
				lista.add(paciente);
				break;
			
			case "l": 
				System.out.println("---- Hospital " + hospital.getNomeHosp() + " ----");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println(lista.get(i).getNomePac() + " - " + lista.get(i).getDoenca());
					
				}
			case "s":
				for (int i = 0; i < 100; i++) {
					System.out.println();
					
				}
				System.out.println("Hasta la vista....");
				System.exit(0);
			}	

		} while (!e.equalsIgnoreCase("i") || !e.equalsIgnoreCase("l") || !e.equalsIgnoreCase("s"));

	}

}
