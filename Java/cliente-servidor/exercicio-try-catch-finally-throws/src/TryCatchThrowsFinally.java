import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchThrowsFinally {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        obtainInteger();
    }

    private static void obtainInteger() throws Exception {
        try {
            while (scanTyping() != null) {
            }

        } catch(InputMismatchException e) {
            throw new Exception(e);
        }
    }
    private static Integer scanTyping() {
        Integer number = null;
        System.out.println("Insira um número: ");
        scan = new Scanner(System.in);

        try {
            number = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        } finally {
            return number;
        }
    }
}
