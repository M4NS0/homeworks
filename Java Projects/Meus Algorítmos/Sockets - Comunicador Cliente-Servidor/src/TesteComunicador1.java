

import java.util.Scanner;

public class TesteComunicador1 {

	public static void main(String[] args) throws Exception {
		ComunicadorSeguro com = new ComunicadorSeguro();
		System.out.println("Escolha o modo de funcionamento: ");
		System.out.println("1 - Servidor");
		System.out.println("2 - Cliente ");
		System.out.print("Escolha a opção desejada: ");
		int opcao = new Scanner(System.in).nextInt();
		
		if (opcao == 1) {
		//Servidor
		com.servidor(7777);
		System.out.println("Servidor conectado na porta 7777");
		byte[] dados = com.receberDados();
		String mensagem = new String(dados);
		com.escreverMensagem(mensagem);
		}
		else if (opcao == 2) {
		//Cliente
		com.cliente("localhost", 7777);
		System.out.println("Conexão com o servidor estabelecida com sucesso!");
		String mensagem = com.lerMensagem();
		com.enviarDados(mensagem.getBytes());
		}
	}

}
