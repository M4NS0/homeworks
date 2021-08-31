package aplicacao;

import model.ObjFuncionario;
import servicos.Fabrica;
import servicos.FolhaDePagamaneto;

import java.util.Scanner;

public class Teste {
    private static String nome, cargo;
    private static float salario, valorGratificacao;
    private static ObjFuncionario funcionarioComum;

    public static void main(String[] args) {
        obterFuncionario();
        iniciaPrograma();
        imprimirFuncionario();

    }
    private static void obterFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = scanner.nextLine();

        System.out.println("Cargo: ");
        cargo = scanner.nextLine();

        System.out.println("Salário: ");
        salario = scanner.nextFloat();

        System.out.println("Gratificação: ");
        valorGratificacao = scanner.nextFloat();
    }

    private static void iniciaPrograma() {
        funcionarioComum = Fabrica.getFuncionario();
        gerarFolhaPagamento(criarFuncionario(funcionarioComum));
    }

    private static ObjFuncionario criarFuncionario(ObjFuncionario funcionarioComum) {
        funcionarioComum.setNome(nome);
        funcionarioComum.setCargo(cargo);
        funcionarioComum.setSalario(salario);
        funcionarioComum.setGratificacao(valorGratificacao);
        return funcionarioComum;
    }

    private static void gerarFolhaPagamento(ObjFuncionario funcionarioComum) {
        FolhaDePagamaneto folhaDePagamaneto = new FolhaDePagamaneto();
        folhaDePagamaneto.calcularGratificacao(funcionarioComum);
        folhaDePagamaneto.calcularSalarioTotal(funcionarioComum);
    }

    private static void imprimirFuncionario() {
        System.out.println("Nome: "+ funcionarioComum.nome);
        System.out.println("Cargo: " + funcionarioComum.cargo);
        System.out.println("Salário: " + funcionarioComum.salario);
        System.out.println("Gratificação: " + funcionarioComum.gratificacao);
        System.out.println("Salário + Gratificacao: " + funcionarioComum.getTotal());
    }
}
