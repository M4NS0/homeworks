

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.security.*;
import java.util.Scanner;

import javax.crypto.*;
public class ComunicadorSeguro {
	Socket conexao;
	ServerSocket server;
	ObjectInputStream entrada;
	ObjectOutputStream saida;
	Cipher cifra;
	Key chave;
	
	public void cliente(String endServer, int portaServer) throws Exception{
		conexao = new Socket(endServer, portaServer);
		entrada = new ObjectInputStream(conexao.getInputStream());
		saida = new ObjectOutputStream(conexao.getOutputStream());
                System.out.println("Cliente criado com sucesso!");
	}
	
	public void servidor(int porta) throws Exception {
		server = new ServerSocket(porta);
		conexao = server.accept();
                System.out.println("Conexão aceita!");
		entrada = new ObjectInputStream(conexao.getInputStream());
		saida = new ObjectOutputStream(conexao.getOutputStream());
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
	/*
	public Key obterChave(String nomeArquivo) {
		
	}
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
