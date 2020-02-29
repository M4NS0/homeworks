import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnaliseDeTexto2 {

	static final String NOME_ARQ = "/home/linuxlite/Downloads/procuracao.txt";
	private static String arquivo;
	private static ArrayList<String> text;

	public static void main(String[] args) throws Exception {
		LeArquivo();
		GeraArrayTexto();
		Analizador();

	}

	private static void LeArquivo() throws Exception {
		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {
			arquivo = arquivo + "\n" + br.readLine();
		}
		br.close();
		fr.close();
	}

	private static void GeraArrayTexto() {

		String texto[] = arquivo.split("\\. ");
		List<String> txt = Arrays.asList(texto);
		text = new ArrayList<>();
		text.addAll(txt);

		/*
		 * for (int i = 0; i < text.size(); i++) { System.out.println(text.get(i)); }
		 */
	}

	private static void Analizador() {

		List<String> palavrasChave = Arrays.asList("(OUTORGANTE*.*\\.) ", "(Pessoa*.*\\.)", "(Inscrit*. no C*.*\\s\\.)", "(Sediad*.*\\.\\s)", "(OUTORGAD*.*\\.)",
				"(Nacionalidade*.*\\.*)", "(Estado civil*.*\\.*)", "(Profiss*./\\.)", "(OAB*.*\\.)", "(PODERES*.*\\.)", "(profissional*.*\\.)", "(para apresentar*.*\\.)",
				"PROPOSTA*.*\\.", "Cidade*.*\\.");

		// acha o index da palavra no texto
		for (int i = 0; i < palavrasChave.size(); i++) {
			

			String chave = palavrasChave.get(i);
			Pattern pattern0 = Pattern.compile(chave);
			Matcher matcher0 = pattern0.matcher(arquivo);
						
			int j = 0;
			while (matcher0.find()) {
				j++;
				
				System.out.println("\npalavra buscada: " + palavrasChave.get(i) 
								+ "\npalavra   achada: " + matcher0.group()
								+ "\nposição no texto: " + matcher0.start() 
								+ " - " + matcher0.end() + "\n");

			}
		}
	}

}
