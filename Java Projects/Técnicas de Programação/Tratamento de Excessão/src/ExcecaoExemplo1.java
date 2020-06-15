/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author japa
 */
public class ExcecaoExemplo1 {

    public static int divisao(int n, int d)
    {
        return (n/d); //pode ocasionar um erro se o d = ZERO
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuaLoop=true;
        
        do
        {
            try
            {
                System.out.print("Digite um numerador inteiro:");
                int numerador = sc.nextInt();
                System.out.print("Digite um denominador inteiro:");
                int denominador = sc.nextInt();
                int resultado = divisao(numerador,denominador);
                System.out.printf("\nResultado= %d/%d=%d\n" , numerador, denominador, resultado);
                continuaLoop=false;
            }
            catch(InputMismatchException e)
            {
                //System.err.printf("Excecao: %s\n " , e);
                sc.next();
                System.out.printf("Digite somente inteiros. Tente novamente \n\n");
                        
            }
            catch (ArithmeticException a)
            {
                //System.err.printf("Excecao: %s\n", a);
                System.out.println("Divisao por ZERO. Tente novamente \n\n");
                
            }
        }while (continuaLoop);
    }
    
}
