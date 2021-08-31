

import java.util.Scanner;

public class registroAcademico {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float valorOriginalMinimo, valorOriginalMaximo, valorGratificacaoMinima, valorGratificacaoMaxima, valorFinalMinimo, valorFinalMaximo;
        String nome, cargo;
        int idade;

        System.out.print("Insira seu nome:");
        nome = scan.nextLine();
        System.out.print("Insira o cargo:");
        cargo = scan.nextLine();
        System.out.print("Insira a idade:");
        idade = scan.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Idade: " + idade);

        if (cargo.equalsIgnoreCase("Supervisor")) {
            valorOriginalMinimo = 3000.0f;
            valorOriginalMaximo = 5000.0f;

            valorGratificacaoMinima = valorOriginalMinimo*0.2f;
            valorFinalMinimo = valorOriginalMinimo + valorGratificacaoMinima;

            System.out.println("Salário Original Minimo: " + valorOriginalMinimo);
            System.out.println("Gratificação Minima: " + valorGratificacaoMinima);
            System.out.println("Valor Final Minimo: " + valorFinalMinimo);

            valorGratificacaoMaxima = valorOriginalMaximo*0.2f;
            valorFinalMaximo = valorOriginalMaximo + valorGratificacaoMaxima;

            System.out.println("Salário Original Máximo: " + valorOriginalMaximo);
            System.out.println("Gratificação Máxima: " + valorGratificacaoMaxima);
            System.out.println("Valor Final MAximo: " + valorFinalMaximo);
        }

        else if (cargo.equalsIgnoreCase("Gerente")) {
            valorOriginalMinimo = 5000.0f;
            valorOriginalMaximo = 10000.0f;

            valorGratificacaoMinima = valorOriginalMinimo*0.2f;
            valorFinalMinimo = valorOriginalMinimo + valorGratificacaoMinima;

            System.out.println("Salário Original Minimo: " + valorOriginalMinimo);
            System.out.println("Gratificação Minima: " + valorGratificacaoMinima);
            System.out.println("Valor Final Minimo: " + valorFinalMinimo);

            valorGratificacaoMaxima = valorOriginalMaximo*0.1f;
            valorFinalMaximo = valorOriginalMaximo + valorGratificacaoMaxima;

            System.out.println("Salário Original Máximo: " + valorOriginalMaximo);
            System.out.println("Gratificação Máxima: " + valorGratificacaoMaxima);
            System.out.println("Valor Final MAximo: " + valorFinalMaximo);
        }

        else if (cargo.equalsIgnoreCase("Diretor")) {
            valorOriginalMinimo = 10000.0f;
            valorOriginalMaximo = 20000.0f;

            valorGratificacaoMinima = valorOriginalMinimo*0.1f;
            valorFinalMinimo = valorOriginalMinimo + valorGratificacaoMinima;

            System.out.println("Salário Original Minimo: " + valorOriginalMinimo);
            System.out.println("Gratificação Minima: " + valorGratificacaoMinima);
            System.out.println("Valor Final Minimo: " + valorFinalMinimo);

            valorGratificacaoMaxima = valorOriginalMaximo*0.2f;
            valorFinalMaximo = valorOriginalMaximo + valorGratificacaoMaxima;

            System.out.println("Salário Original Máximo: " + valorOriginalMaximo);
            System.out.println("Gratificação Máxima: " + valorGratificacaoMaxima);
            System.out.println("Valor Final MAximo: " + valorFinalMaximo);
        }
        else {
            valorOriginalMinimo = 1000.0f;
            valorOriginalMaximo = 3000.0f;

            valorGratificacaoMinima = valorOriginalMinimo*0.0f;
            valorFinalMinimo = valorOriginalMinimo + valorGratificacaoMinima;

            System.out.println("Salário Original Minimo: " + valorOriginalMinimo);
            System.out.println("Gratificação Minima: " + valorGratificacaoMinima);
            System.out.println("Valor Final Minimo: " + valorFinalMinimo);

            valorGratificacaoMaxima = valorOriginalMaximo*0.0f;
            valorFinalMaximo = valorOriginalMaximo + valorGratificacaoMaxima;

            System.out.println("Salário Original Máximo: " + valorOriginalMaximo);
            System.out.println("Gratificação Máxima: " + valorGratificacaoMaxima);
            System.out.println("Valor Final MAximo: " + valorFinalMaximo);
        }
    }
}
