package aplicacao;

import controle.Controle;
import modelos.Cliente;


import java.util.List;
import java.util.Scanner;

public class Menu {

    private static Scanner scan = new Scanner(System.in);

    public void apresentarInicio() {
        System.out.println("----------Aluguel de Carros----------");
        escolha();
    }


    public void escolha() {

        System.out.println("\n Digite 1 para inserir novo cliente");
        System.out.println(" Digite 2 para inserir novo carro");
        System.out.println(" Digite 3 para gerar pedido carro");
        System.out.println(" Digite 4 para gerar relatório");
        System.out.print(":");

        int num = scan.nextInt();
        switch (num) {
            case 1:
                if (obterCliente() == true) {
                    System.out.println("Cliente inserido com sucesso!");
                } else {
                    System.out.println("Cliente não inserido!");
                }
                apresentarInicio();
                break;
            case 2:
                System.out.println("Você escolheu 2");
                apresentarInicio();
                break;
            case 3:
                System.out.println("Você escolheu 3");
                apresentarInicio();
                break;
            case 4:
                System.out.println("Você escolheu 4");
                apresentarInicio();
                break;
            default:
                System.out.println("Número inválido");
        }
    }


    private boolean obterCliente() {
        Controle controle = new Controle();
        List<Cliente> clientes;

        System.out.println("Digite o codigo do cliente: ");
        int codigo = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome = scan.next();
        scan.nextLine();

        System.out.println("Digite o CPF do cliente: ");
        String cpf = scan.next();
        scan.nextLine();

        System.out.println("Digite o endereço do cliente: ");
        String endereco = scan.next();
        scan.nextLine();

        System.out.println("Digite o telefone do cliente: ");
        String telefone = scan.next();
        scan.nextLine();

        System.out.println("Digite o email do cliente: ");
        String email = scan.next();
        scan.nextLine();

        System.out.println("Digite a forma de pagamento: ");
        String formadepagamento = scan.next();
        scan.nextLine();

        System.out.println("Digite a quantidade de dias: ");
        int dias = Integer.parseInt(scan.next());
        scan.nextInt();

        clientes = controle.obterClientes();
        Cliente cliente = new Cliente(clientes.size() + 1, codigo, nome, cpf, endereco, telefone, email, formadepagamento, dias);
        return controle.salvarCliente(cliente);
    }
}
