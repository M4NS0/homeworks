package controle;

import modelos.*;
import persistencia.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {
    Scanner scan = new Scanner(System.in);
    private List<Carro> carros = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Motorista> motoristas = new ArrayList<>();
    private List<Patio> patios = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public void iniciar() {
        obterClientes();
        obterCarros();
        obterMotoristas();
        obterPatios();
        obterVendedores();

        obterNovoCliente();
        criarPedido();
        imprimePedidos();
    }

    private void imprimePedidos() {
        DaoPedido daoPedido = new DaoPedido();
        for (Pedido pedido : daoPedido.obterTudo()) {
            System.out.println("--------  Pedidos ---------");
            System.out.println(pedido.getCliente());
            System.out.println(pedido.getCarro());
            System.out.println(pedido.getCodigodomotorista());
            System.out.println(pedido.getCodigodopatio());
            System.out.println(pedido.getCodigodovendedor());
            System.out.println(pedido.getValortotal());
            System.out.println("-----------------------------");
        }
    }


    private void criarPedido() {
        DaoPedido daoPedido = new DaoPedido();
        DaoCliente daoCliente = new DaoCliente();
        DaoCarro daoCarro = new DaoCarro();
        DaoMotorista daoMotorista = new DaoMotorista();
        DaoPatio daoPatio = new DaoPatio();
        DaoVendedor daoVendedor = new DaoVendedor();


        System.out.println("Digite o codigo do cliente");
        int codigoCliente = scan.nextInt();
        System.out.println("Digite o codigo do carro");
        int codigoCarro = scan.nextInt();
        System.out.println("Digite o codigo do motorista");
        int codigoMotorista = scan.nextInt();
        System.out.println("Digite o codigo do patio");
        int codigoPatio = scan.nextInt();
        System.out.println("Digite o codigo do vendedor");
        int codigoVendedor = scan.nextInt();
        System.out.println("Digite o valor da diária");
        double valorDiaria = Double.parseDouble(scan.nextLine());


        Pedido pedido = new Pedido();
        pedido.setCliente(daoCliente.buscarCliente(codigoCliente).getClientenome());
        pedido.setCarro(daoCarro.buscarCarro(codigoCarro).getMarca());
        pedido.setCodigodomotorista(daoMotorista.buscarMotorista(codigoMotorista).getId());
        pedido.setCodigodopatio(daoPatio.buscarPatio(codigoPatio).getId());
        pedido.setCodigodovendedor(daoVendedor.buscarVendedor(codigoVendedor).getId());
        pedido.setValortotal(String.valueOf(calculaTotal(valorDiaria, daoCliente.buscarCliente(codigoCliente).getDias())));

        daoPedido.inserir(pedido);
        pedidos.add(pedido);

    }

    private Object calculaTotal(double diaria, double dias) {
        return diaria * dias;
    }

    private void obterNovoCliente() {
        System.out.println("Digite o codigo do cliente");
        int codigo = scan.nextInt();

        System.out.println("Digite o nome do cliente");
        String nome = scan.nextLine();

        System.out.println("Digite o CPF do cliente");
        String cpf = scan.nextLine();

        System.out.println("Digite o endereço do cliente");
        String endereco = scan.nextLine();

        System.out.println("Digite o telefone do cliente");
        String telefone = scan.nextLine();

        System.out.println("Digite o email do cliente");
        String email = scan.nextLine();

        System.out.println("Digite a forma de pagamento");
        String formadepagamento = scan.nextLine();

        System.out.println("Digite a quantidade de dias");
        int dias = Integer.parseInt(scan.nextLine());


        Cliente cliente = new Cliente(clientes.size() +1,codigo, nome, cpf, endereco, telefone, email, formadepagamento, dias);
        DaoCliente daoCliente = new DaoCliente();
        daoCliente.inserir(cliente);
        clientes.add(cliente);
    }

    private void obterPedidos() {
        DaoPedido daoPedido = new DaoPedido();
        pedidos = daoPedido.obterTudo();
    }

    private void obterVendedores() {
        DaoVendedor daoVendedor = new DaoVendedor();
        vendedores = daoVendedor.obterTudo();
    }

    private void obterPatios() {
        DaoPatio daoPatio = new DaoPatio();
        patios = daoPatio.obterTudo();
    }

    private void obterMotoristas() {
        DaoMotorista daoMotorista = new DaoMotorista();
        motoristas = daoMotorista.obterTudo();
    }

    private void obterCarros() {
        DaoCarro daoCarro = new DaoCarro();
        carros = daoCarro.obterTudo();
    }

    private void obterClientes() {
        DaoCliente daoCliente = new DaoCliente();
        clientes = daoCliente.obterTudo();
    }
}
