import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		System.out.println("\n --------------------------------------- \n" 
						+ " Imprimir lista de alunos (J)ava\n"
						+ " Imprimir lista de alunos (A)ndroid\n" 
						+ " Imprimir a lista (T)oda\n" 
						+ " Para (S)air\n"
						+ " Escolha J, A, T ou S:\n" + " ---------------------------------------\n");
		String e = leia.next();
		if (!e.equalsIgnoreCase("j") && !e.equalsIgnoreCase("a") && !e.equalsIgnoreCase("t") && !e.equalsIgnoreCase("s")) {
			System.out.println("\nOpção Inválida\nEscolha J, A, T ou S:");
		}
			
		return e;
	}

	public static void main(String[] args) {

		// configurando arrays de listas de alunos
		ArrayList<Aluno> listaJava = new ArrayList<Aluno>();
		ArrayList<Aluno> listaAndroid = new ArrayList<Aluno>();

		// configurando objetos e adicionando nas listas
		Aluno ana = new Aluno();
		ana.setNomeAluno("Ana");
		ana.setMatricula("1001");
		listaJava.add(ana);

		Aluno jose = new Aluno();
		jose.setNomeAluno("José");
		jose.setMatricula("1002");
		listaJava.add(jose);

		Aluno nelson = new Aluno();
		nelson.setNomeAluno("Nelson");
		nelson.setMatricula("1003");
		listaJava.add(nelson);

		Aluno jaqueline = new Aluno();
		jaqueline.setNomeAluno("Jaqueline");
		jaqueline.setMatricula("1004");
		listaJava.add(jaqueline);

		listaAndroid.add(ana);
		listaAndroid.add(jose);

		Aluno thais = new Aluno();
		thais.setNomeAluno("Thais");
		thais.setMatricula("1005");
		listaAndroid.add(thais);

		Aluno john = new Aluno();
		john.setNomeAluno("John");
		john.setMatricula("1006");
		listaAndroid.add(john);

		Curso java = new Curso();
		java.setNomeCurso("Curso Java");
		java.setCargaHoraria("30 horas");

		Curso android = new Curso();
		android.setNomeCurso("Curso Android");
		android.setCargaHoraria("20 horas");

		Instrutor instrutorJava = new Instrutor();
		instrutorJava.setNomeInstrutor("Felipe");

		Instrutor instrutorAndroid = new Instrutor();
		instrutorAndroid.setNomeInstrutor("Ivan");

		String e = "";

		do {
			e = Escolha().toLowerCase();
			switch (e) {
			case "j":
				System.out.println();
				System.out.println(java.getNomeCurso() + ", com carga horária de " + java.getCargaHoraria());
				for (int i = 0; i < listaJava.size(); i++) {
					System.out.println(listaJava.get(i).getNomeAluno() + " - " + listaJava.get(i).getMatricula());
				}
				System.out.println("Instrutor " + instrutorJava.getNomeInstrutor());
				break;
			case "a":
				System.out.println();
				System.out.println(android.getNomeCurso() + ", com carga horária de " + android.getCargaHoraria());
				for (int i = 0; i < listaAndroid.size(); i++) {
					System.out.println(listaAndroid.get(i).getNomeAluno() + " - " + listaAndroid.get(i).getMatricula());
				}
				System.out.println("Instrutor " + instrutorAndroid.getNomeInstrutor());
				break;
			case "t":
				System.out.println();
				System.out.println(java.getNomeCurso() + " e " + android.getNomeCurso());
				
				for (int i = 0; i < listaJava.size(); i++) {
					
					// imprime as duas listas retirando ocorrencias repetidas
					if (!listaJava.get(i).getNomeAluno().equals(listaAndroid.get(i).getNomeAluno())) {
						System.out.println(listaJava.get(i).getNomeAluno() + " - " + listaJava.get(i).getMatricula());
						System.out.println(	listaAndroid.get(i).getNomeAluno() + " - " + listaAndroid.get(i).getMatricula());
		
					} else {
					// imprime a listaAndroid inteira
						System.out.println(	listaAndroid.get(i).getNomeAluno() + " - " + listaAndroid.get(i).getMatricula());
					}
				}
				break;
				
			case "s":
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println("See you later aligator...");
				System.exit(0);

			}

		} while (!e.equalsIgnoreCase("j") || !e.equalsIgnoreCase("a") || !e.equalsIgnoreCase("s")|| !e.equalsIgnoreCase("t"));
	}
}
