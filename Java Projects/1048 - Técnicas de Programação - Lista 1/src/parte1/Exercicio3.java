package parte1;
import java.util.Scanner;

public class Exercicio3 {

	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		float a,b,c,d,e,f,x,y;
		
		System.out.println("insira o valor de a: ");
		a = leia.nextFloat();
		System.out.println("insira o valor de b: ");
		b = leia.nextFloat();
		System.out.println("insira o valor de c: ");
		c = leia.nextFloat();
		System.out.println("insira o valor de d: ");
		d = leia.nextFloat();
		System.out.println("insira o valor de e: ");
		e = leia.nextFloat();
		System.out.println("insira o valor de f: ");
		f = leia.nextFloat();
		
		x = ((c*e) - (b*f))/((a*e - b*d));
		y = ((a*f) - (c*d))/((a*e - b*d));
		
		System.out.println("X = " + x + "\nY = " + y );
	}
}
