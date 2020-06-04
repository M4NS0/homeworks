
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

class Chat4 extends Thread{
    Scanner entrada = new Scanner(System.in);
    int porta;    
    String ipVizinho;
    int portaVizinho;
    DatagramSocket socket; 

    public Chat4() {
        System.out.print("Porta Local: ");
        porta = entrada.nextInt() ;
        System.out.print("IP Vizinho: ");
        ipVizinho = entrada.next();
        System.out.print("Porta Vizinho: ");
        portaVizinho = entrada.nextInt();
        try {
            socket = new DatagramSocket(porta);
        } catch (Exception e) {}
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                byte[] dados = new byte[1024];
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
        } catch (Exception e) {}
    }
    
    public void enviarMensagens() {
        entrada = new Scanner(System.in);
        try {
            while(true) {
            System.out.print("Mensagem: ");
            String mensagem = entrada.nextLine();
            byte[] dados = mensagem.getBytes();
            DatagramPacket pacoteEnviado = new DatagramPacket(dados, dados.length, 
                    InetAddress.getByName(ipVizinho), portaVizinho );
            socket.send(pacoteEnviado);
            }
        } catch (Exception e) {}        
    }
}


public class MultiThreadPeerChat {
    public static void main(String[] args) throws Exception {
        Chat4 chat = new Chat4();
        Thread t = new Thread(chat);
        t.start();
        chat.enviarMensagens();

    }
}