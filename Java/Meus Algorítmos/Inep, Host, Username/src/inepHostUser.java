
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author Crunchify.com
 */

public class inepHostUser {
	public static void main(String[] args) throws UnknownHostException, SocketException {

		try (final DatagramSocket socket = new DatagramSocket()) {
			socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
			String inet = socket.getLocalAddress().getHostAddress();
			InetAddress ip = InetAddress.getLocalHost();
			String hostname = ip.getHostName();
			System.out.println(System.getProperty("user.name"));
			System.out.println("Your current IP address : " + inet);
			System.out.println("Your current Hostname : " + hostname);

		}
	}
}