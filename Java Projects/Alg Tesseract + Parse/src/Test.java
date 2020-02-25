
import java.io.File;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Test {


public static void main(String []args) {
	 Tesseract tesseract = new Tesseract();
	 try {
		
		 tesseract.setDatapath("Tess4J/tessdata/");
		String text = tesseract.doOCR(new File("/home/linuxlite/procuracao.png"));	
		
		System.out.print(text);
		 
	
	 } catch (TesseractException e) {		
		e.printStackTrace();
	}
 }
}