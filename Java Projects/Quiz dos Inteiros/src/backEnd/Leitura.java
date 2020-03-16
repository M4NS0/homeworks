package backEnd;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Leitura {
	static final String NOME_ARQ = "/home/linuxlite/Downloads/procuracao.txt";

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader(fr);
		String text = "";
		while (br.ready()) {
			text = text + "\n" + br.readLine();
		}
		JOptionPane.showMessageDialog(null, "Leitura de Arquivo concluida com sucesso");
		System.out.println(text);
		br.close();
		fr.close();

	}
}
