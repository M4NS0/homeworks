import java.net.*;
import java.io.*;

public class Servidor {

	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(7777);
			Socket conexao = servidor.accept();
			
			DataInputStream entrada = new DataInputStream(conexao.getInputStream());
			
			FileOutputStream fos = new FileOutputStream("arq-recebido.txt");
			entrada.transferTo(fos);
			
			fos.flush();
			fos.close();
		} catch (Exception e) {}

	}

}
