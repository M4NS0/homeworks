import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		System.out.println("######################");
		System.out.println("# [C]adastrar Doutor #");
		System.out.println("# [A]gendar          #");
		System.out.println("# [V]er Agenda       #");
		System.out.println("# [S]air             #");
		System.out.println("######################");
		System.out.print("   Escolha:");
		String e = leia.next();
		return e;

	}

	public static void main(String[] args) {
		Funcionario medico = null;
		Funcionario psicologo = null;

		ArrayList<Consulta> agendaMedico = new ArrayList<Consulta>();
		ArrayList<Consulta> agendaPsicologo = new ArrayList<Consulta>();
		ArrayList<Funcionario> medicos = new ArrayList<Funcionario>();
		ArrayList<Funcionario> psicologos = new ArrayList<Funcionario>();
		String e = "";

		do {
			switch (e = Escolha().toLowerCase()) {
			case "c":
				System.out.print("Deseja cadastrar um [M]édico ou um [P]sicologo?");
				String escolha1 = leia.next();
				if (escolha1.equalsIgnoreCase("m")) {
					AddMedico(medico, psicologos);
				}
				if (escolha1.equalsIgnoreCase("p")) {
					AddPsicologo(psicologo, psicologos);

				}
				break;
			case "a":
				System.out.print("Deseja agendar consulta para um [M]édico ou um [P]sicologo?");
				String escolha2 = leia.next();
				if (escolha2.equalsIgnoreCase("m")) {
					AddAgendaMedico(agendaMedico);
				}
				if (escolha2.equalsIgnoreCase("p")) {
					AddAgendaPsicologo(agendaPsicologo);

				}
				break;
			case "v":
				VerLista(medicos, agendaMedico, psicologos, agendaPsicologo);
				break;
			case "s":
				System.exit(0);

			}
		} while (!e.equalsIgnoreCase("c") || !e.equalsIgnoreCase("a") || !e.equalsIgnoreCase("v")
				|| !e.equalsIgnoreCase("s"));

	}

	private static void VerLista(ArrayList<Funcionario> medicos, ArrayList<Consulta> agendaMedico, ArrayList<Funcionario>  psicologos, ArrayList<Consulta> agendaPsicologo) {
		System.out.println("\n######## Agenda do Médico ########\n");
		for (int i = 0; i < medicos.size(); i++) {
			System.out.println(medicos.get(i).getNome());
			System.out.println(medicos.get(i).getCodigo());
			
		}
	
		
		if (agendaMedico.isEmpty()) {
			System.out.println(" -- vazio -- ");
		} else {
			for (int i = 0; i < agendaMedico.size(); i++) {
				Consulta consulta = new Consulta();
				consulta = agendaMedico.get(i);
				

				if (Consulta.class.isInstance(consulta)) {
					Consulta med = Consulta.class.cast(consulta);
					System.out.println(med.getPaciente());
					System.out.println(med.getHora());
				}

			}
		}
		System.out.println("\n######## Agenda do Psicólogo ########\n");
		for (int j = 0; j < psicologos.size(); j++) {
			System.out.println(psicologos.get(j).getNome());
			System.out.println(psicologos.get(j).getCodigo());
			
		}
	
		if (agendaPsicologo.isEmpty()) {
			System.out.println(" -- vazio -- ");
		} else {
			for (int i = 0; i < agendaPsicologo.size(); i++) {
				Consulta consulta = new Consulta();
				consulta = agendaPsicologo.get(i);

				if (Consulta.class.isInstance(consulta)) {
					Consulta psi = Consulta.class.cast(consulta);
					System.out.println(psi.getPaciente());
					System.out.println(psi.getHora());
				}

			}
		}

	}

	private static void AddAgendaPsicologo(ArrayList<Consulta> agendaPsicologo) {
		System.out.print("Digite o nome do paciente: ");
		String paciente = leia.next();
		System.out.print("Digite o horário de consulta: ");
		String hora = leia.next();
		Consulta c1 = new Consulta(paciente, hora);
		agendaPsicologo.add(c1);

	}

	private static void AddAgendaMedico(ArrayList<Consulta> agendaMedico) {
		System.out.print("Digite o nome do paciente: ");
		String paciente = leia.next();
		System.out.print("Digite o horário de consulta: ");
		String hora = leia.next();
		Consulta c1 = new Consulta(paciente, hora);
		agendaMedico.add(c1);

	}

	private static void AddPsicologo(Funcionario psicologo,ArrayList<Funcionario> psicologos ) {
		System.out.print("Digite o nome do Psicólogo: ");
		String nome = leia.next();
		System.out.print("Digite o CRP: ");
		String codigo = leia.next();
		psicologo = new Funcionario(nome, codigo);
		psicologos.add(psicologo);
		
		

	}

	private static void AddMedico(Funcionario medico,ArrayList<Funcionario> medicos) {
		System.out.print("Digite o nome do Médico: ");
		String nome = leia.next();
		System.out.print("Digite o CRM: ");
		String codigo = leia.next();
		medico = new Funcionario(nome, codigo);
		medicos.add(medico);

	}

}
