package twoSides;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class ClienteServidor {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Porta Local: ");
        int porta = entrada.nextInt() ;
        System.out.print("IP Vizinho: ");
        String ipVizinho = entrada.next();
        System.out.print("Porta Vizinho: ");
        int portaVizinho = entrada.nextInt();
        
        DatagramSocket socket = new DatagramSocket(porta);
        while(true) {
            System.out.println("Mensagem: ");
            String mensagem = entrada.nextLine();
            byte[] dados = mensagem.getBytes();
            DatagramPacket pacoteEnviado = new DatagramPacket(dados, dados.length, 
                    InetAddress.getByName(ipVizinho), portaVizinho );
            socket.send(pacoteEnviado);
            
            dados = new byte[1024];

            DatagramPacket pacoteRecebido = new DatagramPacket(dados,
                    dados.length);

            socket.receive(pacoteRecebido);

            String origem = pacoteRecebido.getAddress().toString();
            int portaOrigem = pacoteRecebido.getPort();
            byte[] dadosRecebidos = pacoteRecebido.getData();
            String mensagemRecebida = new String(dadosRecebidos);

            System.out.println(origem + ":" + portaOrigem +
                    " >> " + mensagemRecebida);
        }
    }
}
