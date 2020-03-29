import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static String Escolha() {
		System.out.println("\n---------------------------------\n" 
				+ "(A)diciona Aluno\n" 
				+ "(V)isualizar Turmas\n"
				+ "(S)air" + "\n---------------------------------\n");

		String e = leia.next();
		return e;
	}

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Curso cursoJava = new Curso();
		cursoJava.setNomeCurso("Java");
		cursoJava.setCargaHoraria("30h");
		Instrutor instrutorJava = new Instrutor();
		instrutorJava.setNomeInstrutor("Felipe");

		Curso cursoAndroid = new Curso();
		cursoAndroid.setNomeCurso("Android");
		cursoAndroid.setCargaHoraria("20h");
		Instrutor instrutorAndroid = new Instrutor();
		instrutorAndroid.setNomeInstrutor("Ivan");

		String e = "";
		do {
			e = Escolha().toLowerCase();
			switch (e) {
			case "a":
				System.out.println("\n---------------------------------\n" 
								+ "Deseja inserir aluno em qual Turma?\n"
								+ "(J)ava\n" + "(A)ndroid\n" 
								+ "(T)odas" + "\n---------------------------------\n");
				
				String e2 = leia.next();

				if (e2.equalsIgnoreCase("J")) {
					System.out.println("Digite o nome do Aluno: ");
					String nome = leia.next();
					aluno.setNomeAluno(nome);
					System.out.println("Digite o número da matrícula: ");
					String matricula = leia.next();
					aluno.setMatricula(matricula);
					aluno.adicionaJava();
				}
				if (e2.equalsIgnoreCase("a")) {
					System.out.println("Digite o nome do Aluno: ");
					String nome = leia.next();
					aluno.setNomeAluno(nome);
					System.out.println("Digite o número da matrícula: ");
					String matricula = leia.next();
					aluno.setMatricula(matricula);

					aluno.adicionaAndroid();
				}
				if (e2.equalsIgnoreCase("t")) {
					System.out.println("Digite o nome do Aluno: ");
					String nome = leia.next();
					aluno.setNomeAluno(nome);
					System.out.println("Digite o número da matrícula: ");
					String matricula = leia.next();
					aluno.setMatricula(matricula);
					aluno.adicionaJava();
					aluno.adicionaAndroid();
				}
				break;
			case "v":
				System.out.println("\n---------------------------------\n" 
									+ "Deseja Visualizar quais turmas?\n" 
									+ "(J)ava\n"+ "(A)ndroid\n" 
									+ "(T)odas" + "\n---------------------------------\n");
				
				String e3 = leia.next();

				if (e3.equalsIgnoreCase("j")) {
					System.out.println(cursoJava.getNomeCurso() 
									+ ", com carga horária de " 
									+ cursoJava.getCargaHoraria());

					for (int i = 0; i < aluno.getListaJava().size(); i++) {
						System.out.println(aluno.getListaJava().get(i));
					}
					
					System.out.println("Instrutor - " + instrutorJava.getNomeInstrutor());
				}
				if (e3.equalsIgnoreCase("a")) {
					System.out.println(cursoAndroid.getNomeCurso()
									+ ", com carga horária de " 
									+ cursoAndroid.getCargaHoraria());
	
					for (int i = 0; i < aluno.getListaAndroid().size(); i++) {
						System.out.println(aluno.getListaAndroid().get(i));

					}
					System.out.println("Instrutor - " + instrutorAndroid.getNomeInstrutor());
				}
				if (e3.equalsIgnoreCase("t")) {
					System.out.println(cursoJava.getNomeCurso()
									+ ", com carga horária de " 
									+ cursoJava.getCargaHoraria());

					for (int i = 0; i < aluno.getListaJava().size(); i++) {
						System.out.println(aluno.getListaJava().get(i));
					}
					
					System.out.println("Instrutor - " + instrutorJava.getNomeInstrutor());
					System.out.println("\n");
					System.out.println(cursoAndroid.getNomeCurso() 
									+ ", com carga horária de " 
									+ cursoAndroid.getCargaHoraria());

					for (int i = 0; i < aluno.getListaAndroid().size(); i++) {
						System.out.println(aluno.getListaAndroid().get(i));
					}
					
					System.out.println("Instrutor - " + instrutorAndroid.getNomeInstrutor());
				}
			}
		} while (!e.equalsIgnoreCase("a") || !e.equalsIgnoreCase("v") || !e.equalsIgnoreCase("s"));

	}
}
