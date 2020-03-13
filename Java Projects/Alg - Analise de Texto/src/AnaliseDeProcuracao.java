import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnaliseDeProcuracao{

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
		int index = 0;
		
		// regras abaixo compiladas no site: https://regexr.com
		List<String> palavrasChave = Arrays.asList(	"((O*.*E|e\\:\\s)([A-z]*\\s[A-z]*\\s[A-z]*))|((O*.*e\\:\\s)([A-z]*\\s[A-z]*\\s[A-z]*))", 
													"((P[a-z]*.a)(\\sj[a-z][a-z][a-z][a-z][a-z][a-z]a))|(P[a-z]*.a)(\\sf[a-z][a-z][a-z][a-z]a)|(P[a-z]*.a)(\\sfí[a-z][a-z][a-z]a)", 
													"((n°\\s)(\\d{2}[-.\\s]?\\d{3}[-.\\s]?\\d{3}[-.\\s\\/]?\\d{4}[-.\\s]?\\d{2}))|(n°\\s)([0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2})",
													"(S[a-z]*.[ao]\\sn[ao]*.)([A-Z]*.*)", 
													"(O*.*[A|O]\\:\\s)([A-Z]*.*[A-Z]\\.)|(O*.*[A|O]\\:\\s)([A-Z]*.*[a-z]\\.)",
													"((Nacionalidade\\s)([A-Z]|[a-z])*.)|((Pais de [O|o]rigem\\:\\s)([A-Z]|[a-z])*.)", 
													"(Estado\\s[C|c]ivil\\s)(([A-Z]|[a-z])*\\.)", 
													"(Profiss*.o\\s)([A-Z]|[a-z])*\\.", 
													"(OAB\\/[A-Z][A-Z]\\sn°\\s)(\\d*\\.\\d*\\.)|(OAB\\/[A-Z][A-Z]\\s)(\\d*\\d*\\.\\d*\\.)", 
													"(endere[a-z]o\\sprofissional\\sn[a-o]\\s)([a-z]*.*)", 
													"((CEP\\s|cep\\s|Cep\\s)(\\d*.\\d*))",
													"(PODERES:\\s)([A-Z].*)",
													"(reclama[a-z|ç][a|ã]o\\s)([A-Z]|[a-z]*)",
													"(\\d*.\\-\\d*\\.\\d\\d\\d\\d\\.\\d\\.\\d*)",
													"(apresentar\\s)([A-z]*)",
													"((PROPOSTA|Proposta)\\s[A-z]*\\s([A-z]*.*))",
													"(Cidade\\sde\\s)([A-z]*.*)(\\,)");
		
		for (int i = 0; i < palavrasChave.size(); i++) {
			

			String chave = palavrasChave.get(i);
			Pattern pattern0 = Pattern.compile(chave);
			Matcher matcher0 = pattern0.matcher(arquivo);
			
			int j = 0;
			
			while (matcher0.find()) {
				j++;
								
				String frase = "";
				System.out.println("regra: " + palavrasChave.get(i));
				System.out.println("palavra achada: " + matcher0.group());
				System.out.println("\n");
				//System.out.println("\ninicia   em  pos: " + matcher0.start());
				//System.out.println("\ntermina  em  pos: " + matcher0.end());
								 
				
							
				
							
			}
		}
	}

}
