// exemplo em:
// www.dropbox.com/home/TP1?preview=TP1-Aula04.pdf
// pagina 23

import java.util.Scanner;

public class App {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		Sorteio sorteio = new Sorteio();
		System.out.println("Lançando o dado...");
		sorteio.lancarDado();
		Thread.sleep(2000);
		System.out.println("O número sorteado: " + sorteio.getValor());
	}
}
