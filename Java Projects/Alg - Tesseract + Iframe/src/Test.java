
import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class Test {

	public static void main(String[] args) throws TesseractException {
		
		Tesseract tesseract = new Tesseract();
		
		tesseract.setDatapath("Tess4J/tessdata/");
		String text = tesseract.doOCR(new File("/home/linuxlite/procuracao.png"));

		System.out.print(text);
		
		}
	}
