import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa {

	static String nome;
	static String nascimento;
	private static int anoHj;
	private static int mesHj;
	private static int diaHj;
	private static String separador;
	private static int anoUser;
	private static int mesUser;
	private static int diaUser;
	private static int mesU;
	private static int anoU;
	private static int diaU;
	private static int anos;

	public static void pegaData() {

		GregorianCalendar dataCal = new GregorianCalendar();

		anoHj = dataCal.get(Calendar.YEAR);
		mesHj = dataCal.get(Calendar.MONTH) + 1;
		diaHj = dataCal.get(Calendar.DAY_OF_MONTH);
	}

	public static void regexAno() {
		String pattern = "^(0[1-9]|[12][0-9]|3[01])([^0-9A-z]?)(0[1-9]|1[012])([^0-9A-z]?)([0-9]{4})$";
		Pattern regex = Pattern.compile(pattern);
		Matcher ano = regex.matcher(nascimento);

		while (ano.find()) {
			anoUser = Integer.parseInt(ano.group(5));
		}
	}

	public static void regexMes() {
		String pattern = "^(0[1-9]|[12][0-9]|3[01])([^0-9A-z]?)(0[1-9]|1[012])([^0-9A-z]?)([0-9]{4})$";
		Pattern regex = Pattern.compile(pattern);
		Matcher mes = regex.matcher(nascimento);

		while (mes.find()) {
			mesUser = Integer.parseInt(mes.group(3));
		}

	}

	public static void regexDia() {
		String pattern = "^(0[1-9]|[12][0-9]|3[01])([^0-9A-z]?)(0[1-9]|1[012])([^0-9A-z]?)([0-9]{4})$";
		Pattern regex = Pattern.compile(pattern);
		Matcher dia = regex.matcher(nascimento);

		while (dia.find()) {
			diaUser = Integer.parseInt(dia.group(1));
		}
	}

	public static void substring() {

		System.out.println();
		if (nascimento.contains("/")) {
			separador = "/";
		}
		if (nascimento.contains("-")) {
			separador = "-";
		}

		int first = nascimento.indexOf(separador);
		int second = nascimento.indexOf(separador, first + 1);

		anoU = Integer.parseInt(nascimento.substring(second + 1));
		mesU = Integer.parseInt(nascimento.substring(first + 1, second));
		diaU = Integer.parseInt(nascimento.substring(0, first));

	}

	public static void calculaSubstring() {
		if ((Pessoa.getMesU() <= Pessoa.getMesHj()) && (Pessoa.getDiaU() < Pessoa.getDiaHj())) {
			anos = (Pessoa.getAnoHj() - Pessoa.getAnoU()) - 1;
		}
		
		anos = (Pessoa.getAnoHj() - Pessoa.getAnoU());
		
	}

	public static void calculaRegex() {
		if ((Pessoa.getMesUser() <= Pessoa.getMesHj()) && (Pessoa.getDiaUser() < Pessoa.getDiaHj())) {
			anos = (Pessoa.getAnoHj() - Pessoa.getAnoUser())-1;
		}
		else {
			anos = (Pessoa.getAnoHj() - (Pessoa.getAnoUser()+1));
		}
	}

	public static String getNascimento() {
		return nascimento;
	}

	public static void setNascimento(String nascimento) {
		Pessoa.nascimento = nascimento;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}

	public static int getAnoUser() {
		return anoUser;
	}

	public static int getAnoU() {
		return anoU;
	}

	public static int getAnoHj() {
		return anoHj;
	}

	public static int getMesUser() {
		return mesUser;
	}

	public static int getMesHj() {
		return mesHj;
	}

	public static int getDiaUser() {
		return diaUser;
	}

	public static int getDiaHj() {
		return diaHj;
	}

	public static int getMesU() {
		return mesU;
	}

	public static int getDiaU() {
		return diaU;
	}

	public static int getAnos() {
		return anos;
	}

}
