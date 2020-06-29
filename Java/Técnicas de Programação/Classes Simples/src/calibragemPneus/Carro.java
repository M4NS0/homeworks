package calibragemPneus;
import java.util.Scanner;

public class Carro {
	private static Scanner leia = new Scanner(System.in);
	private static int pneu1;
	private static int pneu2;
	private static int pneu3;
	private static int pneu4;
	private static String ligado;

	public Carro() {
		ligado = "off";
		pneu1 = pneu2 = pneu3 = pneu4 = 30;

	}


	public void calibrar() {

		System.out.println("Digite quantas libras deseja colocar no pneu 1");
		pneu1 = leia.nextInt();
		System.out.println("Digite quantas libras deseja colocar no pneu 2");
		pneu2 = leia.nextInt();
		System.out.println("Digite quantas libras deseja colocar no pneu 3");
		pneu3 = leia.nextInt();
		System.out.println("Digite quantas libras deseja colocar no pneu 4");
		pneu4 = leia.nextInt();

	}

	public void Status() {
		
		System.out.println("|Pneu 1: " + pneu1 + " libras");
		System.out.println("|Pneu 2: " + pneu2 + " libras");
		System.out.println("|Pneu 3: " + pneu3 + " libras");
		System.out.println("|Pneu 4: " + pneu4 + " libras");
		System.out.println("| Carro: " + ligado);
	}


	public static int getPneu1() {
		return pneu1;
	}

	public static void setPneu1(int pneu1) {
		Carro.pneu1 = pneu1;
	}

	public static int getPneu2() {
		return pneu2;
	}

	public static void setPneu2(int pneu2) {
		Carro.pneu2 = pneu2;
	}

	public static int getPneu3() {
		return pneu3;
	}

	public static void setPneu3(int pneu3) {
		Carro.pneu3 = pneu3;
	}

	public static int getPneu4() {
		return pneu4;
	}

	public static void setPneu4(int pneu4) {
		Carro.pneu4 = pneu4;
	}

	public String getLigado() {
		return ligado;
	}

	public void setLigado(String ligado) {
		Carro.ligado = ligado;
	}

	

	

}
