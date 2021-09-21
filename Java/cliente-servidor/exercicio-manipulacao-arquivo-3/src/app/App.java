package app;

import models.*;
import services.DAO;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static DAO dao;

    private static Transacao transacao;
    private static ResultadoTransacao resultadoTransacao;
    private static TransacoesPermitidasOuNegadas permissaoTransacao;
    private static Conta conta;

    private static List<Todos> listaTodos;
    private static List<TransacoesPermitidasOuNegadas> permitidas;
    private static List<TransacoesPermitidasOuNegadas> negadas;
    private static List<Transacao> listaTransacao;
    private static List<ResultadoTransacao> listaResultados;
    private static List<Conta> listaConta;

    private static double saldoConta;
    private static double valorTransacao;

    public static void main(String[] args) {
        lerArquivo();
        montaLista();
    }
    private static void addConta(int i) {

        Conta conta = new Conta();

        listaConta = new ArrayList<>();

        conta.setSaldo(saldoConta);
        conta.setTransacoes(listaTransacao);
        conta.setNumero(listaTodos.get(i).getNumeroConta());
//        conta.setDv(listaTodos.get(i).getDvConta());
    }

    private static void addTransacoes(int i) {
        Transacao transacao = new Transacao();
        listaTransacao = new ArrayList<>();

        transacao.setResultados(listaResultados);
        transacao.setCodigo(listaTodos.get(i).getCodigoTransacao());
        listaTransacao.add(transacao);
    }

    private static void addResultados(int i) {
        listaResultados = new ArrayList<>();
        resultadoTransacao = new ResultadoTransacao();

        resultadoTransacao.setTransacoesNegadas(negadas);
        resultadoTransacao.setTransacoesPermitidas(permitidas);
        resultadoTransacao.setDataHoraProcessamento(listaTodos.get(i).getDataOperacaoTransacao());
        listaResultados.add(resultadoTransacao);
    }
    private static void setDetalhes(int i, boolean b) {
        permissaoTransacao = new TransacoesPermitidasOuNegadas();
        negadas = new ArrayList<>();

        permissaoTransacao.setPermitido(b);
        permissaoTransacao.setDataOperacao(listaTodos.get(i).getDataOperacaoTransacao());
        permissaoTransacao.setValor(listaTodos.get(i).getValorTransacao());
        permissaoTransacao.setOperacao(listaTodos.get(i).getOperacaoTransacao());
        negadas.add(permissaoTransacao);
    }

    private static void setNegadas(int i) {
        setDetalhes(i,false);
    }

    private static void setPermitidas(int i) {
        setDetalhes(i,true);
    }

    private static boolean isPermitido(Double saldoConta, Double valorTransacao) {
        if (saldoConta < valorTransacao) {
            return false;
        } else {
            return true;
        }
    }

    private static void checkPermissao(int i) {
        if (isPermitido(saldoConta, valorTransacao) == true) {
            setPermitidas(i);
        } else {
            setNegadas(i);
        }
    }
    private static void calcula(int i) {
        saldoConta = listaTodos.get(i).getSaldoConta();
        valorTransacao = listaTodos.get(i).getValorTransacao();
    }


    private static void montaLista() {
        for (int i = 0; i > listaTodos.size(); i ++) {
            calcula(i);
            checkPermissao(i);
            addResultados(i);
            addTransacoes(i);
            addConta(i);
        }
    }

    private static void lerArquivo() {
        dao = new DAO();
        listaTodos = dao.ReadFile();
    }
}
