import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.*;
import java.security.*;
import java.util.Scanner;

import javax.crypto.*;
public class ComunicadorSeguro {
	Socket conexao;
	ServerSocket server;
	DataInputStream entrada;
	DataOutputStream saida;
	Cipher cifra;
	Key chave;
	
	public void cliente(String endServer, int portaServer) throws Exception{
		conexao = new Socket(endServer, portaServer);
                System.out.println("Servidor conectado com sucesso!");
		entrada = new DataInputStream(conexao.getInputStream());
                System.out.println("Entrada criada!");
		saida = new DataOutputStream(conexao.getOutputStream());
                System.out.println("Saída criada!");
		System.out.println("Cliente criado com sucesso!");
	}
	
	public void servidor(int porta) throws Exception {
		server = new ServerSocket(porta);
		conexao = server.accept();
                System.out.println("Conexão aceita!");
		entrada = new DataInputStream(conexao.getInputStream());
                System.out.println("Entrada criada!");
		saida = new DataOutputStream(conexao.getOutputStream());
                System.out.println("Saída criada!");
                System.out.println("Servidor conectado com sucesso!");
	}
	
	public void enviarDados(byte[] dadosEnviados) throws Exception{
		saida.write(dadosEnviados);
	}
	
	public byte[] receberDados() throws Exception {
		byte[] dadosRecebidos = new byte[1024];
		entrada.read(dadosRecebidos);
		return dadosRecebidos;
	}
        

	public Key obterChave(String nomeArquivo) throws Exception {
            Key chave;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Chave.key"));
            chave = (Key)in.readObject();
            in.close();
            return chave;
	}
        
        /*
	public byte[] cifrarMensagem(String mensagem) throws Exception {
		
	}
	public String decifrarMensagem(byte[] dadosCifrados) throws Exception {
		
	}
	*/
	
	public void escreverMensagem(String mensagem) {
		System.out.println(mensagem);
	}
	
	public String lerMensagem() {
		String mensagem = "";
		Scanner teclado = new Scanner(System.in);
                System.out.println("Mensagem: ");
		mensagem = teclado.nextLine();
		return mensagem;
	}
	
}
