package app;

import models.*;
import servicos.Calculo;
import servicos.Dao;
import servicos.Fabrica;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    private static Cliente cliente;
    private static Vendedor vendedor;
    private static Carro carro;
    private static Patio patio;
    private static List<Carro> lista;
    private static Motorista motorista;
    private static Calculo calculo;
    private static List<Cliente> clientes;

    public static void main(String[] args) {

        iniciar();
        criarMockDeCarro();  // getCarros()
        obter();
        imprimirPatio();
        removerCarro();
        calcular();
        imprimir();
    }
    private static void imprimirPatio() {
        System.out.println("------------------------");
        System.out.println("Lista de carros no pátio " + patio.localizacao + ":" );
        imprimirListaDeCarrosDisponiveis();
    }

    private static void imprimirListaDeCarrosDisponiveis() {
        for (Carro carro: lista) {
            System.out.println(carro.modelo);
        }
        System.out.println("------------------------");
    }

    private static void imprimirCarro() {
        System.out.println("------------------------");
        System.out.println("Dados do carro");
        System.out.println("Localização do carro: " + cliente.patio.localizacao);
        System.out.println("Modelo: " + cliente.carro.modelo);
    }

    private static void imprimirMotorista() {
        System.out.println("------------------------");
        System.out.println("Dados do Motorista");
        System.out.println("Motorista: " + cliente.motorista.nome);
    }

    private static void imprimirVendedor() {
        System.out.println("------------------------");
        System.out.println("Dados do Vendedor");
        System.out.println("Vendedor: " + cliente.vendedor.nome);
        System.out.println("Vendas Efetuadas: " + vendedor.getVendasAcumuladas());
    }

    private static void imprimirAluguel() {
        System.out.println("\n");
        System.out.println("Comprovante de Aluguel de " + cliente.carro.modelo + " para cliente de " + cliente.cidade);
        System.out.println("------------------------");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Dias: " + cliente.dias);
        System.out.println("Valor da diária: " + cliente.valorDiarias);
        System.out.println("Total a Pagar: " + cliente.valorTotal);
    }

    private static void imprimir() {
        imprimirAluguel();
        imprimirVendedor();
        imprimirMotorista();
        imprimirCarro();
        imprimirPatio();
    }


    private static void calcular() {
        cliente.vendedor.setVendasAcumuladas(cliente.vendedor.getVendasAcumuladas() + 1);
        calculo.calcular(cliente);
    }

    private static void obterMotorista() {
        motorista.setNome("Craig");
        motorista.setTipoCnh("AB");
        cliente.setMotorista(motorista);
    }

    private static void obterPatio() {
        patio.setCarros(lista);
        patio.setCapacidade(30);
        patio.setLocalizacao("Ao lado da loje A");
        cliente.setPatio(patio);
    }

    private static void obterCarro() {
        cliente.setCarro(lista.get(2));
    }

    private static void removerCarro() {
        lista.remove(2);
    }

    private static void obterVendedor() {
        vendedor.setNome("Dwight");
        vendedor.setComissao(15.0f);
        vendedor.setVendasAcumuladas(1);
        cliente.setVendedor(vendedor);
    }

    private static void obterCliente() {
        System.out.println("Digite o nome:");




//        cliente.setNome("Debby Hairy");
//        cliente.setCidade("Goiânia");
//        cliente.setDias(7);
//        cliente.setValorDiarias(180.0f);


    }

    private static void iniciarFabrica() {
        carro = Fabrica.getCarro();
        vendedor = Fabrica.getVendedor();
        patio = Fabrica.getPatio();
        motorista = Fabrica.getMotorista();
        cliente = Fabrica.getCliente();
    }

    private static void obter() {
        obterCliente();  // getCliente
        obterVendedor(); //getVendedor
        obterCarro();   //getCarro
        obterPatio();   // getPatio
        obterMotorista(); // getMotorista
    }

    private static void criarMockDeCarro() {

        carro = new Carro();
        carro.setModelo("BMW");
        lista.add(carro);

        carro = new Carro();
        carro.setModelo("Honda");
        lista.add(carro);

        carro = new Carro();
        carro.setModelo("Van");
        lista.add(carro);
    }

    private static void iniciar() {
        lista = new ArrayList<>();
        calculo = new Calculo();
        iniciarFabrica();
    }


}
