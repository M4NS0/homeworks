package backEnd;

import java.io.BufferedWriter;
import java.io.FileWriter;

import frontEnd.App;
import frontEnd.Perguntas;

public class Gravacao {

	static final String NOME_ARQ = "Ranking.txt";

	public void Grava(String nome, String sexo, String curso, int ranking) throws Exception {
		
		Perguntas pontos = new Perguntas();
		FileWriter fw = new FileWriter(NOME_ARQ, true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(Client.getNome() + "," + Client.getSexo() + "," + Client.getCurso() + "," + pontos.getRanking()+ "\n");

		// JOptionPane.showMessageDialog(null, "Arquivo criado/conteúdo adicionado com
		// sucesso!");
		bw.close();
		fw.close();

	}

}
