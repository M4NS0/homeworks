import java.io.BufferedReader;
import java.io.FileReader;


public class SimpleParsing {
	
	static final String NOME_ARQ = "/home/linuxlite/Downloads/procuracao.txt";
	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader(fr);
		String text = "";
		while (br.ready()) {
			text = text + "\n" + br.readLine();
		}
		//JOptionPane.showMessageDialog(null, "Leitura de Arquivo concluida com sucesso");
		//System.out.println(text);
		br.close();
		fr.close();
		
		
		int i = text.indexOf("OUTORGANTE: ");
		

		String outorgante = text.substring(i + 11, i + 22);
		System.out.println(outorgante);
		

	}

}
