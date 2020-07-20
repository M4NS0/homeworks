import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws IOException {

        Socket pingSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        
        try {
            pingSocket = new Socket("192.168.25.56", 23);
            out = new PrintWriter(pingSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
        } catch (IOException e) {
            return;
        }

        out.println("(sleep 3;echo bruno;sleep 3;echo 00loki00;sleep 3;echo bash ./home/bruno/Documents/test.sh;sleep 3;) | telnet 192.168.25.56 23");
       
        /* (sleep 3;echo bruno;sleep 3;echo 00loki00;sleep 3;DISPLAY=:1 firefox;sleep 3;) | telnet 192.168.25.56 23 
        */
        System.out.println(in.readLine());
        out.close();
        in.close();
        pingSocket.close();
        
    }
}