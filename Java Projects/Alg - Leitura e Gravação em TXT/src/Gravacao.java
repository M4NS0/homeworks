import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Gravacao {
	static final String NOME_ARQ = "meuArquivo.txt";
	private static String text = "teste";
	
	public static void main(String[] args) throws Exception {
		
			FileWriter fw = new FileWriter(NOME_ARQ);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(text + "\n");
			JOptionPane.showMessageDialog(null, "Arquivo criado/conteúdo adicionado com sucesso!");
			bw.close();
			fw.close();
		}
	}

