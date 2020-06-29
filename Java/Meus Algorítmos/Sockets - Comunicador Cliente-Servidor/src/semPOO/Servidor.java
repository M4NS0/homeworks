package semPOO;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor {
    public static void main(String[] args) throws Exception{
        int porta = 8888;
        DatagramSocket socket = new DatagramSocket(porta);
        while (true) {
            byte[] dados = new byte[1024];

            DatagramPacket pacote = new DatagramPacket(dados,
                    dados.length);

            socket.receive(pacote);

            String origem = pacote.getAddress().toString();
            int portaOrigem = pacote.getPort();
            byte[] dadosRecebidos = pacote.getData();
            String mensagemRecebida = new String(dadosRecebidos);

            System.out.println(origem + ":" + portaOrigem +
                    " >> " + mensagemRecebida);
        }
    }
}
