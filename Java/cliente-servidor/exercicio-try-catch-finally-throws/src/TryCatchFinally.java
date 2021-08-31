import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) throws InputMismatchException {

        obtainInteger();
    }

    private static void obtainInteger()  throws InputMismatchException {
        try {
            while (scanTyping() != null) {
            }

        } catch(InputMismatchException e) {
            System.out.println("Erro " + e);
        }
    }
    private static Integer scanTyping() {
        Integer number = null;
        System.out.println("Insira um número: ");
        scan = new Scanner(System.in);

        try {
            number = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro " + e);
        } finally {
            return number;
        }
    }
}
