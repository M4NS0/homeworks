package semPOO;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Cliente {
    public static void main(String[] args) throws Exception{
        int porta = 7777;
        String ipVizinho = "127.0.0.1";
        int portaVizinho = 8888;
        DatagramSocket socket = new DatagramSocket(porta);
        while(true) {
            System.out.println("Mensagem: ");
            String mensagem = new java.util.Scanner(System.in).nextLine();
            byte[] dados = mensagem.getBytes();
            DatagramPacket pacote = new DatagramPacket(dados, dados.length, 
                    InetAddress.getByName(ipVizinho), portaVizinho );
            socket.send(pacote);
        }
    }
}
