package backEnd;

public class Client {
	static String nome;
	static String sexo;
	static String curso;
	static int ranking;
	
	public Client(String nome, String sexo, String curso, int ranking) {
		Client.nome = nome;
		Client.sexo = sexo;
		Client.curso = curso;
		Client.ranking = ranking;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Client.nome = nome;
	}

	public static String getSexo() {
		return sexo;
	}

	public static void setSexo(String sexo) {
		Client.sexo = sexo;
	}

	public static String getCurso() {
		return curso;
	}

	public static void setCurso(String curso) {
		Client.curso = curso;
	}

	public static int getRanking() {
		return ranking;
	}

	public static void setRanking(int ranking) {
		Client.ranking = ranking;
	}
	
	
	
}
