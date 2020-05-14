import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfToFile {

	static final String NOME_ARQ = "/home/linuxlite/Downloads/Curriculo - Bruno Camargo Manso.txt";
	private static String text;
	
	public static void main(String[] args) throws IOException {
		 //Loading an existing document
	      File file = new File("/home/linuxlite/Downloads/Curriculo - Bruno Camargo Manso.pdf");
	      PDDocument document = PDDocument.load(file);

	      //Instantiate PDFTextStripper class
	      PDFTextStripper pdfStripper = new PDFTextStripper();

	      //Retrieving text from PDF document
	      text = pdfStripper.getText(document);
	      System.out.println(text);

	      //Closing the document
	      document.close();
	      gravarArquivo();
	}

	      public static void gravarArquivo() throws IOException{
	  		FileWriter fw = new FileWriter(NOME_ARQ);
	  		BufferedWriter bw = new BufferedWriter(fw);
	  		bw.write(text + "\n");
	  		JOptionPane.showMessageDialog(null, "Arquivo criado/conteúdo adicionado com sucesso!");
	  		bw.close();
	  		fw.close();
	  	}
	      

	}

