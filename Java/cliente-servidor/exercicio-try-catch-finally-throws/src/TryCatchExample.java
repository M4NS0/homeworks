import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws InputMismatchException {

        int number = 0;
        System.out.println("Insira um número: ");
        obtainInteger(number);
    }

    private static void obtainInteger(int number)  throws InputMismatchException {
        try {
            number = scan.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Erro");
        }
    }
}
