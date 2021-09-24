package App;

import control.Controller;
import models.*;

import java.util.List;

public class Teste {

    private static Controller controller;

    public static void main(String[] args) {
        runControler();
    }

    private static void runControler() {
        controller = new Controller();
        List<DTO> listaDTO;
        listaDTO = controller.getDTOinFile();

        List<Agencia> agencias;
        agencias = controller.getAgenciasFromListaDTO(listaDTO);

        List<Conta> contas;
        contas = controller.getContasFromAgencias(agencias);

        List<Transacao> transacoes;
        transacoes = controller.getTransacoesFromContas(contas);

        List<Resultado> resultados;
        resultados = controller.getResultadosFromTransacoes(transacoes);

        List<Permissao> permitidas;
        permitidas = controller.getResultadosPermitidos(resultados);

        List<Permissao> negados;
        negados = controller.getResultadosNegados(resultados);

        controller.gravaCSVnegados(negados);
        controller.gravaCSVpermitidos(permitidas);

    }











}
