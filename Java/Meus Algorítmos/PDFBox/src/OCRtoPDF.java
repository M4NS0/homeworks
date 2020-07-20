
import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class OCRtoPDF {
	public static void main(String[] args) {
		try {
			File pdf_file = new File("/home/linuxlite/Downloads/Curriculo - Bruno Camargo Manso.pdf");
			PDDocument document = PDDocument.load(pdf_file);
			PDFTextStripper pdfstripper = new PDFTextStripper();
			String ocr_text = pdfstripper.getText(document);
			System.out.println(ocr_text);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
